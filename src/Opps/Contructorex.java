package Opps;

import java.lang.reflect.Constructor;

import javax.swing.SpringLayout.Constraints;

//default construtor
public class Contructorex {
   String name;
   String city;
   int rollno;
   String course;
   private Contructorex() {
	   
	// TODO Auto-generated constructor stub
	   
	   System.out.println("Default");
	   name = "Akanksha";
}
   
   //constructor
   
   Contructorex(String city){
	   this.city = city;
	   System.out.println("I stay at " + city);
	   
   }
   Contructorex(int r, String cr){
	   rollno = r;
	   course = cr;
	   
	   System.out.println("Rollno and Course :" + rollno  + " and my course is " + course);
   }
   
    Contructorex(Contructorex a){
		System.out.println("copy constructor.");
		rollno = a.rollno;
		course =a.course;
		System.out.println(" copy 2 Rollno and Course :" + rollno  + " and my course is " + course);
		
		
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contructorex c= new Contructorex();
		System.out.println("My name is " + c.name);
		Contructorex c1 = new Contructorex("Khopoli");
		Contructorex c2 = new Contructorex(8,  "JAVA");
		Contructorex c3 = new Contructorex(c2);
		System.out.println("Copy  Rollno and Course :" + c3.rollno  + " and my course is " + c3.course);
	}
	
	
		
	
	
}


