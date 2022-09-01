package Student;

public class firstYear extends studentDetails {
	String labname;
	String hodName;
	char section;
	
	public firstYear(String name, int age, String gender, float fees, String degree, String labname,String hodName, char section) {
		super(name, age, gender, fees, degree);
		
		this.labname = labname;
		this.hodName = hodName;
		this.section = section;
	}
	
	public void showfirstyear() {
		System.out.println("My name is " + name + " , my lab is " + labname + " , my hod name is " + hodName);
		System.out.println("I am from section" + section);
	}
	
	

}
