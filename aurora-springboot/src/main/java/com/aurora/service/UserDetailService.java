package com.aurora.service;

import com.aurora.entity.UserAuth;
import com.aurora.model.dto.UserDetailsDTO;

import javax.servlet.http.HttpServletRequest;

/**
 * @Program: aurora-springboot
 * @Description:
 * @Author: xiongke
 * @Create: 2023-11-24
 */
public interface UserDetailService {

    UserDetailsDTO convertUserDetail(UserAuth user, HttpServletRequest request);

}
