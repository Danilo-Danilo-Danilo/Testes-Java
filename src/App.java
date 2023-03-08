import javax.print.event.PrintEvent;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world");
        System.out.println(
            "Integer: " + 10 +
            " Double: " + 3.14 +
            " Boolean: " + true);
            Scanner scanner = new Scanner(System.in);
            String estrigue = String.format("%s may prefer %s.", "Or you", "String.format()");
            System.out.println(estrigue);
            int i=0;
            i++;
            System.out.println(i++);
            System.out.println(i);
    }
    
    }
