package h07;

import java.util.HashMap;

public class ArcPointerGraph<L, D> implements ArcPointer<L, D> {
    private final HashMap<GraphNode<L>, NodePointerGraph<L, D>> existingNodePointers;
    private final HashMap<GraphArc<L>, ArcPointerGraph<L, D>> existingArcPointers;
	private final GraphArc<L> graphArc;

    /**
     * Erzeugt einen Pointer auf eine Kante, für einen gegebenen Graphen.
     * @param existingNodePointers Die bereits bestehenden NodePointer.
     * @param existingArcPointers Die bereits bestehenden ArcPointer.
     * @param graphArc Die Kante des Graphen, auf die der Pointer verweist.
     */
	public ArcPointerGraph(HashMap<GraphNode<L>, NodePointerGraph<L, D>> existingNodePointers,
                           HashMap<GraphArc<L>, ArcPointerGraph<L, D>> existingArcPointers,
                           GraphArc<L> graphArc) {
        throw new RuntimeException("H6 - not implemented"); // TODO: H6 - remove if implemented
    }

	@Override
	public L getLength() {
        throw new RuntimeException("H6 - not implemented"); // TODO: H6 - remove if implemented
	}

	@Override
	public NodePointer<L, D> destination() {
        throw new RuntimeException("H6 - not implemented"); // TODO: H6 - remove if implemented
	}
}
