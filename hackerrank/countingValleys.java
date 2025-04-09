public static int countingValleys(int steps, String path) {
    int valley = 0;
    int downnHil = 0;
    int uphil = 0;
    String currentStep;
    String currentDirection = path.substring(0, 1);

    System.out.println(path);

    for (int i = 2; i <= steps; i++) {
        currentStep = path.substring(i - 1, i);
        // System.out.println(currentStep);
        if ((uphil - downnHil) == 0) {
            valley++;
        }
        if (currentDirection.equals(currentStep)) {
            if (currentStep.equals("U")) {
                uphil++;
            } else {
                downnHil++;
            }

        } else {
            currentDirection = path.substring(i - 1, i);
            uphil = 0;
            downnHil = 0;
        }
    }
    return valley;
}