package com.disriobuida.dao;

import java.util.List;

import com.distribuidas.entities.Pedidos;

public interface PedidosDAO {
	
	public List<Pedidos> finAll();
	
	public Pedidos findOne(int id);
	
	public void add (Pedidos pedidos);
	
	public void up (Pedidos pedidos);
	
	public void del (int id);
	
}
