public static int countingValleys(int steps, String path) {
    int numOfValleys = 0;
    int seaLevel = 0;
    boolean inValley = false;

    for (int i = 0; i < steps; i++) {
        char step = path.charAt(i);

        if (step == 'U') {
            seaLevel++;
        } else {
            seaLevel--;
        }

        if (seaLevel < 0 && !inValley) {
            inValley = true;
        }

        if (seaLevel == 0 && inValley) {
            numOfValleys++;
            inValley = false;
        }
    }

    return numOfValleys;
}
