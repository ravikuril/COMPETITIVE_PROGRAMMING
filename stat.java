/*
Program to perform following statistical operations using the concept of abstract classes and 
inheritance:
•	Mean
•	Harmonic mean
•	Geometric mean
•             Standard error
•	Variance
•	Co-variance
•	Skewness
•	Kurtosis
•	Regression coefficient
•	3rd moment about origin
*/
   

import java.io.*;
import java.lang.Math.*;

class Calculate
 {
  double mean(int a[],int m)
   {
    double sum=0;
    for(int i=0;i<m;i++)
    {
      sum=sum+a[i];
    }
   return (sum/m);
  }
 void harmonic(int a[],int m)
 {
  double sum=0,h;
  for(int i=0;i<m;i++)
  {
    sum=1/(double)a[i];
  }
   h=m/sum;
 System.out.println("the harmonic mean of the observation is:"+h);
 }
void geometric(int a[],int m)
 {
  double geo,prod=1;
  for(int i=0;i<m;i++)
    {
     prod=prod*a[i];
    }
  geo=Math.pow(prod ,(1/(double)m));
 System.out.println("the geometric mean is:"+geo);
 }
double variance(int a[],int m,double mean)  
{
 double sum=0,var;
  for(int i=0;i<m;i++)
  {
    sum=sum+Math.pow(a[i],2);
  }
 var=(double)(sum/m)-Math.pow(mean,2);
 return var;
 }
double mo3,mo4;
void moment(int a[],int m,double mean,double var)
{
 double sum2=0,sum3=0,sum4=0;
  for(int i=0;i<m;i++)
  {
   sum2=sum2+Math.pow(a[i],2);
   sum3=sum3+Math.pow(a[i],3);
   sum4=sum4+Math.pow(a[i],4);
 }
 double mu2=sum2/m;
 double mu3=sum3/m;
 double mu4=sum4/m;
  mo3=mu3-(3*mu2*mean)+(2*Math.pow(mean,3));
  mo4=mu4-(4*mu3*mean)+(6*mu2*Math.pow(mean,2))-(3*Math.pow(mean,4));
}
void skewness(int a[],int m,double mean,double var)

 {
   moment(a,m,mean,var);
  double skew=(Math.pow(mo3,2))/(Math.pow(var,3));
        
 System.out.println("the skewness is:"+skew);
 }
void kurtosis(int a[],int m,double mean,double var)
 {
   moment(a,m,mean,var);
   double kurt=mo4/(Math.pow(var,2));
   System.out.println("the kurtosis is:"+ kurt);
 }
double covariance(int a[],int b[],int m,double meana,double meanb)
{
  double sumab=0.0;
  for(int i=0;i<m;i++)
  sumab=sumab+(a[i]+b[i]);
 double cov=(sumab/m-(meana*meanb));
 return cov;
}
void regression(int a[],int b[],int m,double meana,double meanb,double vara,double varb)
{
 double cov=covariance(a,b,m,meana,meanb);
 double xab=(cov/vara);
 double xba=(cov/varb);
 System.out.println("the regression co-efficient of a on b is:"+xab);
 System.out.println("the regression co-efficient of b on a is:"+xba);}
void third_moment(int a[],int m,double mean)
 {
  double sum3=0;
  for(int i=0;i<m;i++)
  sum3=sum3+Math.pow(a[i],3);
  double mu3=sum3/m;
 System.out.println("the third order moment about origin is:"+mu3);
  }
 }
