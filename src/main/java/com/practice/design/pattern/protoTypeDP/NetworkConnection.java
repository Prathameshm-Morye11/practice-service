package com.practice.design.pattern.protoTypeDP;

public class NetworkConnection implements Cloneable {
	private String ip;
	private String importantData;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getImportantData() {
		return importantData;
	}

	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void loadImportantData() {
		this.importantData = "This is very importantData";
	}

	@Override
	public String toString() {
		return importantData + " : " + ip;
	}
}
