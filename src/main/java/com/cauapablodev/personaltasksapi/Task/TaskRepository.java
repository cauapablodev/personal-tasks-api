package com.cauapablodev.personaltasksapi.Task;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskModel, Long> {
}
