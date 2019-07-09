package tk.mybatis.springboot.service.impl;

import tk.mybatis.springboot.dto.OrderDTO;
import tk.mybatis.springboot.service.IOrderService;

public class OrderServiceImpl implements IOrderService {
    @Override
    public String handle(OrderDTO orderDTO) {
        String type = orderDTO.getType();
        if("1".equals(type)){
            return  "处理普通订单";
        } else if("2".equals(type)){
            return  "处理团购订单";
        }else  if("3".equals(type)){
            return  "处理促销订单";
        }
        return  null;
    }
}
