package deptsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Oleg Bech
 * @version 1.0
 * @package deptsort
 * @e-mail oleg071984@gmail.com
 * @timestamp 25.09.2018, 23:18
 */
public class UnitRun {
    public static void main(String[] args) {
        List<Unit> list = new ArrayList<>();
        list.add(new Unit("K1","",""));
        list.add(new Unit("K1","SK2",""));
        list.add(new Unit("K1","SK1","SSK1"));
        list.add(new Unit("K1","SK1","SSK2"));
        list.add(new Unit("K2","",""));
        list.add(new Unit("K2","SK1","SSK1"));
        list.add(new Unit("K2","SK1","SSK2"));
        Collections.sort(list);
        for (Unit unit : list) {
            System.out.println(unit);
        }
    }
}
