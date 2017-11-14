/**
 * 未交量
 */
package com.firstwei.purchase.entity;

import com.firstwei.purchase.util.ExcelCell;

/**
 * @author ZN-yyrj015
 *
 */
public class BackOrderInfo {

	/**
	 * 商品名称
	 */
	@ExcelCell("A")
	private String goodsName;
	
	/**
	 * 未交量
	 */
	@ExcelCell("B")
	private Integer backOrderQuantity;

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Integer getBackOrderQuantity() {
		return backOrderQuantity;
	}

	public void setBackOrderQuantity(Integer backOrderQuantity) {
		this.backOrderQuantity = backOrderQuantity;
	}


	
}
