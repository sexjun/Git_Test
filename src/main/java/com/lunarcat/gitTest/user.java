package com.lunarcat.gitTest;

/**
 * @aothor cds
 * @create 2019/10/6 - 15:11
 */
public class user {
	private String name;
	private String sex;
	private int age;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public user(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
}
