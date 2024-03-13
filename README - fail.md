My program results in the same outputs as the provided examples.

I don't understand the errors that TMCBeans throws back at me. When I run the code and follow the inputs in each error message, my code output seems to be correct. I'm at a loss at this point.



FAIL: TodoListTest theMethodsOfTodoListWorkCorrectly
Expected the output to contain the string:
2: watch the latest fool us
Try the code:
TodoList list = new TodoList();
list.add("read the course material");
list.add("watch the latest fool us");
list.add("take it easy");
list.print();
list.remove(2);
list.print();
list.add("buy raisins");
list.print();
list.remove(1);
list.remove(1);
list.print();

    
FAIL: TodoListTest testCommandAdd
Expected the output to contain the string:
2: sign up for courses
Try the code:
TodoList list = new TodoList();
Scanner scanner = new Scanner(System.in);
UserInterface ui = new UserInterface(list, scanner);
ui.start();
list.print();
and commands:
add
view courses
add
sign up for courses
stop

    
FAIL: TodoListTest testCommandList
Expected the output to contain the string:
2: second
Try the code:
TodoList list = new TodoList();
list.add("first");
list.add("second");
Scanner scanner = new Scanner(System.in);
UserInterface ui = new UserInterface(list, scanner);
ui.start();
and the commands are:
list
stop

    
FAIL: TodoListTest testCommandRemove
Expected the output to contain the string:
2: three
Try the code:
TodoList list = new TodoList();
list.add("one");
list.add("two");
list.add("three");
Scanner scanner = new Scanner(System.in);
UserInterface ui = new UserInterface(list, scanner);
ui.start();
list.print();
and the commands are:
remove
2
stop

    
FAIL: TodoListTest testCommandRemove2
Expected the output to contain the string:
2: three
Try the code:
TodoList list = new TodoList();
list.add("one");
list.add("two");
list.add("three");
Scanner scanner = new Scanner(System.in);
UserInterface ui = new UserInterface(list, scanner);
ui.start();
list.print();
and the commands are:
remove
1
stop
