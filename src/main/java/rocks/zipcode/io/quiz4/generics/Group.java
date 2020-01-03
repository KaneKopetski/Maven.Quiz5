package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> implements Iterable<T>, GroupInterface<T>{
    protected List<T> group;
    public Group() {
        group = new ArrayList<>();
    }

    public Integer count() {
        return group.size();
    }


    public void insert(T value) {
        group.add(value);
    }

    public Boolean has(T value) {
        return group.contains(value);
    }

    public T fetch(int indexOfValue) {
        return group.get(indexOfValue);
    }



    public void delete(T value) {
        group.remove(value);
    }

    public void clear() {
        group.clear();
    }

    public Iterator<T> iterator() {
        return group.iterator();
    }

    @Override
    public String toString() {
        return group.toString();
    }
}