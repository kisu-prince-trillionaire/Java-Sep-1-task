package Student;

public class Main {

	public static void main(String[] args) {
		studentDetails s1 = new studentDetails("vishal kumar", 22, "Male", 100000, "Btech");
		s1.display();
		
		firstYear fy1 = new firstYear("vishal kumar", 22, "Male", 100000, "Btech","java training", "venkatesh", 'C');
		fy1.showfirstyear();
		fy1.display();
		
		sceondYear sy1 = new sceondYear("mukesh kumar", 22, "Male", 100000, "Btech","Artificial intelligence","Amazon","Shyam",'D');
        sy1.showSceondyear();
        sy1.display();
        
		thirdYear ty1 = new thirdYear("suresh kumar", 22, "Male", 100000, "Btech","Walking stick","Amazon","Shyam",'D');
        ty1.showThirdyear();
        ty1.display();
        
        courseDetail cd1 = new courseDetail("CSE", "B.Tech", "Muthu", 10);
        cd1.courseDisplay();
	}

}
