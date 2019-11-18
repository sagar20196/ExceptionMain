package com.sagarx.exceptions;

public class Division {
	
    private  int a, b;
    
	public Division(int a, int b) {
		this.a=a;
		this.b=b;	
		/*if(b==0) {
			throw new Exception("Variable can't be zero");
		}*/
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int getA() {
		return a;
	}


	public int divide() throws Exception {
		if(b==0) {
			throw new Exception("Variable can't be zero");
		}
		return a / b;
	}

	
}
