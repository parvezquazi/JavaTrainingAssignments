package com.yash.oops8;

import java.util.Date;

public class Mobile extends Electronics {

	public void mobiledetails() {
		Electronics el = new Electronics();
		el.setId(1);
		el.setSemiconductor_type("Alcatel");
		el.setDateofmanufacturing(new Date(20 / 03 / 2007));

		System.out.println(el.getId());
		System.out.println(el.getSemiconductor_type());
		System.out.println(el.getDateofmanufacturing());

	}
}
