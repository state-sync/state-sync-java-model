package org.statesync.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Pagination {
	public int currentPage;
	public int totalPages;
	public long totalElements;

	public List<PaginationItem> pages;

	public Pagination(final int currentPage, final int totalPages, final long totalElements, final int steps) {
		this.currentPage = currentPage;
		this.totalPages = totalPages;
		this.totalElements = totalElements;
		this.pages = new ArrayList<>();
		final int count = steps;
		final int start = steps * (currentPage / steps);
		this.pages.add(new PaginationItem(PaginationItemType.prev, start - steps, start == 0, "", ""));
		for (int i = start; i < start + count; i++) {
			this.pages.add(new PaginationItem(PaginationItemType.normal, i, i >= this.totalPages,
					Integer.toString(i + 1), ""));
		}
		this.pages.add(new PaginationItem(PaginationItemType.next, start + steps, totalPages <= start + steps, "", ""));
	}
}
