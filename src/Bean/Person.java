package Bean;

import java.io.Serializable;

public abstract class Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String surname;
	private int age;
	
	
	Person() {
		
	}
	
	Person(String name,String surname,int age) {
		this.name=name;
		this.surname=surname;
		this.age=age;
		
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return this.name;
	}
	
	public void setSurname(String surname) {
		this.surname=surname;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return this.age;
	}
}
