public static void bonAppetit(List<Integer> bill, int k, int b) {
    // Write your code here

    // System.out.println(b);
    int bact = 0;
    for (int i = 0; i < bill.size(); i++) {
        if (i != k) {
            bact = bact + bill.get(i);
        }
    }
    int overcharge = b - bact / 2;
    if (overcharge == 0) {
        System.out.println("Bon Appetit");
    } else {
        System.out.println(overcharge);
    }
}