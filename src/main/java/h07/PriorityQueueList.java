package h07;

import org.jetbrains.annotations.Nullable;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PriorityQueueList<T> implements IPriorityQueue<T> {
	private final Comparator<T> priorityComparator;
	private final List<T> queue;

	/**
	 * Erstellt eine Priority Queue basierend auf einer Liste, mit durch priorityComparator induzierter Ordnung.
	 * @param priorityComparator Die auf die Priority Queue induzierte Ordnung.
	 */
	public PriorityQueueList(Comparator<T> priorityComparator) {
        throw new RuntimeException("H2 - not implemented"); // TODO: H2 - remove if implemented
	}

	@Override
	public void add(T item) {
        throw new RuntimeException("H2 - not implemented"); // TODO: H2 - remove if implemented
	}

	@Override
	public @Nullable T delete(T item) {
        throw new RuntimeException("H2 - not implemented"); // TODO: H2 - remove if implemented
	}

	@Override
	public @Nullable T getFront() {
        throw new RuntimeException("H2 - not implemented"); // TODO: H2 - remove if implemented
	}

	@Override
	public @Nullable T deleteFront() {
        throw new RuntimeException("H2 - not implemented"); // TODO: H2 - remove if implemented
	}

	@Override
	public int getPosition(T item) {
        throw new RuntimeException("H2 - not implemented"); // TODO: H2 - remove if implemented
	}

    @Override
    public boolean contains(T item) {
        throw new RuntimeException("H2 - not implemented"); // TODO: H2 - remove if implemented
    }

    @Override
	public Comparator<T> getPriorityComparator() {
        return priorityComparator;
	}

	@Override
	public void clear() {
        throw new RuntimeException("H2 - not implemented"); // TODO: H2 - remove if implemented
	}

	/**
	 * Gibt die zur Realisierung der Priority Queue genutzte Liste zurück.
	 * @return Die Liste, die zur Realisierung der Priority Queue genutzt wird.
	 */
	public List<T> getInternalList() {
        return queue;
	}
}
