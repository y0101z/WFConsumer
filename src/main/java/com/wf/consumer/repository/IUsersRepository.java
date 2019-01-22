package com.wf.consumer.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import com.wf.consumer.model.User;

@Repository
public interface IUsersRepository extends CassandraRepository<User>
{
}
