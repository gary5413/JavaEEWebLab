package lab06.model;

import java.util.Arrays;

public class memberBean {
	private String name;
	private String email;
	private String[] fruits;
	public memberBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public memberBean(String name, String email, String[] fruits) {
		super();
		this.name = name;
		this.email = email;
		this.fruits = fruits;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getFruits() {
		return fruits;
	}
	public void setFruits(String[] fruits) {
		this.fruits = fruits;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("memberBean [name=");
		builder.append(name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", fruits=");
		builder.append(Arrays.toString(fruits));
		builder.append("]");
		return builder.toString();
	}
	
}
