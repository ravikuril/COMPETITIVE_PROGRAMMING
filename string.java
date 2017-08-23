
import java.io.*;
class string
{
  public static void main(String args[]) throws IOException
  {
   	//InputStreamReader br = new InputStreamReader(System.in);
    	//BufferedReader keyboard = new BufferedReader(br);
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
    		        


    System.out.println(" ENTER THE STRING : ");
  String s1=br.readLine();
    
    int k = s1.length();


System.out.println("_________________________________");
    System.out.println("THE REVERSED STRING IS: ");
    for(int i=k-1;i>=0;i--)
    {
     char ch= s1.charAt(i);
     System.out.print(ch);
    }
	int temp1=0, temp=0; 
 System.out.println("\nTHE SUM OF THE DIGITS IS:");
   
     temp= Integer.parseInt(s1);
      

     while(temp>0)
	{ 
		   temp1=temp1+temp%10;
                   temp=temp/10;
	}
System.out.print(temp1);  


}
}


/*

OUTPUT:

C:\Program Files\Java\jdk1.6.0_02\bin>javac A\Str_Rev.java

C:\Program Files\Java\jdk1.6.0_02\bin>java A.Str_Rev
 Enter the string:
Hello World
 The Reversed String is: 
dlroW olleH
*/