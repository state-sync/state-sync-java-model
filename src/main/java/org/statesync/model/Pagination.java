package org.statesync.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pagination {
	public int currentPage;
	public int totalPages;
	public long totalElements;
}
