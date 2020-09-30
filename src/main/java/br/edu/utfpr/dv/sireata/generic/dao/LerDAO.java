package br.edu.utfpr.dv.sireata.generic.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface LerDAO {
	  public AllInterfaces findById(int value) throws SQLException;
	  public AllInterfaces loadObject(ResultSet resultSet) throws SQLException;
	  public List<AllInterfaces> findAll() throws SQLException;
	}