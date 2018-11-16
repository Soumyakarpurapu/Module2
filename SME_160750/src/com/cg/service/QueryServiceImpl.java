package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;






import com.cg.dao.IQueryDao;
import com.cg.dto.QueryMaster;


@Service("queryservice")
@Transactional
public class QueryServiceImpl implements IQueryService
{
	@Autowired
	IQueryDao querydao;

	@Override
	public List<QueryMaster> getAllDetail() {
		return querydao.getAllDetail();
	}
	
}
