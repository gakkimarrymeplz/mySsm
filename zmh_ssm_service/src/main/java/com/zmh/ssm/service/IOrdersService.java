package com.zmh.ssm.service;

import com.zmh.ssm.domain.Orders;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IOrdersService {

    List<Orders> findAll(int page,int size) throws Exception;

    Orders findById(String ordersId) throws Exception;
}
