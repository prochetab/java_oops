package frames;

public class SideofBus extends frameService{

	public SideofBus(int arg_days) {
		super(arg_days);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateBill() {
		// TODO Auto-generated method stub
		return days*550;
	}
	
}
