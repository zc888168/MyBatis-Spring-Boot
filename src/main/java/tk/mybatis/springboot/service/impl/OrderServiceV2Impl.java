package tk.mybatis.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.springboot.dto.OrderDTO;
import tk.mybatis.springboot.service.IOrderService;

public class OrderServiceV2Impl implements IOrderService {

    @Autowired
    private HandlerProcessor handlerContext;
    @Override
    public String handle(OrderDTO orderDTO) {
       // AbstractHandler abstractHandler =handlerContext.getInstance(orderDTO.getType());
       // return abstractHandler.handle(orderDTO);
        return null;
    }
}
