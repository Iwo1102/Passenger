package ie.atu;

import ie.atu.Passenger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PassengerTest {
    @BeforeEach
    void setUp() {

    }


    @Test
    void testTitle(){
       assertEquals("Mr", Passenger.title("mr"));
    }

    @Test
    void testFailTitle()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> new Passenger ("m", "Iwo", 12346, 1245612, 32));
        assertEquals("Can only be Mr, Ms or Mrs",e_message.getMessage());
    }

    @Test
    void TestName()
    {
        assertEquals("Iwo", Passenger.name("Iwo"));
    }
    @Test
    void testFailName()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> new Passenger ("mr", "Io", 12346, 1245612, 32));
        assertEquals("Name has to have a minimum of 3 characters",e_message.getMessage());
    }

    @Test
    void TestID()
    {
        assertEquals(1622991122, Passenger.id(1622991122));
    }
    @Test
    void testFailID()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> new Passenger ("mr", "Iwo", 1622991122, 1245612, 32));
        assertEquals("ID has to have a minimum of 10 digits",e_message.getMessage());
    }

    @Test
    void TestPhone()
    {
        assertEquals(1231231, Passenger.phone(1231231));
    }
    @Test
    void testFailPhone()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> new Passenger ("mr", "Iwo", 1622991122, 123123, 32));
        assertEquals("Phone number has to have a minimum of 7 digits",e_message.getMessage());
    }

    @Test
    void TestAge()
    {
        assertEquals(18, Passenger.age(18));
    }
    @Test
    void testFailAge()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> new Passenger ("mr", "Iwo", 1622991122, 1231231, 18));
        assertEquals("Must be at least 16 years of age to fly",e_message.getMessage());
    }


    @AfterEach
    void tearDown() {
    }
}