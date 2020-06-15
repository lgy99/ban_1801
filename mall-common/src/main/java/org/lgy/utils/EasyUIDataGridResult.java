package org.lgy.utils;

import java.util.List;

public class EasyUIDataGridResult {
	private long total;
	private List<?> rows;
	
	public EasyUIDataGridResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EasyUIDataGridResult(long total, List<?> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
