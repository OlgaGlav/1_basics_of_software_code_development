package by.course.glavdel_olga.cycles;

import java.math.BigInteger;

//Составить программу нахождения произведения квадратов первых 200 чисел

public class Test_4 {

	public static void main(String[] args) {

		BigInteger multiplication = new BigInteger("1");

		long count = 1;

		while (count <= 200) {

			multiplication = multiplication.multiply(BigInteger.valueOf(count).pow(2));

			count = count + 1;
		}

		System.out.println(multiplication);
	}
}
