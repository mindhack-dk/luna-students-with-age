import java.time.LocalDateTime;

public class Student {
  private int studentId;
  private String name;
  private int birthYear; // ikke age, men birthYear

  public Student(int studentId, String name,  int birthYear) {
    this.studentId = studentId;
    this.name = name;
    this.birthYear = birthYear;
  }

  public int getAge() {
    return LocalDateTime.now().getYear() - birthYear;
  }

  public int getStudentId() {
    return studentId;
  }

  public String getName() {
    return name;
  }

  public int getBirthYear() {
    return birthYear;
  }

  @Override
  public String toString() {
    return studentId + ": " + name + ", " +
        getAge();
  }
}
