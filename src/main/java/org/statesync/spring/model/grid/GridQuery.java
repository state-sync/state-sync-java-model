package org.statesync.spring.model.grid;

import lombok.Data;

@Data
public class GridQuery implements Cloneable {
	public String search;
	public int page = 0;
	public int size = 10;
	public String sortBy;
}
