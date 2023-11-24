package sem3cosc2006;

public class Course {
    private static final int MAX_ENROLLED_STUDENTS = 5;
    private Student[] students = new Student[MAX_ENROLLED_STUDENTS];
    private int enroll = 0;
    private Instructor instructor;
    private String courseCode;
    private String courseName;

    public Course(String courseCode, String courseName, Instructor instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public int getEnrollment() {
        return enroll;
    }

    public Instructor getInstructor() {
        return instructor;
    }
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void enroll(Student student) {
        if (enroll < MAX_ENROLLED_STUDENTS) {
            students[enroll++] = student;
            System.out.println("The student is enrolled.");
        } else {
            System.out.println("The course is full, so the student cannot be enrolled.");
        }
    }

    public void unenroll(Student student) {
        for (int i = 0; i < enroll; i++) {
            if (students[i] == student) {
                students[i] = students[enroll - 1];
                students[enroll - 1] = null;
                enroll--;
                System.out.println("The student is unenrolled.");
                return;
            }
        }
        System.out.println("The student cannot be unenrolled because they are not enrolled in the course.");
    }

    public void assignGrade(Student student, double grade) {
        student.setAverage((student.getAverage() + grade) / 2);
    }

    @Override
    public String toString() {
        return "Course[code=" + courseCode + ", name=" + courseName +
                ", instructor=" + instructor.getName() + ", enrolled=" + enroll + "]";
    }
}
