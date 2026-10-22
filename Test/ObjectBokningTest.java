import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Här sker alla testfall och enhetstester
 * Testar om alla metoder gör som det ska
 * Kommer det negativa eller positiva tester?
 */
class ObjectBokningTest {

    @BeforeEach
    void setUp()
    {
        ObjectBokning.bookObject("Kanot");
        ObjectBokning.addObject("Kanot");
        ObjectBokning.addObject("Vattenskoter");
        ObjectBokning.addObject("SUP");
    }
    /**
     * Här testas addObject() om det kontrollerar och det läggs till
     */
    @Test
    void TC04()
    {
        ObjectBokning.addObject("Test");
        /*
        Ändra mellan
        getObject()
        isbooked()
        för att ändra mellan bokning och getObject
         */
        var result = ObjectBokning.objectList.getFirst().getObject(); //<-- Ändra i slutet av raden
        var expected = "Test"; //<-- Ändra här för att få rätt resultat
        assertEquals(expected, result);
    }
    /**
     * Här testas showObject() om det skriver in en hel lista av objekt
     */
    @Test
    void TC05()
    {
        ObjectBokning.showObject();

        var result = ObjectBokning.objectList.getFirst().getObject();
        var expected = "Kanot";
        assertEquals(expected, result);
    }
    /**
     * Här testas bookObject() om vilket bokar på dessa objekt
     */
    @Test
    void TC06()
    {
        ObjectBokning.bookObject("SUP");
        var result = ObjectBokning.objectList.getLast().isBooked();
        var expected = true;
        assertEquals(expected,result);
    }
    /**
     * Här testas getSpecificObject() om det hämtar fram en specifik objekt
     */
    @Test
    void TC07()
    {
        String result = ObjectBokning.getSpecificObject("SUP").getObject();
        String expected = "SUP";
        assertEquals(expected, result);
    }
    /**
     * Här testas changeObject() om det ändrar namn på ett specifikt objekt
     */
    @Test
    void TC08()
    {
        String result = ObjectBokning.changeObject("SUP", "HEJ");
        String expected = "HEJ";
        assertEquals(expected,result);
    }
    /**
     * Här testas removeObject() om det ta bort ett specifikt objekt
     */
    @Test
    void TC09()
    {
        ObjectBokning.showObject();
        ObjectBokning.removeObject(1);
        String result = ObjectBokning.objectList.getFirst().getObject();
        String expected = "Kanot";
        assertNotEquals(expected,result);
    }
    /**
     * Här testas removeBooking() om det kan avboka ett specifikt objekt
     */
    @Test
    void TC10()
    {

       boolean result = ObjectBokning.removeBooking("Kanot");
       boolean expected = true;
        System.out.println(result);
       assertNotEquals(expected,result);

    }
    /**
     * Här testas getSpecificObject()
     * Om det kan hitta värde som inte finns
     * Kan det hitta "Kanot" om man skriver istället "SUP"?
     */
    @Test
    void TC11()
    {
                String result = ObjectBokning.getSpecificObject("SUP").getObject();
                String expected = "Kanot";
                assertEquals(expected,result);

    }



}