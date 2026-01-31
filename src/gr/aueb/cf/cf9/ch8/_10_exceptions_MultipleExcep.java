package gr.aueb.cf.cf9.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class _10_exceptions_MultipleExcep {

    public static void main(String[] args) {
        File file = new File("test.txt");
        char ch = ' ';

        try (Scanner scanner = new Scanner(file)) {     //try with resources. scanner here is auto closeable. No need for finally
            ch = (char) System.in.read();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("char read error");     //IOexception is superclass of the fileNotFound(subclass)
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}