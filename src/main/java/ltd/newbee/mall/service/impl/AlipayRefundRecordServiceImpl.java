package ltd.newbee.mall.service.impl;

import ltd.newbee.mall.dao.AlipayRefundRecordMapper;
import ltd.newbee.mall.entity.AlipayRefundRecord;
import ltd.newbee.mall.service.AlipayRefundRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlipayRefundRecordServiceImpl implements AlipayRefundRecordService {

    @Autowired
    private AlipayRefundRecordMapper alipayRefundRecordMapper;

    @Override
    public int deleteByPrimaryKey(Long refundId) {
        return 0;
    }

    @Override
    public int insert(AlipayRefundRecord row) {
        return 0;
    }

    @Override
    public int insertSelective(AlipayRefundRecord row) {
        return 0;
    }

    @Override
    public AlipayRefundRecord selectByPrimaryKey(Long refundId) {
        return null;
    }

    @Override
    public List<AlipayRefundRecord> selectByOrderNo(String orderNo) {
        return alipayRefundRecordMapper.selectByOrderNo(orderNo);
    }

    @Override
    public List<AlipayRefundRecord> selectByOrderIds(Long[] ids) {
        return alipayRefundRecordMapper.selectByOrderIds(ids);
    }

    @Override
    public int updateByPrimaryKeySelective(AlipayRefundRecord row) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(AlipayRefundRecord row) {
        return 0;
    }
}
