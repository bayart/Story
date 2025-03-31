public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    List<Integer> fairsList = new ArrayList<>();
    int fairs = 0;
    for (int i = 0; i < ar.size(); i++) {
        for (int j = i + 1; j < ar.size(); j++) {
            if ((ar.get(i) + ar.get(j)) % k == 0) {
                fairs++;
            }
        }
    }
    return fairs;
}