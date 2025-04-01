public static List<Integer> breakingRecords(List<Integer> scores) {

    List<Integer> ScoreBroke = new ArrayList<>();
    int minScore = scores.get(0);
    int maxScore = scores.get(0);
    int cntMin = 0;
    int cntMax = 0;

    for (int i = 0; i < scores.size(); i++) {
        if (scores.get(i) < minScore) {
            minScore = scores.get(i);
            cntMin++;
        }
        if (scores.get(i) > maxScore) {
            maxScore = scores.get(i);
            cntMax++;
        }
    }
    ScoreBroke.add(cntMax);
    ScoreBroke.add(cntMin);
    return ScoreBroke;
}