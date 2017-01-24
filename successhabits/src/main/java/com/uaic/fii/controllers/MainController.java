package com.uaic.fii.controllers;

import com.uaic.fii.entity.Task;
import com.uaic.fii.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by Simona on 15.01.2017.
 */

@RestController
@RequestMapping("/task")
public class MainController {

        @Autowired //Dependency Injection for decoupling;
        private TaskService taskService;

        @RequestMapping(method = RequestMethod.GET)
        public Collection<Task> getAllTasks(){
            return taskService.getAllTasks();
        }

//        @RequestMapping(value = "/home", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
//        public String home(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
//            model.addAttribute("name", name);
//            return "home";
//
//        }

//        @RequestMapping(value = "/", method = RequestMethod.GET)
//        public String index(Principal principal) {
//            return principal != null ? "home/homeSignedIn" : "homeNotSignedIn";
//        }
//
//        @RequestMapping(value = "/", method = RequestMethod.GET)
//        public String index(Principal principal) {
//            return principal != null ? "home/homeSignedIn" : "login";
//        }


}
