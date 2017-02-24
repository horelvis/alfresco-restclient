package uk.co.techblue.alfresco.dto.content;

import javax.ws.rs.QueryParam;

import uk.co.techblue.alfresco.dto.BaseDto;

@SuppressWarnings("serial")
public class DocLibRequest extends BaseDto {
	
	@QueryParam("filter")
	private String filter;
	
	@QueryParam("size")
	private int size = 50;
	
	@QueryParam("pos")
	private int pos = 1;
	
	@QueryParam("sortField")
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
