package Student;

public class thirdYear extends studentDetails{
	String project;
	String placement;
	String hodName;
	char section;
	
	public thirdYear(String name, int age, String gender, float fees, String degree, String project, String placement,
			String hodName, char section) {
		super(name, age, gender, fees, degree);
		this.project = project;
		this.placement = placement;
		this.hodName = hodName;
		this.section = section;
	}
	
	public void showThirdyear() {
		System.out.println("My name is " + name + ", i am from Third year");
		System.out.println("My project name is " + project + " and I have got placement in " + placement);
		System.out.println("I am from "+ degree + " Section " + section);

	}
	

}
