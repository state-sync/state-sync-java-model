package org.statesync.model;

import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class AnnotatedItem<Item> {
	public Item item;
	public Map<Permission, Boolean> permissions;

	public AnnotatedItem(final Item item, final Set<Permission> permissions) {
		this.item = item;
		this.permissions = JReducer.toMap(permissions);
	}
}
