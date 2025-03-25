
public static String timeConversion(String s) {
    // Write your code here
    List<String> TimeElements = Stream.of(s.replaceAll("\\s+$", "").split(":")).collect(toList());
    int hr = Integer.parseInt(TimeElements.get(0));
    String APM = TimeElements.get(2).substring(2);

    if (APM.equals("PM") && hr != 12) {
        hr = hr + 12;
    }
    if (hr == 12 && APM.equals("AM")) {
        hr = 0;
    }

    String returnStr;
    if (String.valueOf(hr).length() == 1) {
        returnStr = "0" + Integer.toString(hr) + ":" + TimeElements.get(1) + ":" + TimeElements.get(2).substring(0, 2);
    } else {
        returnStr = Integer.toString(hr) + ":" + TimeElements.get(1) + ":" + TimeElements.get(2).substring(0, 2);
    }

    return returnStr;
}