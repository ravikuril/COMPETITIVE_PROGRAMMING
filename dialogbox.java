import java.io.*;
import javax.swing.JOptionPane;
 class dialogbox 
{
 public static void main(String args[])throws IOException
{

calculate obj =new calculate();
	obj.cal();

}
}

class calculate
{
void cal()throws IOException
{
InputStreamReader br=new InputStreamReader(System.in);
BufferedReader keyboard=new BufferedReader(br);
String str;
int i,ch;
double num,product=1;
do 
{
	JOptionPane.showMessageDialog(null,"TO STOP THE PROGRAM ENTER THE 0");
	str=JOptionPane.showInputDialog("ENTER THE NEXT NUMBER");
	num=Double.parseDouble(str);
}
while(num!=0)
{
	product*=num;
	JOptionPane.showMessageDialog(null,"THE PRODUCT IS:"+product);
	System.out.println("DO U WANNA CONTINUE PRESS 1 IF YES OR 0 ");
	str=keyboard.readLine();
	ch=Integer.parseInt(str);
}
while(ch==1);
System.exit(0);
}
}