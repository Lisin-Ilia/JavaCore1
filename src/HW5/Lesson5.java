package HW5;

import javax.annotation.processing.FilerException;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;


public class Lesson5 {


    public static void main(String[] args) throws IOException {



        File file = new File("text.txt");    /* относительный путь*/
            byte[] arr = new byte[1024 * 1024];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 70;
        }

        long startTime = System.currentTimeMillis();
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)){
            for (byte b :arr ){
                fileOutputStream.write(b);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime);
        char[] arr2 = new char[1024 * 1024];

         startTime = System.currentTimeMillis();
        try(FileInputStream fileInputStream = new FileInputStream(file)) {
            int count;
            int i =0;
            while ((count = fileInputStream.read()) != -1) {
                arr2[i] = (char) count;
                i++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
//        for(char c: arr2){
//            System.out.print(c + " ");
//        }
         finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime);


            /* При использовании буфера */

         startTime = System.currentTimeMillis();
        try (OutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream(file))){
            for (byte b :arr ){
                fileOutputStream.write(b);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
         finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime);

        char[] arr3 = new char[1024 * 1024];

        startTime = System.currentTimeMillis();
        try(InputStream fileInputStream = new BufferedInputStream(new FileInputStream(file))) {
            int count;
            int i =0;
            while ((count = fileInputStream.read()) != -1) {
                arr2[i] = (char) count;
                i++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime);

                         /* При использовании DATA(любые данные)  */


        try (DataOutputStream dataFileOutputStream = new DataOutputStream(new FileOutputStream(file))){
            dataFileOutputStream.writeDouble(254.2);
            dataFileOutputStream.writeInt(152);
        }catch (IOException e){
            e.printStackTrace();
        }

        try(DataInputStream dataFileInputStream = new DataInputStream(new FileInputStream(file))) {
            System.out.println(dataFileInputStream.readDouble());
            System.out.println( dataFileInputStream.readInt());
        }catch (IOException e){
            e.printStackTrace();
        }

                    /* Работа с объектами сериализация */

        Employee employee = new Employee("koko", 100);
        Employee employee1 = new Employee("dada",120);
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(employee);
        arrayList.add(employee1);
        String s = employee.toString();
        byte[] b = s.getBytes();
        try (ObjectOutputStream objectFileOutputStream = new ObjectOutputStream(new FileOutputStream(file))){
            for(Employee e: arrayList){
                objectFileOutputStream.writeObject(e);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        try(ObjectInputStream objectFileInputStream = new ObjectInputStream(new FileInputStream(file))) {
            System.out.println(objectFileInputStream.readObject().getClass());
            System.out.println(objectFileInputStream.readObject());
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
                   /* Работа WRITER , RIDER */

        File file2 = new File("src/text2.txt");

        try (Writer outputStream = new FileWriter(file2)){
            outputStream.write('я');
        }catch (IOException e){
            e.printStackTrace();
        }

        try(Reader inputStream = new FileReader(file2)) {
            System.out.println((char) inputStream.read());
        }catch (IOException  e){
            e.printStackTrace();
        }
    }

}

