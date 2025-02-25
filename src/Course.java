public class Course {
  private Student[] students;
  private String courseName;
  private int maxParticipants;
  private int courseYear;

  public Course(String courseName, int maxParticipants, int courseYear) {
    this.courseName = courseName;
    this.maxParticipants = maxParticipants;
    this.courseYear = courseYear;
    students = new Student[maxParticipants];
  }

  public boolean addStudent(Student student) {
    int currentIndex = 0;
    while (currentIndex < students.length && students[currentIndex] != null)
      currentIndex++;
    if (currentIndex < students.length) {
      students[currentIndex] = student;
      return true;
    } else
      return false;
  }

  public boolean removeStudent(int studentId) {
    boolean success = false;

    for (int currentIndex = 0; currentIndex < students.length; currentIndex++) {
      if (students[currentIndex] != null && students[currentIndex].getStudentId() == studentId) {
        students[currentIndex] = null;
        success = true;
        // break;
      }
    }
    return success;
  }

  public void showStudentList() {
    System.out.println("\n" + courseName.toUpperCase() + "\n");
    for (int i = 0; i < students.length; i++) {
      if (students[i] != null) {
        Student s = students[i];
        System.out.println(s.getStudentId() + ": " + s.getName() + ", " + s.getAge());
      }
    }
  }
}
