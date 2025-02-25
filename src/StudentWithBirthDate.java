import java.time.LocalDate;

public class StudentWithBirthDate {
  private int studentId;
  private String name;
  private int birthYear;
  private int birthMonth;
  private int birthDay;

  public StudentWithBirthDate(int studentId, String name, int birthYear, int birthMonth, int birthDay) {
    this.studentId = studentId;
    this.name = name;
    this.birthYear = birthYear;
    this.birthMonth = birthMonth;
    this.birthDay = birthDay;
  }

  public int getAge() {
    LocalDate today = LocalDate.now();
    LocalDate birthdayThisYear = LocalDate.of(today.getYear(), birthMonth, birthDay);

    int age = today.getYear() - birthYear;
    if (today.isBefore(birthdayThisYear)) {
      age--; // Hvis fødselsdagen ikke har været endnu i år
    }
    return age;
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
    return studentId + ": " + name + ", " + getAge() + " år";
  }
}
