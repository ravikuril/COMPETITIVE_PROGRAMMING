/* RAVI KUMAR KURIL
   SEC B 
   RAMJAS COLLEGE 
*/
//____________________________________________________________________________________________
import java.io.*;
class fitline
{
public static void main(String args [])throws IOException
{
System.out.println("PLEASE ENTER THE NO OF POINTS' CO-ORDINATES:");
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
          int no =Integer.parseInt(br.readLine());
	double coordinate[][] =new double[no][3]; 
	double	temparray[][]=new double[no][4];
	double total_X=0,total_Y=0,Xsqr=0,XxY=0;
int j;
	for(int i=0;i<no;i++)
		{ System.out.println("ENTER THE CO-ORDINATE OF POINT "+(i+1)+":");
			for(j=0;j<2;j++)
				{
					coordinate[i][j]=Double.parseDouble(br.readLine()); 
					temparray[i][j]=coordinate[i][j];
					
		}

					total_X+=coordinate[i][0];	
					Xsqr+=(coordinate[i][0]*coordinate[i][0]);					
					total_Y+=coordinate[i][1];			    					     	XxY+=(coordinate[i][0]*coordinate[i][1]);
}
double temp[][]=new double[2][3];
temp[0][0]=no;
temp[0][1]=total_X;
temp[0][2]=total_Y;
temp[1][0]=total_X;
temp[1][1]=Xsqr;
temp[1][2]=XxY;
double temp1,temp2,temp3;
temp1=temp[1][0];
temp2=temp[1][1];
temp3=temp[1][2];
if(temp[0][0]!=temp[1][0])
{
temp[1][0]*=temp[0][0];
temp[1][1]*=temp[0][0];
temp[1][2]*=temp[0][0];
temp[0][0]*=temp1;
temp[0][1]*=temp1;
temp[0][2]*=temp1;
}
double a,result,b;
b=temp[0][1]-temp[1][1];
result=temp[0][2]-temp[1][2];
b=result/b;
a=((temp3-(temp2*b))/temp1);
System.out.println("__________________________________________________________");
System.out.println("the BEST FIT LINE is : Y="+(float)a+"+"+(float)b+"X");

//_____________________________________RESIDUAL ERROR____________________________
double residualerror=0;
for(int j1=0;j1<no;j1++)
{residualerror=0;
temparray[j1][2]=(a+(b*temparray[j1][0]));
temparray[j1][3]=temparray[j1][1]-temparray[j1][2];
residualerror=temparray[j1][3];
System.out.println("the error for point"+(j1+1)+":"+(float)residualerror);

}
}
}
/****************************************************************************************
OUTPUT
******************************************************************************************/

C:\Users\ravi kuril\Desktop\java\practical\print\test>javac fitline.java

C:\Users\ravi kuril\Desktop\java\practical\print\test>java fitline
PLEASE ENTER THE NO OF POINTS' CO-ORDINATES:
6
ENTER THE CO-ORDINATE OF POINT 1:
1
2.4
ENTER THE CO-ORDINATE OF POINT 2:
2
3
ENTER THE CO-ORDINATE OF POINT 3:
3
3.6
ENTER THE CO-ORDINATE OF POINT 4:
4
4
ENTER THE CO-ORDINATE OF POINT 5:
6
5
ENTER THE CO-ORDINATE OF POINT 6:
8
6
__________________________________________________________
the BEST FIT LINE is : Y=1.9764706+0.5058824X
the error for point 1:-0.08235294
the error for point 2: 0.011764706
the error for point 3: 0.105882354
the error for point 4: 0.0
the error for point 5:-0.011764706
the error for point 6: -0.023529412

C:\Users\ravi kuril\Desktop\java\practical\print\test>



