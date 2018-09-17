package priority;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * @param task задача
     */
    public void put(Task task) {
        int newIndex = tasks.size();
        for (int i = 0; i < tasks.size(); i++) {
            if (task.getPriority() < tasks.get(i).getPriority()) {
                System.out.println(tasks.get(i).getDesc() + ". " + tasks.get(i).getPriority());
                newIndex = tasks.indexOf(tasks.get(i));
                break;
            }
        }
        tasks.add(newIndex, task);
    }

    /**
     * Метод take.
     * Извлекает и удаляет первый элемент списка.
     * @return
     */
    public Task take() {
        return this.tasks.poll();
    }
}
