package edu.dio.collections.list.task;

import java.util.ArrayList;
import java.util.List;

public class ListTask {
    private List<Task> tasks;

    public ListTask() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public void removeTask(String desciption) {
        List<Task> forRemove =  new ArrayList<>();

        for(Task task: tasks) {
            if(task.getDescription().equalsIgnoreCase(desciption)) {
                forRemove.add(task);
            }
        }

        tasks.removeAll(forRemove);
    }

    public int getTotalNumberTask() {
        return tasks.size();
    }

    public void getDescriptionTasks() {
        System.out.println(tasks);
    }

    public static void main(String[] args) {
        ListTask listTask = new ListTask();

        System.out.println(listTask.getTotalNumberTask());

        listTask.addTask("Tarefa1");
        System.out.println(listTask.getTotalNumberTask());

        listTask.addTask("Tarefa2");
        System.out.println(listTask.getTotalNumberTask());

        listTask.addTask("Tarefa2");
        System.out.println(listTask.getTotalNumberTask());

        listTask.getDescriptionTasks();

        listTask.removeTask("Tarefa2");
        System.out.println(listTask.getTotalNumberTask());
    }
}
