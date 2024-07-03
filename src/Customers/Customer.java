package Customers;


import gasSupplier.gasAgency;
public class Customer implements gasAgency {
    String name;
    String Street;

    public String area;
    String pinCode;
    String mobile;

    Customer(String name, String mobile, String Street, String area, String pinCode){ // CTOR


        this.name=name;
        this.Street=Street;
        this.area=area;
        this.pinCode=pinCode;
        this.mobile=mobile;


    }








}
