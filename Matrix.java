/* RAVI KUMAR KURIL
   RAMJAS COLLEGE 
   SEC B
   MATRIX PROGRAM
*/



import java.io.*;
class Matrix
	{
		public static void main(String args[])throws IOException		
		{
                
	 	System.out.println("PLEASE ENTER THE(N*N)MATRIX");
  		System.out.println("PLEASE ENTER THE NO OF ROW OF A MATRIX");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int length=Integer.parseInt(br.readLine());
    		int [][]a=new int[length][length];
		int [][]b=new int[length][length];
		int [][]c=new int[length][length];
		System.out.println("PLEASE ENTER THE ROWWISE ELEMENT OF MATRIX A");
		for(int i=0;i<length;i++)
			{
			for(int j=0;j<length;j++)
				{				
			  		a[i][j]=Integer.parseInt(br.readLine());
                        	}	

			}
                            
                     System.out.println("PLEASE ENTER THE ROWWISE ELEMENT OF MATRIX B");
	         	for(int i=0;i<length;i++)
		       	{
		 	for(int j=0;j<length;j++)
			    {				
			  	  b[i][j]=Integer.parseInt(br.readLine());
                            }	
			}
			System.out.println("______________________________");
			System.out.println("MATRIX A IS:");
			for(int i=0;i<length;i++)
		        	{
				for(int j=0;j<length;j++)
					{
					System.out.print("\t"+a[i][j]);
					                
					}
					System.out.println("\n");		
			
			}
			System.out.println("\nMATRIX B IS:");
		for(int i=0;i<length;i++)
			{
				for(int j=0;j<length;j++)
					{
					System.out.print("\t"+b[i][j]);
					                
					}
					System.out.println("\n");		
			
			}


    calculate_various_function ob1=new calculate_various_function();
    int ctr=1;
    int response;
        while(ctr==1)
       {	

     System.out.println("PLEASE ENTER THE CHOICE");
     System.out.println("1.FOR SUM PRESS 1"+"\n2.FOR SUBTRACTION PRESS 2"+"\n3.FOR MULTIPLY PRESS 3"+"\n4.FOR TRANSPOSE PRESS 4"+"\n5.FOR SYMMETRIC CHECK PRESS 5"+"\n6.FOR SKEW SYMMETRIC CHECK PRESS 6");
       
      
		BufferedReader br1 =new BufferedReader(new InputStreamReader(System.in));
		int choice=Integer.parseInt(br1.readLine());
                 
       
    switch(choice)
	 {		
          case 1:ob1.sum(a,b,c,length);
               	 	break;    	
 	  case 2:ob1.subtract(a,b,c,length);
     			break;
	  case 3:ob1.multiply(a,b,c,length);
     			break;
	  case 5:ob1.symmetric_check(a,length);
     			break;
	  case 6:ob1.skew_symmetric_check(a,length);
	     		break;	
	  case 4:ob1.transpose(a,length);		
			break;

		}
        System.out.println("DO YOU WANT TO CONTINUE IF YES THEN WRITE PRESS 1 ,IF NO PRESS 2: ");
     BufferedReader a1 = new BufferedReader(new InputStreamReader(System.in));
     response=Integer.parseInt(br1.readLine());
     if(response==2) ctr--;
         
      }	
	
     }	
}
//_____________________________________________________________________________	
class calculate_various_function
{
void sum(int a[][],int b[][],int c[][],int length)
{

for(int i=0;i<length;i++)
		{
		for(int j=0;j<length;j++)
					{
					 c[i][j]=a[i][j]+b[i][j];
			}
		}
	System.out.println("______________________________");
	System.out.println("PRINTING THE MATRIX AFTER ADDITION:");
	for(int l=0;l<length;l++)
	{
		for(int m=0;m<length;m++)
		{
			System.out.print("\t"+c[l][m]);
		}
		System.out.println("\n");
	}
}
//_____________________________________________________________________________
void subtract(int a[][],int b[][],int c[][],int length)
{

for(int i=0;i<length;i++)
	{
		for(int j=0;j<length;j++)
				{
				 c[i][j]=a[i][j]-b[i][j];		
			}
	}
        System.out.println("______________________________");
	System.out.println("PRINTING THE MATRIX AFTER SUBTRACTION:");
	for(int l=0;l<length;l++)
	{
		for(int m=0;m<length;m++)
		{
			System.out.print("\t"+c[l][m]);
		}
		System.out.println("\n");
	}





}

//_____________________________________________________________________________
void multiply(int a[][],int b[][],int c[][],int length)
{
int sum;
for(int i=0;i<length;i++)
{ 
  for(int j=0;j<length;j++)
   	{
     	 sum = 0;
    	 for(int k=0;k<length;k++)
    	 sum = sum + a[i][k] * b[k][j];
   	 c[i][j]=sum;
   }
}
	System.out.println("______________________________");
	System.out.println("PRINTING THE MATRIX AFTER MULTIPLICATION AxB:");
	for(int l=0;l<length;l++)
	{
		for(int m=0;m<length;m++)
		{
			System.out.print("\t"+c[l][m]);
		}
		System.out.println("\n");
	}



}	
//_____________________________________________________________________________	
void transpose(int a[][],int length)
{
int i=1,j=2,temp;
for(int i1=0;i1<length&&(i<length&&j<=length);i1++)
		{
			{ 
			
				temp=a[j-1][i-1];
				a[j-1][i-1]=a[i-1][j-1];	
				a[i-1][j-1]=temp;
				if(i1%2==0)	
                                   j++;
				else  i++;	
			}
}
	System.out.println("______________________________");
	System.out.println("PRINTING THE MATRIX AFTER TRANSPOSE:");
for(int l=0;l<length;l++)
	{
		for(int m=0;m<length;m++)
		{
			System.out.print("\t"+a[l][m]);
		}
		System.out.println("\n");
			}
		}		


//_____________________________________________________________________________

void symmetric_check(int a[][],int length)
{
 int i=1,j=2,ctl=0,redflag=0;
for(int i1=0;i1<length&&(i<length&&j<=length);i1++)
		{
			{ 
				if(i!=j)
				if(a[i-1][j-1]==a[j-1][i-1])
			           ctl++;
				if(i1%2==0)	
                                   j++;
				else  i++;	
			}
		}
System.out.println("______________________________");
if(length>2&&(ctl==(length)))
{
	redflag++; 
	System.out.println("\"A\" IS A SYMMETRIC MATRIX:");
}
if((length==2)&&((length-1)==ctl))
{
	redflag++;
	System.out.println("\"A\" IS A SYMMETRIC MATRIX:");
}
if(redflag!=1)
	System.out.println("\"A\" IS NOT A SYMMETRIC MATRIX:");


}
//_____________________________________________________________________________	
void skew_symmetric_check(int a[][],int length)
{
		int l=1,m=2,ctl1=0,greenflag=0;
	for(int i2=0;i2<length&&(l<length&&m<=length);i2++)
		{
			if(a[i2][i2]==0)
			if(a[l-1][m-1]==(-a[m-1][l-1]))
				ctl1++;
			if(i2%2==0)	{m++;}
			else  l++;
		}
	System.out.println("______________________________");
if(length>2&&(ctl1==(length)))
{
	greenflag++; 
	System.out.println("\"A\" IS A SKEW_SYMMETRIC MATRIX:");
}
if((length==2)&&((length-1)==ctl1))
{	
	greenflag++;
	System.out.println("\"A\" IS A SKEW_SYMMETRIC MATRIX:");
}
if(greenflag!=1)
	System.out.println("\"A\" IS NOT A SKEW_SYMMETRIC MATRIX:");

}	
}	
********************************************************************************
OUTPUT
********************************************************************************

