package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.javaex.dao.AttentionManagaerDao;
import com.javaex.vo.AttentionCartVo;

@Service
public class AttentionManagerService {

	@Autowired
	private AttentionManagaerDao attentionManagaerDao;

	public List<AttentionCartVo> exeList(String order_date) {
		System.out.println("AttentionManagerService()");

		List<AttentionCartVo> cartList = attentionManagaerDao.attentionCartSelect(order_date);
		
		return cartList;

	}
	public List<AttentionCartVo> exeCoffeeList(AttentionCartVo attentionCartVo) {
		System.out.println("AttentionManagerService.exeCoffeeList()");

		List<AttentionCartVo> cartList = attentionManagaerDao.attentionCoffeeSelect(attentionCartVo);
		
		return cartList;

	}

}
