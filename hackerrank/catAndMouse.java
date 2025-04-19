static String catAndMouse(int x, int y, int z) {

    if (x < 1 || y < 1 || z < 1) {
        return "wrong input";
    }

    if (Math.abs(z - x) == Math.abs(z - y)) {
        return "Mouse C";

    } else {
        if (Math.abs(z - x) < Math.abs(z - y)) {
            return "Cat A";
        } else {
            return "Cat B";
        }

    }
}