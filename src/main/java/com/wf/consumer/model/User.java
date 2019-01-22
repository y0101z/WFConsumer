package com.wf.consumer.model;

import java.util.UUID;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("users")
public class User
{
	@PrimaryKey
	private UUID id;
	private String firstName;
	private String lastName;
	private String email;
	private String zipCode;
}

