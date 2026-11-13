void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);

    String[] name = {"홍길동", "이대한", "한민국", "경복대", "이미숙", "나추가"};   // 선언 + 정의 + 초기화
    char[] attend = new char[name.length];               // 선언 + 정의 (기본값 = '0)
    int count = 0;              // 결석자 수
    float rate;                 // 결석율

    int i = 0;                  // 배열의 index는 0부터이므로

    /***************************** 입력 ************************************/
    while (i < name.length) {
        System.out.printf("%s님 출석 했나요 ? (1 = 출석/ 0 = 결석) ", name[i]);
        attend[i] = keyboard.nextLine().charAt(0);
        if (attend[i] == '0' || attend[i] == '1')
            i++;
        else {
            System.err.println("ERROR : 출석 = 1, 결석 = 0");
            System.in.read();
        }
    }

    /***************************** 처리 ************************************/
    for (i = 0; i < attend.length; i++) {
        if (attend[i] == '0')
            count++;
    }
    rate = (float) count / name.length * 100;

    /***************************** 출력 ************************************/
    System.out.println();
    for (i = 0; i < name.length; i++) {
        System.out.printf("%s님 %s\n", name[i],
                attend[i] == '1' ? "출석" : "결석");
    }
    System.out.println("결석자 수 = " + count);
    System.out.printf("결석율 : %.2f %%\n", rate);


}             // 선언 + 정의 (기본값 = '0)

