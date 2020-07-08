package by.course.glavdel_olga.cycles;

// Найти сумму квадратов первых ста чисел

public class Test_3 {

	public static void main(String[] args) {

		double sum = 0;

		for (int i = 1; i <= 100; i++) {

			sum = sum + Math.pow(i, 2);
		}

		System.out.println("Сумма квадратов первых ста чисел равна "+sum);

	}

}
