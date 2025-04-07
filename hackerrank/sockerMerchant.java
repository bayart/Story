public static int sockMerchant(int n, List<Integer> ar) {
    int pairs = 0;
    int i = ar.size() - 1;
    while (ar.size() >= 2) {
        i = ar.size() - 1;
        for (int j = i - 1; j >= 0; j--) {
            if (ar.get(i) == ar.get(j)) {
                System.out.println("pair = " + i + ", " + j);
                pairs++;
                ar.remove(j);
                // ar.remove(i);
                i = i - 2;
                j = 0;

            } else {
                System.out.println(i + ", " + j);
            }
        }
        if (!ar.isEmpty() && i >= 0) {
            ar.remove(i);
        }
        i--;
    }
    return pairs;
}