package frames;

import frames.Location.LocationTypes;
import frames.LocationCodes.LocationCodesTypes;

public class client {
private frameService fservice;
public client(LocationTypes arg_loc, LocationCodesTypes arg_lcode, int arg_days)
{
	fservice=frameService.createFrameService(arg_loc, arg_lcode, arg_days);
}
public frameService getService()
{
	return fservice;
}
}
