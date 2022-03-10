//package cli;
//
//import model.Subject;
//import model.Course;
//import model.Student;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        int totalUnits = 0;
//        Scanner scanner = new Scanner(System.in);
//        Student student = new Student();
//        Course course = new Course();
//        Subject subject = new Subject();
//        Subject[] subjects = new Subject[0];
//        boolean isExit = false;
//        while (!isExit) {
//            System.out.println("OOP PROJECT");
//            System.out.print("Enter first name  : ");
//            student.setFirstName(scanner.nextLine().trim());
//            System.out.print("Enter last name   : ");
//            student.setLastName(scanner.nextLine().trim());
//            System.out.print("Enter address     : ");
//            student.setAddress(scanner.nextLine().trim());
//            System.out.print("Enter student ID  : ");
//            student.setStudentNumber(scanner.nextLine().trim());
//            boolean subjectsCount = true;
//            while (subjectsCount) {
//                System.out.print("How many subjects do you have? : ");
//                String temporaryString = scanner.nextLine().trim();
//                if (isNumber(temporaryString)) {
//                    int numberOfSubjects = Integer.parseInt(temporaryString);
//                    if (numberOfSubjects >= 1 && numberOfSubjects <= 12) {
//                        subjects = new Subject[numberOfSubjects];
//                        subjectsCount = false;
//                    }
//                    else {
//                        System.out.println("INVALID NUMBER OF SUBJECTS");
//                    }
//                }
//            }
//            System.out.println("-------------------------------------------------------------------------------");
//            for (int i = 0; i < subjects.length; i++) {
//                System.out.println("    -----------------------------------------------------------------");
//                System.out.print("   |Enter subject code       : ");
//                subject.setSubjectCode(scanner.nextLine().trim());
//                System.out.print("   |Enter subject description: ");
//                subject.setSubjectDescription(scanner.nextLine().trim());
//                System.out.print("   |Enter number of units    : ");
//                subject.setUnits(scanner.nextInt());
//                subjects[i] = new Subject(subject.getSubjectCode(), subject.getSubjectDescription(), subject.getUnits());
//                scanner.nextLine();
//                if (i == subjects.length - 1) {
//                    System.out.println("    -----------------------------------------------------------------");
//                }
//            }
//            System.out.print("Enter course code       : ");
//            course.setCourseCode(scanner.nextLine().trim());
//            System.out.print("Enter course Description: ");
//            course.setCourseDescription(scanner.nextLine().trim());
//            course = new Course(course.getCourseCode(), course.getCourseDescription(), subjects);
//            student.setCourse(course);
//            System.out.println("-------------------------------------------------------------------------------");
//            System.out.println("                            STUDENT INFORMATION                                ");
//            System.out.println("    First Name                : " + student.getFirstName());
//            System.out.println("    Last Name                 : " + student.getLastName());
//            System.out.println("    Address                   : " + student.getAddress());
//            System.out.println("    working.Student Number    : " + student.getStudentNumber());
//            System.out.println("    Course Code               : " + student.getCourse().getCourseCode());
//            System.out.println("    Course Description        : " + student.getCourse().getCourseDescription());
//            System.out.println("-------------------------------------------------------------------------------");
////            course.setSubjects(subjects);
//            subjects = course.getSubjects();
//            if (subjects.length == 1) {
//                System.out.println("SUBJECT: ");
//            }
//            else {
//                System.out.println("SUBJECTS: ");
//            }
//            for (int i = 0; i < subjects.length; i++) {
//                System.out.println("    -----------------------------------------------------------------");
//                System.out.println("   |Subject Code       : " + subjects[i].getSubjectCode());
//                System.out.println("   |Subject Description: " + subjects[i].getSubjectDescription());
//                System.out.println("   |Subject Units      : " + subjects[i].getUnits());
//                if (i == subjects.length - 1) {
//                    System.out.println("    -----------------------------------------------------------------");
//                }
//                totalUnits += subjects[i].getUnits();
//            }
//
//            System.out.println("   |Total Units: " + totalUnits);
//            System.out.println("    -----------------------------------------------------------------");
//            System.out.println("-------------------------------------------------------------------------------");
//            while (true) {
//                System.out.print("RETRY ( Y : N ) : ");
//                char choice = scanner.next().toUpperCase().charAt(0);
//                if (choice == 'Y') {
//                    totalUnits = 0;
//                    subjects = new Subject[0];
//                    scanner.nextLine();
//                    break;
//                }
//                else if (choice == 'N') {
//                    isExit = true;
//                    System.out.println("THANK YOU FOR USING MY PROGRAM");
//                    break;
//                }
//            }
//        } // end of while loop
//    }
//    public static boolean isNumber(String numberString) {
//        try {
//            Integer.parseInt(numberString);
//            return true;
//        } catch (Exception ignored) {}
//        return false;
//    }
//}
