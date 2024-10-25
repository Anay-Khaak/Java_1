//Задача 3. Подсчет суммы цифр числа
//Напишите метод sumDigits, который принимает целое число n и возвращает сумму его цифр.

    class Answer1 {
   public int sumDigits(int n) {
       // Введите свое решение ниже
       int sum = 0;
       while (n != 0) {
sum += n % 10;
n /= 10; }
return sum; }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class hw3 {
   public static void main(String[] args) {
int n = 12345;
if (args.length > 0) {
n = Integer.parseInt(args[0]);
}
       // Вывод результата на экран
       Answer1 ans1 = new Answer1();
       int itresume_res = ans1.sumDigits(n);
       System.out.println(itresume_res); }
}
