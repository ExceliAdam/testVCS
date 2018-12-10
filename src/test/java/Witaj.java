import java.util.Scanner;

class Witaj {

    public static void main(String[] args)
        {
            System.out.println("Witaj!");

            Scanner pobierzTekst = new Scanner(System.in);
            System.out.println("Żeby wyłączyć program napisz 'exit'");
            String tekst;

            do
            {
                tekst = pobierzTekst.nextLine();
                //Tutaj dodaję komentarz dlaczego nie może być przy tekstach '!=' ?
                if (!tekst.equals("exit")) {
                    System.out.println("Wpisałeś '" + tekst + "' żeby wyjść z aplikacji musisz wpisać 'exit'.");
                }
            }while (!tekst.equals("exit"));


        }



}
