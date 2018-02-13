package bean;

public class Mather extends Person{
	
	private String maidenName;
	
	public Mather() {
		super();
		
	}
	
	public Mather(String name, String surname, int age, String maidenName) {
		super(name, surname, age);
		this.maidenName = maidenName;
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
	
	
	public String getMaidenName() {
		return maidenName;
	}
	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}	
	
	
	
	
}
