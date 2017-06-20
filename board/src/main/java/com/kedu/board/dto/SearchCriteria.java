package com.kedu.board.dto;

public class SearchCriteria extends Criteria{
	private String searchType;
	private String keyword;

	@Override
	public String toString() {
		return "SearchCriteria [searchType=" + searchType + ", keyword=" + keyword + "]";
	}
	public SearchCriteria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
}
