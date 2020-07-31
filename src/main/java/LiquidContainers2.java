
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);
            System.out.print("> ");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String parts[] = input.split(" ");
            String command = parts[0];
            int valor = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                container1.add(valor);
            }

            if (command.equals("move")) {
                if (container1.contains() == 0) {
                    container2.add(0);
                } else if (container1.contains() - valor >= 0 && container2.contains() + valor <= 100) {
                    container1.remove(valor);
                    container2.add(valor);
                } else if (container1.contains() < valor) {
                    container2.add(container1.contains());
                    container1.add(0);
                } else {
                    container1.add(0);
                    container2.add(100);
                }

            }
            if (command.equals("remove")) {
                if (container2.contains() < valor) {
                    container2.add(0);
                } else if (container2.contains() - valor >= 0) {
                    container2.remove(valor);
                }
            }

        }
    }

}
