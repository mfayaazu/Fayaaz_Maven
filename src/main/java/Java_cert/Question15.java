package Java_cert;

import Java_cert.country.Continent;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question15 {

  public static void main(String[] args) {
    List<country> couList = Arrays.asList(
        new country("Japan", country.Continent.ASIA),
        new country("Italy", country.Continent.EUROPE),
        new country("Germany", country.Continent.EUROPE),
        new country("India", Continent.ASIA));
    Map<Continent, List<String>> regionNames = couList.stream()
        .collect(Collectors.groupingBy(country::getRegion, Collectors.mapping(country::getName, Collectors.toList())));
    System.out.println(regionNames);
  }

}
//output: {ASIA=[Japan], EUROPE=[Italy, Germany]}
//Correct option is B


