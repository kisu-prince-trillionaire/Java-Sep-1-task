package Student;

public class courseDetail {
	String coursename;
	String Dept;
	String deanname;
	int subjects;
	public courseDetail(String coursename, String dept, String deanname, int subjects) {
		super();
		this.coursename = coursename;
		Dept = dept;
		this.deanname = deanname;
		this.subjects = subjects;
	}
	
	public void courseDisplay() {
		System.out.println("I am from Department" + Dept);
		System.out.println("My dean name is" + deanname);
		System.out.println("I am from " + coursename + " and i have " + subjects + " subjects");

	}

}
