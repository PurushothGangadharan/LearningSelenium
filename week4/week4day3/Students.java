package week4day3assignment;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("Student ID:" +id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Student ID:"+id+"  "+"Student Name:"+ name);
	}
	public void getStudentInfo(String email,int phoneNumber)
	{
		System.out.println("Student EMAIL:"+email+"  "+"Student PhoneNumber:"+ phoneNumber);
	}
   public static void main(String[] args) 
   {
	   Students std=new Students();
	   std.getStudentInfo(123);
	   std.getStudentInfo(123, "abc");
	   std.getStudentInfo("abc@gmail.com", 1234);
   }

}
