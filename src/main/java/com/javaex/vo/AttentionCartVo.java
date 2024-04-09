package com.javaex.vo;

public class AttentionCartVo {

	private int productNo; // 제품번호
	private String category; // 품목
	private String productName; // 제품명
	private int totalCount; // 총수량
	private int totalPrice; // 총가격
	private String order_date; // 날짜
	private String selectedDate;

	public AttentionCartVo() {
		super();
	}

	public AttentionCartVo(String category, String selectedDate) {
		super();
		this.category = category;
		this.selectedDate = selectedDate;
	}

	public AttentionCartVo(int productNo, String category, String productName, int totalCount, int totalPrice,
			String order_date) {
		super();
		this.productNo = productNo;
		this.category = category;
		this.productName = productName;
		this.totalCount = totalCount;
		this.totalPrice = totalPrice;
		this.order_date = order_date;
	}

	public AttentionCartVo(int productNo, String category, String productName, int totalCount, int totalPrice,
			String order_date, String selectedDate) {
		super();
		this.productNo = productNo;
		this.category = category;
		this.productName = productName;
		this.totalCount = totalCount;
		this.totalPrice = totalPrice;
		this.order_date = order_date;
		this.selectedDate = selectedDate;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	

	public String getSelectedDate() {
		return selectedDate;
	}

	public void setSelectedDate(String selectedDate) {
		this.selectedDate = selectedDate;
	}
	
	

	@Override
	public String toString() {
		return "AttentionCartVo [productNo=" + productNo + ", category=" + category + ", productName=" + productName
				+ ", totalCount=" + totalCount + ", totalPrice=" + totalPrice + ", order_date=" + order_date
				+ ", selectedDate=" + selectedDate + "]";
	}



}
