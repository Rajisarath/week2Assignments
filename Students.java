package week2.day4ass2;

public class Students {
	public void getStudentInfo() {
		System.out.println("getStudentInfo");
	}
	//by id 

	public void getStudentInfo(int rollno,int collegeCode) {
		System.out.println("student rollno" + rollno);
		System.out.println("student collegeCode" + collegeCode);
	}
	//by name
	//String name="Raji";
	public void getStudentInfo1(String studName) {
		System.out.println(studName);
		
	      
		
	}
	//byemail
	//String email="raji@123";
	public  String getStudentInfo(String studEmail) {
		return studEmail;
	}
	
	//by phnonum
     public int getStudentInfo(int studPhno) {
		 return studPhno ;
	}
     public static void main(String[] args) {
    	 Students stu=new Students();
    	 stu.getStudentInfo();
    	 stu.getStudentInfo(22, 54861);
    	 stu.getStudentInfo1("student name raji");
    	 String studEmail=stu.getStudentInfo("student email raji@123");
    	 System.out.println(studEmail);
    	 int studPhno=stu.getStudentInfo(6465446);
    	 System.out.println("student phno" + studPhno);
    	 
		
	}
	
	
			

}
