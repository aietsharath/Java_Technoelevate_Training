import java.util.Scanner;
class Evenodd{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the integer value");
int z=sc.nextInt();
int even=z%2;
if (even>0)
System.out.println("entered integer number is odd");
else
System.out.println("entere integer number is even"); 
}
}