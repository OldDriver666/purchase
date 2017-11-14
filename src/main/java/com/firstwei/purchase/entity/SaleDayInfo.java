/**
 * 可销天数
 */
package com.firstwei.purchase.entity;

import com.firstwei.purchase.util.ExcelCell;

/**
 * @author ZN-yyrj015
 *
 */
public class SaleDayInfo {
	/**
	 * 商品名称
	 */
	@ExcelCell("A")
	private String goodsName;
	
	/**
	 * 可销天数
	 */
	@ExcelCell("B")
	private Integer saleDay;

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Integer getSaleDay() {
		return saleDay;
	}

	public void setSaleDay(Integer saleDay) {
		this.saleDay = saleDay;
	}
	
	
	
}
