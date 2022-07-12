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

        this.priorityComparator = priorityComparator;
        queue = new LinkedList<>();
	}

	@Override
	public void add(T item) {
        queue.add(item);
        queue.sort(priorityComparator.reversed());
	}

	@Override
	public @Nullable T delete(T item) {
        T returnVal = queue.remove(item)? item: null;
        queue.sort(priorityComparator.reversed());
        return returnVal;
	}

	@Override
	public @Nullable T getFront() {
        return queue.get(0);
	}

	@Override
	public @Nullable T deleteFront() {
        return queue.remove(0);
	}

	@Override
	public int getPosition(T item) {
        int i = queue.indexOf(item);
        return (i == -1)? i: i+ 1;
	}

    @Override
    public boolean contains(T item) {
        return queue.contains(item);
    }

    @Override
	public Comparator<T> getPriorityComparator() {
        return priorityComparator;
	}

	@Override
	public void clear() {
       queue.clear();
	}

	/**
	 * Gibt die zur Realisierung der Priority Queue genutzte Liste zurück.
	 * @return Die Liste, die zur Realisierung der Priority Queue genutzt wird.
	 */
	public List<T> getInternalList() {
        return queue;
	}
}
