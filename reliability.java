/* RAVI KUMAR KURIL
   RAMJAS COLLEGE
   SEC B
   RELIABILITY PROGRAM
*/
//_______________________________________________________________________________
import java.io.*;

class reliability 
{
 public static void main(String args[])throws IOException
{
	int ch;
	do
{	System.out.println("__________________________________________________________");
	System.out.println("PLEASE ENTER THE CHOICE");
	System.out.println("FOR SERIES SYSTEMS PRESS 1 AND"
			   +"FOR PARALLEL SYSTEMS PRESS 2");
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	int choice=Integer.parseInt(br.readLine());
if (choice==1)
{	System.out.println("__________________________________________________________");
	System.out.println("PLEASE ENTER THE COMPONENT NO THAT ARE IN SERIES: ");
	int no=Integer.parseInt(br.readLine());
	double no2,rs=1;
double array[] =new double[no];
for(int i=1;i<=no;i++)
	{
		System.out.println("ENTER THE RELIABILITY OF "+i+"TH COMPONENT:");
		no2=Double.parseDouble(br.readLine());
		array[i-1]=no2;
		rs*=array[i-1];
	}
System.out.println("__________________________________________________________");
System.out.println("THE RELIABILITY IS:"+rs);

}
else
{
	System.out.println("PLEASE ENTER THE COMPONENT NO THAT ARE IN PARALLEL: ");
	System.out.println("__________________________________________________________");
	int no=Integer.parseInt(br.readLine());
	double no1,rp=1;
	double array[] =new double[no];
for(int i1=1;i1<=no;i1++)
	{
		System.out.println("ENTER THE RELIABILITY OF "+i1+"TH COMPONENT");
		no1=Double.parseDouble(br.readLine());
		array[i1-1]=no1;	
		rp=rp*(1-array[i1-1]);
	}
System.out.println("__________________________________________________________");
System.out.println("THE RELIABILITY IS:"+(1-rp));
}
System.out.println("__________________________________________________________");
System.out.println("TO CONTINUE PRESS 1 OR TO LEAVE PRESS 2 ");
ch =Integer.parseInt(br.readLine());
}while(ch==1);

System.out.println("HAVE A NICE DAY");
}
}

/******************************************************************************************
   OUTPUT:
******************************************************************************************
*/

C:\Users\ravi kuril\Desktop\java\practical\print>javac reliability.java

C:\Users\ravi kuril\Desktop\java\practical\print>java reliability
__________________________________________________________
PLEASE ENTER THE CHOICE
FOR SERIES SYSTEMS PRESS 1 ANDFOR PARALLEL SYSTEMS PRESS 2
1
__________________________________________________________
PLEASE ENTER THE COMPONENT NO THAT ARE IN SERIES:
3
ENTER THE RELIABILITY OF 1TH COMPONENT:
.2
ENTER THE RELIABILITY OF 2TH COMPONENT:
.2
ENTER THE RELIABILITY OF 3TH COMPONENT:
.2
__________________________________________________________
THE RELIABILITY IS:0.008000000000000002
__________________________________________________________
TO CONTINUE PRESS 1 OR TO LEAVE PRESS 2
1
__________________________________________________________
PLEASE ENTER THE CHOICE
FOR SERIES SYSTEMS PRESS 1 ANDFOR PARALLEL SYSTEMS PRESS 2
2
PLEASE ENTER THE COMPONENT NO THAT ARE IN PARALLEL:
__________________________________________________________
3
ENTER THE RELIABILITY OF 1TH COMPONENT
.1
ENTER THE RELIABILITY OF 2TH COMPONENT
.1
ENTER THE RELIABILITY OF 3TH COMPONENT
.1
__________________________________________________________
THE RELIABILITY IS:0.2709999999999999
__________________________________________________________
TO CONTINUE PRESS 1 OR TO LEAVE PRESS 2
2
HAVE A NICE DAY
