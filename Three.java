  
// Упражнение 3. Использование циклов
public class Three {

    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " "); // печатаем алфавит
        }
        System.out.println();

        long begin = new java.util.Date().getTime(); // помещаем в begin кол-во миллисекунд с 01.01.1970
        long i;
        for (i = 0; i < 100000000; i++) {
        }
        long end = new java.util.Date().getTime();
        System.out.println(i);
        System.out.println(end - begin);
        // при использовании типа int: end-begin=4
        // при использовании типа long: end-begin=40
        // таким образом, результат увеличился в 10 раз
    }
}
