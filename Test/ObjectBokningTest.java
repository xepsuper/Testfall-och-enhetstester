import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectBokningTest {


    @BeforeEach
    void setUp() {
        ObjectBokning.addObject("Kanot");
        ObjectBokning.addObject("Vattenskoter");
        ObjectBokning.addObject("SUP");
        System.out.println("Antal objekt innan" + ObjectBokning.objektCount);
        ObjectBokning.addObject("Hip");
        ObjectBokning.bookObject("SUP");



    }
    @Test
    void getObjekt(){
        int objects = ObjectBokning.objektCount;
        System.out.println("Antal objekt efter" + objects);
        assertEquals(4, objects); // TC04 för att lägga till objekt
           ObjectBokning.showObject(); // TC05 visa alla objekt som finns
        String[] ObjektTest = ObjectBokning.objektLista;
        boolean bookedobjekt = ObjectBokning.checkBookObject(3);
        assertTrue(bookedobjekt); // TC08 att kolla ifall ett objekt är bokad
        String objektTest = ObjectBokning.objektLista[2];
        boolean objektBookedTest = ObjectBokning.bookedList[2];
        String objekt = ObjectBokning.getSpecificObject(2);
        String objektTest2 = ObjectBokning.objektLista[2]; // test för att ett bokad objekt inte ska bokas igen
        boolean objektBookedTest2 = ObjectBokning.bookedList[2]; // kollar om den nya objektet har bokats
        assertEquals("SUP", objektTest);
        assertEquals("Vattenskoter", objekt); // TC07 att hämta ett specifik objekt
        assertTrue(objektBookedTest); // TC06 testa att det går att boka objekt
        assertTrue(objektBookedTest2); // också tc06



    }


}