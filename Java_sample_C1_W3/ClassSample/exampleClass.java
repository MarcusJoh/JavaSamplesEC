import java.io.*;
public class exampleClass {

   static String name;
   static int age;
   public static String designation;
	private static double salary;

  

  
   public static int empAge(int empAge) {
      age = empAge;
      return age;
   }

   
   public static void empDesignation(String empDesig) {
      designation = empDesig;
   }

  
   public void empSalary(double empSalary) {
      salary = empSalary;
   }

  
   public static void printEmployee() {
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Designation:" + designation );
      System.out.println("Salary:" + salary);
   }
}