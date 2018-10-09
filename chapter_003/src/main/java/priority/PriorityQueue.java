package priority;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * @param task задача
     */
    public void put(Task task) {
        int index = tasks.stream().filter(
                tasks -> tasks.getPriority() < task.getPriority()
        ).collect(Collectors.toList()).size();
        this.tasks.add(index, task);

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
