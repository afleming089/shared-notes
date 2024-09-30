import java.util.ArrayList;

public class TestArrayList {
  public static void main(String[] args) {
    // Create a list to store cities
    ArrayList<String> cityList = new ArrayList<>();

    // Add some cities in the list
    cityList.add("London");
    // cityList now contains [London]
    cityList.add("Denver");
    // cityList now contains [London, Denver]
    cityList.add("Paris");
    // cityList now contains [London, Denver, Paris]
    cityList.add("Miami");
    // cityList now contains [London, Denver, Paris, Miami]
    cityList.add("Seoul");
    // contains [London, Denver, Paris, Miami, Seoul]
    cityList.add("Tokyo");
    // contains [London, Denver, Paris, Miami, Seoul, Tokyo]

	System.out.println(cityList); //display contents of cityList

    System.out.println("List size? " + cityList.size());
    System.out.println("Is Miami in the list? " +
      cityList.contains("Miami"));
    System.out.println("The location of Denver in the list? "
      + cityList.indexOf("Denver"));
    System.out.println("Is the list empty? " +
      cityList.isEmpty()); // Print false
System.out.println("****************************************");
    // Insert a new city at index 2
    cityList.add(2, "Xian");
    // contains [London, Denver, Xian, Paris, Miami, Seoul, Tokyo]
	cityList.add("Miami");
	System.out.println(cityList.toString());

    // Remove a city from the list
    cityList.remove("Miami");
    // contains [London, Denver, Xian, Paris, Seoul, Tokyo, Miami]
	System.out.println("Just removed Miami" + cityList.toString());
    // Remove a city at index 1
     cityList.remove(1);
    // contains [London, Xian, Paris, Seoul, Tokyo, Miami]

    // Display the contents in the list
    System.out.println(cityList.toString());

    //cityList.set(0, "Dallas");
    //System.out.println("demo of set: " + cityList);
System.out.println("****************************************");
    // Display the contents in the list in reverse order
    for (int i = cityList.size() - 1; i >= 0; i--)
      System.out.print(cityList.get(i) + " ");
    System.out.println();
System.out.println("****************************************");
    // Create a list to store two circles
    java.util.ArrayList<CircleFromSimpleGeometricObject> list
      = new java.util.ArrayList<>();

    // Add two circles
    list.add(new CircleFromSimpleGeometricObject(2));
    list.add(new CircleFromSimpleGeometricObject(3));

    // Display the area of the first circle in the list
    System.out.println("The area of the circle? " +
      list.get(0).getArea());

  }
}