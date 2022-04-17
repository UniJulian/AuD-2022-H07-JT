package h07;

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
        // TODO
        throw new RuntimeException("Not implemented");
	}

	@Override
	public D getDistance() {
		return distance;
	}

	@Override
	public void setDistance(D distance) {
		this.distance = distance;
	}

	@Override
	public NodePointer<L, D> getPredecessor() {
		return predecessor;
	}

	@Override
	public void setPredecessor(NodePointer<L, D> predecessor) {
		this.predecessor = predecessor;
	}

	@Override
	public Iterator<ArcPointer<L, D>> outgoingArcs() {
        // TODO
        throw new RuntimeException("Not implemented");
	}
}
