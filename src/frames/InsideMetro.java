package frames;
import java.util.*;
public class InsideMetro extends frameService{

	public InsideMetro(int arg_days) {
		super(arg_days);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateBill() {
		// TODO Auto-generated method stub
		return 350*days;
	}

}
