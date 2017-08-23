/*	RAVI KUMAR KURIL
	MSc Operational Research Sem-2 Sec-B
	RAMJAS COLLEGE 

//Program to implement Banking System.
//__________________________________________________________________________________
import java.io.*;
class Account
{
         final int max_limit=20;
         final  int min_limit=1;
         final double min_bal=500;
         private  String name[]=new String[20];
	 private  String address[]=new String[30];
         private int accNo[]=new int[20];
         private  String accType[]=new String[20];
         private double balAmt[]=new double[20];
         static int totRec=0;
        
        Account()
        {
             for(int i=0;i<max_limit;i++)
             {
                name[i]="";
		address[i]="";
                accNo[i]=0;
                accType[i]="";
                balAmt[i]=0.0;
            }
        }

        
_________________________________________________________________________
public void newAccount()
        {
               String str;
               int acno;
               double amt;
               boolean permit;
                permit=true;

               if (totRec>max_limit)
               {
                    System.out.println("\n\n\nSorry we cannot admit you in our bank...\n\n\n");
                    permit=false;
               }

               if(permit = true)   //Allows to create new entry
               {
               totRec++;         // Incrementing Total Record               
               System.out.println("\n\n\n=====RECORDING NEW ENTRY=====");
               try{
                          accNo[totRec]=totRec;    
                        System.out.println("Account Number :  "+accNo[totRec]);
                        
                     BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                     System.out.print("Enter Name :  ");
                     System.out.flush();
                     name[totRec]=obj.readLine();

		     System.out.print("Enter Address :  ");
                     System.out.flush();
                     address[totRec]=obj.readLine();

                     System.out.print("Enter Account Type : ");
                     System.out.flush();
                     accType[totRec]=obj.readLine();

                    do{
                           System.out.print("Enter Initial  Amount to be deposited : ");
                           System.out.flush();
                           str=obj.readLine();
                           balAmt[totRec]=Double.parseDouble(str);
                         }while(balAmt[totRec]<min_bal);     
                  System.out.println("\n\n\n");
                    }
                catch(Exception e)
                {}
            }
        }

        
        
       
public void view()
        {
              String str;
              int acno=0;
              boolean valid=true;
                           
              System.out.println("\n\n=====DISPLAYING DETAILS OF CUSTOMER=====\n");
              try{
                 BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                 System.out.print("Enter Account number : ");
                 System.out.flush();
                 str=obj.readLine();
                 acno=Integer.parseInt(str);
                  if (acno<min_limit  || acno>totRec)   
                     {
                          System.out.println("\n\n\nInvalid Account Number \n\n");
                          valid=false;
                     }

                    if (valid==true)
                      {     
                        System.out.println("\n\nAccount Number : "+accNo[acno]);
                        System.out.println("Name : "+name[acno]);
			System.out.println("Address : "+address[acno]);
                        System.out.println("Account Type : "+accType[acno]);
                        System.out.println("Balance Amount : "+balAmt[acno]+"\n\n\n");
                      }
                 }
            catch(Exception e)
            {}
        }



public void deposit()
        {
              String str;
              double amt;
              int acno;
              boolean valid=true;
              System.out.println("\n\n\n=====DEPOSIT AMOUNT=====");
              
              try{
                   BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

                        System.out.print("Enter Account No : ");
                        System.out.flush();
                        str=obj.readLine();
                        acno=Integer.parseInt(str);
                         if (acno<min_limit || acno>totRec)   
                         {
                              System.out.println("\n\n\nInvalid Account Number \n\n");
                              valid=false;
                         }
           
                        if (valid==true)
                       {
                            System.out.print("Enter Amount you want to Deposit  : ");
                            System.out.flush();
                            str=obj.readLine();
                            amt=Double.parseDouble(str);

                            balAmt[acno]=balAmt[acno]+amt;

                            //Displaying Depsit Details
                            System.out.println("\nAfter Updation...");
                            System.out.println("Account Number :  "+acno);
                            System.out.println("Balance Amount :  "+balAmt[acno]+"\n\n\n");
                        }
                 }
            catch(Exception e)
            {}
       }



    
public void withdraw()
        {
              String str;
              double amt,checkamt;
              int acno;
              boolean valid=true;
              System.out.println("\n\n\n=====WITHDRAW AMOUNT=====");
              
              try{
                   //Reading deposit value
                   BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                   
                        System.out.print("Enter Account No : ");
                        System.out.flush();
                        str=obj.readLine();
                        acno=Integer.parseInt(str);

                          if (acno<min_limit || acno>totRec)   
                             {
                                System.out.println("\n\n\nInvalid Account Number \n\n");
                                valid=false;
                            }

                        if (valid==true)
                        {
                                System.out.println("Balance is : "+balAmt[acno]);
                                System.out.print("Enter Amount you want to withdraw it should be less then 10000 if the account is saving account: ");
                                System.out.flush();
                                str=obj.readLine();
                                amt=Double.parseDouble(str);

                                checkamt=balAmt[acno]-amt;

                                if(checkamt >= min_bal)
                                 {
                                    balAmt[acno]=checkamt;
                                    //Displaying Depsit Details
                                    System.out.println("\nAfter Updation...");
                                    System.out.println("Account Number :  "+acno);
                                    System.out.println("Balance Amount :  "+balAmt[acno]+"\n\n\n");
                                }
                                else
                                 {
                                    System.out.println("\n\nAs per Bank Rule you should maintain minimum balance of Rs 500\n\n\n");
                                }
                        }
                 }
            catch(Exception e)
            {}
       }

};

class  Bank
{
    public static void main(String args[]) 
    {
        String str;
        int choice;
        choice=0;

        Account acc_obj = new Account();
        

        do
        {
        System.out.println("Choose Your Choices ...");
        System.out.println("1) Open New Account ");
        System.out.println("2) Check Account Details ");
        System.out.println("3) Deposit...");
        System.out.println("4) Withdraw...");
        System.out.println("5) Exit");
         System.out.print("Enter your choice :  ");
        System.out.flush();
              try{
                   BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                   str=obj.readLine();
                   choice=Integer.parseInt(str);

                          switch(choice)
                           {
                            case 1 :  
                                            acc_obj.newAccount();
                                           break;
                            case 2 :  
                                           acc_obj.view();
                                           break;
                            case 3 : 
                                            acc_obj.deposit();
                                           break;
                            case 4 : 
                                            acc_obj.withdraw();
                                            break;
                            case 5  :  System.out.println("\n\n.....THANKS FOR VISITING.....");
                                            break;
                            default : System.out.println("\nInvalid Choice \n\n");
                          }
                    }
                catch(Exception e)
                {}
            }while(choice!=5);
    }
}

/**********************************************************************************************
OUTPUT:
**********************************************************************************************/
C:\Users\ravi kuril\Desktop\java\practical\print\test>javac Bank.java

