//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

final float DON = 3.75f;
final int GOLD = 775000;
float weight;
System.out.print("당신의 몸무게는?");
weight = keyboard.nextFloat();
/* int weight1 = (int) weight;
float remainder = weight - weight1;
int gram = (int) (weight1 * 1000 + remainder * 1000); */
  int gram = (int) (weight * 1000);
  float donofweight = gram/ DON;

    System.out.printf("%.1f kg = %d g\n", weight, gram);
    System.out.printf("%.1f kg = %.2f 돈\n", weight, donofweight);









}
