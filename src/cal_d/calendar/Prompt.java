package cal_d.calendar;

import java.util.Scanner;

public class Prompt {
	public int parseday(String weekday) {
		int count = 0;
		switch (weekday) {
		case "SU": 
		case "su":
			count = 0;
			break;
		case "MO":
		case "mo":
			count = 1;
			break;
		case "TU":
		case "tu":
			count = 2;
			break;
		case "WE":
		case "we":
			count = 3;
			break;
		case "TH":
		case "th":
			count = 4;
			break;
		case "FR":
		case "fr":
			count = 5;
			break;
		case "SA":
		case "sa":
			count = 6;
			break;
		}
		return count;
	}

	public void runPrompt() {
		Calendar cal = new Calendar();
		Scanner sc = new Scanner(System.in);

		int month = 0;
		int count;
		int year;
		int weekday = 0;

		while (true) {
			System.out.println("년도를 입력하세요.(exit : -1)");
			System.out.print("YEAR >");
			year = sc.nextInt();
			if (year == -1)
				break;
			System.out.println("달을 입력하세요.");
			System.out.print("MONTH >");
			month = sc.nextInt();
			if (month > 12 || month < 1) {
				System.out.print("잘못된 입력입니다.");
				continue;
			}
			
			
		
		cal.printCalendar(year, month);
		}
		System.out.print("Bye!");
	}

	public static void main(String[] args){
		Prompt a = new Prompt();
		a.runPrompt();

	}

}
