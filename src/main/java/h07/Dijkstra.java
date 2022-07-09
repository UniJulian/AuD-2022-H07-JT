package h07;

import org.jetbrains.annotations.Nullable;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Dijkstra<L, D>  {
    private final Comparator<D> comparator;
    private final BiFunction<D, L, D> distanceFunction;
    private final IPriorityQueue<NodePointer<L, D>> queue;

    private @Nullable Predicate<NodePointer<L, D>> predicate;

    /**
     * Erzeugt eine Instanz von Dijkstra, welche den Dijkstra Algorithmus ausführt.
     * @param comparator Ein Vergleichsoperator, welcher die Priorität, in der die Knoten in Dijkstra abgearbeitet werden, vorgibt.
     * @param distanceFunction Eine Distanzfunktion, welche für eine gegebene Quellknotendistanz und eine Kantenlänge die Zielknotendistanz ermittelt.
     * @param queueFactory Erzeugt für einen gegebenen Vergleichsoperator eine PriorityQueue, welche nach diesem Vergleichskriterium die Knoten sortiert.
     */
	public Dijkstra(Comparator<D> comparator, BiFunction<D, L, D> distanceFunction,
			Function<Comparator<NodePointer<L,D>>, IPriorityQueue<NodePointer<L, D>>> queueFactory) {
        throw new RuntimeException("H4 - not implemented"); // TODO: H4 - remove if implemented
	}

    /**
     * Initialisiert den Algorithmus von Dijkstra.
     * @param startNode Der Startknoten, von dem der Algorithmus aus die Suche startet.
     */
	public void initialize(NodePointer<L, D> startNode) {
        throw new RuntimeException("H4 - not implemented"); // TODO: H4 - remove if implemented
	}

    /**
     * Initialisiert den Algorithmus von Dijkstra, erhält zusätzlich ein Prädikat, welches beim Eintreffen die Suche vorzeitig beendet.
     * @param startNode Der Startknoten, von dem der Algorithmus aus die Suche startet.
     * @param predicate Das Prädikat, welches beim Eintreffen die Suche vorzeitig beendet.
     */
	public void initialize(NodePointer<L, D> startNode, Predicate<NodePointer<L, D>> predicate) {
        throw new RuntimeException("H4 - not implemented"); // TODO: H4 - remove if implemented
	}

    /**
     * Startet den Algorithms von Dijkstra.
     * @return Alle ermittelten Knoten, ausgenommen den Startknoten.
     */
	public List<NodePointer<L, D>> run() {
        throw new RuntimeException("H4 - not implemented"); // TODO: H4 - remove if implemented
	}

    /**
     * Expandiert den aktuellen Knoten, wie aus Dijkstra bekannt.
     * @param currentNode Zu expandierender Knoten.
     */
	private void expandNode(NodePointer<L, D> currentNode) {
        throw new RuntimeException("H4 - not implemented"); // TODO: H4 - remove if implemented
	}

    /**
     * Überprüft, ob der Algorithmus von Dijkstra terminiert.
     * @param currentNode Der Knoten, anhand dessen überprüft wird, ob der Algorithmus terminiert.
     * @return true, falls der Algorithmus terminiert.
     */
	private boolean finished(NodePointer<L, D> currentNode) {
        throw new RuntimeException("H4 - not implemented"); // TODO: H4 - remove if implemented
	}
}
