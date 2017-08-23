/* program: print the nature quadratic equation and roots from user input 
   name : Ravi Kumar Kuril
   class:Msc Operational Research
   college:ramjas college
*/
//______________________________________________________________________________________


import java.io.*;
class qudratic
{
public static void main(String args[]) throws IOException
{
	double a,b,c,d,r1,r2;
	System.out.println("enter the a,b,c");
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	a=Double.parseDouble(br.readLine());
	b=Double.parseDouble(br.readLine());
        c=Double.parseDouble(br.readLine());
	
       if (b*b==4*a*c)
	{
		System.out.println("The roots are real and same:");
               r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
               r2=(+b-Math.sqrt(b*b-4*a*c))/(2*a);
               
              //System.out.println(r1+","+r2);
               System.out.println("The roots are"+(r1/2*a)+","+(r2/2*a));
     
	}
       if(b*b>4*a*c)
	{
		System.out.println("the roots are real and distinct:");
               r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
               r2=(+b-Math.sqrt(b*b-4*a*c))/(2*a);
               
              //System.out.println(r1+","+r2);
               System.out.println("The roots are"+(r1/2*a)+","+(r2/2*a));



	}
       if(b*b<4*a*c) 
          {
            System.out.println("the roots are imaginary");
            
           }
}


}



************************************************************************
output:

C:\Users\ravi kuril\Desktop\java\practical>java qudratic
enter the a,b,c
2
2
2
the roots are imaginary
C:\Users\ravi kuril\Desktop\java\practical>
