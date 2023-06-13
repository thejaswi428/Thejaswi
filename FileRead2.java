import java.io.*;
class FileRead1{
public static void main(String args[])throws Exception{
FileReader fr=new FileReader("C:\\Users\\91735\\Desktop\\JavaTrainningJune2023\\fh\\demo.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int countVowels=0;
while((i=br.read())!=-1){
if(((char)i>='a')||((char)i>='e')||((char)i>='i')||((char)i>='o')||((char)i>='u')||
((char)i>='A')||((char)i>='E')||((char)i>='I')||((char)i>='O')||((char)i>='U')||
countVowels++;}
System.out.print(countVowels);
br.close();
fr.close();
}
}