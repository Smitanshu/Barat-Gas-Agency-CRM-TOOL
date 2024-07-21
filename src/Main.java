
import Customers.*;
import gasBooking.*;
import gasBooking.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import static gasSupplier.gasAgency.pinCode;

public class Main {

    static int count;
    static int book;
    static int bcount = 0, ccount = 0, dcount = 0, pcount = 0;
    static String dpname;


    public static void cylinderCount(Delivery[] obj) {

        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "Octomber", "November", "December"};
        //System.out.println("In the month of "+ (months[delivery.dt_2.getMonth()]));

        for (Delivery delivery : obj) {
            count = 0;
            System.out.println("In the month of " + (months[delivery.dt_2.getMonth()]) + "  : ");
            System.out.println("* In" + delivery.area);

            if (delivery.status.equals("D")) {
                count += delivery.numberOfCylinders;

            }
            System.out.println("-" + count + "cylinders  delivered ");


        }
        System.out.println("\n");
    }


    public static  void checkLateDel(Delivery[] obj){


        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "Octomber", "November", "December"};

        int [] month =new int [12];

        for(Delivery delivery  :obj){
            if(delivery.status.equals("D") && delivery.amount==783.75){

                month[delivery.dt_2.getMonth()]+=1;
                //Indexing starts from the zero :  Ex.->>>>>February =1;

            }
        }

        System.out.println("!---------Late delivery -------!");
        for(int i=0; i<12; i++){

            if(month[i]!=0){
                System.out.println("* In  "+ month[i]+ "There are "+ month[i]);
            }

        }
        System.out.println("\n");
    }



    public static void numOfSingleCylinders(Delivery[] obj){
        System.out.println(" --------Single  Cylinder Holder-----------");
        for(int i=0; i<obj.length;i++){
            if(obj[i].numberOfCylinders==1){
                System.out.println("Customer name :"+obj[i].name);
                System.out.println("Mobile No :"+obj[i].mobile);
                System.out.println("Gas connnection No :"+(i+101));

            }
        }
        System.out.println("\n");
    }

public static void DeliveryDetails(Delivery[] obj){
    System.out.println("----------Delivery Details ----------");
    System.out.println("Enter the  Delivery person Name" );
    dpname=new Scanner(System.in).next();
    for(Delivery delivery:obj){
        if(delivery.status.equals("D") && delivery.delPersonName.equals(dpname)){
            System.out.println("Customer name :"+delivery.name);
            System.out.println("---"+delivery.Street+", "+delivery.area+", "+delivery.pinCode);

        }
    }
    System.out.println("\n");
}
public static void printReport(Delivery[] obj) {
    System.out.println("----------Delivery Object --------------");
    for (int i = 0; i < obj.length; i++) {
        if (obj[i].status.equals("D")) {
            dcount++;
        } else if (obj[i].status.equals("B")) {
            bcount++;
        } else if (obj[i].status.equals("C")) {
            ccount++;
        } else if (obj[i].status.equals("P")) {
            pcount++;
        } else {
            System.out.println("Status invalid");
        }
        System.out.println("+Booked");
        System.out.println(" - " + bcount + "booked");
        System.out.println("Delivered");
        System.out.println(" - " + dcount + "delivered");
        System.out.println("Cancelled");
        System.out.println(" - " + ccount + "cancelled");
        System.out.println("Pending");
        System.out.println(" - " + pcount + "+pending");
        System.out.println("\n");

    }
}

//import java.text.SimpleDateFormat;
//import java.util.Date;


        public static void printInvoice(Delivery[] obj) {
            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String invoiceDate = sdf.format(d);

            for (int i = 0; i < obj.length; i++) {
                if (obj[i].status.equals("D")) {
                    System.out.println("                         INVOICE                            ");


                    System.out.println("-----------------------------");
                    System.out.println("Gas Agency Code: " + obj[i].agencyCode + "\t\t\t Date of Invoice: " + invoiceDate);
                    System.out.println("Gas Agency Name: " + obj[i].agencyName + "\t\t\t Agency Phone No.: " + obj[i].phNumber);
                    System.out.println("Gas Connection No.: " + (i+101)+"\t\t\t"+"Customer Name:"+obj[i].name);
                    System.out.println("Booking Date: " + sdf.format(obj[i].dt_1) + "\t\t Customer Mobile No: " + obj[i].mobile);


                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Amount: " + obj[i].amount);
                    System.out.println("Refund: " + obj[i].refund);
                    System.out.println("Total Amount: " + (obj[i].amount -obj[i].refund));


                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Delivery Person Name: " + obj[i].delPersonName + "\t\t Delivery Person Mobile: " + obj[i].delMobileNo);
                    System.out.println("Delivery Date: " + sdf.format(obj[i].dt_2));
                    System.out.println("-----------------------------");
                    System.out.println("\n\n");
                }
            }
        }




    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.println("*******************************************************");
        System.out.println("  !-------Welcome to  Bharat Gas Agency ---------!     ");
        System.out.println("********************************************************");

       Delivery [] deliveryObj=new Delivery[5];

        deliveryObj[0]=new Delivery( "Smitanshu", " 982385XXX",  "Ghole Road",  "Shivaji Nagar",  "411005", 1);
        deliveryObj[1]=new Delivery( "Samrat", " XXX",  "Ace Almighty",  "Bhumakr Chowk",  "411033", 2);
        deliveryObj[2]=new Delivery( "Ashish", " ...XXX..",  "Lakshman Nagar",  "Lakshman Nagar",  "411033", 1);
        deliveryObj[3]=new Delivery( "Nupoor", " XXX",  "RohanAnanta",  "Tathawade",  "411033", 2);
        deliveryObj[4]=new Delivery( "Sakshi", " XXX",  "RohanAnanta",  "RohanAnanta",  "411033", 1);


      for(Delivery delivery :deliveryObj){
          delivery.delPersonDetails();
          delivery.getLastDate();
          delivery.getDate();
          delivery.validate();
          delivery.amountCalc();
          delivery.verifyOtp();


      }
System.out.println();
      cylinderCount(deliveryObj);
      checkLateDel(deliveryObj);
      numOfSingleCylinders(deliveryObj);
      DeliveryDetails(deliveryObj);
      printReport(deliveryObj);
      printInvoice(deliveryObj);

    }
}