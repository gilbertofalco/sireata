package br.edu.utfpr.dv.sireata.generic.dao;

import java.sql.SQLException;

import org.apache.commons.collections.list.AbstractLinkedList;

public interface EditarDAO {
	  public void update(AllInterfaces obj, String str) throws SQLException;
	}
