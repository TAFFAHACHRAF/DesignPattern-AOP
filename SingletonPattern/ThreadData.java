package SingletonPattern;

public class ThreadData extends Thread{
    private String taskName;

    public String getTaskName() {
        return taskName;
    }

    @Override
    public void run() {
        Singleton singleton=Singleton.getInstence();
        singleton.showData();
    }
}