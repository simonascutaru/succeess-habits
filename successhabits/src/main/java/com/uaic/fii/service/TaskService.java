package com.uaic.fii.service;

import com.uaic.fii.dao.TaskDao;
import com.uaic.fii.entity.Task;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Simona on 22.01.2017.
 */
@Service
public class TaskService {

    private TaskDao taskDao;

    public Collection<Task> getAllTasks(){
        return taskDao.getAllTasks();
    }
}
