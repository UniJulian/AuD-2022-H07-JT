package h07;

import java.util.Comparator;
import java.util.HashMap;

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
        // TODO
        throw new RuntimeException("Not implemented");
	}

    @Override
	public void add(T item) {
        // TODO
        throw new RuntimeException("Not implemented");
	}

	@Override
	public T delete(T item) {
        // TODO
        throw new RuntimeException("Not implemented");
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
	public T getFront() {
        // TODO
        throw new RuntimeException("Not implemented");
	}

	@Override
	public T deleteFront() {
        // TODO
        throw new RuntimeException("Not implemented");
	}

	@Override
	public int getPosition(T item) {
        // TODO
        throw new RuntimeException("Not implemented");
	}

    @Override
    public boolean contains(T item) {
        // TODO
        throw new RuntimeException("Not implemented");
    }

    @Override
	public void clear() {
        // TODO
        throw new RuntimeException("Not implemented");
	}

	@Override
	public Comparator<T> getPriorityComparator() {
        // TODO
        throw new RuntimeException("Not implemented");
	}

    /**
     * Gibt die zugrundeliegende Heapstruktur zurück.
     * @return Die zugrundeliegende Heapstruktur.
     */
    public Object[] getInternalHeap() {
        return heap;
    }
}
