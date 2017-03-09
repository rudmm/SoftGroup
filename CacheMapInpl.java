import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by michael on 06.03.17.
 */
public class CacheMapInpl implements CacheMap {
    public static void main(String[] args){
        System.out.println("Автовидалення застарілих записів карт");
        MyMap myMap = new MyMap();
        myMap.put("1", 1);
        myMap.put("2", 2);
        myMap.put("3", 3); //посилаємо 7 записів карт
        myMap.put("4", 4);
        myMap.put("5", 5);
        myMap.put("6", 6);
        myMap.put("7", 7);


        myMap.entrySet().forEach(entry -> System.out.println(entry.getKey()+" -> "+entry.getValue()));
        System.out.println("якщо на екрані остані 4 записи тоді все працює");
    }
    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

}
