class print_stars_plus_minus
{
public static void Print_multiple_chars(int i,char c)
{
int k=0;
for(k=1;k<=i;k=k+1)
System.out.print(c);
}
public static void main(String arg[])
{
int j=5;
Print_multiple_chars(j,'*');
Print_multiple_chars(j+1,'+');
Print_multiple_chars(j+2,'-');
System.out.print("");
}
}