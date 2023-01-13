package Opps;



public class StudEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
//		Student s = new Student();
//        s.setRno(8);
//        s.setName("Akanksha");
//        s.setCity("Mumbai");
//        System.out.println("student roll:"+s.getRno());
//        System.out.println("student name:"+s.getName());
//        System.out.println("city:"+s.getCity());
//        
        
		Student s=new Student(46, "Sakshi", "Khopoli");
		System.out.println("student roll:"+s.getRno());
        System.out.println("student name:"+s.getName());
        System.out.println("city:"+s.getCity());
        
        
        s.setRno(43);
        System.out.println("Student roll no:" +s.getRno());
		
        
        
        
        
        
	}

}
