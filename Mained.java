
/*  ..... This is Sample program for Arrays by using the concept of TwoWheeler parking ..... */

//importing packages.
import java.util.Scanner;

class Parking {

    // Declaring public variables   
    int[] twoWheeler = new int[10];
    int slot = 0;
    Scanner in = new Scanner(System.in);

    //This method for parking bike in the slot or vaccant place
    void Two() {
        System.out.println("Which slot you are parked the bike:");
        slot = in.nextInt();
        if (twoWheeler[slot] == 0) {
            twoWheeler[slot] = 1;
            System.out.println("Slot :" + slot + ", has Allocated for YOU");
        }
    }

    //This Method for checking status of parking
    void Avilable() {
        for (int i = 0; i < twoWheeler.length; i++) {
            if (twoWheeler[i] == 0) {
                System.out.println("Slot : " + i + " Avilable");
            }
            if (twoWheeler[i] == 1) {
                System.out.println("Slot : " + i + " Occupied.....");
            }
        }
    }

    //This Method for releaving vechile from the parking
    void Releave() {
        System.out.println("Which slot you are parked the bike:");
        slot = in.nextInt();
        if (twoWheeler[slot] == 1) {
            twoWheeler[slot] = 0;
            System.out.println("Slot :" + slot + ", Releaved by YOU");
        }
    }
}

// Creating main class
class Mained {

    public static void main(String[] args) {
        Parking io = new Parking();                               //Creating object for SubClass...
        Scanner in = new Scanner(System.in);
        int i = 1;
        while (i != 0) {
            System.out.println("--------The Parking---------");
            System.out.println("Enter '1' for choosing SLOT");
            System.out.println("Enter '2' for checking STATUS");
            System.out.println("Enter '3' for releaving SLOT");
            System.out.println("Enter '0' for QUIT");

            System.out.println("Choose any one given above :");
            int park = in.nextInt();
            i = park;
            switch (park) {     //Calling the function by using switch case
                case 1:
                    io.Two();
                    break;
                case 2:
                    io.Avilable();
                    break;
                case 3:
                    io.Releave();
                default:
                    System.out.println("Thanks for using US :)");
            }
        }
    }
}
