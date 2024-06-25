package Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CustomCollection<E> implements Collection<E> {
    private ArrayList<E> list = new ArrayList<>();
    
    @Override
    public boolean add(E e) {
        return list.add(e);
    }
    
    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }
    
    @Override
    public int size() {
        return list.size();
    }
    
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }
    
    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }
    
    @Override
    public Object[] toArray() {
        return list.toArray();
    }
    
    @Override
    public <T> T[] toArray(T[] a) {
        return list.toArray(a);
    }
    
    @Override
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }
    
    @Override
    public boolean addAll(Collection<? extends E> c) {
        return list.addAll(c);
    }
    
    @Override
    public boolean removeAll(Collection<?> c) {
        return list.removeAll(c);
    }
    
    @Override
    public boolean retainAll(Collection<?> c) {
        return list.retainAll(c);
    }
    
    @Override
    public void clear() {
        list.clear();
    }
    
    @Override
    public String toString() {
        return list.toString();
    }
}
