public static int countingValleys(int steps, String path) {
    int numOfValley = 0;
    String currentStep;
    int seaLevel = 0;

    System.out.println(path);

    for (int i = 1; i <= steps; i++) {
        currentStep = path.substring(i - 1, i);

        if (currentStep.equals("U")) {
            seaLevel++;
        } else {
            seaLevel--;
        }

        if (seaLevel == 0 && currentStep.equals("D")) {
            numOfValley++;
        }
        System.out.println(seaLevel + ", and current :" + currentStep + "valleyCount:" + numOfValley);

    }
    return numOfValley;
}
