package ltd.newbee.mall.service;

import ltd.newbee.mall.controller.vo.NewBeeMallCouponVO;
import ltd.newbee.mall.controller.vo.NewBeeMallMyCouponVO;
import ltd.newbee.mall.controller.vo.NewBeeMallShoppingCartItemVO;
import ltd.newbee.mall.entity.NewBeeMallCoupon;
import ltd.newbee.mall.util.PageQueryUtil;
import ltd.newbee.mall.util.PageResult;

import java.util.List;

public interface NewBeeMallUserCouponService {

    /**
     * 查询可用优惠券
     *
     * @param userId
     * @return
     */
    List<NewBeeMallCouponVO> selectAvailableCoupon(Long userId);

    /**
     * 用户领取优惠劵
     *
     * @param couponId 优惠劵ID
     * @param userId   用户ID
     * @return boolean
     */
    boolean saveCouponUser(Long couponId, Long userId);

    /**
     * 查询我的优惠券
     *
     * @param userId 用户ID
     * @return
     */
    List<NewBeeMallCouponVO> selectMyCoupons(Long userId);

    /**
     * 查询当前订单可用的优惠券
     *
     * @param myShoppingCartItems
     * @param priceTotal
     * @param userId
     * @return
     */
    List<NewBeeMallMyCouponVO> selectOrderCanUseCoupons(List<NewBeeMallShoppingCartItemVO> myShoppingCartItems, int priceTotal, Long userId);

    /**
     * 删除用户优惠券
     *
     * @param couponUserId
     * @return
     */
    boolean deleteCouponUser(Long couponUserId);

    /**
     * 恢复未支付的优惠券
     * @param orderId
     */
    void releaseCoupon(Long orderId);
}
