/*
3.  Write a program to define a class employee having fields like empno ,name ,age,dept ,salary .

 a) Define constructors .

 b)Define get method to invoke values from user

c)   Store the complete  record of employee into file

d)   Read  all records of employee from file and display them on screen
*/

package Saturday_Lab_Assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable {
	int Empno;
	String Name;
	int age;
	String Dept;
	float Salary;
	
	public Employee()
	{
		Empno = 0;
		Name = " ";
		age = 0;
		Dept = " ";
		Salary = 0;
		
	}
	
	void get()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee id");
		Empno = s.nextInt();
		
		System.out.println("Enter Employee name");
		Name = s.next();
		
		System.out.println("Enter Employee Age");
		age = s.nextInt();
		
		System.out.println("Enter Employee Department");
		Dept = s.next();
		
		System.out.println("Enter Employee Salary");
		Salary = s.nextFloat();
	}
	
	void Display()
	{
		System.out.println("Employee ID = "+Empno);
		System.out.println("Employee Name = "+Name);
		System.out.println("Employee Age = "+age);
		System.out.println("Employee Department = "+Dept);
		System.out.println("Employee Salary = "+Salary);
	}
	
	
	

	public static void main(String[] args) throws Exception
	{
	Employee E = new Employee();
	
	E.get();
	FileOutputStream FOS = new FileOutputStream("Employee.dat");
	ObjectOutputStream o= new ObjectOutputStream(FOS);
	
	o.writeObject(E);
	o.close();
	
	FileInputStream FIS = new FileInputStream("Employee.dat");
	ObjectInputStream i = new ObjectInputStream(FIS);
	
	E = (Employee)i.readObject();
	E.Display();
	i.close();
	
	}

}
