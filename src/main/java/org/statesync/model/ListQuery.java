package org.statesync.model;

import lombok.Data;

@Data
public class ListQuery {
	public String search;
	public String sortBy;
	public String sortDirection;
	public int page;
	public int pageSize = 5;

	public String[] searchKeywords() {
		return this.search == null ? new String[0] : this.search.split("\\s");
	}

	public void validate(final String defaultSearch) {
		if (this.pageSize < 5)
			this.pageSize = 5;
		if (this.page < 0)
			this.page = 0;
		if (this.sortBy == null)
			this.sortBy = defaultSearch;
		if (this.sortDirection == null)
			this.sortDirection = "asc";
	}
}
