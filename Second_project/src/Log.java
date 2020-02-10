import java.io.*;
public class Log {
int a,b;
void printing(int a,int b,String method)
{
try
{
BufferedWriter out = new BufferedWriter(new FileWriter("C:/Users/Personal/secondprojectfile.txt",true));
out.write("\r\nexception caused due to "+a+" , "+b+" during "+method);
out.close();
}catch(Exception e)
{
	//System.out.println(e);
}
}

}
