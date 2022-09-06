package com.distribuida.springboot.rios.app.models.dao;

import java.util.List;

import com.distribuida.springboot.rios.app.models.entity.Cliente;

public interface iClienteDAO {
	public List<Cliente> findAll();

}
