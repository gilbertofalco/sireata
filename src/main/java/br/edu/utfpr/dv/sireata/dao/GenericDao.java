package br.edu.utfpr.dv.sireata.dao;

import java.sql.SQLException;

import br.edu.utfpr.dv.sireata.generic.ObjectGeneric;
import br.edu.utfpr.dv.sireata.generic.dao.AllInterfaces;

public abstract class GenericDao {
	
		protected AllInterfaces inter;
		
		public int salvar(ObjectGeneric obj) throws SQLException{
			inter.salvar(obj);
		}

}
