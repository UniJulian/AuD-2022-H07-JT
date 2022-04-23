package h07;

import org.jetbrains.annotations.Nullable;

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
        throw new RuntimeException("H3 - not implemented"); // TODO: H3 - remove if implemented
	}

    @Override
	public void add(T item) {
        throw new RuntimeException("H3 - not implemented"); // TODO: H3 - remove if implemented
	}

	@Override
	public @Nullable T delete(T item) {
        throw new RuntimeException("H3 - not implemented"); // TODO: H3 - remove if implemented
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
        throw new RuntimeException("H3 - not implemented"); // TODO: H3 - remove if implemented
	}

	@Override
	public @Nullable T deleteFront() {
        throw new RuntimeException("H3 - not implemented"); // TODO: H3 - remove if implemented
	}

	@Override
	public int getPosition(T item) {
        throw new RuntimeException("H3 - not implemented"); // TODO: H3 - remove if implemented
	}

    @Override
    public boolean contains(T item) {
        throw new RuntimeException("H3 - not implemented"); // TODO: H3 - remove if implemented
    }

    @Override
	public void clear() {
        throw new RuntimeException("H3 - not implemented"); // TODO: H3 - remove if implemented
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
