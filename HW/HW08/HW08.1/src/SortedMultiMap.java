/**
 * Project Name : JavaProgramming and Application HW08.1
 * Program's purpose and basic function :
 * - class SortedMultiMap
 * Program First Author : JH KIM
 * Date of First Write : 2023.11.06
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.11.06			v1.00			First Write
 */
import java.util.*;

public class SortedMultiMap<K, V> {
    private Map<K, Collection<V>> sortedMap = new TreeMap<>();
    /* add value with key in Treemap */
    public void put(K key, V value)
    {
        if (sortedMap.get(key) == null) {
            sortedMap.put(key, new ArrayList<V>());
        }
// if entry exists, but not value, then add value
        if (sortedMap.get(key).contains(value) == false) {
            sortedMap.get(key).add(value);
        }
    }
    public Collection<V> get(Object key) {
        return sortedMap.get(key);
    }
    /* returns set of keys */
    public Set<K> keySet() {
        return sortedMap.keySet();
    }
    /* returns set of entries */
    public Set<Map.Entry<K, Collection<V>>> entrySet() {
        return sortedMap.entrySet();
    }
    /* returns the collection of values */
    public Collection<Collection<V>> values() {
        return sortedMap.values();
    }
    /* if key is contained in hashmap, return true */
    public boolean containsKey(Object key) {
        return sortedMap.containsKey(key);
    }
    /* remove the entry with key */
    public Collection<V> remove(Object key) {
        return sortedMap.remove(key);
    }
    /* returns the number of values */
    public int size() {
        int size = 0;
        for (Collection<V> value: sortedMap.values()) {
            size += value.size();
        }
        return size;
    }
    /* if hashmap is empty return true */
    public boolean isEmpty() {
        return sortedMap.isEmpty();
    }
    /* remove all entries of hashmap */
    public void clear() {
        sortedMap.clear();
    }
    /* remove (key, value) entry */
    public boolean remove(K key, V value) {
        if (sortedMap.get(key) != null) // if key is included
            return sortedMap.get(key).remove(value);
        return false;
    }
    /* replace the (key, oldValue) entry with (key, newValue) */
    public boolean replace(K key, V oldValue, V newValue) // value replace
    {
        if (sortedMap.get(key) != null)
        {
            if (sortedMap.get(key).remove(oldValue)) {
                return sortedMap.get(key).add(newValue);
            }
        }
        return false;
    }
}
