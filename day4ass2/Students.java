package week2.day4ass2;

public class Students {
	public void getStudentInfo() {
		System.out.println("getStudentInfo");
	}
	//by id 

	public int getStudentInfo(int a) {
		return a;
	}
	//by name
	String name="Raji";
	public String getStudentInfo(String name) {
		System.out.println(name);
		return name;
	      
		
	}
	//byemail
	//String email="raji@123";
	//public  String getStudentInfo(String email) {
		//return email;
	//}
	
	//by phnonum
     public int getStudentInfo1(int b) {
		 return b;
	}
     public static void main(String[] args) {
    	 Students stu=new Students();
    	 stu.getStudentInfo();
    	 int id = stu.getStudentInfo(2);
    	 System.out.println(id);
    	 //stu.getStudentInfo();
    	 int phn = stu.getStudentInfo1(146546544);
    	 System.out.println(phn);
		
	}
	
	
			

}
