package org.statesync.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnnotatedList<Item> {
	public List<AnnotatedItem<Item>> data = new ArrayList<>();
	public Map<String, Boolean> permissions = new HashMap<>();
	public Pagination pagination = new Pagination();

	public <DT> void setData(final Collection<DT> source, final Function<DT, Item> itemMap) {
		setData(source, itemMap, t -> Collections.emptySet());
	}

	public <DT> void setData(final Collection<DT> source, final Function<DT, Item> itemMap,
			final Function<DT, Set<String>> permissionsMap) {
		this.data = source.stream().map(src -> new AnnotatedItem<Item>(itemMap.apply(src), permissionsMap.apply(src)))
				.collect(Collectors.toList());
	}
}
