package calendarPrinter;

import java.util.*;

public class mainer{
	
public static void main(String[] args) 
{	
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter year: ");	//GET AN INTEGER YEAR,
	int yr = in.nextInt();
	System.out.println("Enter the first day of the year (0-6):  ");
	int day = in.nextInt();

    System.out.println("first day is ... " + day);
    
	for (int m=1; m<=12; m++)
	{
		String monthN="";
		
		int numD=0;
		
		switch (m)
		{
		case 1:
			monthN="January ";
			numD=31;
			break;
		case 2:
			monthN="February ";
			if ((yr%4 == 0 && yr%100 != 0) || yr%400 == 0 )
				numD=29;
			else numD=28;
			break;
		case 3:
			monthN="March ";
			numD=31;
			break;
		case 4:
			monthN="April ";
			numD=30;
			break;
		case 5:
			monthN="May ";
			numD=31;
			break;
		case 6:
			monthN="June ";
			numD=30;
			break;
		case 7:
			monthN="July ";
			numD=31;
			break;
		case 8:
			monthN="August ";
			numD=31;
			break;
		case 9:
			monthN="September ";
			numD=30;
			break;
		case 10:
			monthN="October ";
			numD=31;
			break;
		case 11:
			monthN="November ";
			numD=30;
			break;
		case 12:
			monthN="December ";
			numD=31;
			break;
		}

		System.out.println("\n             " + monthN + yr);
		System.out.println("_______________________________________");
		System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
		
		for (int sp=1; sp<=day; sp++)
				System.out.print("      ");
		
			for (int p=1; p<=numD; p++)
				{	
					if (day%7==0 && day!=0)
						System.out.println();
						System.out.printf("%3d   ", p);
						day+=1;
				}
		day%=7;
		
		System.out.print("\n\n");
	}
} // end of main method
} // end of class
