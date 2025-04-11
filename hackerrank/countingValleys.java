public static int countingValleys(int steps, String path) {

    long startTime = System.nanoTime();

    int numOfValley = 0;
    String currentStep;
    int valleyEnd = 0;
    int seaLevel = 0;

    System.out.println(path);

    for (int i = 1; i <= steps; i++) {
        currentStep = path.substring(i - 1, i);

        if (currentStep.equals("U")) {
            seaLevel++;
        } else {
            seaLevel--;
        }
        if (i > 1 & seaLevel == 0 && currentStep.equals("U")) {
            valleyEnd = 1;
        }

        if (seaLevel == 0 && currentStep.equals("U") && valleyEnd == 1) {
            numOfValley++;
            valleyEnd = 0;
        }
        System.out.println(seaLevel + ", and current :" + currentStep + "valleyCount:" + numOfValley);

    }
    // long endTime = System.nanoTime();
    // long duration = endTime - startTime;
    // System.out.println("TIME: " + duration + " ns");
    return numOfValley;
}