package tk.mybatis.springboot.service.impl;

import tk.mybatis.springboot.dto.OrderDTO;

public abstract  class AbstractHandler {
    abstract  public  String handle(OrderDTO orderDTO);
}
