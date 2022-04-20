package frames;

public class OnMetro extends frameService{

	public OnMetro(int arg_days) {
		super(arg_days);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateBill() {
		return days*950;
	}

}
