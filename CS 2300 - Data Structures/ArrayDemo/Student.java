public class Student implements Comparable<Student> {
    double GPA;
    String id;

    public Student(String id, double GPA) {
        this.id = id;
        this.GPA = GPA;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        Student st = (Student) obj;

        // this objects radius is radius
        // circle.radius is the object that is passed ins radius.
        return id.equals(st.id);
    }

    public int compareTo(Student st) { // compare by id
        return id.compareTo(st.id);
    }

    public int compareTo(Student st, double GPA) { // compare by GPA
        if (GPA < st.GPA)
            return -1;
        else if (GPA > st.GPA)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Student(" + id + ", " + GPA + ")";
    }

    public static void main(String[] args) {
        Student s1 = new Student("1", 3.5);
        Student s2 = new Student("2", 3.1);
        System.out.println(s1); // Student(1, 3.5)
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals(new Student("1", 1.0))); // true
        System.out.println(s1.compareTo(s2)); // a negative number

        // when comparing gpa
        // System.out.println(s1.compareTo("1", 1.0));// 0
    }
}
