public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    int applesInRange = 0;
    int orangesInRange = 0;

    for (int i = 0; i < apples.size(); i++) {
        if (a + apples.get(i) >= s && a + apples.get(i) <= t) {
            applesInRange++;
        }
        // System.out.println(applesInRange);
    }
    for (int j = 0; j < oranges.size(); j++) {
        if (b + oranges.get(j) >= s && b + oranges.get(j) <= t) {
            orangesInRange++;
        }
        // System.out.println(orangesInRange);
    }
    System.out.println(applesInRange);
    System.out.println(orangesInRange);

}