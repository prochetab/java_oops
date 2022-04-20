package frames;

import java.util.*;

import frames.Location.LocationTypes;
import frames.LocationCodes.LocationCodesTypes;

abstract public class frameService {
	protected int days;

	public frameService(int arg_days) {
		days = arg_days;
	}
	public static frameService createFrameService(LocationTypes arg_loc, LocationCodesTypes arg_lcode, int arg_days)
	{
		
	        if(arg_loc==LocationTypes.Metro)
	        {
	        	if(arg_days<20)
				{
					System.out.println("Sorry, Minimum booking is 20 days for Metro");
					System.exit(1);
				}
	        }
	        else if(arg_loc==LocationTypes.Bus)
	        {
	        	if(arg_days<15)
				{
					System.out.println("Sorry, Minimum booking is 15 days for Bus");
					System.exit(1);
				}
				
	        }
	        	switch(arg_lcode)
				{
				case IM01:
					return new InsideMetro(arg_days);
				case OM01:
					return new OnMetro(arg_days);
				case AP01:
					return new AtPlatform(arg_days);
				case SB01:
					return new SideofBus(arg_days);
				case BB01:
					return new BackofBus(arg_days);
				default:
					return null;
				}
			
		
		
			

		    }
			
	   

	abstract public int calculateBill();


}
