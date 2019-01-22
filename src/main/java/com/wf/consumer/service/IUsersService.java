package com.wf.consumer.service;

import java.util.List;
import java.util.UUID;
import com.wf.consumer.model.User;
import java.util.Optional;

public interface IUsersService
{
	List<User> listAll();
	Optional<User> getOne(UUID id);
	User saveOrUpdate(User user);
	void delete(UUID id);
	void deleteAll();
}
