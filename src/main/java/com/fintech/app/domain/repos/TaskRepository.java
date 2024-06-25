
package com.fintech.app.domain.repos;

import com.fintech.app.domain.models.Task;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TaskRepository {
    Task save(Task task);
    List<Task> findAll();
}
