package com.cip.user.service;

import javax.jws.WebService;

import com.cip.user.bean.User;

@WebService
public interface LoginServiceInf {


	User login(User user);

}
