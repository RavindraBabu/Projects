package com.examples.javaImeplementation;

public class ThrowExampleDemo {
	static Student st = null;

	public static void main(String[] args) {

		st = new Student();
		st.setAge(25);
		st.setName("Ravindra");

		ThrowExampleDemo ex = new ThrowExampleDemo();
	
			try {
				ex.ExceptinChecking(10);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		System.out.println("checking");
		// st.toString();
	}

	
	
	public String display() {
		System.out.println(st.toString());
		return st.toString();

	}
	
	public void ExceptinChecking(int a) throws MyOwnException{
		if(a==10)
			try {
				throw new MyOwnException("firstexeceptaaa");
			} catch (MyOwnException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
 
}

class MyOwnException extends Exception{
	public MyOwnException(String msg){
	      super(msg);
	   }
	
}