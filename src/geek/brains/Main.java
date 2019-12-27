package geek.brains;


import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)  {
        //guessNumber();
        guessWord();
    }

    // Угадай число
    public static void guessNumber () {
        int rand = (int) (Math.random() * 10);
        //System.out.println(rand);
        int attempts = 0;
        System.out.println("Угадайте число, загаданное компьютером (от 0 до 9). У вас есть три попытки");
        while (true) {
            int userNumber = scanner.nextInt();
            attempts ++;
            if (userNumber == rand) {
                System.out.println("Ура! Вы угадали с " + attempts + " попытки");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                userExit();
                break;
            } else if (attempts < 3) {
                System.out.println("Неверно! Попробуйте еще раз. Попыток осталось " + (3 - attempts));
            } else {
                System.out.println("К сожалению Вы проиграли. Повторить игру еще раз? 1 – да / 0 – нет");
                userExit();
                break;
            }
        }
    }
    //Пользовательский выход вынесен в отдельный метод, чтобы не повторять код
    public static void userExit () {
        int userAnswer = scanner.nextInt();
        if (userAnswer == 1) {
            guessNumber();
        } else {
            System.out.println("Спасибо за игру! До свидания");
            scanner.close();
        }
    }

    //Угадай слово
    public static void guessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};

        int rand = (int) (Math.random() * words.length);

        String randWord = words[rand];

        System.out.println("Угадайте слово, загаданное компьютером");
        while (true) {
            String userWord = scanner.next();
            if (userWord.equals(randWord)) {
                System.out.println("Верно! Компьютер загадал слово " + userWord);
                scanner.close();
                break;
            } else {
                System.out.println("Неверно! Подумайте еще");
                String wordForCheking;
                if (userWord.length() < randWord.length()) {
                    wordForCheking = userWord;
                } else {
                    wordForCheking = randWord;
                }
                String shortHint;
                for (int i = 0; i < wordForCheking.length(); i ++) {
                    if (userWord.charAt(i) == randWord.charAt(i)) {
                        System.out.print(wordForCheking.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println("##############");

            }
        }
    }
}

