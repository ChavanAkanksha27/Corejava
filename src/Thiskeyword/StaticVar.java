package Thiskeyword;
class Student {
	int rollno;
	String name;
	static String courseName; //Static variable
}
 class StaticVar {

	private static final String S3 = null;

	public static void main(String[] args) {
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		
		Student.courseName= "Java full stack";
		
		s1.rollno=8;
	    s1.name="Akanksha";
	    
	    s2.rollno=9;
	    s2.name="Sakshi";

	    s3.rollno=10;
	    s3.name="Krupa";
	    
	    System.out.println("S1 Roll no= "+s1.rollno+ " S1 Name= "+s1.name+ " S1 Course Name="+s1.courseName);
	    System.out.println("S2 Roll no= "+s2.rollno+ " S2 Name= "+s2.name+ " S2 Course Name="+s2.courseName);
	    System.out.println("S3 Roll no= "+s3.rollno+ " S3 Name= "+s3.name+ " S3 Course Name="+s3.courseName);

s2.courseName="Python";
s2.name="ABC";

System.out.println("S1 Roll no= " +s1.rollno+ " S1 Name= "+s1.name+  " S1 Course Name="+s1.courseName);
System.out.println("S2 Roll no= " +s2.rollno+ " S2 Name= "+s2.name+  " S2 Course Name="+s2.courseName);
System.out.println("S3 Roll no= " +s3.rollno+ " S3 Name= "+s3.name+  " S3 Course Name="+s3.courseName);

						

 }

}
