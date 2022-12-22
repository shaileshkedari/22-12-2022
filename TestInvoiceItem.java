package com.excercises.pll;

import com.excercises.bll.InvoiceItem;
public class TestInvoiceItem {

	public static void main(String[] args) {
		InvoiceItem i=new InvoiceItem("2r","Lasts 30% longer",2,60);
		System.out.println(i.toString());
		i.setQty(4);
		System.out.println("After change quantity:"+i.getQty());
		System.out.println("After change quantity total price:"+i.getTotal());
	}

}
