package java_oops_practice;

import java_oops_practice.carType.carTypeCodes;

public class gearProblem extends Services{

	public gearProblem(carTypeCodes arg_ctype) {
		super(arg_ctype);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateBill() {
		switch(ctype)
		{
		case Hatchback:
			return 3000;
		case Sedan:
			return 6000;
		case SUV:
			return 8000;
		default:
			return 0;
		}
	}

}
