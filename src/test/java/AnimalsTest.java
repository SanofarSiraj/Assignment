import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalsTest {

    @Test
    void getAge() {
        Assertions.assertEquals(7,7);
    }

    @Test
    void getFavorite_food() {
        Assertions.assertEquals("meat","meat");
    }

    @Test
    void getSex() {
        Assertions.assertEquals("m","m");
    }
}
