package com.generics;

import javax.print.DocFlavor.STRING;

public class MultipleParameter<T,U> {
	T t;
	U u;
	
	
	public MultipleParameter(T t, U u) {
		super();
		this.t = t;
		this.u = u;
	}

	
	@Override
	public String toString() {
		return "MultipleParameter [t=" + t + ", u=" + u + "]";
	}


	public T getT() {
		return t;
	}


	public void setT(T t) {
		this.t = t;
	}


	public U getU() {
		return u;
	}


	public void setU(U u) {
		this.u = u;
	}


	public static void main(String[] args) {
		MultipleParameter<String, Integer>[] x1=new MultipleParameter[5];
		x1[0]=new MultipleParameter("vip", 22);
		x1[1]=new MultipleParameter("Rohit", 21);
		MultipleParameter<String, Integer> x=new MultipleParameter<String, Integer>("vipin",22);
		System.out.println(x.getT()+"--"+x.getU());
		for (MultipleParameter<String, Integer> multipleParameter : x1) {
			System.out.println(multipleParameter);
		}
	}

}
