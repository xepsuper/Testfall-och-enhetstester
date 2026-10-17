







import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    ObjectBokning.addObject("Kanot");
    ObjectBokning.addObject("Vattenskoter");
    ObjectBokning.addObject("SUP"); // duplicering

    System.out.println(ObjectBokning.objekt[2]);
    int choice = 0;
    boolean running = true;
    while (running)
    {

        System.out.println("\n1. Vilket Vattenutrustning vill du visa information om?");
        System.out.println("2. Vilken Vattenutrustning vill du boka?");
        System.out.println("3. Lägg till ny vattenutrustning");
        System.out.println("4. Avsluta");

        try{ //
            choice = scanner.nextInt();
            scanner.nextLine();
        }catch(Exception e){
            choice = 4;
        }


        if (choice == 1)
        {
            ObjectBokning.showObject();
        }

        else if (choice == 2)
        {
            System.out.print("Vattenutrustning att välja på: ");
            String objekt = scanner.nextLine();
            ObjectBokning.bookObject(objekt);
        }

        else if (choice == 3)
        {
            System.out.print("Ny vattenutrustning: ");
            String objekt = scanner.nextLine();
            ObjectBokning.addObject(objekt);
        }
        else if (choice == 4)
        {
            System.out.println("Programmet stängs");
            scanner.close();
            running = false;
        }
        else {
            System.out.println("Lägga till rätt nummer från 1 till 4.");
        }
    }


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