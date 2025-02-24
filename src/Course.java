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
    for (int i = 0; i < students.length; i++) {
      if (students[i] != null && students[i].getStudentId() == studentId) {
        students[i] = null;
        return true;
      }
    }
    return false;
  }

  public void showStudentList() {
    System.out.println("\n" + courseName.toUpperCase() + "\n");
    for (int i = 0; i < students.length; i++)
      if (students[i] != null)
        System.out.println(students[i]);
  }
}
