package com.iu.methods;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.plus");
		System.out.println("2.minus");
		int select = sc.nextInt();
		
		
		
		MethodTest1 m1= new MethodTest1();//변수명만 같을뿐 실제로 들어가는값은 다르다.
		
		
		if(select == 1) {
			System.out.println("1번 숫자를입력");
			int n1= sc.nextInt();
			System.out.println("2번 숫자를입력");
			int n2= sc.nextInt();
			
			m1.hap(n1,n2);
		}else {
			
			m1.minus();
		}
		 System.out.println("size를 입력");
		 int size = sc.nextInt();
		 
	     m1.bark(size);//호출할때 넣는값=인자값
		
		
		
		
		}
			
	
		
	}


