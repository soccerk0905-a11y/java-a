//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {

        final int radius = 6400;
        final float PI = 3.141592f;
        final int KOREA = 100505;

        double surface = 4 * PI * radius * radius;
        double ratio = KOREA / surface * 100;

        System.out.printf("지구의 반지름은 %d km, 표면적은 %.2f km²\n", radius, surface);
        System.out.printf("대한민국 면적 %d km²는 지구 표면적의 %.4f%%입니다.\n", KOREA, ratio);
    }


