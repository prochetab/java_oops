package java_oops_practice;

import java_oops_practice.carType.carTypeCodes;

public class breakFixing extends Services {

	public breakFixing(carTypeCodes arg_ctype) {
		super(arg_ctype);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateBill() {
		switch(ctype)
		{
		case Hatchback:
			return 1000;
		case Sedan:
			return 1500;
		case SUV:
			return 2500;
		default:
			return 0;
		}
	}

}
