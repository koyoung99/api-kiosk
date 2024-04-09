package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.BillVo;
import com.javaex.vo.SalesVo;

@Repository
public class OrderDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	// bill 테이블 등록용 쿼리연결
	public int insertOrder(BillVo vo) {
		System.out.println("OrderDao.insertOrder()");
		int a = sqlSession.insert("order.insertOrder",vo);
		return a;
	}
	
	// sales 테이블 등록용 쿼리연결
	public int insertSales(SalesVo vo) {
		System.out.println("OrderDao.insertSales()");
		return sqlSession.insert("order.insertSales",vo);
	}
}
