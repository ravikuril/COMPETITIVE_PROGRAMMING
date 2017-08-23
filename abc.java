/* RAVI KUMAR KURIL
   RAMJAS COLLEGE
   SEC B
   ABC ANALYSIS
*/

//________________________________________________________________________________________

import java.io.*;
class abc
{
public static void main(String args[])throws IOException
{
	System.out.println("PLEASE ENTER THE NO OF ITEMS");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int item_no=Integer.parseInt(br.readLine());
	float array[][]=new float[item_no][7];
	float [][] array1=new float[item_no][2];
	float [] temp1=new float[item_no];
	System.out.println("PLEASE ENTER THE DETAIL:");
	float unit_cost,avg_annual_con,itemno;

	for(int temp=0;temp<item_no;temp++)
	{
		System.out.println("ENTER THE ITEM NO AVERAGE USAGE UNIT"
				    +" AND UNIT COST FOR ITEM"+(temp+1)+":");
	
		itemno=Float.parseFloat(br.readLine());
		array[temp][0]=(itemno);
		avg_annual_con=Float.parseFloat(br.readLine());
		array[temp][1]=avg_annual_con;
		unit_cost=Float.parseFloat(br.readLine());
		array[temp][2]=unit_cost;
	}
	System.out.println("_____________________________________________");
 	System.out.println("ITEM #\tAVERG.USAGE(UNITS)\tUNIT COST(US$)");
 	System.out.println("_____________________________________________");

	for(int x=0;x<item_no;x++)
	{
		for(int y=0;y<3;y++)
		{

			System.out.print(array[x][y]+"\t\t");
		}
		System.out.println("\n");
		System.out.println("_____________________________________________");
	}
          float total_annual_usage=0;
 	int a=0,b=0,c=0;
	      for(int x1=0;x1<item_no;x1++)
		{ 
			array[x1][3]=array[x1][1]*array[x1][2];
			total_annual_usage+=array[x1][3];
		}		
		float []A=new float[item_no];
		float []B=new float[item_no];
		float []C=new float[item_no];	
		for(int x2=0;x2<item_no;x2++)
		{ 
			array[x2][4]=(array[x2][3]/total_annual_usage)*100;	
			array1[x2][0]=array[x2][4];
			array1[x2][1]=(x2+1);
 			//temp1[x2]=array[x2][4]*100;	
//___________________________________ANNUAL CONSUMPTION IN $______________________________
 //using bubblesort algo to sort the element of 5th column
	
		int n = item_no;
		int k;
		for (int m = n; m >= 0; m--) {
			for (int i = 0; i < n - 1; i++) {
				k = i + 1;
				int j=k;
				if (array1[i][0] > array1[k][0]) {
					 float index,temp2;
        				temp2 = array1[i][0];
						index=array1[i][1];
        				array1[i][0] = array1[j][0];
        				array1[j][0] = temp2;
						array1[j][1]=index;
				}
			}
		}
	System.out.println("\nthe sorted array is :");
        for(int c1=item_no-1;c1>=0;c1--)
		{
			System.out.println("% $ consumption"+array1[c1][0]);
		}

//____________________________FINDING CATEGORY__________________________________________

if(array[x2][4]<=80&&array[x2][4]>=70)
{
	A[a]=x2;
	System.out.println("A:"+(x2+1));
	a++;
}
if(array[x2][4]<=20&&array[x2][4]>=9)
{
	B[b]=x2;
	System.out.println("B:"+(x2+1));
	b++;

}
if(array[x2][4]<=9)
{
	C[c]=x2+1;
	System.out.println("C:"+(x2+1));
	c++;
}	

}	System.out.println("CATEGORY  |ITEM NO   |% OF ITEM IN INVENTORY"+
		   "    |$ IN THE CATEGORY   |% $ IN THE CATEGORY |");

//____________________________________________FOR PRINTING CATEGORY A__________________
	System.out.print("A\t\t");
	int ctr =0;
	while(A[ctr]!=0)
	{	
		System.out.print(((int)A[ctr]+1)+" ");
		ctr++;
	}
	System.out.print("\t\t"+ctr*10+"\t");
	float sum1=0,sum=0;		//$ in the category
	for(int v=0;v<ctr;v++)
		{
			sum=array[(int)A[v]][1]*array[(int)A[v]][2]+sum;
		}
		System.out.print("\t"+(int)sum);
	for(int v1=0;v1<ctr;v1++)
		{
			sum1=array[(int)A[v1]][4]+sum1;
		}
	System.out.print("\t\t\t"+(float)sum1);

//____________________________________________FOR PRINTING CATEGORY B__________________

	System.out.print("\nB\t\t");
	int ctr2 =0;

	while(B[ctr2]!=0)
	{	
		System.out.print(((int)B[ctr2]+1)+" ");
		ctr2++;
	}
	System.out.print("\t\t"+ctr2*10+"\t");
	float sum3=0,sum2=0;		//$ in the category
	for(int v2=0;v2<ctr2;v2++)
		{
			sum2=array[(int)B[v2]][1]*array[(int)B[v2]][2]+sum2;
		}
		System.out.print("\t"+(int)sum2+"\t");
	for(int v12=0;v12<ctr2;v12++)
		{
			sum3=array[(int)B[v12]][4]+sum3;
		}
	System.out.print("\t\t"+(float)sum3);

//____________________________________________FOR PRINTING CATEGORY C__________________

		System.out.print("\nC\t\t");
	int ctr3=0;
	while((C[ctr3])!=0)
	{	
		System.out.print(((int)C[ctr3])+" ");
		ctr3++;
	}
	System.out.print("\t"+ctr3*10+"\t");
	float sum4=0,sum5=0;		//$ in the category
	for(int v3=0;v3<ctr3;v3++)
		{        
			sum4=array[((int)C[v3]-1)][1]*array[((int)C[v3]-1)][2]+sum4;
		
		}
		System.out.print("\t"+(int)sum4);
	for(int v13=0;v13<ctr;v13++)
		{
			sum5=array[((int)C[v13])][4]+sum5;
		}
	System.out.print("\t\t\t"+(float)sum5);

System.out.print("\nTOTAL\t\t"+item_no+"\t\t"+100+"\t\t"+(sum+sum2+sum4)+"\t\t"+(sum1+sum5+sum3));


     
  }
}

