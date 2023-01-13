package ExceptionHandling;



 class Learner {
	 String fname, Iname;
	 
	 
public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getIname() {
		return Iname;
	}
	public void setIname(String iname) {
		Iname = iname;
	}
	
}


class LearnerUserdefineException extends Exception{
	public LearnerUserdefineException(String s){
		super(s);
	}

public class LearnerUserdefinedException{
	void checkName(String fname, String Iname) {
		if(fname.isEmpty() && Iname.isEmpty()) {
			throw new LearnerUserdefineException("fname : iname is empty");
		}
		else if(fname.isBlank()) {
			throw new LearnerUserdefineException("fname is empty" );
			
		}
		else if (Iname.isBlank()) {
			throw new LearnerUserdefineException("Iname is empty");
		}
		else {
			System.out.println(fname+ " " +Iname);
		}
}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Learner l= new Learner(); 
		
		l.setFname("a");
		l.setIname("");
		LearnerUserdefineException lu= new LearnerUserdefineException();
		try {
	
		    lu.checkName(l.getFname(), l.getLname());
		}
		catch(LearnerUserdefineException e){
			e.printStackTrace();
		}
			
		}
}

