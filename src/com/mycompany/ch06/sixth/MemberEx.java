package com.mycompany.ch06.sixth;

public class MemberEx {

	public static void main(String[] args) {

		Member member = new Member();
		
//		member.name = "Tony";
		member.setName("Tony");

//		member.age = 28;
		member.setAge(28);
		
//		System.out.println("member.name: " + member.name);
		System.out.println("member.name: " + member.getName());
		System.out.println("member.age: " + member.getAge());
	}

}
