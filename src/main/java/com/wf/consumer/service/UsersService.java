package com.wf.consumer.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wf.consumer.model.User;
import com.wf.consumer.repository.IUsersRepository;
@Service
public class UsersService implements IUsersService
{
	@Autowired
	private IUsersRepository repository;

	@Autowired
	public UsersService(IUsersRepository repository)
	{		
		this.repository = repository;
	}
	
	@Override
	public List<User> listAll()
	{
		List<User> users = new ArrayList<User>();
		repository.findAll().forEach(users::add); // cool Java8
		return users;
	}

	@Override
	public Optional<User> getOne(UUID id)
	{
		//return repository.findById(id);
		return null;
	}

	@Override
	public User saveOrUpdate(User user)
	{
		repository.save(user);
		return user;
	}

	@Override
	public void delete(UUID id)
	{
		// TODO Auto-generated method stub	
	}

	@Override
	public void deleteAll()
	{
		repository.deleteAll();
	}
}
