package Students;

import java.util.Scanner;

public class StudentDemo {
    private static Scanner scanner = new Scanner(System.in);
    private  static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {

        boolean run = true;
        while(run){
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add student");
            System.out.println("Please input 2 for print all students");
            System.out.println("Please input 3 for print students count");
            System.out.println("Please input 4 for delete student by index");
            System.out.println("Please input 5 print student by lesson");
            System.out.println("Please input 6 for change students lesson");
            int command = Integer.parseInt(scanner.nextLine());

            switch (command){
                case 0:
                    run = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentStorage.print();
                    break;
                case 3:
                    System.out.println(studentStorage.getSize());
                    break;
                case 4:
                    studentStorage.print();
                    System.out.println("Please choose student index");
                    int index = Integer.parseInt(scanner.nextLine());
                    studentStorage.delete(index);

                    break;
                case 5:
                    System.out.println("Please input lesson name");
                    String lessonName = scanner.nextLine();
                    studentStorage.printStudentsByLesson(lessonName);
                    break;
                case 6:
                    studentStorage.print();
                    System.out.println("Please input index");
                    int index1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please input new lesson name");
                    String lessonChangeName = scanner.nextLine();
                    studentStorage.changeLessonByIndex(index1,lessonChangeName);
                    break;
                default:
                    System.out.println("Invalid command,please try again");
            }
        }

    }

    private static  void addStudent(){
        System.out.println("Please input student name");
        String name = scanner.nextLine();
        System.out.println("Please input student surname");
        String surname = scanner.nextLine();
        System.out.println("Please input student age");
        String ageStr = scanner.nextLine();
        System.out.println("Please input student phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input student city");
        String city = scanner.nextLine();
        System.out.println("Please input student lesson");
        String lesson = scanner.nextLine();

        int age = Integer.parseInt(ageStr);
        Student student = new Student(name,surname,age,phoneNumber,city, lesson);
        studentStorage.add(student);
        System.out.println("Thank you");
    }
}
