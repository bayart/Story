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
            count++;
            birdTypes.replace(arr.get(i), count);
        }
    }
    int max = birdTypes.keySet().stream().findFirst().get();
    System.out.println(max);

    for (Map.Entry<Integer, Integer> pair : birdTypes.entrySet()) {
        if (max < pair.getValue()) {
            max = pair.getValue();
        }

        // pair.getKey()
    }

    System.out.println(birdTypes);

    return birdType;

}