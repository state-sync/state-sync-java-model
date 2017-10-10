package org.statesync.model;

import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnnotatedItem<Item> {
	public Item data;
	public Map<String, Boolean> permissions;

	public AnnotatedItem(final Item item, final Set<String> permissions) {
		this.data = item;
		this.permissions = JReducer.toMap(permissions);
	}

	public AnnotatedItem(final Item item, final String... permissions) {
		this.data = item;
		this.permissions = JReducer.toMap(permissions);
	}
}
