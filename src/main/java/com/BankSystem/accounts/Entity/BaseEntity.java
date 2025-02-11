package com.BankSystem.accounts.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BaseEntity {

	@Column(updatable = false)
	private LocalDateTime createdAt;

	@Column(updatable = false)
	private String createdBy;

	@Column(insertable = false)
	private LocalDateTime updatedAt;

	@Column(insertable = false)
	private String updatedBy;

}
