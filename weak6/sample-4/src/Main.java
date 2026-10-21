//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
Scanner keyboard = new Scanner(System.in);
final  int LIFE= 7;
final int FEE = 4500;
int year;
int ciga;
System.out.print("당신은 몇년동안 담배를 피웠나요?");
year = keyboard.nextInt();
    System.out.print("당신은 담배를 하루에 몇 개피 피우나요?");
    ciga = keyboard.nextInt();
    int day = year * 365;
    int count = day * ciga;
    int minute = count * LIFE;
    int hour = minute / 60;
    minute = minute -=(hour * 60);
    int day1 = hour / 24;
    hour -= (hour *24);
    int gap = count / 20 + ((count % 20 !=0)? 1 : 0);
    int money = gap * FEE;






}
