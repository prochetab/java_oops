package java_oops_practice;
import java.util.*;

import java_oops_practice.carType.carTypeCodes;
import java_oops_practice.serviceCodes.ServiceCodesTypes;
abstract public class Services {
	protected carTypeCodes ctype;
	public Services(carTypeCodes arg_ctype)
	{
		ctype=arg_ctype;
	}
	static public Services createService(ServiceCodesTypes arg_scode, carTypeCodes arg_ctype)
	{
		switch(arg_scode)
		{
		case BS01:
			return new basicServicing(arg_ctype);
		case EP01:
			return new engineProblem(arg_ctype);
		case CP01:
			return new clutchProblem(arg_ctype);
		case BF01:
			return new breakFixing(arg_ctype);
		case GP01:
			return new gearProblem(arg_ctype);
		default:
			return null;
		}
	}
	abstract public int calculateBill();
}
