package model.classes;


import java.util.ArrayList;

/**
 * Lists the report scores in order for each establishment.
 */
public class ReportScore {

    private ArrayList<Integer> score = new ArrayList<>();

    public ReportIterator getReportIterator() {
        return new ReportIterator() {
            int index = 0;

            @Override
            public int next() {
                int current = score.get(index);
                index++;
                return current;
            }

            @Override
            public int previous() {
                int current = score.get(index);
                index--;
                return current;
            }

            @Override
            public boolean hasNext() {
                return index < score.size();
            }

            @Override
            public boolean hasPrevious() {
                if (index >= 0) {
                    return index < score.size();
                }
                return false;
            }
        };
    }

}
