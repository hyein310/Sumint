import java.util.Scanner;

//1차원 배열과 반복문을 이용하여 정수를 4개 입력 받아서 합계를 구하는 프로그램을 작성하시오.

public class Sumint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int  array [] = new int[10];
		int sum = 0;
		
		System.out.print("1번째 숫자를 입력하세요. : ");
		array [0] = scanner.nextInt();
		
		System.out.print("2번째 숫자를 입력하세요. : ");
		array [1] = scanner.nextInt();
		
		System.out.print("3번째 숫자를 입력하세요. : ");
		array [2] = scanner.nextInt();
		
		System.out.print("4번째 숫자를 입력하세요. : ");
		array [3] = scanner.nextInt();
	
		scanner.close();
		
		for (int i=0; i<4; i++)
		{
			sum += array[i];
		}
	System.out.print("합계는 " + sum + "입니다.");
	}
	
}
