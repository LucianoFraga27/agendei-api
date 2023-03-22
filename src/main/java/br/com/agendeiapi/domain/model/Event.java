package br.com.agendeiapi.domain.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Event {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false, name="description_event")
	private String description;
	
	@Column(nullable=false, name="client_name")
	private String clientName;
	
	//@JsonIgnore
	@CreationTimestamp 
	@Column(nullable=false, name="date_registration")
	private LocalDateTime dateRegistration;
	
	@Column(nullable=true, name="date_event")
	private LocalDateTime dateEvent;
	
	@Column(nullable=false, name="type_event")
	private TypeEvent typeEvent;
	
}
