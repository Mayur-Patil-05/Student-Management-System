import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private int rollNo;
    private String email;
    private int choice;

    Scanner sc = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();

    public void menu(){
        while (choice!=5) {
            System.out.println("1. Add student\n2. View all students\n3. Update student details\n4. Delete a student\n5. Exit");
            System.out.println("Enter choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                addStudent();
            } else if (choice == 2) {
                viewallStudent();
            } else if (choice == 3) {
                updateStudent();
            } else if (choice == 4) {
                deleteStudent();
            } else if (choice == 5) {
                System.out.println("Exiting....");
            } else {
                System.out.println("Enter valid choice!");
            }
        }
        }
    public void addStudent(){
        System.out.println("Enter student name:");
        name = sc.nextLine();

        System.out.println("Enter student roll number:");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter student email:");
        email = sc.nextLine();

        String std = name + ", " +rollNo+ ", " +email;
        list.add(std);
    }

    public void viewallStudent(){
        System.out.println("Students");
        for(int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + ". " + list.get(i));
        }
    }

    public void updateStudent(){
        System.out.println("Students");
        for(int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + ". " + list.get(i));
        }

        if (list.isEmpty()){
            System.out.println("Students not available");
        }
        else {
            System.out.println("Enter index number to update student:");
            int index = sc.nextInt()-1;
            if (index>0 && index<=list.size()){
                System.out.println("Enter student name:");
                name = sc.nextLine();
                sc.nextLine();

                System.out.println("Enter student roll number:");
                rollNo = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter student email:");
                email = sc.nextLine();

                String std2 = name + ", " +rollNo+ ", " +email;
                list.set(index, std2);
                System.out.println("Student updated successfully!");
            }
        }
    }

    public void deleteStudent(){
        System.out.println("Available Students");
        for(int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + ". " + list.get(i));
        }

        if (list.isEmpty()){
            System.out.println("Students not available");
        }
        else {
            System.out.println("Enter index number to update student:");
            int index2 = sc.nextInt()-1;
            if (index2>0 && index2<= list.size()){
                list.remove(index2);
                System.out.println("Student deleted successfully!");
            }
        }
    }

    }

