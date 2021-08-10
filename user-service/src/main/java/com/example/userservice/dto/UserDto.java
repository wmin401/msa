package com.example.userservice.dto;

import com.example.userservice.vo.ResponseOrder;
import com.example.userservice.vo.ResponseUser;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class UserDto {
    private String email;
    private String name;
    private String pwd;
    private String userId;
    private Date createdAt;
    private List<ResponseOrder> orders;
    private String decryptedPwd;
    private String encryptedPwd;


}
