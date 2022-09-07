package com.distribuida.springboot.rios.app.models.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.distribuida.springboot.rios.app.models.dao.iClienteDAO;
import com.distribuida.springboot.rios.app.models.entity.Cliente;

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
	
	@RequestMapping(value="/form", method = RequestMethod.GET)
	public String crear(Map <String,Object> model) {
		Cliente cliente = new Cliente();
		model.put("cliente", cliente);
		model.put("titulo", "Formulario cliente");
		return "form"; //HTML	
	}
	
	public String guardar(Map <String,Object> model) {
		Cliente cliente = new Cliente();
		model.put("cliente", cliente);
		model.put("titulo", "Formulario cliente");
		return "form"; //HTML	
	}

	
}
