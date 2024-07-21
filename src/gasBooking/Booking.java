package gasBooking;

import Customers.*;

import java.util.*;
import java.text.*;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;


public class Booking extends GasConnection {

    public int otp = 5678;
    public double amount = 825.0, refund = 0;

    public String dt, delDate, status="B", delMobileNo = "7838048546";
    public Date dt_1;
    public Date dt_2;

    public Booking(String name, String Street, String area, String pinCode, String mobile, int numberofCylinder) {
        super(name, Street, area, pinCode, mobile, numberofCylinder);
    }

    public void getDate() {
        System.out.println("Enter Booking  date :");
        dt = new Scanner(System.in).next();
        dt_1 = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dt_1 = dateFormat.parse(dt);

        } catch (Exception e) {
            System.out.println("Error is in  getDates() function :" + e);

        }


        //Delivery Details :
        System.out.println("Enter Delivery Date ");
        delDate = new Scanner(System.in).nextLine();
        try {
            dt_2 = dateFormat.parse(delDate);
        } catch (Exception e) {
            System.out.println("Error parsing  date dt_2 " + e);

        }


// Finding difference between two dates:
        try {
            long difference = dt_2.getTime() - dt_1.getTime();


            //difference in days:
            long newDiffference = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);

            if (newDiffference > 7) {
                status = "P"; //Pending status

            }
        } catch (Exception e) {
            System.out.println("Error while finding difference :" + e);
        }

    }

    public void validate() {

        long elapsedms = dt_1.getTime() - lastDate.getTime();
        long diff = TimeUnit.DAYS.convert(elapsedms, TimeUnit.MILLISECONDS);

        System.out.println("Diffrence between two dates is :" + diff);


        //Check for single cylinder
        if (numberOfCylinders == 1) {
            if (diff < 30) {
                System.out.println("Booking cannot be done");
                //numberOfCylinders=0;
                status = "C";

            } else {
                //System.out.println("status :booked");
                status = "B";
                lastDate = dt_1;// current booking date will become the last date

            }
        }
        else if (numberOfCylinders == 2) {
            if (diff < 50) {
                System.out.println("Booking cannot be done :");
                //NumberOfCylinders=0;
                status = "C";
            } else {
                System.out.println("Status : booked");
                status = "B";
                lastDate = dt_1;

            }

        }


    }

}

