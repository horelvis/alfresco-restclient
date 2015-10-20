package uk.co.techblue.alfresco.dto.content;

import uk.co.techblue.alfresco.dto.BaseDto;

@SuppressWarnings("serial")
public class DocLibRequest extends BaseDto {

	private String filter;
	private int size = 50;
	private int pos = 1;
	private String sortField;

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getSortField() {
		return sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

}
