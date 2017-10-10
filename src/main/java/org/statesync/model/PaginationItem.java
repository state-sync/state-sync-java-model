package org.statesync.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaginationItem {
	public PaginationItemType type;
	public int page;
	public boolean disabled;
	public String label;
	public String badge;
}
