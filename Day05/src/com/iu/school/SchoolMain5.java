package com.iu.school;

import java.util.Scanner;

public class SchoolMain5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Teacher iu = new Teacher();
		StudentView = ();
		System.out.println("선생님의 이름을 입력하세요");
		iu.name=sc.next();
		System.out.println("선생님의 과목명을 입력");
		iu.subject=sc.next();
		System.out.println("학생의 수를 입력");
		boolean check=true;
		while(check){
			System.out.println("1.학생정보입력");
			System.out.println("2.전체정보출력");
			System.out.println("3.학생정보검색");
			System.out.println("4.프로그램종료");
			int select = sc.nextInt();
			
			switch(select){
			    case 1:
				System.out.println("학생의 수 입력");
				select = sc.nextInt();
				iu.students = new Student[select];
				
				//학생정보 입력
				for(int i=0;i<iu.students.length;i++) {
					Student student= new Student();
					System.out.println("이름을 입력");
					student.name=sc.next();
					System.out.println("번호를입력");
					student.num=sc.nextInt();
					System.out.println("국어점수입력");
					student.kor=sc.nextInt();
					System.out.println("영어점수입력");
					student.eng=sc.nextInt();
					System.out.println("수학점수입력");
					student.math=sc.nextInt();
					student.total=student.kor+student.eng+student.math;
					student.avg=student.total/3.0;
					iu.students[0].name=sc.next();
					iu.students[i]=student;
					
					
					
						
					
				}
				
				
			break;
			    case 2:
			    	
			    	if(iu.students !=null) {
			    	for(int i=0;i<iu.students.length;i++);{
			    		view.view
			    	
				
			    	}
			   	}
			break;
				 
			    case 3:
			    	
			    	if(iu.students !=null) {
			    		System.out.println("학생정보입력");
				    	select = sc.nextInt();
			    		boolean find=true;
			    		for(int i =0;i<iu.students.length;i++) {
			    			if(select == iu.students[i].num)
			    				view.view(iu.students[1]);
			    			{
			    				System.out.println("이름:"+iu.students[i].name);
			    				System.out.println("번호:"+iu.students[i].num);
								System.out.println("국어:"+iu.students[i].kor);
							    System.out.println("영어:"+iu.students[i].eng);
							    System.out.println("수학:"+iu.students[i].math);
							    System.out.println("총점:"+iu.students[i].total);
							    System.out.println("평균:"+iu.students[i].avg);
							    find = !find;
							    break;
							    
			    			}
			    		}
			    		if(find) {
			    			System.out.println("없는번호입니다.");
			    		}
			    	
			    	
			    	
			    	}else{
			    		System.out.println("학생정보가 없습니다");
			    	}
			    	
			    	
			    	
			    	break;
					
					
					
			
				
				
				
			  
				
				
			
			}
				
				
				
				
				
				
				
				
				
				
				
			}
		
		
		for(int i=0;i<iu.students.length;i++) {
			System.out.println(iu.students[i].name);
			System.out.println(iu.students[i].avg);
		}
		
		
		
		
		
			
		
		
		
		
		
		
		

	}

}
