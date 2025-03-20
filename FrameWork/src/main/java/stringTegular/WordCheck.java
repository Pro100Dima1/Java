package stringTegular;

public class WordCheck {

    public static void main(String[] args) {

        taskChecker("som", "mos", true);
        taskChecker("Макс", "Сом", false);
        taskChecker("Макс", "Маакс", false);
        taskChecker("пустая", "сом", false);
        taskChecker("Макс", "макс", true);
        taskChecker("ром", "ром", true);
        taskChecker("", "ром", false);
        taskChecker(null, "mos", false);
        taskChecker(null, null, true);
        taskChecker("", null, false);
        taskChecker("", "", true);
    }


    private static boolean checkThatWorkHasSameLetters(String left, String right){
        return true;
    }

    private static void taskChecker(String left, String right, boolean expected){
        if (checkThatWorkHasSameLetters(left, right) == expected){
            final String checkResult = expected ? "состоят" : "не состоят";
            System.out.printf("Проверка успешна. %s и %s из одних букв\n", left, right, checkResult);
        }
        else{
            final String checkResult = expected ? "состоять" : "не состоять";
            System.out.printf("Проверка не прошла!! %s и %s должны %s из одних букв\n", left, right, checkResult);
        }
    }
}
