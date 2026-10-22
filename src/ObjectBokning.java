import java.util.ArrayList;
import java.util.Objects;

/**
 * Samling av alla metoder
 * Skapar logiken här där nya algoritmer och metoder samlas
 */
public class ObjectBokning {
    // Specifika typ-värde hos ObjectConstruktor: Objekt, Bokning (String,
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
     * Hämtar ett specifikt objekt från getSpecificObject()
     * @param objektName Objekt som skrivs in
     * @return returnerar objekt som man hämtar ut
     */
    public static ObjectConstructor getSpecificObject(String objektName) {
        ObjectConstructor object = new ObjectConstructor(null, false);
        for (int i = 0; i < objectCount; i++) { // tagit bort "<="
            if (objectList.get(i).getObject().equals(objektName)) {
                object = objectList.get(i);
            }
        }
        return object;
    }

    /**
     * bookObject() kollar efter om objektet är bokat
     * Om inte bookObject() kommer att boka den
     * Om det är redan bokat bookObject() kommer att skriva att det är redan bokat
     * @param objektName Objekt som skrivs in
     */
    public static void bookObject(String objektName) { // Fel metod namn
        for (int i = 0; i < objectCount; i++) {
            if (objectList.get(i).getObject().equals(objektName)) {
                if (!objectList.get(i).isBooked()) {
                    objectList.get(i).setBooked(true);;
                    System.out.println("Objekt bokad.");
                } else {
                    System.out.println("Objektet är redan bokad.");
                }
            }
        }
    }

    /**
     * Ändrar namnet på specifik objekt och tar bort bokningen efter det ändras
     * @param objektName Objekt som skrivs in
     */
    public static String changeObject(String objektName, String objektNameReplacer){
        String objekt = null;
        for (int i = 0; i < objectCount; i++) {
            if (objectList.get(i).getObject().equals(objektName))  {
                objectList.set(i, new ObjectConstructor(objektNameReplacer, false));
                objekt = objektNameReplacer;

                System.out.println("Objekt ändrad");
            }
        }
        return objekt;
    }

    /**
     * Raderar en objekt efter att numret skrivs in
     * @param choice nummer skrivs in
     */
    public static void removeObject(int choice) {
        int newChoice = choice-1;
        if (newChoice > -1 && newChoice < objectCount){ // 1
            objectList.remove(newChoice);
        }else{
            System.out.println("Välj mellan 1 - " + objectCount);
        }

    }

    /**
     * avbokar en specifik objekt
     * @param objektName Objekt som skrivs in
     */
    public static boolean removeBooking(String objektName){
        boolean booking = true;
        for (int i = 0; i < objectCount; i++) {
            if (objectList.get(i).getObject().equals(objektName)) {
                    objectList.get(i).setBooked(false);
                    booking = objectList.get(i).isBooked();
            }
        }
        return booking;
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