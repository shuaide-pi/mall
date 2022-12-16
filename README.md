## 商城项目
### 后台管理系统登录模块
### 搜索模块
### 秒杀模块
### 优惠券模块
### 支付宝沙盒模块


### 通用
返回错误页面：ErrorPageController <br/>
验证码：CommonController <br/>
全局异常处理：NewBeeMallExceptionHandler <br/>
文件上传：UploadController

### 商城后台
后台登录：AdminController --> AdminUserService <br/>
首页轮播图：NewBeeMallCarouselController --> NewBeeMallCarouselService <br/>
优惠券：NewBeeMallCouponController --> NewBeeMallCouponService <br/>
商品分类：NewBeeMallGoodsCategoryController --> NewBeeMallCategoryService <br/>
商品：NewBeeMallGoodsController --> NewBeeMallGoodsService NewBeeMallCategoryService <br/>
首页配置商品：NewBeeMallGoodsIndexConfigController --> NewBeeMallIndexConfigService <br/>
订单：NewBeeMallOrderController --> NewBeeMallOrderService <br/>
秒杀：NewBeeMallSeckillController --> NewBeeMallSeckillService RedisCache <br/>
     
### 商城前台
前台登录：NewBeeMallUserController --> NewBeeMallUserService <br/>
优惠劵:CouponController --> NewBeeMallCouponService <br/>
商品:GoodsController --> NewBeeMallGoodsService NewBeeMallCategoryService <br/>
首页：IndexController --> NewBeeMallCarouselService NewBeeMallIndexConfigService NewBeeMallCategoryService <br/>
订单：OrderController --> NewBeeMallShoppingCartService NewBeeMallOrderService MallUserMapper AlipayConfig <br/>
用户：PersonalController --> NewBeeMallUserService NewBeeMallCouponService <br/>
秒杀：SecKillController --> NewBeeMallSeckillService NewBeeMallGoodsMapper RedisCache <br/>
购物车：ShoppingCartController --> NewBeeMallShoppingCartService NewBeeMallCouponService <br/>

### 操作数据库
后台管理员：AdminUserMapper  <br/>
轮播图：CarouselMapper  <br/>
商品分类：GoodsCategoryMapper  <br/>
首页：IndexConfigMapper  <br/>
用户：MallUserMapper  <br/>
优惠劵:NewBeeMallCouponMapper NewBeeMallUserCouponRecordMapper  <br/>
商品：NewBeeMallGoodsMapper  <br/>
订单：NewBeeMallOrderItemMapper NewBeeMallOrderMapper  <br/>
秒杀：NewBeeMallSeckillMapper NewBeeMallSeckillSuccessMapper  <br/>
购物车：NewBeeMallShoppingCartItemMapper  <br/>










