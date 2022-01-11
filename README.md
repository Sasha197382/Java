1.	Создать приложение, имеющее следующие классы и интерфейсы:
	1.1. главный класс для запуска приложения:
		public class Main {
			public static void main(String[] args) {
				// TODO
			}
		}
	1.2. public interface MaxtrixPrintable {
			void print(int[][] data);
		}
	1.3. public class NestedLoopsPrintableImpl implements MaxtrixPrintable {
			void print(int[][] data) {
				// TODO
			}
		}
	1.4. public class SingleLoopPrintableImpl implements MaxtrixPrintable {
			void print(int[][] data) {
				// TODO
			}
		}
2.	Реализовать методы print(int[][] data) для вывода на консоль содержимого двумерного массива следующим образом:
	
	2.1. класс NestedLoopsPrintableImpl - распечатать значения двумерного массива в виде матрицы используя вложенные циклы;
	2.2. класс SingleLoopPrintableImpl - распечатать значения двумерного массива в виде матрицы используя один цикл 
	(при этом запрещается использовать методы класса Arrays либо сторонние библиотеки).
	
3.	Инициализировать двумерный массив в методе main() класса Main и реализовать логику выбора способа вывода на консоль используя Math.random() -
	если значение Math.random() < 0.5 то использовать реализацию NestedLoopsPrintableImpl для вывода на консоль, в противном случае использовать
	SingleLoopPrintableImpl.
	
4.	Протестировать приложение для следующих исходных данных:
	4.1. int[][] data = {
		{1,2,3},
		{4,5,6},
		{7,8,9}
	};
	4.2. int[][] data = {
		{1,2,3},
		{4,5,6,7,8},
		{10}
	};
	4.3. int[][] data = {
		null,
		{},
		{10}
	};
	4.4. int[][] data = null;


Пример вывода на консоль для
	int[][] data = {
		{1,2,3},
		null,
		{7,8},
		{}
	};
	
	output
	
	1 2 3
	null
	7 8
	empty
