package com.practice.design.pattern;

public class BuilderPatternImpl {

	public static void main(String[] args) {

		UserBuilderPattern user1 = new UserBuilderPattern.userBuilder().setUserName("Prathamesh").setUserId("101")
				.setEmailId("test@gmail.com").build();

		System.out.println(user1);

		UserBuilderPattern user2 = new UserBuilderPattern.userBuilder().setUserName("Ankit").setUserId("102")
				.setEmailId("ankit@gmail.com").build();

		System.out.println(user2);
	}

}
