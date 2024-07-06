package com.disriobuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuidas.entities.Pedidos;

@Repository
public class PedidosDAOImpl implements PedidosDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Pedidos> finAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Pedidos", Pedidos.class).getResultList();
	}

	@Override
	public Pedidos findOne(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Pedidos.class, id);
	}

	@Override
	public void add(Pedidos pedidos) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(pedidos);
	}

	@Override
	public void up(Pedidos pedidos) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(pedidos);
	}

	@Override
	public void del(int id) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(id);
	}

}
