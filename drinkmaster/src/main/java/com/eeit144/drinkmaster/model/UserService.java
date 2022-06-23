package com.eeit144.drinkmaster.model;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;

import com.eeit144.drinkmaster.bean.UserBean;

public interface UserService {

	public Optional<UserBean> findById(Integer id);

	public Page<UserBean> findAll(Integer pageNumber);

	public void insertUser(UserBean userBean);

	public void deleteById(Integer id);

	public Page<UserBean> select(Integer pageNumber, String string);

	public UserBean findByAccPwd(String userAccount, String userPassword);

	public String findIdByName(String userName);
}
