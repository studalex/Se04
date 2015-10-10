package ru.alex;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class WordProcessing {

    private static StringBuilder stringBuilder = new StringBuilder();
    private static Pattern pattern;
    private static Matcher matcher;
    private static String resultFind = "";
    private static int resultValue = 0;

    public static void LoadFile() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src//ru//alex//WordProcessing.java");

            int content;
            while ((content = fileInputStream.read()) != -1) {
                stringBuilder.append((char) content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null)
                    fileInputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void showReadText() {
        System.out.println(stringBuilder);
    }

    public static void FindKeyWord() {
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(stringBuilder);
        resultFind = "";
        resultValue = 0;
        while (matcher.find()) {
            resultValue++;
            resultFind += stringBuilder.substring(matcher.start(), matcher.end()) + " ";
        }
        resultFind += '\n' + "total:" + resultValue;
    }

    public static void SaveFile() {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("src//ru//alex//Result.txt");
            outputStream.write(resultFind.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    static String patternStr = "byte|short|int|long|float|double|char|boolean|do|while|for|break|continue|else|switch|case|default|break|private|public|protected|final|static|abstract|synchronized|volatile|strictfp|false|true|null|return|void|package|import|try|catch|finally|throw|throws|new|extends|implements|class|instanceof|this|super";
}