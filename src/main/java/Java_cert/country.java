package Java_cert;

public class country {

  public enum Continent {ASIA, EUROPE}

  String name;
  Continent region;

  public country(String na, Continent reg) {
    name = na;
    region = reg;
  }

  public String getName() {
    return name;
  }

  public Continent getRegion() {
    return region;
  }
}