class stat
       
  {
  public static void main(String args[])throws IOException
   {
    int ch;
    String str,cho;
    Calculate obj=new Calculate();
    InputStreamReader obj1=new InputStreamReader(System.in);
    BufferedReader obj2=new BufferedReader(obj1);
    int m;
         
   System.out.println("enter the no. of element in the array");
   str= obj2.readLine();
   m=Integer.parseInt(str);
   int a[]=new int[m];
   int b[]=new int[m];
   System.out.println("enter the elements of array");
     for(int i=0;i<m;i++)
      {
       str=obj2.readLine();
       a[i]=Integer.parseInt(str);
      }
  System.out.println("Elements are");
   for(int i=0;i<m;i++) 
    {
      System.out.println(a[i]);
    }  
 do
 {  
   System.out.println("MENU...........");
   System.out.println("Enter 1 for mean");
   System.out.println("Enter 2 for harmonic mean");
   System.out.println("Enter 3 for geometric mean");
   System.out.println("Enter 4 for standard error");
   System.out.println("Enter 5 for variance");
   System.out.println("Enter 6 for skewness");
   System.out.println("Enter 7 for kurtosis");
   System.out.println("Enter 8 for covariance");
   System.out.println("Enter 9 for regressioncoefficient");
   System.out.println("Enter 10 for 3rd moment about origin");
   System.out.println("Enter the choice.........");

   str=obj2.readLine(); 
   ch=Integer.parseInt(str);
    
 switch(ch)
  {
  case 1:
         System.out.println("The mean of observation is : "+obj.mean(a,m));

         break;
 case 2:
        obj.harmonic(a,m);
        break;
 case 3:
       obj.geometric(a,m);
       break;
 case 4:
      double mean=obj.mean(a,m);
      double var=obj.variance(a,m,mean);
      System.out.println("The standard error of observation is : "+Math.sqrt(var));
      break;
 case 5:
	 mean=obj.mean(a,m);
         System.out.println("The variance is : "+obj.variance(a,m,mean));
         break;
 case 6:
        mean=obj.mean(a,m);
        var=obj.variance(a,m,mean) ;
        obj.skewness(a,m,mean,var);
        break;      

 case 7:
       mean=obj.mean(a,m);
      var=obj.variance(a,m,mean);
      obj.kurtosis(a,m,mean,var);
      break;
 case 8:
         System.out.println("Enter the elements of second variable");
           for(int j=0;j<m;j++)
         {
           str=obj2.readLine();
           b[j]=Integer.parseInt(str);
         }
           double meana=obj.mean(a,m);
           double meanb=obj.mean(b,m);
           double cov=obj.covariance(a,b,m,meana,meanb);
         System.out.println("covariance between the two variables is : "+cov);
         break; 
case 9:
        System.out.println("Enter the elements of the second variable");
          for(int j=0;j<m;j++)
         {
          str= obj2.readLine();
          b[j]=Integer.parseInt(str);
       }
         meana=obj.mean(a,m);
         meanb=obj.mean(b,m);
         double vara=obj.variance(a,m,meana);
         double varb=obj.variance(b,m,meanb);
         obj.regression(a,b,m,meana,meanb,vara,varb);
          break; 
 case 10:
           mean=obj.mean(a,m);
           obj.third_moment(a,m,mean);
           break;

 default:
         System.out.println("The enter choice is wrong");
          break;
        }System.out.println("do you want to continue ?(y/n)");
     cho=obj2.readLine();
  }
    while(cho.equals("y")||cho.equals("Y"));
    System.out.println("exit..");

 }
}

