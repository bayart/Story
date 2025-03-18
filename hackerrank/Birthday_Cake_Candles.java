
public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
    int heightOfCandles = candles.get(0);
    int count = 1;

    for (int i = 0; i < candles.size(); i++) {
        if (heightOfCandles <= candles.get(i)) {
            if (heightOfCandles == candles.get(i) && i > 0) {
                count++;
            } else {
                heightOfCandles = candles.get(i);
                count = 1;
            }

        }

        // System.out.println(i +" ,"+count);
    }
    return count;
}