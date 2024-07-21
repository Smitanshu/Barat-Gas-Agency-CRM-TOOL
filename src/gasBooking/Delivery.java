package gasBooking;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;



public class Delivery extends Booking
{

    public String delPersonName;
    public int customerOtp;
    public Delivery(String name,  String area, String pinCode,String mobile,  String Street,int numberofCylinder)
    {
        super(name,  Street, area, pinCode,mobile, numberofCylinder);


    }

    public  void amountCalc(){
        long dayDiff=dt_2.getTime()-dt_1.getTime();
        long newDiff= TimeUnit.DAYS.convert(dayDiff, TimeUnit.MILLISECONDS);
        if(newDiff>7)
        {
            refund=41.25;
            amount=amount-refund;
        }
    }



    public void verifyOtp(){
           if (status != null && status.equals("B"))
        {
            System.out.println("Enter  OTP:");
            customerOtp=new Scanner(System.in).nextInt();

            if(customerOtp != otp)
            {   System.out.println("In verify otp");
                status="C";
            }else {
                status = "D";
            }
        }
        else
        { System.out.println("In verify otp for where status is not equals to B");
            System.out.println("Booking not found!!");
        }




    }
    public void delPersonDetails()
        {
           System.out.println("\n Enter the delivery person Name :");

           delPersonName=new Scanner(System.in).nextLine();
           ////

        }
}
