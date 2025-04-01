public static int migratoryBirds(List<Integer> arr) {
    int birdType = arr.get(0);
    int count = 1;
    Map<Integer, Integer> birdTypes = new HashMap<>();

    for (int i = 0; i < arr.size(); i++) {
        if (!birdTypes.containsKey(arr.get(i))) {
            count = 1;
            birdTypes.put(arr.get(i), count);
            birdType = arr.get(i);

        } else {
            count = birdTypes.get(arr.get(i)) + 1;
            birdTypes.replace(arr.get(i), count);
        }
    }
    // System.out.println(birdTypes);
    int maxValueInMap = (Collections.max(birdTypes.values()));
    // System.out.println("max value = "+ maxValueInMap);

    birdTypes.values().removeIf(v -> !v.equals(maxValueInMap));
    birdType = birdTypes.keySet().stream().findFirst().get();

    // System.out.println(birdTypes);

    return birdType;
}