package com.ns.clould.bean;

public class User {
		private  String name;
		
		private  int age;
		
		private Boolean isBeautiful;
		
		public User(String name,int age ,Boolean isBeautiful){
			this.name =name;
			this.age = age;
			this.isBeautiful =isBeautiful;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public Boolean getIsBeautiful() {
			return isBeautiful;
		}

		public void setIsBeautiful(Boolean isBeautiful) {
			this.isBeautiful = isBeautiful;
		}
}
