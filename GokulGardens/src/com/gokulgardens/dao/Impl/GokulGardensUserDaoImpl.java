package com.gokulgardens.dao.Impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.gokulgardens.dao.GokulGardensUserDao;
import com.gokulgardens.domain.User;

@Repository
public class GokulGardensUserDaoImpl implements GokulGardensUserDao {

	NamedParameterJdbcTemplate namedParamJdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {

		namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);

	}

	@Override
	public boolean createUser(User user) {
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(user);
		String sqlQuery = "INSERT INTO user (user_name, user_password, user_rights) VALUES (:userName, :userPassword, :userRights)";
		return namedParamJdbcTemplate.update(sqlQuery, paramSource) == 1;
	}

	@Override
	public User getUser(int id) {
		SqlParameterSource paramSource = new MapSqlParameterSource("ID", id);
		String sqlQuery = "SELECT * FROM user WHERE user_id = :ID";
		User user = namedParamJdbcTemplate.queryForObject(sqlQuery, paramSource, new GokulGardensUserRowMapper());
		return user;
	}

	@Override
	public boolean updateUser(User user) {
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(user);
		String sqlQuery = "UPDATE user SET user_name = :userName, user_password = :userPassword, user_rights = :userRights";
		return namedParamJdbcTemplate.update(sqlQuery, paramSource) == 1;
	}

	@Override
	public void cleanup() {
		
		String sqlQuery = "TRUNCATE TABLE user";

		namedParamJdbcTemplate.getJdbcOperations().execute(sqlQuery);
	}

}
