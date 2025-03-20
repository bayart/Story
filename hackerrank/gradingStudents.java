public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    // List<Integer> grads = new ArrayList<>();
    int nextMult = 0;

    for (int i = 0; i < grades.size(); i++) {
        if (grades.get(i) % 5 == 0) {
            nextMult = Math.round(grades.get(i) / 5) * 5;
        } else {
            nextMult = Math.round(grades.get(i) / 5 + 1) * 5;
        }
        if (grades.get(i) >= 38. && nextMult - grades.get(i) < 3.) {
            grades.set(i, nextMult);
        }
        // System.out.println(nextMult);

    }

    return grades;

}