/* OUT PUT

C:\Program Files\Java\jdk1.6.0_02\bin>javac j\stat.java

C:\Program Files\Java\jdk1.6.0_02\bin>java j.stat

enter the no. of element in the array
8
enter the elements of array
4
12
16
8
24
8
12
20
Elements are
4
12
16
8
24
8
12
20
MENU...........
Enter 1 for mean
Enter 2 for harmonic mean
Enter 3 for geometric mean
Enter 4 for standard error
Enter 5 for variance
Enter 6 for skewness
Enter 7 for kurtosis
Enter 8 for covariance
Enter 9 for regressioncoefficient
Enter 10 for 3rd moment about origin
Enter the choice.........
1
The mean of observation is : 13.0
do you want to continue ?(y/n)
y
MENU...........
Enter 1 for mean
Enter 2 for harmonic mean
Enter 3 for geometric mean
Enter 4 for standard error
Enter 5 for variance
Enter 6 for skewness
Enter 7 for kurtosis
Enter 8 for covariance
Enter 9 for regressioncoefficient
Enter 10 for 3rd moment about origin
Enter the choice.........
2
the harmonic mean of the observation is:160.0
do you want to continue ?(y/n)
y
MENU...........
Enter 1 for mean
Enter 2 for harmonic mean
Enter 3 for geometric mean
Enter 4 for standard error
Enter 5 for variance
Enter 6 for skewness
Enter 7 for kurtosis
Enter 8 for covariance
Enter 9 for regressioncoefficient
Enter 10 for 3rd moment about origin
Enter the choice.........
3
the geometric mean is:11.38925874943033
do you want to continue ?(y/n)
y
MENU...........
Enter 1 for mean
Enter 2 for harmonic mean
Enter 3 for geometric mean
Enter 4 for standard error
Enter 5 for variance
Enter 6 for skewness
Enter 7 for kurtosis
Enter 8 for covariance
Enter 9 for regressioncoefficient
Enter 10 for 3rd moment about origin
Enter the choice.........
4
The standard error of observation is : 6.244997998398398
do you want to continue ?(y/n)
y
MENU...........
Enter 1 for mean
Enter 2 for harmonic mean
Enter 3 for geometric mean
Enter 4 for standard error
Enter 5 for variance
Enter 6 for skewness
Enter 7 for kurtosis
Enter 8 for covariance
Enter 9 for regressioncoefficient
Enter 10 for 3rd moment about origin
Enter the choice.........
5
The variance is : 39.0
do you want to continue ?(y/n)
y
MENU...........
Enter 1 for mean
Enter 2 for harmonic mean
Enter 3 for geometric mean
Enter 4 for standard error
Enter 5 for variance
Enter 6 for skewness
Enter 7 for kurtosis
Enter 8 for covariance
Enter 9 for regressioncoefficient
Enter 10 for 3rd moment about origin
Enter the choice.........
6
the skewness is:0.13654984069185253
do you want to continue ?(y/n)
y
MENU...........
Enter 1 for mean
Enter 2 for harmonic mean
Enter 3 for geometric mean
Enter 4 for standard error
Enter 5 for variance
Enter 6 for skewness
Enter 7 for kurtosis
Enter 8 for covariance
Enter 9 for regressioncoefficient
Enter 10 for 3rd moment about origin
Enter the choice.........
7
the kurtosis is:2.04930966469428
do you want to continue ?(y/n)
y
MENU...........
Enter 1 for mean
Enter 2 for harmonic mean
Enter 3 for geometric mean
Enter 4 for standard error
Enter 5 for variance
Enter 6 for skewness
Enter 7 for kurtosis
Enter 8 for covariance
Enter 9 for regressioncoefficient
Enter 10 for 3rd moment about origin
Enter the choice.........
8
Enter the elements of second variable
5
12
5
8
15
10
25
8
covariance between the two variables is : -119.0
do you want to continue ?(y/n)
y
MENU...........
Enter 1 for mean
Enter 2 for harmonic mean
Enter 3 for geometric mean
Enter 4 for standard error
Enter 5 for variance
Enter 6 for skewness
Enter 7 for kurtosis
Enter 8 for covariance
Enter 9 for regressioncoefficient
Enter 10 for 3rd moment about origin
Enter the choice.........
9
Enter the elements of the second variable
4
2
5
12
7
20
21
4
the regression co-efficient of a on b is:-2.551282051282051
the regression co-efficient of b on a is:-2.0312599681020735
do you want to continue ?(y/n)
y
MENU...........
Enter 1 for mean
Enter 2 for harmonic mean
Enter 3 for geometric mean
Enter 4 for standard error
Enter 5 for variance
Enter 6 for skewness
Enter 7 for kurtosis
Enter 8 for covariance
Enter 9 for regressioncoefficient
Enter 10 for 3rd moment about origin
Enter the choice.........
10
the third order moment about origin is:3808.0
do you want to continue ?(y/n)
n
exit..
*/

