package tk.mybatis.springboot.service.impl;

import org.springframework.stereotype.Component;
import tk.mybatis.springboot.dto.OrderDTO;

@Component
@HandlerType("2")
public class GroupHandler extends  AbstractHandler {
    @Override
    public String handle(OrderDTO orderDTO) {
        return "处理团购订单";
    }
}
