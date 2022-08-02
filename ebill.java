package electricitybillsys;

import java.util.*;

 class ebill 
 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		customerdata ob = new customerdata();
		ob.getdata();
		ob.calc();
		ob.display();
	}
 }
class customerdata
	{
		Scanner in = new Scanner(System.in);
		Scanner ins = new Scanner(System.in);
		String cname,type;
		int bn;
		double current,previous,tbill,units;
		void getdata()
			{
			System.out.print ("\n *************** Electricity Bill System ****************** \n ");
			
			System.out.print ("\n Getting the data from the Customer :-\n ");
			
				System.out.print ("\n Enter customer meter number = ");
				bn = in.nextInt();
				
				System.out.print ("\n Enter Type of connection  (D for Domestic or C for Commercial)= ");
				type = ins.nextLine();
				
				System.out.print ("\n Enter customer name = ");
				cname = ins.nextLine();
				
				System.out.print ("\n Enter previous month reading = ");
				previous= in.nextDouble();
				
				System.out.print ("\nEnter current month reading = ");
				current= in.nextDouble();
			}
		void calc()
			{
				units=current-previous;
				if(type.equals("D"))
					{
						if (units<=100)
							tbill=1 * units;
						else if (units>100 && units<=200)
							tbill=2.50*units;
						else if(units>200 && units<=500)
							tbill= 4*units;
						else
							tbill= 6*units;
					}
				else 
				{
					if (units<=100)
						tbill= 2 * units;
					else if(units>100 && units<=200)
						tbill=4.50*units;
					else if(units>200 && units<=500)
						tbill= 6*units;
					else
						tbill= 7*units;
				}
				System.out.print ("\n Calculation for the Bill Generation is Done ! =\n ");
			}
			
		void display()
			{
		
			System.out.print ("\n Bill Genereted Successfully!!!! =\n ");
			
			System.out.println("\n Consumer number = "+bn);
			System.out.println ("\n  Consumer name = "+cname);
			if(type.equals("D"))
				System.out.println ("\n  type of connection  = DOMESTIC ");
		
			else
				
				System.out.println ("\n type of connection  = COMMERCIAL ");
				System.out.println ("\n Current Month  Reading = "+current);
				System.out.println ("\n Previous Month  Reading = "+previous);
				System.out.println ("\n  Total units = "+units);
				System.out.println ("\n  Total bill = RS "+tbill);
		}
	}


