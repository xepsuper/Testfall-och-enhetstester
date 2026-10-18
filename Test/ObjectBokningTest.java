import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectBokningTest {


    @BeforeEach
    void setUp() {
        ObjectBokning.addObject("Kanot");
        ObjectBokning.addObject("Vattenskoter");
        ObjectBokning.addObject("SUP"); // duplicering
        ObjectBokning.bookObject("SUP");

    }
    @Test
    void getObjekt(){
        String[] ObjektTest = ObjectBokning.objektLista;
        String objektTest = ObjectBokning.objektLista[2];
        boolean objektBookedTest = ObjectBokning.booked[2];

        assertEquals("SUP", objektTest);
    }


}