package lab4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopier {
    public static void main(String[] args) {
        // Путь к исходному файлу
        String sourceFilePath = "source.txt";
        // Путь к целевому файлу
        String destinationFilePath = "destination.txt";

        // Объявление переменных для потоков ввода и вывода
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Создание потока для чтения из исходного файла
            fis = new FileInputStream(sourceFilePath);
            // Создание потока для записи в целевой файл
            fos = new FileOutputStream(destinationFilePath);

            // Создание буфера для чтения данных
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Чтение данных из исходного файла и запись их в целевой файл
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            // Вывод сообщения об успешном копировании файла
            System.out.println("Файл успешно скопирован.");
        } catch (IOException e) {
            // Обработка исключений ввода-вывода
            System.err.println("Ошибка ввода-вывода: " + e.getMessage());
        } finally {
            // Закрытие потока для чтения из исходного файла
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                // Обработка исключений при закрытии потока для чтения
                System.err.println("Ошибка при закрытии исходного файла: " + e.getMessage());
            }

            // Закрытие потока для записи в целевой файл
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                // Обработка исключений при закрытии потока для записи
                System.err.println("Ошибка при закрытии целевого файла: " + e.getMessage());
            }
        }
    }
}
