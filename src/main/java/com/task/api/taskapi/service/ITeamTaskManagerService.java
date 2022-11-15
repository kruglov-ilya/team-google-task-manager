package com.task.api.taskapi.service;

import com.google.api.services.tasks.Tasks;
import com.google.api.services.tasks.model.TaskList;
import com.task.api.taskapi.entity.TaskToAddEntity;

import java.io.IOException;
import java.security.GeneralSecurityException;

public interface ITeamTaskManagerService {
    Tasks getTasksService(String userCode) throws GeneralSecurityException, IOException;

    TaskList initTeamTasksListOfAccount(String userId) throws GeneralSecurityException, IOException;

    boolean addTaskToUserAccount(TaskToAddEntity task) throws IOException, GeneralSecurityException;
}