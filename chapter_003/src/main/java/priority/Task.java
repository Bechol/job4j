package priority;

/**
 * Класс Task.
 * Шаблон для создания объекта - задача.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 17.09.2018
 * @version 1.0
 */
public class Task {
    private String desc;
    private int priority;

    /**
     * Конструктор класса.
     * @param desc описание задачи.
     * @param priority приоритет.
     */
    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    /**
     * Геттер getDesc().
     * Возврат описания задачи.
     * @return описание задачи.
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Геттер getPriority().
     * Возврат приоритета задачи.
     * @return приоритет задачи.
     */
    public int getPriority() {
        return priority;
    }
}
