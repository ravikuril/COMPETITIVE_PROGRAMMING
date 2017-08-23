/*
    RAVI KUMAR KURIL
    RAMJAS COLLEGE 
    SEC B
    
 
   Program: To find the Economic order quantity FROM INHERITANCE */


import java.io.*;
import java.lang.Math;
class inherit
{
 public static void main(String args[])throws IOException
 {
  InputStreamReader br=new InputStreamReader(System.in);
  BufferedReader keyboard=new BufferedReader(br);
  String str;
  int choice, ch;
  double P,S;
  int Q;
  System.out.println("____________________________________________________");
  System.out.println("INVENTORY MODEL");
  System.out.println("____________________________________________________");
  System.out.println("1.Deterministic Inventory Problems With No Shortages"
  +"\nAssumptions:\na.Demand is known, uniform and constant."
  +"\nb.Supply is instantaneous."
  +"\nc.Lead time is zero."
  +"\nd.Shortages not allowed.");
    
   System.out.println("____________________________________________________");
   System.out.println("\n\n2.Inventory Model With Shortages And Fully"+
"Backlogged"+"\nAssumptions:\na.Demand is known, uniform and constant."
  +"\nb.Supply is instantaneous."
  +"\nc.Lead time is zero."
  +"\nd.Shortages are allowed with full backlogging.");
  
  System.out.println("____________________________________________________");
  System.out.println("\n\n3.Inventory Model With Finite Replenishment"+"\nAssumptions:"+
"\na.Demand is known, uniform and constant."
  +"\nb.Supply is finite."
  +"\nc.Lead time is zero."
  +"\nd.Shortages not allowed.");
  
 System.out.println("____________________________________________________");
 System.out.println("\n\n4.Inventory Model With Shortages Allowed"+"\nAssumptions:\na.Demand" 
+"is known, uniform and constant."
  +"\nb.Supply is finite."
  +"\nc.Lead time is zero."
  +"\nd.Shortages are allowed with full backlogging.");
     /*
    	 double D1,C1,I1,A1;
        BufferedReader br1 =new BufferedReader(new InputStreamReader(System.in));
	
         System.out.println("Enter the demand");
    	 D1=Double.parseDouble(br1.readLine());
     
    	 System.out.println("Enter the ordering cost");
     	 A1=Double.parseDouble(br1.readLine());				
 	 
	 System.out.println("Enter the unit cost");
         C1=Double.parseDouble(br1.readLine());

         System.out.println("Enter the inventory carrying charges");
         I1=Double.parseDouble(br1.readLine());     
         a obj=new a(D1,A1,C1,I1);   

*/

  do
  
  {
   System.out.println("Enter your choice:");
   str=keyboard.readLine();
   choice=Integer.parseInt(str);
   switch(choice)
   {
	 		
     case 1:
        System.out.println("____________________________________________________");
     	case1 ob1=new case1();
     	ob1.print();
	break;
                                
     case 2:
	System.out.println("____________________________________________________");
     	case2 ob2=new case2();
     	ob2.print();
	break;

     case 3:
	System.out.println("____________________________________________________");
     	case3 ob3=new case3();
     	ob3.print();
     	break;

     case 4:
	System.out.println("____________________________________________________");
     	case4 ob4=new case4();
     	ob4.print();
     	break;

     default :
     
    System.out.println("Wrong Choice");
    break;
    }
   
    System.out.println("____________________________________________________");
    System.out.println("Do you want to continue(Press 1 for yes and 0 for no)?");
    str=keyboard.readLine();
    ch=Integer.parseInt(str);
    }
    while(ch==1);
   }
  }




class a
{ 
       double D,C,A,I;
       a()
	{ 
          D=100;
          C=100;
          A=100;
          I=100;
	}  
}
 class case1 extends a
{ double Q;
  
    
  void print()throws IOException
              { System.out.println("____________________________________________________");
                Q=Math.sqrt((2*A*D)/(I*C)); 
                System.out.println("Optimal order quantity ="+Q);
	       }
}

class case2 extends a
{

void print()throws IOException
            {
     double S,Q;
     String str; 
     InputStreamReader br=new InputStreamReader(System.in);
     BufferedReader keyboard=new BufferedReader(br);
      
     System.out.println("____________________________________________________");
     System.out.println("Enter the Shortages cost");
     str=keyboard.readLine();
     S=Double.parseDouble(str);
     Q=Math.sqrt(((2*A*D)/(I*C))*(((I*C)+S)/S));
    
     System.out.println("Optimal order quantity ="+Q);

}}

class case3 extends a
{

void print()throws IOException
         {
    double P,Q;
     String str;
     InputStreamReader br=new InputStreamReader(System.in);
     BufferedReader keyboard=new BufferedReader(br);
   
     System.out.println("____________________________________________________");
     System.out.println("Enter the production rate");
     str=keyboard.readLine();
     P=Double.parseDouble(str);
     Q=Math.sqrt(((2*A*D)/(I*C))*(P/(P-D)));
     System.out.println("Optimal order quantity ="+Q);
	}
}

class case4 extends a

	{

void print()throws IOException

{    double S,P,Q;
     String str;
     InputStreamReader br=new InputStreamReader(System.in);
     BufferedReader keyboard=new BufferedReader(br);

     System.out.println("____________________________________________________");
     System.out.println("Enter the Shortages cost");
     str=keyboard.readLine();
     S=Double.parseDouble(str);
				
     System.out.println("Enter the production rate");
     str=keyboard.readLine();
     P=Double.parseDouble(str);
     Q=Math.sqrt(((2*A*D)/(I*C))*(P/(P-D))*(((I*C)+S)/S));
    
     System.out.println("Optimal order quantity ="+Q);
	}

}

//****************************************************************************
/* OUT PUT

C:\Users\ravi kuril\Desktop\java\practical\print\test>javac Ravi.java

C:\Users\ravi kuril\Desktop\java\practical\print\test>java Ravi
____________________________________________________________
INVENTORY MODEL
____________________________________________________________
1.Deterministic Inventory Problems With No Shortages
Assumptions:
a.Demand is known, uniform and constant.
b.Supply is instantaneous.
c.Lead time is zero.
d.Shortages not allowed.

____________________________________________________________
2.Inventory Model With Shortages And FullyBacklogged
Assumptions:
a.Demand is known, uniform and constant.
b.Supply is instantaneous.
c.Lead time is zero.
d.Shortages are allowed with full backlogging.
____________________________________________________________

3.Inventory Model With Finite Replenishment
Assumptions:
a.Demand is known, uniform and constant.
b.Supply is finite.
c.Lead time is zero.
d.Shortages not allowed.

____________________________________________________________
4.Inventory Model With Shortages Allowed
Assumptions:
a.Demandis known, uniform and constant.
b.Supply is finite.
c.Lead time is zero.
d.Shortages are allowed with full backlogging.
Enter your choice:
1
Optimal order quantity =1.4142135623730951
____________________________________________________________
Do you want to continue(Press 1 for yes and 0 for no)?
1
Enter your choice:
3
Enter the production rate
100
Optimal order quantity =2.147483647E9
____________________________________________________________
Do you want to continue(Press 1 for yes and 0 for no)?
1
Enter your choice:
4
Enter the Shortages cost
100
Enter the production rate
100
Optimal order quantity =2.147483647E9
____________________________________________________________
Do you want to continue(Press 1 for yes and 0 for no)?
1
Enter your choice:
2
Enter the Shortages cost
100
Optimal order quantity =14.0
____________________________________________________________
Do you want to continue(Press 1 for yes and 0 for no)?
0

C:\Users\ravi kuril\Desktop\java\practical\print\test>
*/