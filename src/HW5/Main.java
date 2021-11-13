package HW5;

import java.io.*;
import java.util.Arrays;

public class Main {


    public static void main(String[] args)throws IOException {


        AppData appData = new AppData("Value 1,Value 2,Value 3,Value 4");//Создали готовые заголовки
        appData.setData(new int[][]{
                {10, 20, 30, 40},
                {400, 500, 600, 50},
                {700, 800, 900, 60},
                {700, 800, 900, 60}
        });
        FileWriter fileWriterHeader = new FileWriter("file1.csv", false);
        fileWriterHeader.write(appData.getHeaderString());//записали в файл заголовок
        fileWriterHeader.write(appData.stringData());//записали в файл данные
        fileWriterHeader.close();//закрыли поток вывода

        AppData appDataRead = new AppData(new FileReader("file1.csv"));
        appDataRead.readAll();//Этим методом читаем из файла и инициализируем все поля класса
       System.out.println(Arrays.toString(appDataRead.getHeader()));//проверка поля заголовки
        AppData.show2dArray(appDataRead.getData());//Проверка поля данных
    }
}
