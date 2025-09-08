import java.util.Scanner;
class Employee{
            private int age;
	public void setAge(int age){
	if(age >= 18){
	  this.age = age;
	  }
	 else{
	 System.out.println("Invalid age");
	 }
	 }
	 
	 public int getAge(){
	   return age;
	}
}
public class EmployeeQ3{
public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		
		System.out.println("Enter the age");
		int intage = sc.nextInt();
		
		e.setAge(intage);
		if (intage >= 18){
		System.out.println("Age" + e.getAge());
      }
	  sc.close();
      }
}
