package org.statesync.model.permissions;

import lombok.Data;

@Data
public class ListCrudPermissions implements ListPermissions {
	public boolean create;
	public boolean delete;
}
