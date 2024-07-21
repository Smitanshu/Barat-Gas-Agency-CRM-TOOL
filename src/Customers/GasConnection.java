package Customers;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.*;
public class GasConnection extends Customer{
       public  int numberOfCylinders;
        String date;
        static int connectionNumber=100;
        {
            connectionNumber +=1;

        }
      public Date lastDate=null;
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");

    public GasConnection(String name,  String Street, String area, String pinCode,String mobile, int numberOfCylinder) {
        super(name,  Street, area, pinCode , mobile);
        this.numberOfCylinders = numberOfCylinders;
    }

    public void getLastDate(){
        System.out.println("Enter the last Date");
        date=new Scanner(System.in).nextLine();

        try{

            lastDate=dateFormat.parse(date);

        }
        catch(Exception e){
            System.out.println("Error in getlastdate() :"+e);

        }



    }
}

