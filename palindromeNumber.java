import java.util.Scanner;
class PalindromeNumber
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
int n;
int rd=0;
System.out.print("Enter a number:");
n=sc.nextInt();
int num=n;
while(n>0){
rd=rd*10+(n%10);
n=n/10;
}
if(num==rd)
{
System.out.println("is a palindrome");
}
else
{
System.out.println("not a palindrome");
}
}
}