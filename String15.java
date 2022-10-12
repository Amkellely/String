package String;

import java.util.Scanner;
//Козловский Константин

public class String15 {
    //String15. Дана строка. Подсчитать общее количество содержащихся в ней
    //строчных латинских и русских букв.
    private static final String ENGLISH = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String RUSSIAN = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯЯ";

    public static void main(String[] args) {
        System.out.print("Введите предложение: ");
        String offer = new Scanner(System.in).nextLine();

        int count = 0;
        for (char symbol : offer.toCharArray()) {
            if (ENGLISH.indexOf(symbol) != -1 || RUSSIAN.indexOf(symbol) != -1) {
                count++;
            }
        }

        System.out.println("Кол-во строчных русских или латинских букв равно: " + count);
    }

    //String16. Дана строка. Преобразовать в ней все прописные латинские буквы
    //в строчные.
    public static void String15(final String[] args) {
        for (char i = 0x41; i < 0x5a; i++) {
            System.out.printf(" %s ", i);
        }

        System.out.println();

        for (char i = 0x41; i < 0x5a; i++) {
            System.out.printf("%h ", i);
        }

        System.out.println("\n");

        for (char i = 0x61; i < 0x7a; i++) {
            System.out.printf(" %s ", i);
        }

        System.out.println();

        for (char i = 0x61; i < 0x7a; i++) {
            System.out.printf("%h ", i);
        }
    }
}