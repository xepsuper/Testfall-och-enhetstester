







import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    ObjektBokning.addObjekt("Kanot");
    ObjektBokning.addObjekt("Vattenskoter");
    ObjektBokning.addObjekt("SUP"); // duplicering

    int choice = 0;
    while (choice != 2) // Det ska vara 4 inte 2.
        {

        System.out.println("\n1. Vilket vattenutrudtning vill du visa information om?"); // Fel stavning
        System.out.println("2. Vilken vattenutrudtning vill du boka?"); // Fel stavning
        System.out.println("2. Lägg till ny vattenutrustning");
        System.out.println("4. Avsluta");

        choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            ObjektBokning.showObjekt();}
        else if (choice == 2) {
            System.out.print("Vattenutrustning att välja på: ");
            String objekt = scanner.nextLine();
            ObjektBokning.bookObjekt(objekt);

        }
        else if (choice == 3) {

            System.out.print("Ny vattenutrustning: ");
            String objekt = scanner.nextLine();

            ObjektBokning.addObjekt(objekt);
        }

    }

    scanner.close();
    //a
}




// Original code
/*
import java.util.Scanner;

public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ObjektBokning.addObjekt("Kanot");
        ObjektBokning.addObjekt("Vattenskoter"); // array out of bounds
        ObjektBokning.addObjekt("SUP");

        int choice = 0;
        while (choice != 2) {

        System.out.println("\n1. Vilket vattenutrudtning vill du visa information om?");
        System.out.println("2. Vilken vattenutrudtning vill du boka?");
        System.out.println("2. Lägg till ny vattenutrustning");
        System.out.println("4. Avsluta");

        choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            ObjektBokning.showObjekt();} else if (choice == 2) {
        System.out.print("Vattenutrustning att välja på: ");
        String objekt = scanner.nextLine();
        ObjektBokning.bookObjekt(objekt); } else if (choice == 3) {

        System.out.print("Ny vattenutrustning: ");
        String objekt = scanner.nextLine();

        ObjektBokning.addObjekt(objekt);
        }
        }

        scanner.close();
        }
*/

