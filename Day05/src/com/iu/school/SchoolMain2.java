package com.iu.school;


import java.util.Scanner;

public class SchoolMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st1 = new Student();
		Student st2 = new Student();
		//학생수 입력
		//학생수 만큼  학생 객체를 생성 해서 이름과 번호를 입력하고 출력
		
		int count=sc.nextInt();//2
	     
		
		//new Student() //학생이라는 객체
		Student st=null;
	     Student [] students= new Student[count];
		
		 for(int i=0;i<count;i++){
			
			 st = new Student();
			System.out.println("이름");
			st.name=sc.next();
			System.out.println("번호");
			st.num=sc.nextInt();
			students[i]=st;
			
			System.out.println("name");
			System.out.println("num");
			
			
		}
		 
		 for(int i=0;i<count;i++) {
			 System.out.println(students[i].name);
			 System.out.println(students[i].num);
			 
		 }
		
	
		
		
		
		
		
	}

}
