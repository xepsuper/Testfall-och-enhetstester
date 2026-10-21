public class ObjectBokning {
    static ObjectConstructor[] objectListTest = new ObjectConstructor[10];
    private static int objectCount = 0;


    /**
     * Skapar nya objekt som hämtar in objekt och boolean samtidig
     * @param object Indata för objekt
     */
    public static void addObject(String object) {
        if (objectCount < 10) {
            objectListTest[objectCount] = new ObjectConstructor(object, false);
            objectCount++;
        }
    }

    /**
     * ShowObject() returnerar en hel lista av objekt i tur ordning
     */
    public static void showObject() {
        System.out.println("Objekt:");
        for (int i = 0; i < objectCount; i++) {
            System.out.println(i + 1 + ": " + objectListTest[i].getObject() + " Bokat: " + objectListTest[i].isBooked()
            );
        }
    }



    /**
     * getSpecificObjekt() används för att leta efter en specifik objekt
     *
     * @param choice Nummer som man väljer objekt för
     * @return Returnerar en string som hänvisar en objekt utifrån objektList
     */
    public static void getSpecificObject(int choice) {
        ObjectConstructor newObjekt = null;
        choice -= 1;
        if (choice < objectCount && choice > -1) {
            newObjekt = objectListTest[choice];
        } else {
            System.out.println("Finns inga objekt");
        }
        System.out.println("Objekt: " + newObjekt.getObject() + " bokning: " + newObjekt.isBooked());
    }

    /**
     * bookObject() kollar efter om objektet är bokat
     * Om inte bookObject() kommer att boka den
     * Om det är redan bokat bookObject() kommer att skriva att det är redan bokat
     *
     * @param objektName Objektet som skrivs in
     */
    public static void bookObject(String objektName) { // Fel metod namn
        for (int i = 0; i < objectCount; i++) { // tagit bort "<="
            if (objectListTest[i].getObject().equals(objektName)) {
                if (!objectListTest[i].isBooked()) { // Fel operator
                    objectListTest[i].setBooked(true);;
                    System.out.println("Objekt bokad.");
                } else {
                    System.out.println("Objektet är redan bokad.");
                }
            }
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