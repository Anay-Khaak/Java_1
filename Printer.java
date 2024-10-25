//Задание 1. Нахождение факториала числа
//Напишите метод factorial, который принимает число n и возвращает его факториал. 
//Если число n < 0, метод должен вернуть -1.



class Answer {
   public int factorial(int n) {
// Введите свое решение ниже
if (n < 0) {
    return -1;
}
int result = 1;
for (int i = 2; i <= n; i++) {
result *= i; }
return result;
   }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
   public static void main(String[] args) {
int n = 3;
if (args.length > 0) {
n = Integer.parseInt(args[0]);
}
       // Вывод результата на экран
Answer ans = new Answer();
int itresume_res = ans.factorial(n); System.out.println(itresume_res);
} }

