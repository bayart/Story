public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    int max = b.get(0);
    int min = a.get(0);
    List<Integer> dividers = new ArrayList<>();
    for (int i = 0; i < b.size(); i++) {
        if (b.get(i) < max) {
            max = b.get(i);
        }
    }
    for (int k = 0; k < a.size(); k++) {
        if (a.get(k) > min) {
            min = a.get(k);
        }
    }
    boolean checkDiv = true;
    for (int j = min; j <= max; j = j + min) {
        checkDiv = true;
        for (int m = 0; m < a.size(); m++) {
            System.out.println(j + ", " + a.get(m) + ", " + j % a.get(m));
            if (j % a.get(m) != 0) {
                checkDiv = false;
            }
        }
        if (checkDiv == true) {
            dividers.add(j);
        }
    }
    System.out.println("-------------");
    for (int h = 0; h < dividers.size(); h++) {
        System.out.println(dividers.get(h));
    }

    boolean check = true;
    for (int h = 0; h < dividers.size(); h++) {
        check = true;
        for (int l = 0; l < b.size(); l++) {
            if (b.get(l) % dividers.get(h) != 0) {
                check = false;
            }
        }
        if (check == false) {
            dividers.remove(h);
        }
    }
    System.out.println("-------------");
    for (int h = 0; h < dividers.size(); h++) {
        System.out.println(dividers.get(h));
    }
    return dividers.size();

}