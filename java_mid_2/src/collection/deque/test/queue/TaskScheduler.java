 package collection.deque.test.queue;
import java.util.*;

 public class TaskScheduler {
 private Queue<Task> tasks = new ArrayDeque<>();

  public void addTask(Task task) {
   tasks.offer(task);
  }

  public int getRemainingTasks() {
   return tasks.size();
  }

  public void processNextTask() {
   tasks.peek().execute();
   tasks.poll();
  }
  // 코드 작성
}