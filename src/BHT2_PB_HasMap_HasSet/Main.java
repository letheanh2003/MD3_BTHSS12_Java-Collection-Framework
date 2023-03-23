package BHT2_PB_HasMap_HasSet;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("The Anh", 20, "Bac Ninh");
        Student student2 = new Student("Anh Khoa", 23, "Kon Tum");
        Student student3 = new Student("Thang Xoai", 21, "Nghe An");
        // write your code here
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);
        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println();
    }
}
