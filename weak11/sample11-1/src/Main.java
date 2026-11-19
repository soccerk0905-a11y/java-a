void main() {
    int[] students1 = new int[] {41, 43, 45, 42, 44, 39}; // 1학년
    int[] students2 = new int[] {41, 43, 45, 42, 44, 39}; // 2학년
    int[] students3 = new int[] {41, 43, 45, 42, 44, 39}; // 3학년
    int[][] students = new int[][]{students1, students2, students3};

    int[][] highSchoolStudent = { // {1반, 2반, 3반, 4반, 5반, 6반, 합계}
            {41, 43, 45, 42, 44, 39, 0},  // 1학년
            {41, 43, 45, 42, 44, 39, 0},  // 2학년
            {41, 43, 45, 42, 44, 39, 0}}; // 3학년

    int[] total = new int[highSchoolStudent.length]; // 결과
    int sum = 0;

    /*** 학년별 학생수 *************/
    for (int i = 0; i < highSchoolStudent.length; i++) {
        for (int j = 0; j < highSchoolStudent[i].length -1; j++) {
            highSchoolStudent[i][6] += highSchoolStudent[i][j];
            total[i] += highSchoolStudent[i][j];
        }
    }

    for (int i = 0; i < highSchoolStudent.length; i++)
        sum += highSchoolStudent[i][6];

    for (int i = 0; i < total.length; i++)
        sum += total[i];

    System.out.println("*******************************************");
    System.out.println("      1반  2반   3반  4반   5반  6반  합계");
    System.out.println("*******************************************");

    for (int i = 0; i < highSchoolStudent.length; i++) {
        System.out.printf("%d학년 %3d %4d %4d %4d %4d %4d %4d\n",
                i+ 1, highSchoolStudent[i][0],
                highSchoolStudent[i][1],
                highSchoolStudent[i][2],
                highSchoolStudent[i][3],
                highSchoolStudent[i][4],
                highSchoolStudent[i][5],
                highSchoolStudent[i][6]);
    }
    System.out.printf("\t\t\t 학교 정원 : %,d명\n", sum);
}
