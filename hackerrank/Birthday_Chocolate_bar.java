public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
    int bar = 0;
    if (d > 31 || d < 1 || m > 12 || m < 1) {
        return bar;
    }

    for (int i = 0; i < s.size(); i++) {
        for (int j = i; j < s.size(); j++) {
            if (s.get(i) + s.get(j) == d) {
                bar++;
            }
        }
    }

    return bar;

}