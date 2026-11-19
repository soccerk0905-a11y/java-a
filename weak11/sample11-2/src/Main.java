void main() {
    int[] step1 = {3, 3, 3, 0};
    int[] step2 = {3, 3, 3, 0};
    int[] step3 = {3, 3, 3, 0};
    int[] step4 = {3, 3, 3, 0};
    int[] step5 = {3, 3, 3, 0};
    int[][] villa1 = {step1, step2, step3, step4, step5};
    int[][] villa2 = {step1, step2, step3, step4, step5};
    int[][] villa3 = {step1, step2, step3, step4, step5};
    int[][][] villa = {villa1, villa2, villa3};

    int[][][] somangVilla = new int[][][] {{ //{1호, 2호, 3호, 합계}
            {3, 3, 3, 0}, // 1동 1층
            {3, 3, 3, 0}, // 1동 3층
            {3, 3, 3, 0},
            {3, 3, 3, 0},
            {3, 3, 3, 0}},
            {step1, step2, step3, step4, step5},
            {step1, step2, step3, step4, step5},
            {step1, step2, step3, step4, step5},
            {step1, step2, step3, step4, step5}};
    int[][] total = new int[somangVilla.length][villa1.length]; //{동, 층}
    int[] sum = new int[somangVilla.length];
    int total_of_Sum = 0;

    for (int i = 0; i < somangVilla.length; i++) {
        for (int j = 0; j < somangVilla[i].length; j++) {
            for (int k = 0; k < somangVilla[i][j].length; k++) {
                total[1][j] += somangVilla[i][j][k];
            }
        }
    }

    for (int i = 0; i < total.length; i++) {
        for (int j = 0; j < total[i].length; j++)
            sum[i] += total[i][j];
    }

    for (int i = 0; i < sum.length; i++)
        total_of_Sum +=  sum[i];

    for (int i = 0; i < somangVilla.length; i++) {
        System.out.printf("%d동 주민수\n", i+ 1);
        for (int j = 0; j < somangVilla.length; j++) {
            System.out.printf("%d 층", j+1);
            for (int k = 0; k < somangVilla[i][j].length -1; k++) {
                System.out.printf(" %d호 ", k + 1);
            }
            System.out.println(" 합계 ");
        }
        System.out.println(" 동별 합계 ");
    }
    System.out.println("빌라 합계");
}