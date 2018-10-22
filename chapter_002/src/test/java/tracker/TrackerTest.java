package tracker;
import tracker.models.*;
import java.util.*;
import org.junit.Test;
import tracker.start.Tracker;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.equalTo;
/**
 * Test.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @version $Id$
 * @since 0.1
 */ 
public class TrackerTest {
	private final Tracker tracker = new Tracker();
/**
* Тест добавления новой заявки.
*/
	@Test
	public void whenAddNewItemThenTrackerHasSameItem() {
		tracker.add(new Item("Oleg", "Senior developer", 123L));
		assertThat(tracker.getAll().get(0).getName(), equalTo("Oleg"));
	}
/**
* Тест удаления заявки по id.
*/
	@Test
public void whenDeleteItemThenItemIsNull() {
		Tracker tracker = new Tracker();
		tracker.add(new Item("Task1", "TaskDesc1", 123L));
		Item testDelete = tracker.add(new Item("Task2", "TaskDesc2", 1234L));
		tracker.add(new Item("Task3", "TaskDesc3", 12345L));
   tracker.delete(testDelete.getId());
   assertThat(tracker.getAll().get(1).getName(), is("Task3"));
}

/**
* Тест редактирования заявки id.
*/	
	@Test
	public void whenReplaceItemThenNewItem() {
		String newName = "newNameReplace";
		String newDescription = "newDescriptionReplace";
		Item newItem = new Item("test1", "testDescription", 123L);
		tracker.add(newItem);
		tracker.replace(newItem.getId(), newName, newDescription);
		String resultName = newItem.getName();
		String resultDescription = newItem.getDescription();
		assertThat(newName, is(equalTo(resultName)));
		assertThat(newDescription, is(equalTo(resultDescription)));
	}
/**
* Тест вывода списка заявок по имени.
*/	
	@Test
	public void whenFindByNameThenTrackerAddsFindedItemsInNewList() {
		Tracker tracker = new Tracker();
		tracker.add(new Item("Task1", "TaskDesc1", 123L));
		Item test = tracker.add(new Item("Task2", "TaskDesc2", 1234L));
		tracker.add(new Item("Task3", "TaskDesc3", 12345L));
		List<Item> expect = new ArrayList<>();
		expect.add(test);
		assertThat(tracker.findByName("Task2"), is(expect));
	}
/**
* Тест поиска по id.
*/
	@Test
	public void whenIdIsTest1ThenWeHave1Item() {
		Tracker tracker = new Tracker();
		Item testItem = tracker.add(new Item("Task1", "TaskDesc1", 123L));
		tracker.add(new Item("Task2", "TaskDesc2", 1234L));
		tracker.add(new Item("Task3", "TaskDesc3", 12345L));
		assertThat(tracker.findById(testItem.getId()).getName(), is("Task1"));
	}
}