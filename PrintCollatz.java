import java.util.Scanner;
class PrintCollatz {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
 System.out.println("Enter your no");  
   int n=sc.nextInt();
while(n>1)
{
if(n%2==0)
{
n=n/2;
System.out.print(n +" ");
}
else if(n%2!=0)
{
n=(n*3)+1;
System.out.print(n +" ");
}
else return;
}
}
}