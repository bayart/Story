public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
    if ((x2 > x1 && v2 >= v1) || (x2 < x1 && v2 <= v1)) {
        return "NO";
    } else {
        if ((x2 - x1) % (v1 - v2) == 0) {
            return "YES";
        } else {
            return "NO";
        }

    }

}