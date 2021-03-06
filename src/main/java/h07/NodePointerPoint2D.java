package h07;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class NodePointerPoint2D implements NodePointer<Double, Double> {
    private final HashMap<Point2D, NodePointerPoint2D> existingNodePointers;
    private final HashMap<Pair<Point2D, Point2D>, ArcPointerPoint2D> existingArcPointers;

    private final Point2DCollection collection;
    private final Point2D point;

    private @Nullable NodePointer<Double, Double> predecessor;
    private @Nullable Double distance;

    /**
     * Erzeugt einen Verweis auf einen Punkt einer Punktsammlung.
     * @param existingNodePointers Die bereits bestehenden NodePointer.
     * @param existingArcPointers Die bereits bestehenden ArcPointer.
     * @param point Der Punkt, auf den verwiesen wird.
     * @param collection Die Punktsammlung, die den Punkt enthält.
     */
    public NodePointerPoint2D(HashMap<Point2D, NodePointerPoint2D> existingNodePointers,
                              HashMap<Pair<Point2D, Point2D>, ArcPointerPoint2D> existingArcPointers,
                              Point2D point, Point2DCollection collection) {
        throw new RuntimeException("H8 - not implemented"); // TODO: H8 - remove if implemented
    }

    @Override
    public @Nullable Double getDistance() {
        return distance;
    }

    @Override
    public void setDistance(@NotNull Double distance) {
        this.distance = distance;
    }

    @Override
    public @Nullable NodePointer<Double, Double> getPredecessor() {
        return predecessor;
    }

    @Override
    public void setPredecessor(@NotNull NodePointer<Double, Double> predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public Iterator<ArcPointer<Double, Double>> outgoingArcs() {
        throw new RuntimeException("H8 - not implemented"); // TODO: H8 - remove if implemented
    }
}
