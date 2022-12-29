package ltd.newbee.mall.dao;

import ltd.newbee.mall.entity.AlipayPayRecord;

public interface AlipayPayRecordMapper {
    int deleteByPrimaryKey(Long payId);

    int deleteByOrderNo(String orderNo);

    AlipayPayRecord selectByOrderNo(String orderNo);

    int insert(AlipayPayRecord row);

    int insertSelective(AlipayPayRecord row);

    AlipayPayRecord selectByPrimaryKey(Long payId);

    int updateByPrimaryKeySelective(AlipayPayRecord row);

    int updateByPrimaryKey(AlipayPayRecord row);

    int updateStatus(Byte status, String orderNo);
}
