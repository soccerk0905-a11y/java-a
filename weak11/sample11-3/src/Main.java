void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    final int ID = 0;
    final int NAME = 1;
    final int BASE = 0;
    final int SUDANG = 1;
    final int SALARY = 2;
    final int TAX = 3;
    final int NET = 4;

    String[][] employees = new String[][] {{"1111", "홍길동"},
            {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"},
            {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"},
            {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"}};
    char[] grade = new char[] {'1', '2', '3', '4', '5', '1', '2', '3', '4', '5'};
    // int[][] salary = new int[employees.length][5]; // 기본금, 수당, 급여액, 세금, 지급액
    int[][] salary = {{0, 800000, 0, 0, 0}, {0, 800000, 0, 0, 0}, {0, 800000, 0, 0, 0},
            {0, 800000, 0, 0, 0}, {0, 800000, 0, 0, 0}, {0, 800000, 0, 0, 0},
            {0, 800000, 0, 0, 0}, {0, 800000, 0, 0, 0}, {0, 800000, 0, 0, 0},{0, 800000, 0, 0, 0}};

    int[] unit = {0, 1650000, 1680000, 170000, 1720000, 1750000}; // 기본 급 테이블
    int[] taxRate = {1600000, 2300000};

    for (int i = 0; i < employees.length; i++) {
        salary[i][BASE] = unit[grade[i] - '0'];
    }

        /* int count = 0;
        while (count < employees.length) {
            System.out.printf("%s 사원의 수당 입력 : ", employees[count][NAME]);
            salary[count][SUDANG] = keyboard.nextInt();

            if (salary[count][SUDANG] >= 0 && salary[count][SUDANG] <= 1000000)
                count++;
            else {
                System.err.print("ERROR : 0 ~ 1,000,000");
                System.in.read();
            }
        }
       */
    for (int i = 0; i < employees.length; i++) {
        salary[i][SALARY] = salary[i][BASE] + salary[i][SUDANG];
    }

    for (int i = 0; i < employees.length; i++) {
        int temp = salary[i][SALARY] - (int) (salary[i][SALARY] * 15.0f / 100);
        if (temp < taxRate[0]) {
            salary[i][TAX] = (int) (temp * 3.3f / 100);
        } else if (temp < taxRate[1]) {
            salary[i][TAX] = (int) (temp * 7.5f / 100);
        } else {
            salary[i][TAX] = (int) (temp * 10.2f / 100);
        }
        salary[i][TAX] = salary[i][TAX] / 100 * 100;
    }

    for (int i = 0; i < employees.length; i++) {
        salary[i][NET] = salary[1][SALARY] - salary[i][TAX];
    }

    for (int i = 0; i < employees.length; i++) {
        for (int j = 0; j < employees.length - (i + 1); j++) {
            if (salary[j][NET] > salary[j + 1][NET]) {
                String[] temp = employees[i];
                employees[i] = employees[j + 1];
                employees[j + 1] = temp;
                char test = grade[i];
                grade[i] = grade[i];
                grade[j + 1] = test;
                int[] test1 = salary[i];
                salary[i] = salary[j + 1];
                salary[j + 1] = test1;
            }
        }
    }

    System.out.println("********************************************************************");
    System.out.println(" 이름   사번 호봉  기본급      업무수당     급여액        세금      지급액 ");
    System.out.println("********************************************************************");

    for (int i = 0; i < employees.length; i++) {
        System.out.printf(" %3s %4s %c %,10d %,10d %,10d %,10d %,10d\n", employees[i][NAME], employees[i][ID], grade[i],
                salary[i][BASE], salary[i][SUDANG], salary[i][SALARY], salary[i][TAX], salary[i][NET]);
    }
}
