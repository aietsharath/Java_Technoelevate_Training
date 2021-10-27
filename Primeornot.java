import java.util.Scanner;
class Primeornot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int p=sc.nextInt();
	for (int i=2;i<p; i++) 
		if(p%i!=0)
		{
	System.out.println("number is prime");
		}
		else
			System.out.println("number not is prime");
	
}
}
