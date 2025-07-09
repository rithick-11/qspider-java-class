package Dev;

import java.util.Scanner;

class Sample{
	// static single line init
	static int a = 10; 
	
	// non-static single line init
	int b;
	
	// static multi line init
	static {
		System.out.println("this is static multiline init");
		System.out.println(a);
		
	}
	
	// constructor
	Sample(int b) {
		this.b = b;
		System.out.println("this is constroctor");
		System.out.println(b);
	}
	
	int add(int a, int b){
		return a+b;
	}
	
	int sub(int a, int b){
		return a-b;
	}
	
	// non-static multi line init
	{
		System.out.println("this is non static init");
		System.out.println(b);
	}
}


class StaticPrg {
	public static void main(String[] args) {
		new Sample(10);
	}
}