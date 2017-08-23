//Kirtee Kumar
//MSc Operational Research, Sem-2, Sec-B
//Kirori Mal College

// EOQ USING DIALOG BOXES

import java.io.*;
import java.lang.Math;
import javax.swing.JOptionPane; //import class JOptionPane 

class EOQdialog
	{
 		public static void main(String args[])throws IOException
 			{
  				String firstnumber,secondnumber,thirdnumber,fourthnumber,fifthnumber,sixthnumber,seventhnumber,eightnumber;
  				int choice, ch;
  				double A,D,I,C,P,S;
  				double Q;
  
  				System.out.println("INVENTORY MODEL");
  
				System.out.println("1.Deterministic Inventory Problems With No Shortages"
  				+"\nAssumptions:\na.Demand is known, uniform and constant."
  				+"\nb.Supply is instantaneous."
 				+"\nc.Lead time is zero."
 				+"\nd.Shortages not allowed.");
  					
				System.out.println("Q1 is set 100 (if Q>Q1 then c2=100 other wise c1=50) ");
   				/*System.out.println("\n\n2.Inventory Model With Shortages And Fully Backlogged"+"\nAssumptions:\na.Demand is known, uniform and constant."
  				+"\nb.Supply is instantaneous."
  				+"\nc.Lead time is zero."
  				+"\nd.Shortages are allowed with full backlogging.");
  
  				System.out.println("\n\n3.Inventory Model With Finite Replenishment"+"\nAssumptions:\na.Demand is known, uniform and constant."
  				+"\nb.Supply is finite."
 			 	+"\nc.Lead time is zero."
  				+"\nd.Shortages not allowed.");
  
  				System.out.println("\n\n4.Inventory Model With Shortages Allowed"+"\nAssumptions:\na.Demand is known, uniform and constant."
  				+"\nb.Supply is finite."
  				+"\nc.Lead time is zero."
  				+"\nd.Shortages are allowed with full backlogging.");
				*/ 
 			do
  			{
   				eightnumber = JOptionPane.showInputDialog ("Enter your Choice"); 
  				choice=Integer.parseInt(eightnumber);
   				switch(choice)
   				
				{
				
     				case 1:
     
				firstnumber = JOptionPane.showInputDialog ("Enter the demand"); 
				D = Double.parseDouble ( firstnumber);
				
				secondnumber = JOptionPane.showInputDialog ("Enter the ordering cost");
				A=Double.parseDouble (secondnumber);
     
     				//thirdnumber = JOptionPane.showInputDialog ("Enter the unit cost");
   				//C=Double.parseDouble(thirdnumber);
     
     				fourthnumber = JOptionPane.showInputDialog ("Enter the inventory carrying charges");
				I=Double.parseDouble(fourthnumber);
     				if(D<100){C=50;
						Q=(int)Math.sqrt((2*A*D)/(I*C));
				}
				else{C=100;
						Q=(int)Math.sqrt((2*A*D)/(I*C));
				}
				JOptionPane.showMessageDialog ( null, "Optimal order quantity " + Q, "Results", JOptionPane.PLAIN_MESSAGE); 
     
    				break;
				/*
                                case 2:
     
     				firstnumber = JOptionPane.showInputDialog ("Enter the demand"); 
     				D = Double.parseDouble ( firstnumber);

     				secondnumber = JOptionPane.showInputDialog ("Enter the ordering cost");
       				A=Double.parseDouble (secondnumber);
     
     				thirdnumber = JOptionPane.showInputDialog ("Enter the unit cost");
     				C=Double.parseDouble(thirdnumber);
     
     				fourthnumber = JOptionPane.showInputDialog ("Enter the inventory carrying charges");
				I=Double.parseDouble(fourthnumber);
     
				fifthnumber = JOptionPane.showInputDialog ("Enter the Shortages cost");
    				S=Double.parseDouble(fifthnumber);

    				Q=(int)Math.sqrt(((2*A*D)/(I*C))*(((I*C)+S)/S));
    
     				JOptionPane.showMessageDialog ( null, "Optimal order quantity " + Q, "Results", JOptionPane.PLAIN_MESSAGE); 
     
				break;

				case 3:
     
     				firstnumber = JOptionPane.showInputDialog ("Enter the demand"); 
    				D = Double.parseDouble ( firstnumber);
     
     				secondnumber = JOptionPane.showInputDialog ("Enter the ordering cost");
     				A=Double.parseDouble (secondnumber);
     
     				thirdnumber = JOptionPane.showInputDialog ("Enter the unit cost");
     				C=Double.parseDouble(thirdnumber);
     
     				fourthnumber = JOptionPane.showInputDialog ("Enter the inventory carrying charges");
				I=Double.parseDouble(fourthnumber);
     
     				sixthnumber = JOptionPane.showInputDialog ("Enter the production rate");
    				P=Double.parseDouble(sixthnumber);
     
				Q=(int)Math.sqrt(((2*A*D)/(I*C))*(P/(P-D)));
     
     				JOptionPane.showMessageDialog ( null, "Optimal order quantity " + Q, "Results", JOptionPane.PLAIN_MESSAGE); 
     
				break;

     				case 4:

      				firstnumber = JOptionPane.showInputDialog ("Enter the demand"); 
     				D = Double.parseDouble ( firstnumber);
     
    				secondnumber = JOptionPane.showInputDialog ("Enter the ordering cost");
        			A=Double.parseDouble (secondnumber);
				
   				thirdnumber = JOptionPane.showInputDialog ("Enter the unit cost");
     				C=Double.parseDouble(thirdnumber);
     
    				fourthnumber = JOptionPane.showInputDialog ("Enter the inventory carrying charges");
				I=Double.parseDouble(fourthnumber);
     
     				fifthnumber = JOptionPane.showInputDialog ("Enter the Shortages cost");
    				S=Double.parseDouble(fifthnumber);
				
				sixthnumber = JOptionPane.showInputDialog ("Enter the production rate"); 
 				P=Double.parseDouble(sixthnumber);    

     				Q=(int)Math.sqrt(((2*A*D)/(I*C))*(P/(P-D))*(((I*C)+S)/S));
    
     				JOptionPane.showMessageDialog ( null, "Optimal order quantity " + Q, "Results", JOptionPane.PLAIN_MESSAGE); 
     
				break;
				*/
     				default :
     
   				JOptionPane.showMessageDialog ( null, "Wrong Choice " , "Results", JOptionPane.PLAIN_MESSAGE); 
    				
				break;
    				
				}
   
				seventhnumber = JOptionPane.showInputDialog ("Do you want to continue(1 for yes)");
    				ch=Integer.parseInt(seventhnumber);
    			
			}while(ch==1);

   		}
  	}