/**
 * Created by Bálint on 2017. 04. 06..
 */
public class App {

  public static void main(String[] args) {
    ToDoList myToDoList = new ToDoList(args);

    myToDoList.zeroArg();
    myToDoList.invalidArg();

    if (args.length > 0) {
      myToDoList.showList();
      myToDoList.addTask();
      myToDoList.removeTask();
      myToDoList.checkTask();
    }
  }
}
