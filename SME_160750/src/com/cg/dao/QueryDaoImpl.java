package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.dto.QueryMaster;



@Repository("querydao")
@Transactional
public class QueryDaoImpl implements IQueryDao
{
	@PersistenceContext
	EntityManager em;

	@Override
	public List<QueryMaster> getAllDetail() {
		Query queryGet=em.createQuery("FROM QueryMaster");
		List<QueryMaster> myAll=queryGet.getResultList();
		return myAll;
	}

	
}
