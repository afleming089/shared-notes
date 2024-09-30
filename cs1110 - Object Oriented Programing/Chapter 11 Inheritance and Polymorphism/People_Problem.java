//See People_Problem.pdf for UML diagram.

import java.util.Date;

public class People_Problem {
  public static void main(String[] args) {
   /* Person3 person = new Person3("Peter", "123 Elm", "6601234567", "pete@ucmo.edu");
    Student student = new Student("Susan","456 Main", "6609999999", "sue@gmail.com");
    student.setStatus(Student.FRESHMAN);
    Employee employee = new Employee("Eva");
    Faculty faculty = new Faculty("Frank");
    Staff staff = new Staff("Shane");

    System.out.println(person);
    System.out.println(student);
    System.out.println(employee);
    System.out.println(faculty);
    System.out.println(staff);
    */
  }
}//end People_Problem

/*class Person3 {
  private String name;
  private String address;
  private String phoneNumber;
  private String email;

  public Person3(String name) {

  }

  public Person3(String name, String address, String phone, String email){
	  this.name = name;
	  this.address = address;
	  this.phoneNumber = phone;
	  this.email = email;
  }

  public String getName() {    return name;  }
  public String getAddress(){ return address;}
  public String getPhone(){ return phoneNumber;}
  public String getEmail(){ return email;}

  public void setName(String name){ this.name = name; }
  public void setAddress(String address){ this.address = address;}
  public void setPhone(String phoneNumber){this.phoneNumber = phoneNumber;}
  public void setEmail(String email){this.email = email;}

  @Override
  public String toString() {
    return "Person: " + name;
  }
}
*/

/*class Student **** {
  public static final int FRESHMAN = 1;
  public static final int SOPHOMORE = 2;
  public static final int JUNIOR = 3;
  public static final int SENIOR = 4;

  private int status;

  Student(String name){
	  super(name);
  }

  Student(String name, String address, String phone, String email) {
    super(name, address, phone, email);
    status = FRESHMAN;
  }

  public void setStatus(int status){this.status = status;}

  //add toString method that overrides parent

}
*/

/*class Employee **** {
  private String office;
  private int salary;
  private Date dateHired;

  Employee(String name){
	  super(name);
  }

  Employee(String name,String address, String phone, String email ) {
    super(name, address, phone, email);
    dateHired = new Date();
  }

  @Override
  public String toString() {
    return "Employee: " + getName();
  }
}
*/

/* class Faculty **** {
  public static final int LECTURER = 1;
  public static final int ASSISTANT_PROFESSOR = 2;
  public static final int ASSOCIATE_PROFESSOR = 3;
  public static final int PROFESSOR = 4;

  private String officeHours;
  private int rank;

  Faculty(String name){
	  super(name);
  }

  Faculty(String name, String address, String phone, String email, int rank) {
    super(name, address, phone, email);
  }

  @Override
  public String toString() {
    return "Faculty: " + getName();
  }
}
*/

/* class Staff **** {
  protected String title;

  Staff(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return "Staff: " + getName();
  }
}
*/
