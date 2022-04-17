package h07;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PriorityQueueList<T> implements IPriorityQueue<T> {
	final Comparator<T> priorityComparator;
	final List<T> queue;

	/**
	 * Erstellt eine Priority Queue basierend auf einer Liste, mit durch priorityComparator induzierter Ordnung.
	 * @param priorityComparator Die auf die Priority Queue induzierte Ordnung.
	 */
	public PriorityQueueList(Comparator<T> priorityComparator) {
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
	public Comparator<T> getPriorityComparator() {
        // TODO
        throw new RuntimeException("Not implemented");
	}

	@Override
	public void clear() {
        // TODO
        throw new RuntimeException("Not implemented");
	}

	/**
	 * Gibt die zur Realisierung der Priority Queue genutzte Liste zurück.
	 * @return Die Liste, die zur Realisierung der Priority Queue genutzt wird.
	 */
	public List<T> getInternalList() {
        // TODO
        throw new RuntimeException("Not implemented");
	}
}
