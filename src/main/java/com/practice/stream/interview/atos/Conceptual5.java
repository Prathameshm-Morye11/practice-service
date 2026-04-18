package com.practice.stream.interview.atos;

public class Conceptual5 {

	public static void main(String[] args) {
		try {

			int num=10/0;
		} catch (Exception e) {
			System.out.println("Exception e");
		}
		
		System.out.println("Success");	
//		finally {
//			System.out.println("Finally");
//		}
	}
}
