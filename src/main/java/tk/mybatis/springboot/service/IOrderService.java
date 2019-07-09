package tk.mybatis.springboot.service;

import tk.mybatis.springboot.dto.OrderDTO;

public interface IOrderService {

    String handle(OrderDTO orderDTO);
}
