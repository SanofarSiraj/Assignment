import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {

    @Test
    void bookingInfo() {
        Animals newanimal = new Animals("Tiger",7,"m","meat","climbing");
        Assertions.assertEquals("Tiger",newanimal.getName());

    }


    @Test
    void testBookingInfo() {
        Animals newanimal = new Animals("Tiger",7,"m","meat","climbing");
        Assertions.assertEquals("meat",newanimal.getFavorite_food());

    }

    @Test
    void testBookingInfo1() {
        Animals newanimal = new Animals("Tiger",7,"m","meat","climbing");
        Assertions.assertEquals(7,newanimal.getAge());

    }
}