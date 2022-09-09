import java.sql.SQLOutput;
import java.util.Scanner;

public class SuperGreeter {
    public void start(){
        System.out.println("Det virker!");
    }

    public void Greet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv dit navn bruger:");
        String navn = scanner.nextLine();
        System.out.println("Hej "+ navn);
    }

    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();
        sg.Greet();
    }

}
