package listtomap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Класс UserConvert.
 * Конвертация списка пользователей в Map с ключом Integer id и соответствующим ему User.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 17.09.2018
 * @version 1.0
 */
public class UserConvert {
    /**
     * Метод process.
     * Конвертация списка пользователей в Map.
     * @param list список пользователей.
     * @return Map.
     */
    public Map<Integer, User> process(List<User> list) {
        return list.stream().collect(
                Collectors.toMap(User::getId, Function.identity()));
    }
}
