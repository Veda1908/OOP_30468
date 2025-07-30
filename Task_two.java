package prac_tasks;
import java.util.*;
public class Task_two {
    static class Course {
        private String cou_id;
        private String cou_name;
        public Course(String cou_id, String cou_name) {
            this.cou_id = cou_id;
            this.cou_name = cou_name;
        }
        public String getCourseCode() {
            return cou_id;
        }
        public String getCourseName() {
            return cou_name;
        }
       public String toString() {
            return cou_id + " - " + cou_name;
        }
    }
    static class Students_cou {
        private String stu_Id;
        private String stu_Name;
        private Course[] enrolledCourses;
        private int coursecount;
        public Students_cou(String stu_Id, String stu_Name, int maxCourses) {
            this.stu_Id = stu_Id;
            this.stu_Name = stu_Name;
            this.enrolledCourses = new Course[maxCourses];
            this.coursecount = 0;
        }
        public void enroll(Course course) {
            if (coursecount < enrolledCourses.length) {
                enrolledCourses[coursecount++] = course;
                System.out.println("Enrolled in: " + course.getCourseName());
            } else {
                System.out.println("Cannot enroll. Maximum course limit reached.");
            }
        }
        public void listCourses() {
            System.out.println("\nCourses enrolled by " + stu_Name + " (" + stu_Id + "):");
            if (coursecount == 0) {
                System.out.println("No courses enrolled.");
            } else {
                for (int i = 0; i < coursecount; i++) {
                    System.out.println("  - " + enrolledCourses[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        String stu_Id = sc.nextLine();
        System.out.print("Enter Student Name: ");
        String stu_Name = sc.nextLine();
        System.out.print("Enter max number of courses to enroll: ");
        int maxCourses = sc.nextInt();
        sc.nextLine(); 
        Students_cou student = new Students_cou(stu_Id, stu_Name, maxCourses);
        Course[] courseList = {
            new Course("CSE101", "Course1"),
            new Course("CSE102", "Course2"),
            new Course("CSE103", "Course3")
        };
        System.out.println("\nAvailable Courses:");
        for (int i = 0; i < courseList.length; i++) {
            System.out.println((i + 1) + ". " + courseList[i]);
        }
        System.out.print("\nHow many courses do you want to enroll in? ");
        int enrollCount = sc.nextInt();
        if (enrollCount > maxCourses) {
            System.out.println("You can only enroll in up to " + maxCourses + " courses.");
            enrollCount = maxCourses;
        }
        for (int i = 0; i < enrollCount; i++) {
            System.out.print("Enter course number to enroll (1 to 3): ");
            int courseNum = sc.nextInt();
            if (courseNum >= 1 && courseNum <= 3) {
                student.enroll(courseList[courseNum - 1]);
            } else {
                System.out.println("Invalid course number.");
            }
        }
        student.listCourses();
        sc.close();
    }
}
