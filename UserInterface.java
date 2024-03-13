import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.list = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.println("To add:");
                String task = scanner.nextLine();
                list.add(task);
            } else if (command.equals("list")) {
                list.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int remove = Integer.valueOf(scanner.nextLine());
                list.remove(remove);
            } else {
                continue;
            }
        }
    }
}
