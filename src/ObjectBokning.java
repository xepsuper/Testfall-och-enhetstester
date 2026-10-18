public class ObjectBokning {
    static String[] objektLista = new String[10];// array out of bounds
    static boolean[] bookedList = new boolean[10];
    static int objektCount = 0;

    public static void addObject(String objektName) {
        if (objektCount < 10){
            objektLista[objektCount] = objektName;
            objektCount++;
        }
    }

    public static void bookObject(String objektName) { // Fel metod namn
        for (int i = 0; i < objektCount; i++) { // tagit bort "<="
            if (objektLista[i].equals(objektName)) {
                if (!bookedList[i]) { // Fel operator
                    bookedList[i] = true;
                    System.out.println("Objekt bokad.");
                } else {
                    System.out.println("Objektet är redan bokad.");
                }
            }
        }
    }

    public static void showObject() {
        System.out.println("Objekt:");
        for (int i = 0; i < objektCount; i++) {
            System.out.println(
                  i+1+": " + objektLista[i] + " Bokat: " + bookedList[i]
            );
        }
    }
    public static String getSpecificObject(int choice){
        String newObjekt = null;
        choice -= 1;
        if (choice < objektCount && choice > -1){
            newObjekt = objektLista[choice];
        }
        else{
            newObjekt = "Finns inte objekt";
        }
        return newObjekt;
    }
    public static boolean checkBookObject(int choice){
        boolean newBookedObject = false;
        choice -=1;
        if (choice < objektCount && choice > -1){
            newBookedObject = bookedList[choice];
        }
              return newBookedObject;
    }
}

// Original code
/*
public class ObjektBokning {

    static String[] objekt = new String[10];
    static boolean[] booked = new boolean[10];
    static int objektCount = 0;

    public static void addObjekt(String objektName) {
        objekt[objektCount] = objektName;
        objektCount++;
    }

    public static void bookObjekt(String objektName) {
        for (int i = 0; i <= objektCount; i++) {
            if (objekt[i].equals(objektName)) {
                if (!booked[i]) { // FEL
                    booked[i] = true;
                    System.out.println("Objekt bokad.");
                } else {
                    System.out.println("Objektet är redan bokad.");
                }
            }
        }
    }

    public static void showObjekt() {
        System.out.println("Objekt:");
        for (int i = 0; i < objektCount; i++) {
            System.out.println(
                    objekt[i] + " Bokat: " + booked[i]
            );
        }
    }
}
*/