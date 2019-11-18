package com.sagarx.exceptions;

public class ExceptionMain {

	public ExceptionMain() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws Exception {
		//Division div;
		Division div=new Division(10,0);
		try {
		//	div=new Division(10,0);
			System.out.println(div.divide());
			//return;
		}catch(Exception e) {
			div.setB(1);
			System.out.println(div.divide());
			return;
		}finally {
			System.out.println("Finally executed");
		}
		System.out.println("Is it executed");
	}

}
