
package com.xuhh.springmvc.model;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 0:18 2018/9/12
 * @Modified By:
 */
public class User {
	private Integer id;
	private String username;
	private String password;
	private String email;
	private int age;
	private  Address address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

//	@Override
//	public String toString() {
//		return "User{" +
//				"username='" + username + '\'' +
//				", password='" + password + '\'' +
//				", email='" + email + '\'' +
//				", age=" + age +
//				", address=" + address +
//				'}';
//	}

	/*这个地方为了测试方便，把toString重写了一下 */
	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				", age=" + age +
				'}';
	}

	public User(String username, String password, String email, int age) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.age = age;
	}
	public  User(){

	}
}
