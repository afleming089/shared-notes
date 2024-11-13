import java.util.ArrayList;
import java.util.Collections;

public class MyArrayDemo {
    public static void main(String[] args) {
        // MyArrayForInt nums1 = new MyArrayForInt();
        MyArray<Double> nums1 = new MyArray<>();
        nums1.add(10.0);
        // nums1 = {10,0,0,0,0}
        // length = 5

        nums1.add(20.0);
        // nums1 = {10,20,0,0,0}
        // length = 5

        System.out.println(nums1.toString());

        nums1.add(30.0);
        // nums1 = {10,20,30,0,0}
        // length = 5

        System.out.println(nums1.toString());

        nums1.add(40.0);
        // nums1 = {10,20,30,40,0}
        // length = 5

        System.out.println(nums1.toString());

        nums1.add(50.0);
        // nums1 = {10,20,30,40,50}
        // length = 5

        System.out.println(nums1.toString());

        nums1.add(60.0);
        // nums1 = {10,20,30,40,50, 60}
        // length 10

        System.out.println(nums1.toString());

        nums1.remove(20.0);
        System.out.println(nums1.toString());

        System.out.println("Located at " + nums1.search(30.0));
        System.out.println("Located at " + nums1.search(5.0));
        System.out.println("Located at " + nums1.search(1023.0));

        // wont work with doubles
        nums1.add(2.5); // removes .5

        System.out.println("Nums Array Sorted");
        MyArraySorted nums2 = new MyArraySorted();
        nums2.add(10);
        nums2.add(5);
        System.out.println(nums2.toString()); // print array 5 10

        nums2.add(20);
        nums2.add(4);
        System.out.println(nums2.toString()); // array = 4 5 10 20
        nums2.remove(5);
        System.out.println(nums2.toString()); // array = 4 10 20

        MyArray<String> names = new MyArray<>();

        names.add("Tom");
        names.add("Jack");
        System.out.println(names.toString()); // Tom Jack
        names.add("Caleb");
        names.add("Zach");
        System.out.println(names.toString()); // Tom Jack Caleb Zach
        System.out.println(names.search("Jack")); // 1
        System.out.println(names.search(new String("Jack"))); // -1 Different memory addresses so not in the array.
        // When you compare the values not the address then it will equal 1.

        Circle c1 = new Circle(3);
        MyArray<Circle> circles = new MyArray<Circle>();
        circles.add(new Circle(5));
        circles.add(new Circle(3));

        System.out.println(circles.toString());
        System.out.println(circles.search(new Circle(3))); // 1
        System.out.println(circles.search(new Circle(2))); // - 1

        Circle c3 = new Circle(3);
        System.out.println(c1.equals(c3)); // true
        System.out.println(c3.equals(c1)); // true
        // .equals in object super class it equals == when comparing. Seeing if it is
        // the same object but not the same value.
        // need to override it in circle class.

        Circle c2 = new Circle(13);
        Circle c4 = new Circle(40);

        circles.add(c2);
        circles.add(c4);

        System.out.println(circles.max());

        // Student s1 = new Student("1", 3.1);
        // MyArray<Student> students = new MyArray<Student>();
        // students.add(s1);
        // students.add(new Student("2", 3.3));
        // students.add(new Student("3", 3.4));
        // System.out.println(students.toString()); // Student(1, 3.1), Student(2, 3.3),
        // Student(3, 3.4)

        // System.out.println(students.toString());
        // System.out.println(students.search(new Student("2", 4))); // 1
        // System.out.println(students.search(new Student("10", 4))); // - 1
        // System.out.println(students.max()); // Student 3, 3.4

        Student s1 = new Student("1", 3.1);
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(new Student("2", 3.3));
        students.add(new Student("3", 3.4));
        System.out.println(students.toString()); // Student(1, 3.1), Student(2, 3.3), Student(3, 3.4)

        System.out.println(students); // [Student(1, 3.1), Student(2, 3.3), Student(3, 3.4)]
        System.out.println(students.indexOf(new Student("2", 4))); // 1
        System.out.println(students.contains(new Student("10", 4))); // true
        // System.out.println(students.max()); // Student 3, 3.4
        System.out.println(Collections.max(students));

        System.out.println(ArrayDemo.commonElements(new int[] { 10, 20, 30, 40 }, new int[] { 4, 10, 20, 34, 50 }));
        // 10 20
    }
}
