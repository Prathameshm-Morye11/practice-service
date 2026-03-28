package com.practice.design.pattern.protoTypeDP;

public class ProtoTypeDesignPattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Creating Object using prototype Design Pattern");

		NetworkConnection networkConnection1 = new NetworkConnection();
		networkConnection1.setIp("10.20.123.456");
		networkConnection1.loadImportantData();

		System.out.println(networkConnection1);

		NetworkConnection networkConnection2 = (NetworkConnection) networkConnection1.clone();
		System.out.println(networkConnection2);
	}
}
