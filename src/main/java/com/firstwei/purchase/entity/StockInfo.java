/**
 * 库存
 */
package com.firstwei.purchase.entity;

import com.firstwei.purchase.util.ExcelCell;


/**
 * @author ZN-yyrj015
 *
 */
public class StockInfo {

	/**
	 * 商品名称
	 */
	@ExcelCell("A")
	private String goodsName;
	
	/**
	 * 库存数量
	 */
	@ExcelCell("B")
	private Integer stockQuantity;

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Integer getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	
}
