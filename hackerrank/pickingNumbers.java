public static int pickingNumbers(List<Integer> a) {
    int maxlength = 0;
    int check = a.get(0);
    List<Integer> subarray = new ArrayList<>();

    for (int i = 0; i < a.size(); i++) {
        if ((a.get(i) - check) <= 1) {
            subarray.add(a.get(i));
        } else {

        }
    }

    return maxlength;

}