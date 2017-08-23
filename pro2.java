/* name: RAVI KUMAR KURIL
         MSC OR 
         SEC B
         RAMJAS COLLEGE 
PROGRAM2 THAT TAKES THE VALUES FROM COMMAND LINE ARGUMENTS AND RETURNS THE SUM AND AVERAGE. 
*/
//__________________________________________________________________________________________
import java.io.*;

class calculate 
{
double [] result=new double[2];
 int temp=0,j;
double avg;	
           double[] sum(int []array,int length_of_no)
			{  	
					j=length_of_no-1;	
				while((length_of_no>=0)&&j>=0)
					{
                                		temp=array[j]+temp;	
                                                length_of_no--;
						j--;
					}
			result[0]=temp;
			return(result);

			}
		   double[] average(int length_of_no)
			{
   				 avg=temp/length_of_no;
				
			result[1]=avg;
			return(result);
			}
			
		}


class pro2
{
	public static void main(String args[])throws IOException	
	{ 
          int[]array=new int[args.length];
         int length=args.length;

         	 System.out.println("YOU ENTERED THE "+length+"NO:");  
		for(int i =0;i<args.length;i++)
			{
				array[i]=Integer.parseInt(args[i]);
			System.out.println("THE ENTERED NO IS:"+array[i]);
			}
		 calculate a= new calculate();
                double temp[]=a.sum(array,length); 
                 double temp1[]=a.average(length);
			        
				System.out.println("-------------------------");
				System.out.println("THE SUM IS:"+temp[0]);
				
				System.out.println("THE AVERAGE IS:"+temp1[1]);

		}
	}
 //**********************************************************************************
/*
OUTPUT:
C:\Users\ravi kuril\Desktop\java\practical\print>javac pro2.java

C:\Users\ravi kuril\Desktop\java\practical\print>java pro2 1 2 3
YOU ENTERED THE 3NO:
THE ENTERED NO IS:1
THE ENTERED NO IS:2
THE ENTERED NO IS:3
-------------------------
THE SUM IS:6
THE AVERAGE IS:2.0
*/