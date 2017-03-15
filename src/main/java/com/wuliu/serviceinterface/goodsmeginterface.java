package com.wuliu.serviceinterface;

import com.wuliu.pojo.goodsmeg;

import java.util.HashMap;
import java.util.List;

public interface goodsmeginterface {
	int deleteByPrimaryKey(Integer gid);

	int insert(goodsmeg record);

	int insertSelective(goodsmeginterface record);

	goodsmeginterface selectByPrimaryKey(Integer gid);

	int updateByPrimaryKeySelective(goodsmeginterface record);

	int updateByPrimaryKey(goodsmeginterface record);

	List<HashMap<String, Object>> getgoodmessage(int page, int size);

	int gettotalnumber();

	List<HashMap> getgoodinfo(int page, int size);

	List<HashMap> getallgoodmessage(int page, int size);

	int updateByPrimaryKey(goodsmeg goodsmeg);

	/**
	 * 获取详情页
	 * 
	 * @param id
	 * @return
	 */
	HashMap<String, Object> getdetail(int id);
}