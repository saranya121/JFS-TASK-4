package task2;

public class Voter {
	private String voterId;
	private String name;
	private int age;

	public Voter() {
	}

	public Voter(String voterId, String name, int age) throws InvalidAgeException {
		super();
		this.voterId = voterId;
		this.name = name;
		this.age = age;
		if (this.age < 18) {
			throw new InvalidAgeException("Given age: " + age + " is invalid age for voter");
		} else {
			System.out.println("Given age is valid");
		}
	}

	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
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

}
