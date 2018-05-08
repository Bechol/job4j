package professions;
/**
 * Класс учитель наследник от профессии.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 08.05.2018
 * @version 1.0
 */
public class Teacher extends Profession {
    /**
     * Метод teach. Учитель учит студента.
     * @param student объект студент.
     */
    public String teach(Student student) {
        Profession teacher = new Profession("Иванова А.А.", "Учитель математики");
        return teacher.getProfession() + " " + teacher.getName() + " учит студента по имени " + student.getStudentName();
    }

}
