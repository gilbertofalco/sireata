package br.edu.utfpr.dv.sireata.generic.dao;

import java.sql.SQLException;

import br.edu.utfpr.dv.sireata.generic.ObjectGeneric;

public interface AllInterfaces {
	public int save(ObjectGeneric obj) throws SQLException;
	public void delete(int id) throws SQLException;
	
	
}
