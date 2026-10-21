import java.util.ArrayList;

/**
 * Samling av alla metoder
 * Skapar logiken här där nya algoritmer och metoder samlas
 */
public class ObjectBokning {
    static ArrayList<ObjectConstructor> objectList = new ArrayList<>();

    private static int objectCount = 0;


    /**
     * Skapar nya objekt som hämtar in objekt och boolean samtidig
     * @param object Indata för objekt
     */
    public static void addObject(String object) {
        if (objectCount < 10) {
            objectList.add(new ObjectConstructor(object, false));
            objectCount++;
        }
    }

    /**
     * ShowObject() returnerar en hel lista av objekt i tur ordning
     */
    public static void showObject() {
        System.out.println("Objekt:");
        for (int i = 0; i < objectCount; i++) {
            System.out.println(i + 1 + ": " + objectList.get(i).getObject() + " Bokat: " + objectList.get(i).isBooked()
            );
        }
    }


    /**
     * getSpecificObjekt() används för att leta efter en specifik objekt
     * @param choice välja mellan objekt enligt objektlistan
     */
    public static void getSpecificObject(int choice) {
        ObjectConstructor newObjekt = null;
        choice -= 1;
        if (choice < objectCount && choice > -1) {
            newObjekt = objectList.get(choice);
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
            if (objectList.get(i).getObject().equals(objektName)) {
                if (!objectList.get(i).isBooked()) { // Fel operator
                    objectList.set(i, new ObjectConstructor(objektName, true));
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