package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.ImageVo;
import com.javaex.vo.ProductVo;

@Repository
public class ManagerDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//사진 등록
	public int insertImg(ImageVo imageVo) {
		System.out.println("AttachDao.insertImg()");
		System.out.println(imageVo);
		int count = sqlSession.insert("pos.insertImg", imageVo);
		return count;
	}
	
	//메뉴 등록
	public int menuInsert(ProductVo productVo) {
		System.out.println("ManagerDao.menuInsert()");
		
		int count = sqlSession.insert("pos.insertMenu", productVo);
		
		return count;
	}
	
	
	//리스트
	public List<ProductVo> selectList() {
		System.out.println("ManagerDao.selectList()");
		
		List<ProductVo> pList = sqlSession.selectList("pos.selectList");
		
		return pList;
	}
	
	public List<ProductVo> selectCategory(String category){
		System.out.println("ManagerDao.selectCategory()");
		List<ProductVo> categoryList = sqlSession.selectList("pos.selectCategory", category);
		return categoryList;
	}
	
	//삭제
	public int menuDelete(int no) {
		System.out.println("ManagerDao.menuDelete()");
		System.out.println(no);
		int count = sqlSession.delete("pos.deleteMenu", no);
		return count;
	}
	//이미지삭제
	public int imgDelete(int no) {
		System.out.println("ManagerDao.imgDelete()");
		System.out.println(no);
		int count = sqlSession.delete("pos.deleteImg", no);
		return count;
	}
	
	//이미지 등록되어있나 확인
	public ImageVo imgSelect(int no) {
		System.out.println("ManagerDao.imgSelect()");
		ImageVo imgVo = sqlSession.selectOne("pos.selectImg", no);
		return imgVo;
	}
	
	public int imgUpdate(ImageVo imageVo) {
		System.out.println("ManagerDao.imgUpdate()");
		System.out.println("Update: " + imageVo);
		return 0;
	}

}
