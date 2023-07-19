package service;

import entities.Task;
import java.util.ArrayList;

public class ServiceTask {



    public void addTask (String nnn, ArrayList<Task> list) {

        list.add(new Task(nnn));
    }

    public void showTasks (ArrayList<Task> list) {

        for ( int i = 0; i < list.size();i++ ) {
            System.out.println(i + " " + list.get(i).toString());
        }

    }

    public void infoTask (int opt,String nnn,ArrayList<Task> list) {
        list.get(opt).setTask(nnn);
    }

    public void deleteTask (int h,ArrayList<Task> list) {
        list.remove(h);

    }
}
