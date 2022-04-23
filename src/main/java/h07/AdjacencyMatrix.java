package h07;

import java.util.List;

public class AdjacencyMatrix<L> {
    private final L[][] matrix;

    /**
     * Initialisiert die Adjazenzmatrix über die gegebene Matrix.
     * @param matrix Die Matrix, die als Adjazenzmatrix genutzt werden soll.
     */
    public AdjacencyMatrix(L[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * Erzeugt aus dem gegebenen Graph eine Adjazenzmatrix.
     * @param graph Der zu konvertierende Graph.
     */
	@SuppressWarnings("unchecked")
	public AdjacencyMatrix(Graph<L> graph) {
        throw new RuntimeException("H7 - not implemented"); // TODO: H7 - remove if implemented
	}

    /**
     * Gibt die Adjazenzmatrix zurück.
     * @return Die Adjazenzmatrix.
     */
	public L[][] getMatrix() {
        return matrix;
	}
}
