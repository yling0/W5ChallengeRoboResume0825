package me.yling.w5challengeroboresume0825.repositories;

import me.yling.w5challengeroboresume0825.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person,Long>
{
}
