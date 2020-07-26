package Studentinfo;

public class students {
	
	public void getStudentInfo(int id) {
		
		System.out.println("The student id is:"+" "+ id);

	}

	public void getStudentInfo(int id, String name) {
		System.out.println("The student id is:"+" "+ id+" "+" and the nam is:"+name);
		
	}
	
	public void getStudentInfo(String email, int phone) {
		System.out.println("The emailid is:"+" "+ email+" "+ "the phonenumber is:"+phone);
		
	}
	
	public static void main(String[] args) {
		students s1=new students();
		s1.getStudentInfo(123);
		s1.getStudentInfo(234, "Vivek");
		s1.getStudentInfo("Bean@gmail.com",789877);
		
		
	}
	
	
	
}
