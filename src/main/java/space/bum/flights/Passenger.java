package space.bum.flights;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Passenger {
  private String identifier;
  private String name;
}
