import java.util.Scanner;

//1���� �迭�� �ݺ����� �̿��Ͽ� ������ 4�� �Է� �޾Ƽ� �հ踦 ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class Sumint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int  array [] = new int[10];
		int sum = 0;
		
		System.out.print("1��° ���ڸ� �Է��ϼ���. : ");
		array [0] = scanner.nextInt();
		
		System.out.print("2��° ���ڸ� �Է��ϼ���. : ");
		array [1] = scanner.nextInt();
		
		System.out.print("3��° ���ڸ� �Է��ϼ���. : ");
		array [2] = scanner.nextInt();
		
		System.out.print("4��° ���ڸ� �Է��ϼ���. : ");
		array [3] = scanner.nextInt();
	
		scanner.close();
		
		for (int i=0; i<4; i++)
		{
			sum += array[i];
		}
	System.out.print("�հ�� " + sum + "�Դϴ�.");
	}
	
}
