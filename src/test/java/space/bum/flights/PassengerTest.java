package space.bum.flights;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PassengerTest {

  @Test
  void testPassenter() {
      Passenger passenger = new Passenger("010-1234-5678", "등산객");
      String exPaStr = "Passenger(identifier=010-1234-5678, name=등산객)";
      assertEquals(exPaStr, passenger.toString());
  }
}
