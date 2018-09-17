package tracker;
import tracker.models.*;
import java.util.*;
import org.junit.Test;
import tracker.start.Tracker;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.nullValue;
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
		Item item = new Item("test1", "testDescription", 123L);
		tracker.add(item);
		assertThat(tracker.getAll()[0], is(item));
	}
/**
* Тест удаления заявки по id.
*/
	@Test
public void whenDeleteItemThenItemIsNull() {
   Item first = new Item("test1", "testDescription", 123L);
   Item second = new Item("test2", "testDescription", 123L);
   tracker.add(first);
   tracker.add(second);
   tracker.delete(first.getId());
   assertThat(tracker.getAll()[0].getName(), is("test2"));
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
	public void whenNameIsJob4jThenWeHave1Item() {
	Task task = new Task("Job4j", "desc1");
	tracker.add(task);
	Item expect = tracker.getAll()[0];
	Item result = tracker.findByName("Job4j")[0];
	assertThat(expect, is(result));
	}
/**
* Тест поиска по id.
*/
	@Test
	public void whenIdIsTest1ThenWeHave1Item() {
	Task task = new Task("item1", "desc1");
	tracker.add(task);
	String id = tracker.getAll()[0].getId();
	Item expect = tracker.getAll()[0];
	Item result = tracker.findById(id);

	assertThat(expect, is(result));
	}
}