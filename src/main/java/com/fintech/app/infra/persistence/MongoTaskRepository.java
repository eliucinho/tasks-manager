
package com.fintech.app.infra.persistence;

import com.fintech.app.domain.models.Task;
import com.fintech.app.domain.repos.TaskRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoTaskRepository extends MongoRepository<Task, String>, TaskRepository {
}
