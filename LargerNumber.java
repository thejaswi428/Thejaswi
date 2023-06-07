import java.util.Scanner;
class LargeNumber{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int max;
if(a>b)
{
if(a>b)max=a;
else max=b;
}
else
{
if(b>c)max=a;
else max=c;
}
System.out.println("Maximum no is:"+max);
}
}