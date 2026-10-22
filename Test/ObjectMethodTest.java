import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Här sker alla testfall och enhetstester
 * Testar om alla metoder gör som det ska
 * Kommer det negativa eller positiva tester?
 */
class ObjectMethodTest {

    @BeforeEach
    void setUp()
    {
        ObjectMethod.bookObject("Kanot");
        ObjectMethod.addObject("Kanot");
        ObjectMethod.addObject("Vattenskoter");
        ObjectMethod.addObject("SUP");
    }
    /**
     * Här testas addObject() om det kontrollerar och det läggs till
     */
    @Test
    void TC01()
    {
        ObjectMethod.addObject("Test");

        var result = ObjectMethod.objectList.getLast().getObject();
        var expected = "Test";
        assertEquals(expected, result);
    }
@Test
    /**
     * Här testas getNumberOfObject(), det hämtar ut hur många objekt som finns i objektlistan
     */
    void TCO2(){
        int result = ObjectMethod.getNumberOfObject();
        int expected = 0;
        assertEquals(expected,result);
    }

    /**
     * Här testas showObject() om det skriver in en hel lista av objekt
     */
    @Test
    void TC03()
    {
        ObjectMethod.showObject();

        var result = ObjectMethod.objectList.getFirst().getObject();
        var expected = "Kanot";
        assertEquals(expected, result);
    }
    /**
     * Här testas bookObject() om vilket objekt bokas
     */
    @Test
    void TC04()
    {
        ObjectMethod.bookObject("SUP");
        var result = ObjectMethod.objectList.getLast().isBooked();
        var expected = true;
        assertEquals(expected,result);
    }
    /**
     * Här testas getSpecificObject() om det hämtar fram en specifik objekt
     */
    @Test
    void TC05()
    {
        String result = ObjectMethod.getSpecificObject("SUP").getObject();
        String expected = "SUP";
        assertEquals(expected, result);
    }
    /**
     * Här testas changeObject() om det ändrar namn på ett specifikt objekt
     */
    @Test
    void TC06()
    {
        String result = ObjectMethod.changeObject("SUP", "HEJ");
        String expected = "HEJ";
        assertEquals(expected,result);
    }
    /**
     * Här testas removeObject() om det ta bort ett specifikt objekt
     */
    @Test
    void TC07()
    {
        ObjectMethod.showObject();
        ObjectMethod.removeObject(1);
        String result = ObjectMethod.objectList.getFirst().getObject();
        String expected = "Kanot";
        assertNotEquals(expected,result);
    }
    /**
     * Här testas removeBooking() om det kan avboka ett specifikt objekt
     */
    @Test
    void TC08()
    {

       boolean result = ObjectMethod.removeBooking("Kanot");
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
    void TC09()
    {
                String result = ObjectMethod.getSpecificObject("Test").getObject();
                String expected = "Test";
                assertEquals(expected,result);

    }



}