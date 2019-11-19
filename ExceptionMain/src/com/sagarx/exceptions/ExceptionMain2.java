package com.sagarx.exceptions;

 /* 
  * Checked exception are error scenario that requires to be handled in a code or else you will get compile time error
  * For ex: If you are using FileInputStream it throw FileNotFoundException and we must catch it in try catch block or throw it again to a caller method.
 
  Unchecked Exception mostly caused by poor programming.
  For ex: NullPointerException
  */
 
import java.io.FileInputStream;

import java.io.FileNotFoundException;

public class ExceptionMain2 {

	public ExceptionMain2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a=10, b=0;
		//System.out.println(a/b);
		Object obj= null;
		
			try {
				FileInputStream fis=new FileInputStream("");
			} catch (FileNotFoundException e) {
				
			}
		obj.toString();
	}

}
