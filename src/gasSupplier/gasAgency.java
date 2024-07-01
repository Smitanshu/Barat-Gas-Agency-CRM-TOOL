package gasSupplier;
public interface gasAgency {
        public String agencyName="Bharat Gas";

        public int agencyCode=1234;

        public int phNumber=98555;

        public int pinCode=411033; //Pimpri chinchwad

        default void show(){

            System.out.println("The agency Name is :" + agencyName);
            System.out.println("The ahecy code is :" +agencyCode);
            System.out.println("The agecy phone number is :"+phNumber);


        }



    }







