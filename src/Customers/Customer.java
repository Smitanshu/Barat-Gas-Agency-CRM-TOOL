package Customers;


import gasSupplier.gasAgency;
public class Customer implements gasAgency {
    public String name;
    public String Street;

    public String area;
    public String pinCode;
   public  String mobile;

    Customer(String name, String mobile, String Street, String area, String pinCode){ // CTOR


        this.name=name;
        this.Street=Street;
        this.area=area;
        this.pinCode=pinCode;
        this.mobile=mobile;


    }








}