/********************************************************************************************
OUTPUT:

C:\Users\ravi kuril\Desktop\java\practical\print>java abc
PLEASE ENTER THE NO OF ITEMS
10
PLEASE ENTER THE DETAIL:
ENTER THE ITEM NO AVERAGE USAGE UNIT AND UNIT COST FOR ITEM1:
1
17
2.5
ENTER THE ITEM NO AVERAGE USAGE UNIT AND UNIT COST FOR ITEM2:
2
50
17
ENTER THE ITEM NO AVERAGE USAGE UNIT AND UNIT COST FOR ITEM3:
3
15
15
ENTER THE ITEM NO AVERAGE USAGE UNIT AND UNIT COST FOR ITEM4:
4
25
17
ENTER THE ITEM NO AVERAGE USAGE UNIT AND UNIT COST FOR ITEM5:
5
5
17
ENTER THE ITEM NO AVERAGE USAGE UNIT AND UNIT COST FOR ITEM6:
6
50
119
ENTER THE ITEM NO AVERAGE USAGE UNIT AND UNIT COST FOR ITEM7:
7
153
5
ENTER THE ITEM NO AVERAGE USAGE UNIT AND UNIT COST FOR ITEM8:
8
20
2.125
ENTER THE ITEM NO AVERAGE USAGE UNIT AND UNIT COST FOR ITEM9:
9
16
2.656
ENTER THE ITEM NO AVERAGE USAGE UNIT AND UNIT COST FOR ITEM10:
10
17
2.5
_____________________________________________
ITEM #  AVERG.USAGE(UNITS)      UNIT COST(US$)
_____________________________________________
1.0             17.0            2.5

_____________________________________________
2.0             50.0            17.0

_____________________________________________
3.0             15.0            15.0

_____________________________________________
4.0             25.0            17.0

_____________________________________________
5.0             5.0             17.0

_____________________________________________
6.0             50.0            119.0

_____________________________________________
7.0             153.0           5.0

_____________________________________________
8.0             20.0            2.125

_____________________________________________
9.0             16.0            2.656

_____________________________________________
10.0            17.0            2.5

_____________________________________________


the sorted array is :
% $ consumption70.24796
% $ consumption10.035424
% $ consumption9.031881
% $ consumption5.017712
% $ consumption2.6564357
% $ consumption1.0035423
% $ consumption0.50177115
% $ consumption0.50177115
% $ consumption0.50177115
% $ consumption0.50172395

CATEGORY  |ITEM NO   |% OF ITEM IN INVENTORY    |$ IN THE CATEGORY   |% $ IN THE CATEGORY |
A               6               10              5950                    70.24796
___________________________________________________________________________________________
B               2 7             20              1615                    19.067307
___________________________________________________________________________________________
C               1 3 4 5 8 9 10  70              904                     10.035424
___________________________________________________________________________________________
TOTAL           10              100             8469.996                99.35069
___________________________________________________________________________________________
*/















