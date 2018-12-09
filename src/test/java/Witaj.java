import java.util.Scanner;

public class Witaj {

        public static void main(String[] args)
        {
            System.out.println("Witaj!");

            Scanner skaner = new Scanner(System.in);
            System.out.println("Żeby wyłączyć program napisz 'exit'");
            String tekst;

            do
            {
                tekst = skaner.nextLine();
                if (!tekst.equals("exit")){
                //Tutaj dodaję komentarz dlaczego nie może być przy tekstach '!=' ?
                    System.out.println("Wpisałeś '" + tekst + "' żeby wyjść z aplikacji musisz wpisać 'exit'.");
                }
            }while (!tekst.equals("exit"));

        }

}
