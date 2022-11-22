package com.yash.oops8;

import java.util.Date;

public class LCD extends Electronics {

	public void lcddetails() {
		Electronics el1 = new Electronics();

		el1.setId(101);
		el1.setSemiconductor_type("Blackberry");
		el1.setDateofmanufacturing(new Date(11 / 03 / 2003));

		System.out.println(el1.getId());
		System.out.println(el1.getSemiconductor_type());
		System.out.println(el1.getDateofmanufacturing());
	}
}
