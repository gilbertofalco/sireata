package br.edu.utfpr.dv.sireata.generic.dao;

import java.sql.SQLException;

import org.apache.commons.collections.list.AbstractLinkedList;

public interface EditarDAO {
	  public void update(AbstractLinkedList obj, String str) throws SQLException;
	}
