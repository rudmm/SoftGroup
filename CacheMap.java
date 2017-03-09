import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by michael on 05.03.17.
 */
public interface CacheMap extends Map {



    public class MyMap extends LinkedHashMap<String, Integer>{ //создаэмо внутрішній клас який наслідує LinkedHashMap
        public static final int MAX_SIZE = 4; //в змінні MAX_SIZE вказуємо максимальну кількість записів для збереження

        protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest){
            return size() > MAX_SIZE;
        }
    }



}
