package bean;

public class Child extends Person {	
	private Child[] chi;
	public Child() {
		super();
	}
	
	public Child(String name, String surname, int age, String gender) {
		super(name, surname, age, gender);
		
	}

	public String getName() {
		return super.getName();
	}

	public void setName(String name) {
		super.setName(name);
	}

	public String getSurname() {
		return super.getSurname();
	}

	public void setSurname(String surname) {
		super.setSurname(surname);
	}

	public int getAge() {
		return super.getAge();
	}

	public void setAge(int age) {
		super.setAge(age);
	}

	public Gender getGender() {
		return super.getGender();
	}

	public void setGender(String gender) {
		super.setGender(Gender.valueOf(gender));
	}
}
