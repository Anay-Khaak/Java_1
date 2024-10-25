//Задача 2. Вывод всех четных чисел от 1 до 100
//Напишите метод printEvenNums, который выведет на экран все четные числа в 
//промежутке от 1 до 100, каждое на новой строке.

//public class hw2 {
   class Answer2 {
   public static void printEvenNums() {
    // Напишите свое решение ниже
for (int i = 2; i <= 100; i += 2) { System.out.println(i);
} }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class hw2 {
   public static void main(String[] args) {
       Answer2 ans = new Answer2();
ans.printEvenNums(); }
} 
//}
