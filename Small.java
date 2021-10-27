import java.util.Scanner;
class Small{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter integer number is");
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
int small=x;
if (y<small)
small=y;
if(z<small)
small=z;
System.out.println("smallest is" +small);
}
}