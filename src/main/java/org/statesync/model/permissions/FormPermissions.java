package org.statesync.model.permissions;

import lombok.Data;

/**
 *
 * @author ify
 *
 */
@Data
public class FormPermissions implements ItemPermissions {
	/**
	 * Data is ready to be updated on server side. Usually used to disable
	 * submit button on client
	 */
	public boolean update;
}
