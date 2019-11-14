package com.aufe.service;

import java.io.IOException;

import com.aufe.pojo.PageInfo;

public interface LogService  {
	/**
	 * 分页显示
	 * @param pageSize
	 * @param pageNumber
	 * @return
	 */
	PageInfo showPage(int pageSize,int pageNumber) throws IOException;
}
