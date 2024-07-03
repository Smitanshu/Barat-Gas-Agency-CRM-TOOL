package gasBooking;

import Customers.*;
import java.util.*;
import java.text.*;
import java.util.concurrent.TimeUnit;


public class Booking extends GasConnection {

    public  double otp=5678, amount =825.0, refund=0;
    public String  delDate,status, delMobileNo="567890";
    public String dt;
    public Date dt_1, dt_2;

    public Booking(String name, String mobile, String Street, String area, String pinCode, int numberofCylinder) {
        super(name, mobile, Street, area, pinCode, numberofCylinder);
    }

    public void getDate(){
        System.out.println("Enter Booking  date :");
        dt=new Scanner(System.in).next();
        dt_1=null;
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd//MM/yyy");
        try{
            dt_1=dateFormat.parse(dt);

        }catch(Exception e){
            System.out.println("Error in lastDate function :" + e);

        }

        //Delivery Details :
        System.out.println("Enter Delivery Date ");
        delDate=new Scanner(System.in).nextLine();
        try{
            dt_2=dateFormat.parse(delDate);
        }catch(Exception e){
            System.out.println("Error parsing second date:");

        }


// Finding difference between two dates:
        try {

            long difference = dt_2.getTime() - dt_1.getTime();

            //diffference in days:
            long newDiffference = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);

            if (newDiffference > 7) {
                status = "p"; //Pending status

            }
        }catch (Exception e){
                System.out.println("Error while finding difference :" + e);
            }

    }
    public void validate(){

        long elapsedms=dt_1.getTime()-lastDate.getTime();
        long diff=TimeUnit.DAYS.convert(elapsedms, TimeUnit.MILLISECONDS);

        System.out.println("Diffrence between two dates is :" + diff);

        if (numberOfCylinders==1){ //Check for single cylinder
             if(diff<30){
            System.out.println("Booking cannot be done");
            status="C";//

        }else{
                 //System.out.println("status :booked");
                 status="B";
                 lastDate=dt_1;// current booking date will become the last date

             }
        } else if (numberOfCylinders==2) {
            if(diff<50){
                System.out.println("Booking cannot be done :");
                //NumberOfCylinders=0;
                status="C";
            }else{
                //System.out.println("Status : booked");

                status="B";
                lastDate=dt_1;

            }

        }
    }

}

