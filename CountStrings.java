import java.util.Scanner;
public class CountStrings {
public static void main(String[]args){
	  Scanner sc=new Scanner(System.in);
    	  String str=sc.nextLine();
	  int count=0;
          for(int i=0;i<=str.length()-1;i++){
                   count++;
                 }	
System.out.println(count);
}  
}