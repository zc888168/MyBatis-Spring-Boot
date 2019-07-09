package tk.mybatis.springboot.service.impl;

import org.springframework.stereotype.Component;
import tk.mybatis.springboot.dto.OrderDTO;

@Component
@HandlerType("1")
public class NormalHandler extends  AbstractHandler {
    @Override
    public String handle(OrderDTO orderDTO) {
        return "处理普通订单";
    }
}