C:\Users\ravi kuril\Desktop\java\practical>javac Matrix.java

C:\Users\ravi kuril\Desktop\java\practical>java Matrix
PLEASE ENTER THE(N*N)MATRIX
PLEASE ENTER THE NO OF ROW OF A MATRIX
2
PLEASE ENTER THE ROWWISE ELEMENT OF MATRIX A
1
2
3
4
PLEASE ENTER THE ROWWISE ELEMENT OF MATRIX B
1
2
3
4
______________________________
MATRIX A IS:
        1       2

        3       4


MATRIX B IS:
        1       2

        3       4

PLEASE ENTER THE CHOICE
1.FOR SUM PRESS 1
2.FOR SUBTRACTION PRESS 2
3.FOR MULTIPLY PRESS 3
4.FOR TRANSPOSE PRESS 4
5.FOR SYMMETRIC CHECK PRESS 5
6.FOR SKEW SYMMETRIC CHECK PRESS 6
1
______________________________
PRINTING THE MATRIX AFTER ADDITION:
        2       4

        6       8

DO YOU WANT TO CONTINUE IF YES THEN WRITE PRESS 1 ,IF NO PRESS 2:
1
PLEASE ENTER THE CHOICE
1.FOR SUM PRESS 1
2.FOR SUBTRACTION PRESS 2
3.FOR MULTIPLY PRESS 3
4.FOR TRANSPOSE PRESS 4
5.FOR SYMMETRIC CHECK PRESS 5
6.FOR SKEW SYMMETRIC CHECK PRESS 6
2
______________________________
PRINTING THE MATRIX AFTER SUBTRACTION:
        0       0

        0       0

