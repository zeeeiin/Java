package Quiz10;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass_ {

	public static void main(String[] args) {
		System.out.println("----------문제1----------");
		/* 문제1
		 * 1. 클래스 User를 생성하세요
		 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정)
		 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
		 * 4. main에서 User객체를  생성 후  
		 *    (홍길동, 123123, 20)을 저장 하고 값을 확인하세요.
		 */
		
		//생성하고 값 사용하기?
		//일반 변수의 getter/setter﻿
//		User u1 = new User();
//		u1.setRrn(123123);
//		u1.setName("홍길동");
//		u1.setAge(20);

		User u1 = new User("홍길동", 123123, 20);
		System.out.println("Name:" + u1.getName());
		System.out.println("Rrn:" + u1.getRrn());
		System.out.println("Age:" + u1.getAge());
		

		System.out.println("----------문제2----------");
		/* 문제2
		 * 1. 메인에서 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
		 * 2. 메인에서 두번째 User객체를 생성하세요. ("김길동", 456456, 30)을 저장.
		 * 3. 메인에서 User배열에 두 객체를 저장하세요.
 		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
 		 * ex) User[] arr = new User[2];
		 */

		
		//새로운 객체 하나 더 생성
		User u2 = new User("김길동", 456456, 30);		
		
		User[] arr = new User[2]; //유저 객체를 담을 수 있음 - 주소값(변수명)으로 저장
		arr[0] = u1; //User배열의 0번째에 u1(객체)이 들어간 것
		arr[1] = u2;
		
		for(int i = 0; i < arr.length; i++) {
			//User u = arr[i];
			System.out.println(arr[i].getAge());
			System.out.println(arr[i].getName());
			System.out.println(arr[i].getRrn());
		}
		
		//arr에서 값을 꺼내면 유저타입으로 받아야한다는 의미
		for(User u : arr) { //user 타입 변수가 나와야함. 유저배열로 돌리면 유저로 받는 것
//			System.out.println(u);
			System.out.println(u.getName());
			System.out.println(u.getRrn());
			System.out.println(u.getAge());
		}
		
		System.out.println("----------문제3----------");
		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */

		Scanner scan = new Scanner(System.in);
		User[] uArr = new User[5];
		
		//여기 밖에다 User user = new User(); user객체를 만들면 안 됨!
		//기존이 값이 지워지기 때문에 반복문 안에서 user 객체를 만들어줘야한다
		
		int i = 0;		
		while(i < uArr.length) {
			
			System.out.print("name >");
			String name = scan.next();
			System.out.print("rrn >");
			int rrn = scan.nextInt();
			System.out.print("age >");
			int age = scan.nextInt();
			
//			User user = new User(); //1개 *5 User 객체 5개 생성
			
			//객체 안에 각각의 값을 넣을 때 setter 사용도 가능하고
			User user = new User(name, rrn, age); //이렇게 넣어줘도 됨
			uArr[i] = user;
			
			i++;	
			
			System.out.println(Arrays.toString(uArr));
						
		}
		
		
		
		
		
	}
}
