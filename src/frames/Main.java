package frames;

import java.util.*;

import frames.Location.LocationTypes;
import frames.LocationCodes.LocationCodesTypes;

public class Main {

	public static void main(String[] args) {
		Map<String,Location.LocationTypes> LocationMap= new HashMap<String,LocationTypes>();
		LocationMap.put("Metro", LocationTypes.Metro);
		LocationMap.put("Bus",LocationTypes.Bus);
		Map<String,LocationCodesTypes> LocationCodeMap= new HashMap<String, LocationCodes.LocationCodesTypes>();
		LocationCodeMap.put("IM01",LocationCodesTypes.IM01);
		LocationCodeMap.put("OM01",LocationCodesTypes.OM01);
		LocationCodeMap.put("AP01",LocationCodesTypes.AP01);
		LocationCodeMap.put("SB01",LocationCodesTypes.SB01);
		LocationCodeMap.put("BB01",LocationCodesTypes.BB01);
		Scanner sc=new Scanner(System.in);
		System.out.println("Location of Ad:");
		String inputLocation=sc.next();
		System.out.println("Location Codes:");
		String inputLocationCodes=sc.next();
		System.out.println("Days: ");
		int inputDays=sc.nextInt();
		String[] locationCodesList=inputLocationCodes.split(",");
		int totalBill=0;
		frameService fservice;
		for(String locationCodeSingle:locationCodesList)
		{
			client Client=new client(LocationMap.get(inputLocation),LocationCodeMap.get(locationCodeSingle), inputDays);
			fservice=Client.getService();
			totalBill=totalBill+fservice.calculateBill();
		}
		System.out.println(totalBill);
	}

}
