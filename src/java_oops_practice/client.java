package java_oops_practice;import java_oops_practice.carType.carTypeCodes;
import java_oops_practice.serviceCodes.ServiceCodesTypes;

public class client {
	private Services service;
public client(ServiceCodesTypes arg_scode, carTypeCodes arg_ctype)
{
	service=Services.createService(arg_scode, arg_ctype);
}
Services getService()
{
	return service;
}
}
