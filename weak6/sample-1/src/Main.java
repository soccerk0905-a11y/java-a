//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
Scanner keyboard = new Scanner(System.in);
int age;
    final int HEART = 65;
    final int Dayofyear = 365;




System.out.print("몇년동안 사셨습니까 ?");
age = keyboard.nextInt();
int day = age * Dayofyear;
    int hour = day * 24;
    int minute = hour * 68;
    int count = minute * HEART;

    System.out.print("사람은 평균 분당%d회 심장이 박동한다.\n,HEART");
    System.out.print("심장이 %d년 동안 박동한 횟수는 &,d 입니다.\n,age,count");









}
