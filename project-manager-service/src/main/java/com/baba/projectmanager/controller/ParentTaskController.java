package com.baba.projectmanager.controller;

import com.baba.projectmanager.dto.ParentTaskDto;
import com.baba.projectmanager.entity.ParentTask;
import com.baba.projectmanager.service.ParentTaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/projectmanager/api")
public class ParentTaskController {
    private final ParentTaskService parentTaskService;

    public ParentTaskController(ParentTaskService parentTaskService) {
        this.parentTaskService = parentTaskService;
    }

    @GetMapping(path="/parenttask")
    public ResponseEntity<Object> getAllParentTasks(){
        List<ParentTask> parentTaskList = parentTaskService.getAllParentTasks();
        List<ParentTaskDto> parentTaskDtoList = parentTaskList.stream().map(parentTask -> parentTaskService.getParentTaskDtoFromParentTask(parentTask)).collect(Collectors.toList());
        return new ResponseEntity<>(parentTaskDtoList, HttpStatus.OK);
    }

    @PostMapping(path="/parenttask/add")
    public ResponseEntity<Object> addTask(@RequestBody ParentTaskDto parentTaskDto) {
        ParentTask parentTask = parentTaskService.getParentTaskFromParentTaskDto(parentTaskDto);
        parentTaskService.addParentTask(parentTask);
        return new ResponseEntity<>(HttpStatus.CREATED);
        
        
        
        
    }

}
