package com.wf.consumer.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wf.consumer.model.Click;
import com.wf.consumer.model.User;
import com.wf.consumer.repository.IClicksRepository;
import com.wf.consumer.repository.IUsersRepository;

@Service
public class ClicksService implements IClicksService
{
	@Autowired
	private IClicksRepository repository;

	@Autowired
	public ClicksService(IClicksRepository repository)
	{		
		this.repository = repository;
	}
	@Override
	public List<Click> listAll()
	{
		List<Click> clicks = new ArrayList<Click>();
		repository.findAll().forEach(clicks::add); 
		return clicks;
	}

	@Override
	public Optional<Click> getOne(UUID id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Click saveOrUpdate(Click click)
	{
		repository.save(click);
		return click;
	}

	@Override
	public void delete(UUID id)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll()
	{
		// TODO Auto-generated method stub
	}
}
