// Упражнение 1 Компиляция и запуск первой Java 1. 
// Упражнение 2 Использование примитивных типов и операторов
public class OneTwo {
    // Tools - Generate JavaDoc

    /**
     * Main function
     * @param args arguments of cmd
     */
    public static void main(String[] args) {
        System.out.println("Starting project");
        int integer = 777777; // целые - от –2 147 483 648 до +2 147 483 647
        long lng = 9999999999999L; // целые - от –9 223 372 036 854 775 808 до +9 223 372 036 854 775 807
        double dbl = 1555.55; // вещественные - приблизительно от 10^–38 до 10^+38; 7 значащих цифр
        float flt = 3333.3333f; // вещественные - приблизительно от 10^–308 до 10^+308; 15 значащих цифр
        byte bt = 100; // целые - от –128 до 127
        char ch = 'a'; // символический - от '\u0000' до '\uFFFF'
        short sh = 9999; // целые - от -32 768 до 32 767
        boolean bln = true; // логический - true или false
        System.out.println("This is a int: " + integer);
        System.out.println("This is a long: " + lng);
        System.out.println("This is a double: " + dbl);
        System.out.println("This is a flout: " + flt);
        System.out.println("This is a byte: " + bt);
        System.out.println("This is a char: " + ch);
        System.out.println("This is a sh: " + sh);
        System.out.println("This is a boolean: " + bln);
        // добавляем новые переменные, проверяем работоспособность
        byte tempByte = 120;
        short tempShort = 129;
        // char tempChar = с - не работает - необходимо добавить одинарные ковычки
        char tempChar = 'c';
        int tempInt = 65999;
        // long tempLong = 4294967296 - не работает - необходимо добавить L в конце числа
        long tempLong = 4294967296L;
        // float tempFloat = 0.33333334 - не работает - необходимо добавить f в конце числа
        float tempFloat = 0.33333334f;
        double tempDouble = 0.33333333333333333;
        // double = true - не работает - double - вещественный тип - true относится к логическому типу
        boolean tempBoolean = true;


    }
}