DO YOU WANT TO CONTINUE IF YES THEN WRITE PRESS 1 ,IF NO PRESS 2:
1
PLEASE ENTER THE CHOICE
1.FOR SUM PRESS 1
2.FOR SUBTRACTION PRESS 2
3.FOR MULTIPLY PRESS 3
4.FOR TRANSPOSE PRESS 4
5.FOR SYMMETRIC CHECK PRESS 5
6.FOR SKEW SYMMETRIC CHECK PRESS 6
3
______________________________
PRINTING THE MATRIX AFTER MULTIPLICATION AxB:
        7       10

        15      22

DO YOU WANT TO CONTINUE IF YES THEN WRITE PRESS 1 ,IF NO PRESS 2:
1
PLEASE ENTER THE CHOICE
1.FOR SUM PRESS 1
2.FOR SUBTRACTION PRESS 2
3.FOR MULTIPLY PRESS 3
4.FOR TRANSPOSE PRESS 4
5.FOR SYMMETRIC CHECK PRESS 5
6.FOR SKEW SYMMETRIC CHECK PRESS 6
4
______________________________
PRINTING THE MATRIX AFTER TRANSPOSE:
        1       3

        2       4

DO YOU WANT TO CONTINUE IF YES THEN WRITE PRESS 1 ,IF NO PRESS 2:
1
PLEASE ENTER THE CHOICE
1.FOR SUM PRESS 1
2.FOR SUBTRACTION PRESS 2
3.FOR MULTIPLY PRESS 3
4.FOR TRANSPOSE PRESS 4
5.FOR SYMMETRIC CHECK PRESS 5
6.FOR SKEW SYMMETRIC CHECK PRESS 6
5
______________________________
"A" IS NOT A SYMMETRIC MATRIX:
DO YOU WANT TO CONTINUE IF YES THEN WRITE PRESS 1 ,IF NO PRESS 2:
1
PLEASE ENTER THE CHOICE
1.FOR SUM PRESS 1
2.FOR SUBTRACTION PRESS 2
3.FOR MULTIPLY PRESS 3
4.FOR TRANSPOSE PRESS 4
5.FOR SYMMETRIC CHECK PRESS 5
6.FOR SKEW SYMMETRIC CHECK PRESS 6
6
______________________________
"A" IS NOT A SKEW_SYMMETRIC MATRIX:
DO YOU WANT TO CONTINUE IF YES THEN WRITE PRESS 1 ,IF NO PRESS 2:
2

C:\Users\ravi kuril\Desktop\java\practical>




	
	