C:\Users\ravi kuril\Desktop\java\practical\print\test>java Bank
Choose Your Choices ...
1) Open New Account
2) Check Account Details
3) Deposit...
4) Withdraw...
5) Exit
Enter your choice :  1



=====RECORDING NEW ENTRY=====
Account Number :  1
Enter Name :  Ravi kumar Kuril
Enter Address :  768 goivindpuri kalkaji new delhi
Enter Account Type : saving
Enter Initial  Amount to be deposited : 12000




Choose Your Choices ...
1) Open New Account
2) Check Account Details
3) Deposit...
4) Withdraw...
5) Exit
Enter your choice :  2


=====DISPLAYING DETAILS OF CUSTOMER=====

Enter Account number : 1


Account Number : 1
Name : Ravi kumar Kuril
Address : 768 goivindpuri kalkaji new delhi
Account Type : saving
Balance Amount : 12000.0



Choose Your Choices ...
1) Open New Account
2) Check Account Details
3) Deposit...
4) Withdraw...
5) Exit
Enter your choice :  3



=====DEPOSIT AMOUNT=====
Enter Account No : 1
Enter Amount you want to Deposit  : 12000

After Updation...
Account Number :  1
Balance Amount :  24000.0



Choose Your Choices ...
1) Open New Account
2) Check Account Details
3) Deposit...
4) Withdraw...
5) Exit
Enter your choice :  4



=====WITHDRAW AMOUNT=====
Enter Account No : 1
Balance is : 24000.0
Enter Amount you want to withdraw it should be less then 10000 if the account is saving account: 9000

After Updation...
Account Number :  1
Balance Amount :  15000.0



Choose Your Choices ...
1) Open New Account
2) Check Account Details
3) Deposit...
4) Withdraw...
5) Exit
Enter your choice :  5


.....THANKS FOR VISITING.....

C:\Users\ravi kuril\Desktop\java\practical\print\test>
