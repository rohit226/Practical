package Saturday_Lab_Assignment;

import java.util.Scanner;

/*10.Write a program to ask two password  from user (in string )
and compare them .If
both are equal print “access allowed “ otherwise ask string maximum 
of three times*/

public class Q7 {
String pwd;
String pwd2;
Scanner sc=new Scanner(System.in);
void CheckPassword() {
	int i;
	for( i=1;i<=3;i++) {
		System.out.println("enter password");
		pwd=sc.next();
		System.out.println("re-enter password");
		pwd2=sc.next();
		
	if(pwd.equals(pwd2)) {
		System.out.println("Access Granted...");
		break;
	}
	}
	if(i==4) {
		System.out.println("GO back");
		
	
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q7 q=new Q7();
		q.CheckPassword();

	}

}
