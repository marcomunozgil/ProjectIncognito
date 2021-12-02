package model.classes;

/**
 * Interface for the iterator pattern.
 */
public interface ReportIterator {
    int next();
    int previous();
    boolean hasNext();
    boolean hasPrevious();
}
