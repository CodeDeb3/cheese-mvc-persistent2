package org.launchcode.models.data;

import org.launchcode.models.Cheese;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by LaunchCode
 */
@Repository
@Transactional  // all methods should be as one transaction
public interface CheeseDao extends CrudRepository<Cheese, Integer> {
}
