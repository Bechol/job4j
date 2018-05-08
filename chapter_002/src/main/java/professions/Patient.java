package professions;
/**
 * Класс пациент.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 08.05.2018
 * @version 1.0
 */
public class Patient {
    public String patientName;
    /**
     * Дефолтный конструктор.
     */
    public Patient() {
    }
    /**
     * Метод Patient.
     * Конструктор класса.
     */
    public Patient(String patientName) {
        this.patientName = patientName;
    }
    /**
     * Метод getPatientName.
     * Возвращает имя пациента.
     */
    public String getPatientName() {
        return this.patientName;
    }
}
