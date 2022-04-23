package h07;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class NodePointerAdjacencyMatrix<L, D> implements NodePointer<L, D> {

    private final AdjacencyMatrix<L> adjacencyMatrix;
    private final int row;
    private final HashMap<Integer, NodePointerAdjacencyMatrix<L, D>> existingNodePointers;
    private final HashMap<Pair<Integer, Integer>, ArcPointerAdjacencyMatrix<L, D>> existingArcPointers;

    private D distance;
    private NodePointer<L, D> predecessor;

    /**
     * Erzeugt einen Verweis auf eine Kante eines Graphen, gegeben durch eine Adjazenzmatrix.
     * @param existingNodePointers Die bereits bestehenden NodePointer.
     * @param existingArcPointers Die bereits bestehenden ArcPointer.
     * @param adjacencyMatrix Die Adjazenzmatrix.
     * @param row Die Zeile der Matrix (Knoten des Graphen).
     */
	public NodePointerAdjacencyMatrix(HashMap<Integer, NodePointerAdjacencyMatrix<L, D>> existingNodePointers,
                                      HashMap<Pair<Integer, Integer>, ArcPointerAdjacencyMatrix<L, D>> existingArcPointers,
                                      AdjacencyMatrix<L> adjacencyMatrix, int row) {
        throw new RuntimeException("H7 - not implemented"); // TODO: H7 - remove if implemented
	}

	@Override
	public @Nullable D getDistance() {
		return distance;
	}

	@Override
	public void setDistance(@NotNull D distance) {
		this.distance = distance;
	}

	@Override
	public @Nullable NodePointer<L, D> getPredecessor() {
		return predecessor;
	}

	@Override
	public void setPredecessor(@NotNull NodePointer<L, D> predecessor) {
		this.predecessor = predecessor;
	}

	@Override
	public Iterator<ArcPointer<L, D>> outgoingArcs() {
        throw new RuntimeException("H7 - not implemented"); // TODO: H7 - remove if implemented
	}
}
