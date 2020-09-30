package br.edu.utfpr.dv.sireata.generic.dao;

import java.sql.SQLException;
import java.util.List;

public abstract class GeralDAO {
	  protected SalvarDAO salvar;
	  protected LerDAO ler;
	  protected EditarDAO editar;
	  protected DeleteDAO delete;

	  public int save(AllInterfaces entity) throws SQLException {
	    return salvar.save(entity);
	  }

	  public List<AllInterfaces> findAll() throws SQLException {
	    return ler.findAll();
	  }

	  public AllInterfaces findById(int id) throws SQLException {
	    return ler.findById(id);
	  }

	  public void update(AllInterfaces obj, String str) throws SQLException {
	    editar.update(obj, str);
	  	}
	  

	  public void delete(int id) throws SQLException {
	    delete.delete(id);
	  }
	}
