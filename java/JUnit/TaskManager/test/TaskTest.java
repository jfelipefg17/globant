import entities.Task;
import org.junit.Before;
import org.junit.Test;
import service.ServiceTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;

public class TaskTest {

    ServiceTask s1;
    List<Task> listT;
    @Before
    public void setUpt ()   {

        listT = new ArrayList<>();
        s1 = new ServiceTask();
        listT.add(new Task("ss"));
        listT.add(new Task("ss"));
        listT.add(new Task("ss"));
    }



    @Test
    public void addTest (){
        assertEquals("ss",listT.get(2).getTask());
    }

    @Test
    public void infoTest (){
        String ss = "phone";
        s1.infoTask(1,ss,(ArrayList<Task>) listT);
        assertEquals("phone",listT.get(1).getTask());
    }

    @Test
    public void deleteTest (){
        s1.deleteTask(2, (ArrayList<Task>) listT);
        assertEquals(2,listT.size());
    }
}
