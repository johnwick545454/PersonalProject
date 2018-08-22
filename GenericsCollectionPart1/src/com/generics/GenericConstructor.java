package com.generics;

public class GenericConstructor<T> {
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public GenericConstructor(T t) {
		super();
		this.t = t;
	}

	public GenericConstructor() {

	}

	@Override
	public String toString() {
		return "GenericConstructor [t=" + t + "]";
	}

	public static void main(String[] args) {
		GenericConstructor<String> x=new GenericConstructor<String>("vipin");
		System.out.println(x);
		GenericConstructor<Integer> x1=new GenericConstructor<>(22);
		System.out.println(x1.getT());
	}

}
