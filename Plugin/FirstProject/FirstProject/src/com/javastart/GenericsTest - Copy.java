package com.javastart;

public class GenericsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		genericClass genericData = new genericClass("Some Data Updated");

		
		
		/*
		Data data = new Data("Some Value string");
		String var = (String)data.getObj();
		System.out.print(var);*/
	}

}

 class Data {
	
	private Object obj;

	public Data(Object obj)	
	{
		 this.obj=obj;
		
	}
	@Override
	public String toString() {
		return "data [obj=" + obj + "]";
	}

	public Object getObj() {
		return obj;
	}
}

 
 class genericClass<T>{
	 
	 private T data;

	public genericClass(T data) {

		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "genericClass [data=" + data + "]";
	}
	 
	
	 
 }