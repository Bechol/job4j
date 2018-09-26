import java.util.*;

/**
 * @author Oleg Bech
 * @version 1.0
 * @e-mail oleg071984@gmail.com
 * @timestamp 26.09.2018, 7:53
 */
public class DepartamentSort {

    /**
     * Метод sortAscending(String[] array).
     * Создание массива кодов подразделений с сортировкой по возрастанию.
     * Метод получает массив строк, после чего в двойном цикле происходит следующее преобразование:
     * 1. Внешний цикл разбивает полученную строку по символу '\', split("\\\\"). Используется регулярное выражение.
     * 2. Последовательно записывает полученные строки в массив tmpStr. Строка K1\SK1 после разбиения запишется в массив
     *    двумя элементами - K1 и SK1.
     * 3. Вутренний цикл последовательно перебирая элементы tmpStr добавляет к ним символ '\', сохраняет полученные
     *    значения в StringBuilder.
     * 4. Далее длина выбранной строки уменьшается на 1 символ и записывается в tmpSet.
     * 5. После того как массив tmpStr исчерпан, внешний цикл повторяет работу.
     * Повтор значений в результирующем массиве невозможен, т.к. мы мспользуем TreeSet.
     * @param array входящий несортированный массив.
     * @return отсортированный по возратанию массив String[] с недостающими кодами подразделений.
     */
    public static String[] sortAscend(String[] array) {
        List<String> sourceList = Arrays.asList(array);
        Set<String> tmpSet = new TreeSet<>();
        for (String departmentString : sourceList) {
            String[] tmpStr = departmentString.split("\\\\");
            StringBuilder temp = new StringBuilder();
            for (String aTmpStr : tmpStr) {
                temp.append(aTmpStr).append("\\");
                tmpSet.add(temp.substring(0, temp.length() - 1));
            }
        }
        return tmpSet.toArray(new String[tmpSet.size()]);
    }

    /**
     * Метод sortDescend(String[] array).
     * @param array входящий несортированный массив.
     * @return отсортированный по убыванию массив String[]
     */
    public static String[] sortDescend(String[] array) {
        List<String> sourceList = Arrays.asList(sortAscend(array));
        Collections.sort(sourceList, descendComp);
        return sourceList.toArray(new String[sourceList.size()]);
    }

    public static Comparator<String> descendComp = new Comparator<String>() {
        @Override
        public int compare(String left, String right) {
            char[] charsCode1 = left.toCharArray();
            char[] charsCode2 = right.toCharArray();
            int compareLength = 0, compareCode = 0;
            compareLength = charsCode1.length - charsCode2.length;
            int len = Math.min(charsCode1.length, charsCode2.length);
            for (int i = 0; i < len; i++) {
                if (charsCode1[i] != charsCode2[i]) {
                    compareCode = -(charsCode1[i] - charsCode2[i]);
                    break;
                }
            }
            return compareCode == 0 ? compareLength : compareCode;
        }
    };
}
