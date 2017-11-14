/**
 * 销量
 */
package com.firstwei.purchase.entity;

import com.firstwei.purchase.util.ExcelCell;

/**
 * @author ZN-yyrj015
 *
 */
public class SaleInfo {

	/**
	 * 商品名称
	 */
	@ExcelCell("A")
	private String goodsName;
	
	/**
	 * 销量
	 */
	@ExcelCell("B")
	private Integer saleQuantity;

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Integer getSaleQuantity() {
		return saleQuantity;
	}

	public void setSaleQuantity(Integer saleQuantity) {
		this.saleQuantity = saleQuantity;
	}
	
	
}
