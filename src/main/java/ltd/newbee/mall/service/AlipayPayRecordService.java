package ltd.newbee.mall.service;

import ltd.newbee.mall.entity.AlipayPayRecord;



public interface AlipayPayRecordService {
    int updateStatus(Byte status, String orderNo);

    int deleteByOrderNo(String orderNo);

    int deleteByPrimaryKey(Long payId);

    int insert(AlipayPayRecord row);

    int insertSelective(AlipayPayRecord row);

    AlipayPayRecord selectByPrimaryKey(Long payId);

    AlipayPayRecord selectByOrderNo(String orderNo);

    int updateByPrimaryKeySelective(AlipayPayRecord row);

    int updateByPrimaryKey(AlipayPayRecord row);
}
