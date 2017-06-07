package prime;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int flag=0;
for(int i=2;i<n;i++)
{
	if(n%i==0)
	{
		flag=1;
	}
}
if(flag==1)
{
	System.out.println("not a prime number");
}
else
{
	System.out.println("prime number");
}
}
}