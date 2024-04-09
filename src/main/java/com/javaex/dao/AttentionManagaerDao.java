package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.javaex.vo.AttentionCartVo;

@Repository
public class AttentionManagaerDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<AttentionCartVo> attentionCartSelect(String order_date){
		System.out.println("attentionManagaerDao.attentionCartSelect()");
		
		List<AttentionCartVo> cartList=sqlSession.selectList("attention.select",order_date);
		System.out.println(cartList);
		
		return cartList;
	}
	
	public List<AttentionCartVo> attentionCoffeeSelect(AttentionCartVo attentionCartVo){
		System.out.println("attentionManagaerDao.attentionCoffeeSelect()");
		
		List<AttentionCartVo> cartList=sqlSession.selectList("attention.coffeeSelect",attentionCartVo);
		return cartList;
	}

}
