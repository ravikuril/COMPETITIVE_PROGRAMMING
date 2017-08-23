/* RAVI KUMAR KURIL
   SEC B 
   RAMJAS COLLEGE 
   
WAP M/M/1,M/M/C,M/M/INFINITY

*/
//___________________________________________________________________________
import java.io.*; 
class queuing
 {
  	public static void main(String args[])throws IOException
   
{ 
	System.out.println("PLEASE ENTER THE LAMDA(arrival) AND MIU(serving) for mm1");
    
		mm1 ob1=new mm1();
		ob1.calculate();
		//ob1.calall();


		mmc ob2=new mmc();
		ob2.calculate();

		mmIN ob3=new mmIN();
		ob3.calculate();
	}

}

class mm1
{
	float l,ro,u;
	
	int power =0;
	void calculate()throws IOException
	{
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	float l=Float.parseFloat(br.readLine());
	float u=Float.parseFloat(br.readLine());
	
		ro=(l/u);
		if(ro<1)
		{	
			float p=1;
			System.out.println("_______________________________");
			for(int loop=0;loop<3;loop++)
				{
 					p=(1-ro)*p;
 					System.out.println("p"+loop+" "+p);
				
				}
                  }

}
void calall()
	{
		if(ro<1)
			{
				float L =(ro/(1-ro));
				System.out.println("\nMEASURE OF EFFECTIVENESS:");
				System.out.println("L is:"+L);
			


  				float lq=(ro*ro)/(1-ro);
                                System.out.println("Lq is:"+lq);
                               
                                float w=L/(u-l);
				System.out.println("w is:"+w);
    
 				float wq=ro/(u-l);	
				System.out.println("Wq is:"+wq);
		}
	}	
}
//________________________________________________________________________________
class mmc
{
void calculate()throws IOException
{System.out.println("_______________________________________________________________");
System.out.println("ENTER THE LAMDA(ARRIVAL RATE),MIU(SEVREING RATE)"+
						" AND NO OF SERVER(c) FOR MMC");
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	double l=Double.parseDouble(br.readLine());
	double u=Double.parseDouble(br.readLine());
	double c=Double.parseDouble(br.readLine());
        double n=Double.parseDouble(br.readLine());
         double ndupli=n;
	 double p=1,ro,r;
         r=l/u;
         ro=r/c;

       double rpowerc=1;
       for(int i=0;i<c;i++)
	{rpowerc=rpowerc*r;}

	//System.out.println("rpowerc is:"+rpowerc);        
        double n1, nfact=1;
	n1=n;
        while(n1>1)
		{
			nfact=(n1)*nfact;
			n1--;
		}

	//System.out.println("nfact is:"+nfact);
	double c1,cfact=1;
        c1=c;
	while(c1>1)
		{
			cfact=c1*cfact;
			c1--;
		}

        //System.out.println("cfact is:"+cfact+"c"+c+"n"+n);
  	double n2,nfact1=1,summation=0,rpower_n;
         n2=n;
	for(int x=0;x<c-1;x++)				//finding summation
		{       rpower_n=1;
			nfact1=1;
			for(int i1=0;i1<n;i1++)
				{
					rpower_n=rpower_n*r;
				}
		         n2=n;

  			
          		while(n2>=1)
                         {
				nfact1=(n2)*nfact1;
				n2--;
			}
		  summation=summation+(rpower_n/nfact1);
		n--;
		
		}
      
	double p0=0;
	p0=(1/((rpowerc/(cfact*(1-ro)))+(summation+1)));
	System.out.println("p0 is:"+p0);
	double t=ndupli, lpowern=1,upowern=1;			//calculating lambda power n
        for(int i3=0;i3<t;i3++)
		{
			lpowern=lpowern*l;
			upowern*=u;
		}
        
	double cpowern_c=1,n_c=ndupli-c;
	//System.out.println("n-c"+n_c+"n:"+n+"c:"+c);
	for(int i4=0;i4<n_c;i4++)
	{     
		cpowern_c*=c;
		
		}
        if(0<=n&&n<c)		//pn when 0<=n<c
		{
		System.out.println("0<=n&&n<c");
     		 double P=0;
//System.out.println("nfact:"+nfact+"lpowern:"+lpowern+"upowern:"+upowern+"n:"+n);
	 	 P=((lpowern/(nfact*upowern))*p0);
		 System.out.println("p"+(int)ndupli+"is :"+P);
		}
	if(n>=c)
		{
		double Pn=0;
		System.out.println("Math.pow(l,n)"+Math.pow(l,n)+"cfact"+cfact+"Math.pow(u,n)"+Math.pow(u,n)+"Math.pow(c,n-c)"+Math.pow(c,n-c)+"p0");
		Pn=((Math.pow(l,n)/(cfact*Math.pow(u,n)*Math.pow(c,n-c)))*p0);
		System.out.println("Pn is:"+Pn);
		}

	}
}
//_______________________________________________________________________________________
 class mmIN

{
   void calculate()throws IOException
{System.out.println("_______________________________________________________________");
System.out.println("ENTER THE LAMDA(ARRIVAL RATE),MIU(SEVREING RATE) AND"+
                       " nfor nth probabaility FOR M/M/INFINITY MODEL");
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	double l=Double.parseDouble(br.readLine());
	double u=Double.parseDouble(br.readLine());
	double n=Double.parseDouble(br.readLine());
	double n3,n2,nfact1=1,summation=0,rpower_n;
        double r=l/u; 
	n2=n;
	n3=n;
		n2=n3;
		nfact1=1;
			while(n2>=1)
                         {
				nfact1=(n2)*nfact1;
				n2--;
				}
		
		double Pn=0;
		double p0=1/(Math.exp(r));
		System.out.println("THE p0 is :"+(float)p0);
		Pn=((Math.pow(r,n3)*Math.exp(-r))/nfact1);
		System.out.print("THE P"+(int)n3+"is:");
		System.out.println((float)Pn);

		}   
	}

/*************************************************************************************
OUTPUT:
**************************************************************************************
*/

C:\Users\ravi kuril\Desktop\java\practical\print\test>javac queuing.java

C:\Users\ravi kuril\Desktop\java\practical\print\test>java queuing
PLEASE ENTER THE LAMDA(arrival) AND MIU(serving) for mm1
10
12
____________________________________________________________
p0 0.16666669
p1 0.027777784
p2 0.004629631
____________________________________________________________
ENTER THE LAMDA(ARRIVAL RATE),MIU(SEVREING RATE) AND NO OF SERVER(c) FOR MMC
10
12
4
3
____________________________________________________________
p0 is:0.4343316753095565
0<=n&&n<c
p3is :0.04189155818957914
____________________________________________________________
ENTER THE LAMDA(ARRIVAL RATE),MIU(SEVREING RATE) AND nfor nth probabaility FOR M/M/INFINITY MODEL
10
12
5
____________________________________________________________
THE p0 is :0.4345982
THE P5is:0.0014554606

C:\Users\ravi kuril\Desktop\java\practical\print\test>


