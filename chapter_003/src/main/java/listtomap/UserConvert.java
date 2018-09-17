package listtomap;

import java.util.HashMap;
import java.util.List;

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
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> hm = new HashMap<>(list.size());
        for (User user : list) {
            hm.put(user.getId(), user);
        }
        return hm;
    }
}
