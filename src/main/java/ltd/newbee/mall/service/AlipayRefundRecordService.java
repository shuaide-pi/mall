package ltd.newbee.mall.service;

import ltd.newbee.mall.entity.AlipayRefundRecord;

import java.util.List;

public interface AlipayRefundRecordService {
    int deleteByPrimaryKey(Long refundId);

    int insert(AlipayRefundRecord row);

    int insertSelective(AlipayRefundRecord row);

    AlipayRefundRecord selectByPrimaryKey(Long refundId);

    List<AlipayRefundRecord> selectByOrderNo(String orderNo);

    List<AlipayRefundRecord> selectByOrderIds(Long[] ids);

    int updateByPrimaryKeySelective(AlipayRefundRecord row);

    int updateByPrimaryKey(AlipayRefundRecord row);
}
