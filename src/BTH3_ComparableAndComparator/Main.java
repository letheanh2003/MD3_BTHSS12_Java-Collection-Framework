package BTH3_ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Write your code here
        Student student = new Student("The Anh", 20, "BacNinh");
        Student student1 = new Student("Anh Khoa", 23, "KonTum");
        Student student2 = new Student("Thang Xoai", 21, "NgheAn");
        Student student3 = new Student("Minh Kun", 23, "BacGiang");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sanh theo tuoi: ");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}
