package java_oops_practice;

import java_oops_practice.carType.carTypeCodes;

public class engineProblem extends Services {

	public engineProblem(carTypeCodes arg_ctype) {
		super(arg_ctype);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateBill() {
		switch(ctype)
		{
		case Hatchback:
			return 5000;
		case Sedan:
			return 8000;
		case SUV:
			return 10000;
		default:
			return 0;
		}
	}

}
