import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {



        System.out.println("Добро пожаловать на учебный портал");
        System.out.println("Пройдите авторизацию");
        System.out.println("1.Студент");
        System.out.println("2.Преподаватель");
        Animal albatros = new Animal();
        Teacher teacher = new Teacher();
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        switch (x) {
            case 1:

                System.out.println("Вы авторизованы как студент");
                System.out.println("1.Посмотреть расписание");
                System.out.println("2.Выход из системы");
               albatros.summa();

               break;
            case 2:
                System.out.println("Вы авторизованы как преподаватель");
                System.out.println("1.Посмотреть расписание");
                System.out.println("2.Редактировать расписание");
                System.out.println("3.Выход из системы");
                teacher.teacher();
                break;

            default:
                System.out.println("Ошибка");

        }

    }

}





