package com.wuliu.dao;

import com.wuliu.pojo.goodsmeg;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface goodsmegdao {
	List<HashMap<String, Object>> getgoodmessage(@Param("page") int page, @Param("size") int size);

	int gettotalnumber();

	int deleteByPrimaryKey(Integer gid);

	int insert(goodsmeg record);

	int insertSelective(goodsmegdao record);

	goodsmegdao selectByPrimaryKey(Integer gid);

	int updateByPrimaryKeySelective(goodsmegdao record);

	int updateByPrimaryKey(goodsmegdao record);

	List<HashMap> getgoodinfo(int page, int size);

	List<HashMap> getallgoodmessage(int page, int size);

	int updateByPrimaryKey(goodsmeg goodsmeg);

	/**
	 * 
	 * @param id
	 * @return
	 */
	HashMap<String, Object> getdetail(int id);
}