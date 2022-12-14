package com.distribuida.springboot.rios.app.models.entity;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.*;


@Entity
@Table(name="clientes")
public class Cliente implements Serializable{
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private String email;
	
	@Temporal(TemporalType.DATE)
	@Column(name="create_at")
	private Date createAt;
	
	//CREAMOS UN METODO QUE SE EJECUTE ANTES QUE SE GUARDEN LOS DATOS
	public void prePersist() {
		
	}
	
	//GENERACION DE METODOS GETTER AND SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	
	private static final long serialVersionUID = 1L;
	
	

}
