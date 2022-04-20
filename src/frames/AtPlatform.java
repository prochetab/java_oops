package frames;

public class AtPlatform extends frameService {

	public AtPlatform(int arg_days) {
		super(arg_days);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateBill() {
		// TODO Auto-generated method stub
		return 600*days;
	}

}
