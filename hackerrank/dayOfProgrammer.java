public static String dayOfProgrammer(int year) {
    int numOfDays = 243;
    int theDayOfProgrammer = 256;
    int calculatedDay = 0;
    StringBuilder retStr = new StringBuilder(10);

    if (year == 1918) {
        calculatedDay = 26;

    } else {
        if ((year % 400 == 0) && (year > 1918) || ((year % 4 == 0 && year % 100 != 0) && year > 1918)
                || ((year % 4 == 0) && year < 1918)) {
            calculatedDay = theDayOfProgrammer - numOfDays - 1;
        } else {
            calculatedDay = theDayOfProgrammer - numOfDays;
        }

    }

    System.out.println(calculatedDay);

    retStr.append(Integer.toString(calculatedDay));
    retStr.append(".09.");
    retStr.append(Integer.toString(year));

    return retStr.toString();

}