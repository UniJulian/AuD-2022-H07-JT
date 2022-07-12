package h07;

import org.jetbrains.annotations.Nullable;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PriorityQueueHeap<T> implements IPriorityQueue<T> {
    private final Comparator<T> priorityComparator;
    private final HashMap<T, Integer> indexMap;
    private T[] heap;
    private int size;

    /**
     * Erstellt eine Priority Queue basierend auf einem Heap, mit durch priorityComparator induzierter Ordnung.
     * @param priorityComparator Die auf die Priority Queue induzierte Ordnung.
     * @param capacity Die Kapazität der Queue.
     */
	public PriorityQueueHeap(Comparator<T> priorityComparator, int capacity) {
        if(capacity<= 0)
            throw new IllegalArgumentException();
        this.priorityComparator = priorityComparator;
        heap = (T[]) new Object[capacity] ;
        size = 0;
        indexMap = new HashMap<>(capacity);
	}

    @Override
	public void add(T item) { // macht mies keinen sinn idk tbh
        int index;
        if(size == 0){
            index = size;
            heap[index] = item;}
        else if(size % 2 == 0){
            index = size* 2 + 1;
            heap[index] = item;}
        else{
            index = size* 2 + 2;
            heap[index] = item;}
        indexMap.put(item,index);



        size++;
        sort();

	}
    private void sort(){

    }

	@Override
	public @Nullable T delete(T item) {
        if(!indexMap.containsKey(item))
            return null;
        indexMap.remove(item);
        heap[size] = null;
        size--;
        return item;
	}

    /**
     * Tauscht die Position der Elemente
     * @param index0 Die Position des ersten Elements.
     * @param index1 Die Position des zweiten Elements.
     */
	private void swap(int index0, int index1) {
        // OPTIONAL
	}

	@Override
	public @Nullable T getFront() {
        return heap[0];
	}

	@Override
	public @Nullable T deleteFront() {

        T t = heap[0];
        heap[0] = null;
        indexMap.remove(t);
        return t;
	}

	@Override
	public int getPosition(T item) {
        if(!indexMap.containsKey(item))
            return -1;
        return indexMap.get(item) + 1 ;

	}

    @Override
    public boolean contains(T item) {
        return indexMap.containsKey(item);
    }

    @Override
	public void clear() {
        heap = (T[]) new Object[size];
        indexMap.clear();
	}

	@Override
	public Comparator<T> getPriorityComparator() {
        return priorityComparator;
	}

    /**
     * Gibt die zugrundeliegende Heapstruktur zurück.
     * @return Die zugrundeliegende Heapstruktur.
     */
    public Object[] getInternalHeap() {
        return heap;
    }
}
