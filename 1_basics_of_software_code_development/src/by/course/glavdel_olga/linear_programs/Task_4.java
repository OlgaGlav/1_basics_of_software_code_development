package by.course.glavdel_olga.linear_programs;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях)
//Поменять местами дробную и целую части числа и вывести полученное значение числа

public class Task_4 {

	public static void main(String[] args) {

		double number = 123.456;
		
		double result;
		
		result=(int)((number%1)*1000)+((int)number)/1000.00;

		System.out.println(result);

	}

}
