package org.statesync.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.statesync.model.permissions.ItemPermissions;
import org.statesync.model.permissions.ListPermissions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnnotatedList<Item, IP extends ItemPermissions, LP extends ListPermissions> {
	public List<AnnotatedItem<Item, IP>> data = new ArrayList<>();
	public LP permissions;
	public Pagination pagination = new Pagination();

	public <DT> void setData(final Collection<DT> source, final Function<DT, Item> itemMap,
			final Function<DT, IP> permissionsMap) {
		this.data = source.stream().map(src -> new AnnotatedItem<>(itemMap.apply(src), permissionsMap.apply(src)))
				.collect(Collectors.toList());
	}
}
