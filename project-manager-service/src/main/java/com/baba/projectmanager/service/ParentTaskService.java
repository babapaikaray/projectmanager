package com.baba.projectmanager.service;

import java.util.List;

import com.baba.projectmanager.dto.ParentTaskDto;
import com.baba.projectmanager.entity.ParentTask;

public interface ParentTaskService {
    List<ParentTask> getAllParentTasks();
    ParentTask getParentTaskById(Long parentId);
    void addParentTask(ParentTask parentTask);
    ParentTaskDto getParentTaskDtoFromParentTask(ParentTask parentTask);
    ParentTask getParentTaskFromParentTaskDto(ParentTaskDto parentTaskDto);
}
