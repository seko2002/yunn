package com.iu.school;

import java.util.Scanner;

public class SchoolMain4 {
	        //1.받은수만큼 학생 객체생성 ex)3명
			//2.각 학생의 정보를 입력-----student 탭 활용 
			//3.각 학생의정보가 출력
	Scanner sc = new Scanner(System.in);
	int count = sc.nextInt();
	

	Student st1 = new Student();
	Student st2 = new Student();
	Student st3 = new Student();
	Student st=null;
	
	
    Student [] students= new Student[count];{
	for(int i=0;i<count;i++) {
		st= new Student();
		System.out.println("이름");
		st.name=sc.next();
		System.out.println("번호");
		st.num=sc.nextInt();
		students[i]=st;
	}
	
	
	
			
		
	
	
	

}
}