public class PolymorphismDemo2 {
  public static void main(String[] args) {
    m(new GraduateStudent4());
    m(new Student4());
    m(new Person4());
    m(new Object());
  }

public static void m(Object x) {
    System.out.println(x.toString());
  }
}

class GraduateStudent4 extends Student {
}

class Student4 extends Person {
  public String toString() {
    return "Student";
  }
}

class Person4 extends Object {
  public String toString() {
    return "Person";
  }
}