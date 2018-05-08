package professions;
/**
 * Класс доктор наследник от профессии.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 08.05.2018
 * @version 1.0
 */
public class Doctor extends Profession {
    /**
     * Метод heal. Доктор лечит пациента.
     * @param patient объект пациент.
     */
    public String heal(Patient patient) {
        Profession doctor = new Profession("Иванов А.А.", "Терапевт");
        return doctor.getProfession() + " " + doctor.getName() + " лечит пациента по имени: " + patient.getPatientName();
    }
}
