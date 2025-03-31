public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
    int bar = 0;
    int sum = 0;
    if (d > 31 || d < 1 || m > 12 || m < 1) {
        return bar;
    }

    for (int i = 0; i < s.size() + 1 - m; i++) {
        for (int j = 0; j < m; j++) {
            sum = sum + s.get(i + j);
            System.out.println(i + ", " + j + "," + sum);
        }

        if (sum == d) {
            bar++;
        }
        sum = 0;
    }
    return bar;
}