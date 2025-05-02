import java.util.List;

public static int formingMagicSquare(List<List<Integer>> s) {

    int magicCost = 0;
    int currentRow = 0;
    int differerence = 0;
    int rowIndex = 0;
    int colIndex = 0;

    for (int i = 0; i < s.size(); i++) {
        int rowMax = s.get(i).get(0);
        int rowSum = 0;

        for (int j = 0; j < s.size(); j++) {
            currentRow = i;
            rowSum = rowSum + s.get(i).get(j);
            if (rowMax < s.get(i).get(j)) {
                rowMax = s.get(i).get(j);
                rowIndex = i;
                colIndex = j;
            }

        }
        if (rowSum != 15) {
            differerence = 15 - rowSum;
            if (currentRow == 0) {
                magicCost = magicCost + differerence;

                s.get(rowIndex).set(colIndex, s.get(rowIndex).get(colIndex) + magicCost);
                System.out.println(s);
            }
            {
                System.out.println("test: " + currentRow + ", " + differerence);
            }

        }

        // System.out.println("row sum = " + rowSum);
        // System.out.println("rowmax = " + rowMax);
        // System.out.println("cost = " + magicCost);
        // System.out.println("--------------------------");
    }

    return magicCost;

}