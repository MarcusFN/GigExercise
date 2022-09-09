import java.sql.SQLOutput;
import java.util.Scanner;

public class SuperGreeter {
    Scanner scanner = new Scanner(System.in);
    public void start(){
        System.out.println("Det virker!");
    }

    public void Greet(){
        System.out.println("Skriv dit navn bruger:");
        String navn = scanner.nextLine();
        System.out.println("Hej "+ navn);
    }
    public void askAboutAge(){
        System.out.println("Hvad er din alder?");
        int age = scanner.nextInt();
        System.out.println("du er "+age);

    }

    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();
        sg.Greet();
        sg.askAboutAge();
    }

}
