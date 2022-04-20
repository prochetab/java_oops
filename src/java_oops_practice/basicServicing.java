package java_oops_practice;

import java_oops_practice.carType.carTypeCodes;

public class basicServicing extends Services{

	public basicServicing(carTypeCodes arg_ctype) {
		super(arg_ctype);
	}

	@Override
	public int calculateBill() {
		switch(ctype)
		{
		case Hatchback:
			return 2000;
		case Sedan:
			return 4000;
		case SUV:
			return 5000;
		default:
			return 0;
		}
	}

}
