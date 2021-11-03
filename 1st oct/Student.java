package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String name;
    private Integer phoneNo;
    private Integer age;

    public Student(String name, Integer phoneNo, Integer age) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public int getAge() {
        return age;
    }

public static void main(String[] args) {

     ArrayList<Student> student = new ArrayList<Student>();

    Scanner scan = new Scanner(System.in);

    System.out.print("No of Students the Students List will include of  : ");
        int n = scan.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print(" Name : ");
            String name = scan.next();

            System.out.print(" Phone number : ");
            int phone = scan.nextInt();

            System.out.print(" age : ");
            int age = scan.nextInt();

            Student st = new Student(name, phone, age);

            student.add(st);

            count++;
            System.out.println(count + " data registered");
        }

        System.out.println("Persons who are above 18years : ");
        for (int i = 0; i < student.size(); i++) {
            if ((student.get(i).age >= 18)) {
                System.out.println(student.get(i).getName());
                System.out.println(student.get(i).getPhoneNo());
                System.out.println(student.get(i).getAge());
            }
        }

    }

}
