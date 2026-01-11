package apihandler;

public class Task {
    // Fields (variables)
    private int task_id;
    private String task_title;

    // Constructor
    public Task(int task_id,String task_title) {
        this.task_id = task_id;
        this.task_title = task_title;
    }

    // Method
    public void getTaskData() {
        System.out.println("ID:-" + this.task_id + "Title:-" + this.task_title);
    }
}