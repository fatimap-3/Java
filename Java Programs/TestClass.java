package sem3cosc2006;

public class TestClass {
    public static void main(String[] args) {
       
        Student student1 = new Student(001, "Fatima", 0.0);
        Student student2 = new Student(002, "Waseema", 0.0);
        Student student3 = new Student(003, "Taslima", 0.0);
        Student student4 = new Student(004, "Zakkiyah", 0.0);
        Student student5 = new Student(005, "Kawshar", 0.0);
        Student student6 = new Student(006, "Kutbuddin", 0.0);
        Student student7 = new Student(007, "Farida", 0.0);

       
        System.out.println("Students:");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);

        
        Instructor instructor = new Instructor(010, " Kulsum", "Computer Science");

              System.out.println("Instructor:");
        System.out.println(instructor);

       
        Course course1 = new Course("COSC2006N", "Data Structures I", instructor);
        Course course2 = new Course("COSC2007N", "Data Structures II", instructor);

        
        course1.enroll(student1);
        course1.enroll(student2);
        course1.enroll(student3);
        course1.enroll(student4);
        course1.enroll(student5);
        course2.enroll(student6);
        course2.enroll(student7);

      
        System.out.println("Courses Available :");
        System.out.println(course1);
        System.out.println(course2);

        
        student1.setAverage(92.0);
        student2.setAverage(90.0);
        student3.setAverage(89.2);
        student4.setAverage(95.7);
        student5.setAverage(85.3);
        student6.setAverage(70.8);
        student7.setAverage(68.1);

        
        System.out.println("Students with Averages :");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);

        
        course1.setInstructor(instructor);
        course2.setInstructor(instructor);

      
        System.out.println("Courses with Instructors:");
        System.out.println(course1);
        System.out.println(course2);

        
        course1.unenroll(student3);
        course1.unenroll(student4);

      
        System.out.println("Course 1 After Unenrolling Students:");
        System.out.println(course1);

       
        course1.assignGrade(student1, 96.0);
        course1.assignGrade(student2, 86.5);
        course2.assignGrade(student6, 90.0);
        course2.assignGrade(student7, 87.5);

       
        System.out.println("Students with Grades:");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3); 
        System.out.println(student4); 
        System.out.println(student5); 
        System.out.println(student6);
        System.out.println(student7);
    }
}

