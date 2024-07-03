import Customers.*;
import gasBooking.*;
import gasBooking.*;

import javax.swing.plaf.synth.SynthTextAreaUI;

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

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("  !-------Welcome to  Bharat Gas Agency ---------!   ");


    }
}