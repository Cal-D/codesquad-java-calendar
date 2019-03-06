package cal_d.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int num_1, num_2;
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력 하세요:");
		num_1 = sc.nextInt();
		num_2 = sc.nextInt();
		System.out.println(num_1 + num_2);
		System.out.printf("두 수의 합은 %d입니다", num_1 + num_2);
		sc.close();
	}

}
