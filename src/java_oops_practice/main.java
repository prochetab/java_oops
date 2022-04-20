package java_oops_practice;
import java.util.*;

import java_oops_practice.carType.carTypeCodes;
import java_oops_practice.serviceCodes.ServiceCodesTypes;
public class main {

	public static void main(String[] args) {
		Map<String,carTypeCodes> carTypeMap=new HashMap<String, carType.carTypeCodes>();
		carTypeMap.put("Hatchback", carTypeCodes.Hatchback);
		carTypeMap.put("Sedan", carTypeCodes.Sedan);
		carTypeMap.put("SUV", carTypeCodes.SUV);
		Map<String,ServiceCodesTypes> serviceCodeMap= new HashMap<String, ServiceCodesTypes>();
		serviceCodeMap.put("BS01", ServiceCodesTypes.BS01);
		serviceCodeMap.put("EP01",ServiceCodesTypes.EP01);
		serviceCodeMap.put("CP01",ServiceCodesTypes.CP01);
		serviceCodeMap.put("BF01",ServiceCodesTypes.BF01);
		serviceCodeMap.put("GP01",ServiceCodesTypes.GP01);
		Scanner sc= new Scanner(System.in);
		System.out.println("Type of Car: ");
		String carTypeInput=sc.next();
		System.out.println("Enter Service Code: ");
		String serviceCodesInput=sc.next();
		String[] serviceCodesList=serviceCodesInput.split(",");
		int totalBill=0;
		Services service;
		for(String serviceCodeSingle:serviceCodesList)
		{
			client Client=new client(serviceCodeMap.get(serviceCodeSingle),carTypeMap.get(carTypeInput));
			service=Client.getService();
			totalBill=totalBill+service.calculateBill();
			
		}
		System.out.println(totalBill);
	}

}


