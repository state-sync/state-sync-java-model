package org.statesync.model.permissions;

import lombok.Data;

@Data
public class ItemCrudPermissions implements ItemPermissions {
	public boolean edit;
	public boolean delete;
}
