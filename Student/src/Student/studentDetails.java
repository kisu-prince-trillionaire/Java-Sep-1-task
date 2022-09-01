package Student;

public class studentDetails {
	String name;
	int age;
	String gender;
	float fees;
	String degree;
	
	public studentDetails(String name, int age, String gender, float fees, String degree) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.fees = fees;
		this.degree = degree;
	}
	
	public void display() {
		System.out.println("My name is " + name + ", i am " + age + " years old");
	}
	
	
	
}

