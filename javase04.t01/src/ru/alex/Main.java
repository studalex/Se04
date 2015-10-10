package ru.alex;

/**
 * Прочитайте файл, содержащий код на языке Java.
 * Определите, какие ключевые слова языка Java этот код содержит.
 * Выведите эти слова и их количество в другой файл.
 * Используйте только байтовые потоки ввода-вывода.
 */
public class Main {

    public static void main(String[] args) {

        WordProcessing.LoadFile();
        WordProcessing.FindKeyWord();
        WordProcessing.SaveFile();
    }
}