package h07;

import java.util.ArrayList;
import java.util.List;

public class Graph<L> {
    private final List<GraphNode<L>> nodes;

    /**
     * Speichert die gegebenen Knoten als Graphen ab.
     * @param nodes Die Knoten des Graphen.
     */
	public Graph(List<GraphNode<L>> nodes) {
        // TODO
        throw new RuntimeException("Not implemented");
	}

    /**
     * Erzeugt anhand einer Adjazenzmatrix einen Graphen.
     * @param adjacencyMatrix Die Adjazenzmatrix, die zu einem Graphen konvertiert werden soll.
     */
	public Graph(AdjacencyMatrix<L> adjacencyMatrix) {
        // TODO
        throw new RuntimeException("Not implemented");
	}

    /**
     * Gibt die Knoten des Graphen zurück.
     * @return Die Knoten des Graphen.
     */
	public List<GraphNode<L>> getNodes() {
        // TODO
        throw new RuntimeException("Not implemented");
	}
}
