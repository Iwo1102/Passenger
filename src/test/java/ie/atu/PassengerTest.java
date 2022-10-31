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
        assertEquals("Mrs", Passenger.Title("mrs"));
    }
    @Test
    void testFailTitle(){
        try
        {
            Passenger.Title("rs");
            fail("Correct input");
        } catch (RuntimeException e){
            assertNotNull(e);
        }
    }



    @AfterEach
    void tearDown() {
    }
}