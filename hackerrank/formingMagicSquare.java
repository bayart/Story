public static int formingMagicSquare(List<List<Integer>> s) {

    int magicCost = 0;

    for (int i = 0; i < s.size(); i++) {
        int rowMax = s.get(i).get(0);
        int rowSum = 0;

        for (int j = 0; j < s.size(); j++) {
            rowSum = rowSum + s.get(i).get(j);
            if (rowMax < s.get(i).get(j)) {
                rowMax = s.get(i).get(j);
            }
        }
        if (rowSum != 15) {
            magicCost = magicCost + Math.abs(9 - rowMax);
        }

        System.out.println("row sum = " + rowSum);
        System.out.println("rowmax = " + rowMax);
        System.out.println("cost = " + magicCost);
    }

    return magicCost;

}
