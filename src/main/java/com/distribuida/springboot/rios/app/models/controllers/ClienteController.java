package com.distribuida.springboot.rios.app.models.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.distribuida.springboot.rios.app.models.dao.iClienteDAO;

@Controller
public class ClienteController {

	@Autowired
	private iClienteDAO clienteDao;

	// CREAMOS UN METODO QUE ME ALMACENE TODA LA INFORMACION
	@RequestMapping(value="/listar",method=RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "LISTADO DE CLIENTES");
		model.addAttribute("cliente", clienteDao.findAll());
		return "listar";
	}

	
}
