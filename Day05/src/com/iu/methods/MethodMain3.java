package com.iu.methods;

public class MethodMain3 {

	public static void main(String[] args) {
		MethodTest3 t3= new MethodTest3();
		
		int num =3;
		
		t3.test(num);
		Product product = new Product();
		product.price=700;
		t3.test2(product);
		System.out.println(product.price);
		
		System.out.println(num);//6
		
		t3.test2(product);
		System.out.println(product.price);
		

	}

}
