package chapter15.eleven;

public class Employee implements Payable<Employee>{

	
}
class Hourly extends Employee implements Payable<Hourly>{  //同一个接口被实现多次，类型被擦除之后，接口是相同的。
	
}
