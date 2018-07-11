import java.util.Scanner;
class Perfect {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your no");  
int n=sc.nextInt();
int rem,sum=0;   
for(int i=1;i<(n-1);i++)
{
rem=n%i;
if(rem==0)
{
sum=sum+i;
}
}
if(sum==n)
{
System.out.println("Perfect Number");
}
else 
{
System.out.println("Not a Perfect numer");
}
}
}