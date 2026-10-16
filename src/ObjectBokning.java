public class ObjectBokning {
    static String[] objekt = new String[10];// array out of bounds
    static boolean[] booked = new boolean[10];
    static int objektCount = 0;

    public static void addObject(String objektName) {
        if (objektCount > 10){
            objekt[objektCount] = objektName;
            objektCount++;
        }
    }

    public static void bookObject(String objektName) { // Fel metod namn
        for (int i = 0; i < objektCount; i++) { // tagit bort "<="
            if (objekt[i].equals(objektName)) {
                if (!booked[i]) { // Fel operator
                    booked[i] = true;
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
                  i+": " + objekt[i] + " Bokat: " + booked[i]
            );
        }
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