package tk.mybatis.springboot.service.impl;

import org.springframework.stereotype.Component;
import tk.mybatis.springboot.dto.OrderDTO;

@Component
@HandlerType("3")
public class PromotionHandler extends  AbstractHandler {
    @Override
    public String handle(OrderDTO orderDTO) {
        return "处理促销订单";
    }
}
