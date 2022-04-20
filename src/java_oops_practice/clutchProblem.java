package java_oops_practice;

import java_oops_practice.carType.carTypeCodes;

public class clutchProblem extends Services {

	public clutchProblem(carTypeCodes arg_ctype) {
		super(arg_ctype);
		// TODO Auto-generated constructor stub
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
			return 6000;
		default:
			return 0;
		}
	}

}
