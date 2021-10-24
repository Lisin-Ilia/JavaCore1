package HW2;
public class Main {

    public static void main(String[] args) {
        String[][] validArray = new String[][]
                        {{"56", "32", "1", "32"},
                        {"12", "18", "19", "98"},
                        {"14", "14", "8", "18"},
                        {"15", "56", "15", "91"}};
        String[][] wrongSizeArray = new String[][]
                        {{"56", "32", "1", "32"},
                        {"12", "18", "19", "98"},
                        {"15", "56", "15", "91"}};
        String[][] wrongSizeArray2 = new String[][]
                        {{"56", "32", "1"},
                        {"12", "18", "19", "98"},
                        {"14", "14", "8"},
                        {"15", "56", "15", "91"}};
        String[][] wrongDataArray = new String[][]
                        {{"56", "32", "1", "32"},
                        {"12", "#", "19", "98"},
                        {"14", "с", "8", "18"},
                        {"15", "56", "число", "91"}};

        try {
            System.out.println(sum(validArray));
            System.out.println(sum(wrongSizeArray));
            System.out.println(sum(wrongSizeArray2));

        } catch (MyException MyException) {
            MyException.printStackTrace();
        }
        try {
            System.out.println(sum(wrongDataArray));
        } catch (MyException MyException) {
            MyException.printStackTrace();
        }
    }

    public static String sum(String[][] array) throws MyException {  /* Проверка условий массива для вывода суммы элементов */
        checkSizeArray(array);
        checkDataArray(array);
        return "Сумма элементов массива: " + stringToInteger(array);
    }

    public static int stringToInteger(String[][] array) {  /* Метод, который переводит строки в числа и суммирует их*/
        int result = 0;
        for (String[] strings : array) {
            for (String string : strings) {
                result += Integer.parseInt(string);
            }
        }
        return result;
    }

    public static void checkDataArray(String[][] array) throws MyArrayDataException {    /* Метод, который проверяет формат данных массива */
        int row;
        int col;
        for (row = 0; row < array.length; row++) {
            for (col = 0; col < array[row].length; col++) {
                try {
                    Integer.parseInt(array[row][col]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверный формат данных в строке: " + (1 + row) + ", в столбце: " + (1 + col));
                }
            }
        }
    }

    public static void checkSizeArray(String[][] array) throws MyArraySizeException {   /* Метод, который проверяет размер массива */
        if (array.length != 4) {
            throw new MyArraySizeException("Неверный размер массива, должно быть 4х4");
        }
        for (String[] strings : array) {
            if (strings.length != 4) {
                throw new MyArraySizeException("Неверный размер массива, должно быть 4х4");
            }
        }
    }

}