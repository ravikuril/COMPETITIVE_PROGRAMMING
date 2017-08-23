/* name: RAVI KUMAR KURIL
         MSC OR 
         SEC B
         RAMJAS COLLEGE 
*/
//_________________________________________________________________________________
import java.io.*;
class eoq
{
public static void main(String args[])throws IOException
{
		double eoq1,dem_rate,set_cost,hold_cost,tbo;
		System.out.println("please enter the demandrate,setcost,holdcost");
		InputStreamReader br=new InputStreamReader(System.in);
		BufferedReader keyboard=new BufferedReader(br);

       
		dem_rate=Double.parseDouble(keyboard.readLine());			    
          	set_cost=Double.parseDouble(keyboard.readLine());
		hold_cost=Double.parseDouble(keyboard.readLine());

		eoq1=Math.sqrt((2*dem_rate*set_cost)/(hold_cost));
		tbo=Math.sqrt((2*set_cost)/(dem_rate*hold_cost));
		
		System.out.println("_____________________________________________");
		System.out.println("EOQ is:"+eoq1);
		System.out.println("Time between orders is:"+tbo);
}
}


***********************************************************************************
OUTPUT:

C:\Users\ravi kuril\Desktop\java\practical\print>javac eoq.java

C:\Users\ravi kuril\Desktop\java\practical\print>java eoq
please enter the demandrate,setcost,holdcost
4
5
6
___________________________________________________________________________________
EOQ is:2.581988897471611
Time between orders is:0.6454972243679028