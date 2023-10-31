package ch08_HashMultiMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HashMultiMap<K, V> {
    private Map<K, Collection<V>> hashmap = new HashMap<>();
    /* add value with key in hashmap */
    public void put(K key, V value)
    {
        if (hashmap.get(key) == null) {
            hashmap.put(key, new ArrayList<V>());
        }
// if entry exists, but not value, then add value
        if (hashmap.get(key).contains(value) == false) {
            hashmap.get(key).add(value);
        }
    }
    public Collection<V> get(Object key) {
        return hashmap.get(key);
    }
    /* returns set of keys */
    public Set<K> keySet() {
        return hashmap.keySet();
    }
    /* returns set of entries */
    public Set<Map.Entry<K, Collection<V>>> entrySet() {
        return hashmap.entrySet();
    }
    /* returns the collection of values */
    public Collection<Collection<V>> values() {
        return hashmap.values();
    }
    /* if key is contained in hashmap, return true */
    public boolean containsKey(Object key) {
        return hashmap.containsKey(key);
    }
    /* remove the entry with key */
    public Collection<V> remove(Object key) {
        return hashmap.remove(key);
    }
    /* returns the number of values */
    public int size() {
        int size = 0;
        for (Collection<V> value: hashmap.values()) {
            size += value.size();
        }
        return size;
    }
    /* if hashmap is empty return true */
    public boolean isEmpty() {
        return hashmap.isEmpty();
    }
    /* remove all entries of hashmap */
    public void clear() {
        hashmap.clear();
    }
    /* remove (key, value) entry */
    public boolean remove(K key, V value) {
        if (hashmap.get(key) != null) // if key is included
            return hashmap.get(key).remove(value);
        return false;
    }
    /* replace the (key, oldValue) entry with (key, newValue) */
    public boolean replace(K key, V oldValue, V newValue) {
        if (hashmap.get(key) != null)
        {
            if (hashmap.get(key).remove(oldValue)) {
                return hashmap.get(key).add(newValue);
            }
        }
        return false;
    }
}
