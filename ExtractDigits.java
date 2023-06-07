import java.util.Scanner;
class ExtractDigits
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
String strobj=sc.nextLine();
for(int i=0;i<strobj.length()-1;i++)
{
if(strobj.charAt(i)>='0'&&strobj.charAt(i)<='9')
System.out.print(strobj.charAt(i));
}
}
}
