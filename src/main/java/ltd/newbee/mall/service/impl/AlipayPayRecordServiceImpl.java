package ltd.newbee.mall.service.impl;

import ltd.newbee.mall.common.Constants;
import ltd.newbee.mall.dao.AlipayPayRecordMapper;
import ltd.newbee.mall.entity.AlipayPayRecord;
import ltd.newbee.mall.service.AlipayPayRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlipayPayRecordServiceImpl implements AlipayPayRecordService {

    @Autowired
    private AlipayPayRecordMapper alipayPayRecordMapper;

    @Override
    public int updateStatus(Byte status, String orderNo) {
        return alipayPayRecordMapper.updateStatus(status, orderNo);
    }

    @Override
    public int deleteByOrderNo(String orderNo) {
        return alipayPayRecordMapper.deleteByOrderNo(orderNo);
    }

    @Override
    public int deleteByPrimaryKey(Long payId) {
        return 0;
    }

    @Override
    public int insert(AlipayPayRecord row) {
        return 0;
    }

    @Override
    public int insertSelective(AlipayPayRecord row) {
        return alipayPayRecordMapper.insertSelective(row);
    }

    @Override
    public AlipayPayRecord selectByPrimaryKey(Long payId) {
        return null;
    }

    @Override
    public AlipayPayRecord selectByOrderNo(String orderNo) {
        return alipayPayRecordMapper.selectByOrderNo(orderNo);
    }

    @Override
    public int updateByPrimaryKeySelective(AlipayPayRecord row) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(AlipayPayRecord row) {
        return 0;
    }
}
