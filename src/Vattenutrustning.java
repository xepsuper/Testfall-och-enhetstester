/**
 * Konstruktor för klassen
 * Skapar specifika attributer och variabler för att få en mall för objektListan
 */
public class Vattenutrustning {
    private String object;
    private boolean booked;

    /**
     * Konstruktor, det vill sägas en mall för ObjectBokning.
     * Används för att hämta ut specifik attributer och variabeltyp
     * @param object Använder objekt som variabeltyp string
     * @param booked Använder bokningar som variabeltyp boolean
     */
    public Vattenutrustning(String object, boolean booked){
        this.object = object;
        this.booked = booked;
    }

    /**
     * Metod för att hämta ut bokningar
     * @return Hämtar ut boolean
     */
    public boolean isBooked() {
        return booked;
    }

    /**
     * Ändrar bokningar mellan falsk och sant
     * @param booked Kollar om bokningen är sann
     */
    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    /**
     * Används för att hämta ut objekt
     * @return returnerar objekt
     */
    public String getObject() {
        return object;
    }

    /**
     * Används för att ändra objektens namn
     * @param object Tar fram objekt
     */
    public void setObject(String object) {
        this.object = object;
    }
}
