package com.wf.consumer.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import com.wf.consumer.model.Click;

@Repository
public interface IClicksRepository extends CassandraRepository<Click>
{
}
