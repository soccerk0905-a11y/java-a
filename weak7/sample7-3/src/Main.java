

void main() {
    Scanner keyboard = new Scanner(System.in);
    int num1, num2, num3;
    int result;

    System.out.print("정수 3개 입력 : ");
    num1 = keyboard.nextInt();
    num2 = keyboard.nextInt();
    num3 = keyboard.nextInt();

    if (num1 > num2) {
        if (num1 > num3) {
            result = num1;
        } else {
            result = num3;
        }
    } else if (num2 > num3) {
        result = num2;
    } else {
        result = num3;
    }

    System.out.printf("%,d, %,d, %,d중에서 가장 큰 수는 %,d 입니다.\n", num1, num2, num3, result);
}
