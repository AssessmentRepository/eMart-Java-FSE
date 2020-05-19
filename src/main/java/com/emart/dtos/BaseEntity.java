package com.emart.dtos;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private LocalDate createdAt = LocalDate.now();;

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

}
