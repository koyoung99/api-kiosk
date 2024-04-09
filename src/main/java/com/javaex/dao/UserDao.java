package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository
public class UserDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//유저정보 확인
	public UserVo userSelect(UserVo userVo) {
		System.out.println("UserDao.userSelect()");
		UserVo uVo = sqlSession.selectOne("user.selectUser", userVo);
		//System.out.println(uVo);
		return uVo;
	}
	
	//유저업데이트
	public int userUpdate(UserVo userVo) {
		System.out.println("UserDao.userUpdate()");
		sqlSession.update("user.savePoint", userVo);
		return 0;
	}
	
	//유저추가
	public int userInsert(UserVo userVo) {
		System.out.println("UserDao.userInsert()");
		sqlSession.insert("user.userInsert", userVo);
		return 0;
	}
	
	//포인트 불러오기
	public UserVo pointSelect(String hp) {
		System.out.println("UserDao.pointSelect()");
		UserVo userVo = sqlSession.selectOne("user.getPoint", hp);
		//System.out.println(hp);
		return userVo;
	}

}
