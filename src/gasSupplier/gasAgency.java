package gasSupplier;
public interface gasAgency {
        public String agencyName="Bharat Gas";

         int agencyCode=1234;

         int phNumber=783555;

         int pinCode =411033;


    

        default void show(){

            System.out.println("The agency Name is :" + agencyName);
            System.out.println("The agency code is :" +agencyCode);
            System.out.println("The agency phone number is :"+phNumber);


        }



    }







