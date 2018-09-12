/*
 * Copyright (c) 2008-2018 百度知道 All Rights Reserved.FileName: Adress.java@author: jack@date: 18-9-12 下午9:37@version: 1.0
 */

package com.xuhh.springmvc.model;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 21:37 2018/9/12
 * @Modified By:
 */
public class Address {
	private String province;
	private String city;

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address{" +
				"province='" + province + '\'' +
				", city='" + city + '\'' +
				'}';
	}
}
