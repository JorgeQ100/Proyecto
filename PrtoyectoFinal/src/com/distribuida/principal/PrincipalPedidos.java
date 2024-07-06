package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.disriobuida.dao.PedidosDAO;
import com.disriobuida.dao.PedidosDAOImpl;
import com.distribuidas.entities.Pedidos;

public class PrincipalPedidos {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		PedidosDAO pedidosDAO = context.getBean("pedidosDAOImpl", PedidosDAOImpl.class);
		
		List<Pedidos> pedidos = pedidosDAO.finAll();
		
		pedidos.forEach(item ->{
			System.out.println(item.toString());
		});

	}

}
