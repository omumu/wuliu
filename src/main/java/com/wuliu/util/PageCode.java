package com.wuliu.util;

/**
 * 
 * @author joe蒋渊
 *
 *         一个用于生成 前端分页代码的 工具类
 */
public class PageCode {

	public static String getPageCode(String url, int totalNums, int pageSize, int page) {
		StringBuilder pageCode = new StringBuilder();
		int totalPages = totalNums % pageSize > 0 ? totalNums / pageSize + 1 : totalNums / pageSize;

		pageCode.append("<a type=\"button\" class=\"btn btn-default\" href=\"/" + url
				+ "?page=" + 1 + "\">首页</a>");

		if (page > 1) {
			pageCode.append("<a type=\"button\" class=\"btn btn-default\" href=\"/"
					+ url + "?page=" + (page - 1) + "\">上一页</a>");
		}
		if(page>0&&page<=totalPages){
			pageCode.append("<a type=\"button\" class=\"btn btn-default\" href=\"/"
					+ url + "?page=" + page  + "\">"+ page+"</a>");
		}
		if ((page + 1) <= totalPages) {
			pageCode.append("<a type=\"button\" class=\"btn btn-default\" href=\"/"
					+ url + "?page=" + (page + 1) + "\">下一页</a>");
		}
		pageCode.append("<a type=\"button\" class=\"btn btn-default\" href=\"/" + url
				+ "?page=" + totalPages + "\">尾页</a>");
		return pageCode.toString();
	}

}
