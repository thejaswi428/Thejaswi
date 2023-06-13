import java.io.*;
class CopyFile1{
public static void main(String args[])throws Exception{
FileReader fr=new FileReader("C:\\Users\\91735\\Desktop\\JavaTrainningJune2023\\fh\\demo.txt");
BufferedReader br=new BufferedReader(fr);
CharArrayWriter out=new CharArrayWriter();
int i;
while((i=br.read())!=-1){
out.write((char)i);
}
FileWriter f1=new FileWriter("C:\\Users\\91735\\Desktop\\JavaTrainningJune2023\\fh\\z.txt");
out.writeTo(f1);
f1.close();
System.out.println("Success...");
}
}
