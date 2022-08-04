import java.io.*;
import java.util.Scanner;

public class Animal {


    Teachers teachers = new Teachers();
    public void summa() throws IOException {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();


        switch (x) {

                    case 1:
                        System.out.println("1.Воронова Е.А.");
                        System.out.println("2.Толстихина Е.В.");
                        System.out.println("3.Агалакова А.В.");
                       teachers.teachers();
                        break;
                    default:
                        System.out.println("Вы успешно вышли из системы");


                }
        }
    }








