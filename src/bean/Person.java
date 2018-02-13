package bean;

public abstract class Person {
	private int age;
	private String name;
	private String surname;
	private Gender gender;
	private String maidenName;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getMaidenName() {
		return maidenName;
	}

	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}
	
	public Person () {
		super();
	}
	public Person(String name, String surname, int age) {
		super();
		this.age = age;
		this.name = name;
		this.surname = surname;		
	}
	
	public Person(String name, String surname, int age, String gender) {
		super();
		this.age = age;
		this.name = name;
		this.surname = surname;
		this.gender = Gender.valueOf(gender);
	}
	
	
	
	
	
}
