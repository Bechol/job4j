package professions;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Oleg Bech (oleg071984@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ProfessionsTest {
    /**
     * Test работы класса Doctor.
     */
    @Test
    public void whenDoctorThenPatient() {
    Doctor doc = new Doctor();
    Patient patient = new Patient("Сергеев А.С.");
    String test = doc.heal(patient);
    String expected = "Терапевт Иванов А.А. лечит пациента по имени: Сергеев А.С.";
    assertEquals(test, expected);
    }
    /**
     * Test работы класса Engineer.
     */
    @Test
    public void whenEngineerThenHouse() {
        Engineer engineer = new Engineer();
        House house = new House("зимний дом из красного кирпича");
        String test = engineer.build(house);
        String expected = "Строитель Сидоров А.В. строит зимний дом из красного кирпича";
        assertEquals(test, expected);
    }
    /**
     * Test работы класса Engineer.
     */
    @Test
    public void whenTheacherThenStudent() {
        Teacher teacher = new Teacher();
        Student student = new Student("Вовочка");
        String test = teacher.teach(student);
        String expected = "Учитель математики Иванова А.А. учит студента по имени Вовочка";
        assertEquals(test, expected);
    }
}
