package cn.stylefeng.guns.modular.rent.service;

import cn.stylefeng.guns.core.common.exception.BizExceptionEnum;
import cn.stylefeng.guns.core.common.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.rent.entity.RentBaseInfo;
import cn.stylefeng.guns.modular.rent.entity.RentBaseInfoExample;
import cn.stylefeng.guns.modular.rent.mapper.RentBaseInfoMapper;
import cn.stylefeng.roses.core.reqres.response.ResponseData;
import cn.stylefeng.roses.kernel.model.exception.ServiceException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RentBaseInfoService {
    @Resource
    RentBaseInfoMapper rentBaseInfoMapper;

    public LayuiPageInfo list(RentBaseInfo rentBaseInfo){
        RentBaseInfoExample rentBaseInfoExample=new RentBaseInfoExample();
        rentBaseInfoExample.setOffset(Long.valueOf((rentBaseInfo.getPage()-1)*rentBaseInfo.getLimit()));
        rentBaseInfoExample.setLimit(rentBaseInfo.getLimit());
        RentBaseInfoExample.Criteria criteria = rentBaseInfoExample.createCriteria();
        if(StringUtils.isNoneBlank(rentBaseInfo.getRentingHouse())){
            criteria.andRentingHouseLike("%"+rentBaseInfo.getRentingHouse()+"%");
        }
        List<RentBaseInfo> rentBaseInfos = rentBaseInfoMapper.selectByExample(rentBaseInfoExample);
        long count = rentBaseInfoMapper.countByExample(rentBaseInfoExample);
        LayuiPageInfo result=new LayuiPageInfo();
        result.setData(rentBaseInfos);
        result.setCount(count);
        return result;
    }

    public ResponseData addOrUpdate(RentBaseInfo rentBaseInfo) {
        if(StringUtils.isNotBlank(rentBaseInfo.getId())){
            if(rentBaseInfoMapper.selectByPrimaryKey(rentBaseInfo.getId())!=null){
                rentBaseInfoMapper.updateByPrimaryKeySelective(rentBaseInfo);
                return ResponseData.success(200,"更新成功！",null);
            }else {
                return ResponseData.error("该信息不存在或已被删除！");
            }
        }else {
            rentBaseInfoMapper.insertSelective(rentBaseInfo);
            return ResponseData.success(200,"添加成功！",null);
        }
    }

    public ResponseData deleteById(String id) {
        rentBaseInfoMapper.deleteByPrimaryKey(id);
        return ResponseData.success(200,"删除成功！",null);
    }
}
