package com.example.deliveryservice.dto;

import com.example.deliveryservice.vo.ResponseItem;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class DeliveryDto {

    private String email;
    private String name;
    private String pwd;
    private String deliveryId;
    private Date createdAt;
    private String phoneNumber;

    private String encryptedPwd;
    private List<ResponseItem> items;
}
