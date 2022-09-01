package Student;

public class sceondYear extends studentDetails {
	String labname;
	String industryVisit;
	String hodName;
	char section;
	
	public sceondYear(String name, int age, String gender, float fees, String degree, String labname,
			String industryVisit, String hodName, char section) {
		super(name, age, gender, fees, degree);
		this.labname = labname;
		this.industryVisit = industryVisit;
		this.hodName = hodName;
		this.section = section;
	}
	
	public void showSceondyear() {
		System.out.println("My name is " + name + ", i am from Sceond year");
		System.out.println("My Lab name is " + labname + " and I have to visit" + industryVisit);
		System.out.println("I am from "+ degree + " Section" + section);

	}
	
	

}
