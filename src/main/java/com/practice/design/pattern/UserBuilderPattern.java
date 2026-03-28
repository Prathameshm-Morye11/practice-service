package com.practice.design.pattern;

public class UserBuilderPattern {

	private final String userId;
	private final String userName;
	private final String emailId;

	public UserBuilderPattern(userBuilder userBuilder) {
		this.userId = userBuilder.userId;
		this.userName = userBuilder.userName;
		this.emailId = userBuilder.emailId;
	}

	public String getUserId() {
		return this.userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public String getEmailId() {
		return this.emailId;
	}

	static class userBuilder {
		private String userId;
		private String userName;
		private String emailId;

		public userBuilder() {

		}

		public userBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}

		public userBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}

		public userBuilder setEmailId(String emailId) {
			this.emailId = emailId;
			return this;
		}

		public UserBuilderPattern build() {
			UserBuilderPattern user = new UserBuilderPattern(this);
			return user;
		}

	}

	@Override
	public String toString() {
		return this.userName + " " + this.userId + " " + this.emailId;
	}
}
