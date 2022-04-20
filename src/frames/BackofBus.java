package frames;

public class BackofBus extends frameService{

	public BackofBus(int arg_days) {
		super(arg_days);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateBill() {
		// TODO Auto-generated method stub
		return 800*days;
	}
	
}
