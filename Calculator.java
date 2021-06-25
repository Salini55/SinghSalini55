import java.io.*;
import java.util.*;
class Calculator
{
public static void main(String[] args)
{
char operator;
Double n1,n2,result;

Scanner sc=new Scanner(System.in);

System.out.println("Enter the first number");
n1=sc.nextDouble();

System.out.println("Enter the second number");
n2=sc.nextDouble();

System.out.println("Enter any operator: +,-,*,/, or %");
operator=sc.next().charAt(0);

switch(operator)
{
	case '+':
	result=n1+n2;
	System.out.println(n1+"+"+n2+"="+result);
	break;

	case '-':
	result=n1-n2;
	System.out.println(n1+"-"+n2+"="+result);
	break;

	case '*':
	result=n1*n2;
	System.out.println(n1+"*"+n2+"="+result);
	break;

	case '/':
	result=n1/n2;
	System.out.println(n1+"/"+n2+"="+result);
	break;

	case '%':
	result=n1%n2;
	System.out.println(n1+"%"+n2+"="+result);
	break;

	default:
	System.out.println("Invalid operation!");
	break;

}
	sc.close();
}
}