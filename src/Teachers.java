import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Teachers {

    public void teachers() throws IOException {
       

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        switch (x) {

            case 1:
                System.out.println("1.Воронова Е.А.");
                File doc =
                        new File("C:\\Users\\black\\IdeaProjects\\uchebka\\src\\Voronova.txt");
                Scanner obj = new Scanner(doc);

                while (obj.hasNextLine())
                    System.out.println(obj.nextLine());

                break;

            case 2:
                System.out.println("2.Толстихина Е.В.");
                doc = new File("C:\\Users\\black\\IdeaProjects\\uchebka\\src\\Tolstihina.txt");
                obj = new Scanner(doc);

                while (obj.hasNextLine())
                    System.out.println(obj.nextLine());
                break;

            case 3:
                System.out.println("3.Агалакова А.В.");
                doc = new File("C:\\Users\\black\\IdeaProjects\\uchebka\\src\\Agalakova.txt");
                obj = new Scanner(doc);

                while (obj.hasNextLine())
                    System.out.println(obj.nextLine());





        }
    }
}






