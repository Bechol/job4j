package classes;
/**
 * Класс доктор наследник от профессии.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 08.05.2018
 * @version 1.0
 */
public class Doctor extends Profession {
    public static void main(String[] args) {
        Patient patient = new Patient();
        Doctor doctor = new Doctor();
        doctor.heal(patient);
    }
    /**
     * Доктор умеет лечить пациента.
     * @param patient пациент.
     */
    public void heal(Patient patient) {
    }
}
