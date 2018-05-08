package classes;
/**
 * Класс учитель наследник от профессии.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 08.05.2018
 * @version 1.0
 */
public class Teacher extends Profession {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();
        teacher.teach(student);
    }
    /**
     * Учитель умеет учить студента.
     * @param student студент.
     */
    private void teach(Student student) {
    }
}
