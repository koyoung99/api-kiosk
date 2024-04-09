package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.UserDao;
import com.javaex.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public UserVo exeSave(UserVo userVo) {
		System.out.println("UserService.exeSave()");
		UserVo uVo = userDao.userSelect(userVo);
		//유저정보 있음
		if(uVo != null) {
			//유저 번호불러오기
			userVo.setNo(uVo.getNo());
			//포인트 추가(기존포인트 + 적립포인트)
			userVo.setPoint(uVo.getPoint()+userVo.getPoint());
			//유저정보 업데이트
			userDao.userUpdate(userVo);
		} else { //유저정보 없음
			//유저 추가
			userDao.userInsert(userVo);
			//userDao.userUpdate(userVo);
		}
		
		//포인트 불러오기
		UserVo pointVo = userDao.pointSelect(userVo.getHp());
		return pointVo;
	}
}
