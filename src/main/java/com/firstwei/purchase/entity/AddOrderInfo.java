/**
 * 加单
 */
package com.firstwei.purchase.entity;

/**
 * @author ZN-yyrj015
 *
 */
public class AddOrderInfo {

	/**
	 * 商品名称
	 */
	private String goodsName;
	
	/**
	 * 加单数量
	 */
	private Integer addOrderQuantity;

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Integer getAddOrderQuantity() {
		return addOrderQuantity;
	}

	public void setAddOrderQuantity(Integer addOrderQuantity) {
		this.addOrderQuantity = addOrderQuantity;
	}
	
	
}
