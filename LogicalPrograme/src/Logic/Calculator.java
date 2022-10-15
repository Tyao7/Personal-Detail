package Logic;

import java.util.Scanner;

public class Calculator {
	
public static void main(String[] args) {
	while(true) {Scanner sc =new Scanner(System.in);
	System.out.println("Enter two number ");
	  float a=sc.nextFloat();
	  float b=sc.nextFloat();
	
	 System.out.println("Enter 1 to Addition");
	  System.out.println("Enter 2 to Substraction");
	  System.out.println("Enter 3 to Multiplication");
	  System.out.println("Enter 4 to Division");
	  System.out.println("ENter 5 to percentage");
	  int num=sc.nextInt();
	  
	  switch(num) {
	  case 1:System.out.println(a+b);
	  break;
	  case 2:System.out.println(a-b);
	  break;
	  case 3:System.out.println(a*b);
	  break;
	  case 4:System.out.println(a/b);
	  break;
	  case 5:System.out.println((a/b)*100+"%");
	  break;
	  default:System.out.println("nikal");
	  }
	  
	}
}
}
