package model.inspections;
import model.classes.Establishment;


/**
 * This interface is the implementation of the strategy pattern. Depending on who
 * is making an inspection, the program behaves differently; the inspector can conduct
 * an inspection, while the user can only view the results (placard) of the inspection.
 */
public interface Inspection {
   void doInspection(Establishment facility, String nameOfInspector);
}
