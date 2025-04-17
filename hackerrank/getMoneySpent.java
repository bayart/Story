static int getMoneySpent(int[] keyboards, int[] drives, int b) {

    List<ArrayList<Integer>> purchOptions = new ArrayList<ArrayList<Integer>>();
    List<Integer> couple = new ArrayList<Integer>();

    if (keyboards.length == 0 || drives.length == 0 || b <= 0) {
        return -1;
    }
    for (int i = 0; i < keyboards.length; i++) {
        for (int j = 0; j < drives.length; j++) {
            if (keyboards[i] + drives[j] <= b) {
                couple.add(keyboards[i]);
                couple.add(drives[j]);
                purchOptions.add(new ArrayList(couple));
                // System.out.println(couple);
                couple.clear();
            }
        }
    }
    int max = -1;
    if (purchOptions.size() > 0) {
        max = purchOptions.get(0).get(0) + purchOptions.get(0).get(1);
    }

    for (int k = 0; k < purchOptions.size(); k++) {
        if (max < (purchOptions.get(k).get(0) + purchOptions.get(k).get(1))) {
            max = purchOptions.get(k).get(0) + purchOptions.get(k).get(1);
        }
    }
    System.out.println(max);
    System.out.println(purchOptions);

    if (purchOptions.size() > 0) {
        return max;
    } else {
        return -1;
    }
    // Expected Output
    // 729580

}