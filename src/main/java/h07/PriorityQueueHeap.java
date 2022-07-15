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

        heap[size] = item;
        indexMap.put(item,size);
        size++;
        sort(size-1);

	}
    private void sort(int current){
        if(current == 0)
            return;

        current = current + 1;
        int root = current /2;

        assert current != root;

        while( current > 1 && priorityComparator.compare(heap[current - 1],heap[root - 1]) > 0  ){
            swap(current-1,root-1);
            current = root;
            root = current/2;
        }
    }

	@Override
	public @Nullable T delete(T item) {
        if(!indexMap.containsKey(item))
            return null;
        int index = indexMap.get(item);
        T t = heap[index];
        heap[index] = heap[size-1];
        heap[size-1] = null;
        indexMap.remove(t);
        size--;
        sortDownRecursive(index);
        return t;
	}

    /**
     * Tauscht die Position der Elemente
     * @param index0 Die Position des ersten Elements.
     * @param index1 Die Position des zweiten Elements.
     */
	private void swap(int index0, int index1) {
        indexMap.replace(heap[index0],index1);
        indexMap.replace(heap[index1],index0);

        T oldItem = heap[index0];
        heap[index0] = heap[index1];
        heap[index1] = oldItem;

	}

	@Override
	public @Nullable T getFront() {
        return heap[0];
	}

	@Override
	public @Nullable T deleteFront() {
        if(size == 0)
            throw new IllegalArgumentException();
        if(size == 1){
            T t = heap[0];
            heap[0] = null;
            indexMap.remove(t);
            return t;
        }

        T t = heap[0];
        heap[0] = heap[size-1];
        heap[size-1] = null;
        indexMap.remove(t);
        size--;
        sortDownRecursive(0);


        return t;
	}
    public void sortDownRecursive(int currentIndex){
        currentIndex++;
        int child1 = currentIndex *2;
        int child2 = currentIndex*2 +1;
        int biggerChild = child1;
        if(child2 <= size && child1 < size && priorityComparator.compare(heap[child2 - 1],heap[child1 - 1]) > 0  )
            biggerChild = child2;

       if( biggerChild <= size && priorityComparator.compare(heap[ biggerChild- 1],heap[currentIndex - 1]) > 0  ){
           swap(currentIndex-1,biggerChild-1);
           sortDownRecursive(biggerChild-1);
       }


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
