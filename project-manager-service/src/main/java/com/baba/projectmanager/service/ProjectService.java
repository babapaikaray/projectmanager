package com.baba.projectmanager.service;

import com.baba.projectmanager.dto.ProjectDto;
import com.baba.projectmanager.entity.Project;

import java.util.List;

public interface ProjectService {
    List<Project> getAllProjects();
    Project getProjectById(Long projectId);
    void addProject(Project project);
    void updateProject(Project project);
    void suspendProject(Project project);
    Project getProjectFromProjectDto(ProjectDto projectDto);
    ProjectDto getProjectDtoFromProject(Project project);
}
