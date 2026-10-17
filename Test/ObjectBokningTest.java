import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectBokningTest {


    @BeforeEach
    void setUp() {
        ObjectBokning.addObject("Kanot");
        ObjectBokning.addObject("Vattenskoter");
        ObjectBokning.addObject("SUP"); // duplicering

    }
    @Test
    void getObjekt(){
        String objektTest = ObjectBokning.objekt[1];

        assertEquals("SUP", objektTest);
    }
}