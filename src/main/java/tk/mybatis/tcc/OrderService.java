package tk.mybatis.tcc;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {

    // 库存服务
    @Autowired
    private InventoryService inventoryService;

    // 积分服务
    @Autowired
    private CreditService creditService;

    // 仓储服务
    @Autowired
    private WmsService wmsService;

    // 对这个订单完成支付
    public void pay(){
        //对本地的的订单数据库修改订单状态为"已支付"
        Object orderDAO = null;
        //orderDAO.updateStatus(OrderStatus.PAYED);

        //调用库存服务扣减库存
        inventoryService.reduceStock();

        //调用积分服务增加积分
        creditService.addCredit();

        //调用仓储服务通知发货
        wmsService.saleDelivery();
    }
}