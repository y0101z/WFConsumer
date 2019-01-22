package com.wf.consumer.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import com.wf.consumer.model.Click;

public interface IClicksService
{
	List<Click> listAll();
	Optional<Click> getOne(UUID id);
	Click saveOrUpdate(Click click);
	void delete(UUID id);
	void deleteAll();
}
