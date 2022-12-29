package ltd.newbee.mall.dao;

import ltd.newbee.mall.entity.AlipayRefundRecord;

import java.util.Date;
import java.util.List;

public interface AlipayRefundRecordMapper {
    int deleteByPrimaryKey(Long refundId);

    int insert(AlipayRefundRecord row);

    int insertSelective(AlipayRefundRecord row);

    AlipayRefundRecord selectByPrimaryKey(Long refundId);

    List<AlipayRefundRecord> selectByOrderNo(String orderNo);

    List<AlipayRefundRecord> selectByOrderIds(Long[] ids);

    int updateByPrimaryKeySelective(AlipayRefundRecord row);

    int updateByPrimaryKey(AlipayRefundRecord row);

    int updateStatusByOrderNo(Date d, Byte status, String orderNo);
}
