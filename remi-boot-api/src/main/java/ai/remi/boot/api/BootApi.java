package ai.remi.boot.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 门面服务
 *
 * @author dianjiu
 * @date 2021-10-14 下午9:36
 **/
public interface BootApi {

    @GetMapping("/goods/findByGoodsId")
    String findById(@RequestParam("goodsId") int goodsId);

    /**
     * 查询订单详情列表
     *
     * @param query 查询对象
     */
    //@PostMapping(value = "/order/detail/list")
    //PageInfo<OrderDetailListVO> listOrderDetailByPage(@RequestBody @Validated OrderDetailListQuery query);

}
