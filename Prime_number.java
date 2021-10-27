import java.util.Scanner;
class Prime_number{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
boolean rs=isPrime_number(n);
if(rs==true)
{
System.out.println(n+ "is a prime number");
}
else 
{
System.out.println(n+ "is not a prime number");
}
static boolean isPrime_number(int x)
{
int temp=0;
for(int i=2;i<=n;i++)
{
if (n%i==0)
{
temp=temp+1;
}
}
return temp>0;
}
}
}
}