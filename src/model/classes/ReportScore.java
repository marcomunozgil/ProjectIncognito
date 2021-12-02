package model.classes;


import java.util.ArrayList;

/**
 * Lists the report scores in order for each establishment.
 */
public class ReportScore {

    private ArrayList<Integer> scoreList = new ArrayList<>();

    /**
     * Adds a new score into the score list for the report.
     * @param score new score
     */
    public void addScore(int score) {
        scoreList.add(score);
    }

    public ReportIterator getReportIterator() {
        return new ReportIterator() {
            int index = 0;

            @Override
            public int next() {
                int current = scoreList.get(index);
                index++;
                return current;
            }

            @Override
            public int previous() {
                int current = scoreList.get(index);
                index--;
                return current;
            }

            @Override
            public boolean hasNext() {
                return index < scoreList.size();
            }

            @Override
            public boolean hasPrevious() {
                if (index >= 0) {
                    return index < scoreList.size();
                }
                return false;
            }
        };
    }

}
