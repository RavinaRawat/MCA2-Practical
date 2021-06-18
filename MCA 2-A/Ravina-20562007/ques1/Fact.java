import java.util.Scanner;
class Fact
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
int fact=1;
int n=num;
while(n>0)
{
fact=fact*n;
n--;
}
System.out.println("factorial of number "+num+" is "+fact);
}
}