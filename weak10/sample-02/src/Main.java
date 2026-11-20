void main() {

    // score = new int[] {90, 85, 70, 75, 100};
    /* int[] score;
    score = new int[5];
    score[0] = 90;
    score[1] = 85;
    score[2] = 70;
    score[3] = 75;
    score[4] = 100;  */

    // int[] score = new int[] {90, 85, 70, 75, 100};
    int[] score = {90, 85, 70, 75, 100};
    int total = 0;
    float avg;

    for (int i = 0; i < score.length; i++)
        total += score[i];
    avg = (float) total / score.length;


    System.out.println();
    for (int i = 0; i < score.length; i++)
        System.out.printf("%d\n", score[i]);

    System.out.printf("합계 : %d\n", total);
    System.out.printf("평균 : %.2f\n", avg);


}
