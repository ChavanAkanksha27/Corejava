package Finalkeyword;

//final keyword (for variables) - can't modify/override
//final method - can't override
//final class - can't extend


final class nonExtendable {
	//pass
}

//can't extend the final class

//class tryExtend extends nonExtendable {
//	//pass
//}

class Test {
	//can't override or reassigned
	final int testVar = 10;
	
	final void testMethod() {
		System.out.println("This is a Final method!");
	}
}

class Test2 extends Test {
//	void testMethod() {
//		//getting the error, can't override!
//	}
}


public class FinalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test obj = new Test();
//		value can't be reassigned
//		testObj.testVar = 50;
	}


}


   