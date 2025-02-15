package com.jpabook.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@DiscriminatorValue("M")
@Entity
public class Movie extends Item {
	
	private String director;
	private String actor;

}
