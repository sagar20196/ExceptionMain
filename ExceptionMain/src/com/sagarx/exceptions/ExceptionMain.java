package com.sagarx.exceptions;

/**
 * Throwable
 * 			Error- We can't do anything because a reasonable applications should not try to catch. All the subclasses of error should not try to
 * 					handle it. Those situations are beyond our control.
 * 			Exception- This condition is under control because a reasonable applications might try to catch.
 * 						Checked Exception- Checked Exceptions are exception scenario that we can anticipate in a program and try to recover from it. 
 * 						Runtime Exception- These are caused by bad programming. Arithmetic exception is Runtime Exception.
 * 
 *
 */
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
			//return;
		}finally {
			System.out.println("Finally executed");
		}
		System.out.println("Is it executed");
	}

}
