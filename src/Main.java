public class Main {
  public static void main(String[] args) {
    Student luna = new Student(10, "Luna Szipli", 1991);
    Student amailie = new Student(11, "Amalie Malle", 2002);
    Student zuhur = new Student(12, "Zuhur Zuzu", 2000);
    Student oskar = new Student(13, "Oskar Osbje", 1998);

    Course programmingCounse = new Course("Programming 101", 10,2025);
    Course technologyCourse = new Course("Tech for dummies", 10, 2026);
    Course advancedMathCourse = new Course("Math for geniuses", 10, 2026);

    programmingCounse.addStudent(luna);
    programmingCounse.addStudent(amailie);
    programmingCounse.addStudent(zuhur);

    technologyCourse.addStudent(luna);
    technologyCourse.addStudent(oskar);
    technologyCourse.addStudent(zuhur);

    advancedMathCourse.addStudent(luna);
    advancedMathCourse.addStudent(oskar);

    programmingCounse.showStudentList();
    technologyCourse.showStudentList();
    advancedMathCourse.showStudentList();

    System.out.println("\n\n\nRemove some students\n\n");

    programmingCounse.removeStudent(10);
    programmingCounse.removeStudent(9999);
    technologyCourse.removeStudent(13);
    advancedMathCourse.removeStudent(10);

    programmingCounse.showStudentList();
    technologyCourse.showStudentList();
    advancedMathCourse.showStudentList();
  }
}
