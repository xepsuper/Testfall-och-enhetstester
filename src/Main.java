







import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    ObjectBokning.addObject("Kanot");
    ObjectBokning.addObject("Vattenskoter");
    ObjectBokning.addObject("SUP"); // duplicering

    int choice = 0;
    boolean running = true;
    while (running)
    {

        System.out.println("\n1. Vilket Vattenutrustning vill du visa information om?");
        System.out.println("2. Vilken Vattenutrustning vill du boka?");
        System.out.println("3. Lägg till ny vattenutrustning");
        System.out.println("4. Välja en specifik vattenutrustning");
        System.out.println("5. Avsluta");

        /* Kollar för eventuella error som kan komma upp.
        Som till exempel nextInt() hämta endast nummer.
        Det används främst för felhantering och undvika att krascha koden.
        */

        try{
            choice = scanner.nextInt();
            scanner.nextLine();
        }catch(Exception e){
            System.out.println("Välj endast nummer.");
            return;
        }


        if (choice == 1)
        {
            ObjectBokning.showObject();
        }

        else if (choice == 2)
        {
            System.out.print("Vattenutrustning att välja på: ");
            String objektChoice = scanner.nextLine();
            ObjectBokning.bookObject(objektChoice);

        }

        else if (choice == 3)
        {
            System.out.print("Ny vattenutrustning: ");
            String objektChoice = scanner.nextLine();
            ObjectBokning.addObject(objektChoice);
        }
        else if (choice == 4)
        {
            System.out.println("Välj från det som finns här:");
            ObjectBokning.showObject();
            int objektChoice;

            /* Kollar för eventuella error som kan komma upp.
              Som till exempel nextInt() hämta endast nummer.
               Det används främst för felhantering och undvika att krascha koden.
            */
            try{
                objektChoice = scanner.nextInt();
            }catch(Exception e){
                System.out.println("Välj endast nummer.");
                return;
            }
            ObjectBokning.getSpecificObject(objektChoice);

        }
        else if (choice == 5){
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