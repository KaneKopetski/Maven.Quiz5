package rocks.zipcode.io.quiz4.generics;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T extends Comparable> extends Group<T> {

    @Override
    public void insert(T value) {
        this.group.add(value);
        this.group.sort((object1, object2) -> {
            if (object1 instanceof Comparable) {
            return (object1).compareTo(object2);
        }
        else return 0;});
    }

    @Override
    public void delete(T value) {
        this.group.remove(value);
    }

    public Integer indexOf(T value) {
        return super.group.indexOf(value);
    }
}
