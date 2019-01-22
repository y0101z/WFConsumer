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
@Table("clicks")
public class Click
{
	@PrimaryKey
	private UUID id;
	private UUID userId;
	private UUID applicationId;
}
