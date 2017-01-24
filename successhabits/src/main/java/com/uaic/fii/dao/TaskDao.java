package com.uaic.fii.dao;

import com.uaic.fii.entity.Task;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Simona on 22.01.2017.
 */

@Repository
public class TaskDao {
    private static Map<Integer, Task> tasks;

    static {
        tasks = new HashMap<Integer, Task>(){
            {
            put (1, new Task (1, "Meditate", "Rewire your brain and reduce stress "));
            put (2, new Task (1, "Read a book", "It reduces stress and helps you improve brain function "));
            put (3, new Task (1, "Eat a healthy breakfast", "Start your day feeling energized and in a good mood "));
            }
        };
    }

    public Collection<Task> getAllTasks(){
        return this.tasks.values();
    }

    public Task getTaskById(int id){
        return this.tasks.get(id);
    }


}
