package professions;
/**
 * Класс пациент.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 08.05.2018
 * @version 1.0
 */
public class Student {
    public String studentName;
    /**
     * Дефолтный конструктор.
     */
    public Student() {
    }
    /**
     * Метод Student.
     * Конструктор класса.
     */
    public Student(String studentName) {
        this.studentName = studentName;
    }
    /**
     * Метод getStudentName.
     * Возвращает имя студента.
     */
    public String getStudentName() {
        return this.studentName;
    }
}
