package org.statesync.model;

import org.statesync.model.permissions.ItemPermissions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnnotatedItem<Item, Permissions extends ItemPermissions> {
	public Item data;
	public Permissions permissions;
}
