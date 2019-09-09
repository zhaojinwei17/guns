package cn.stylefeng.guns.modular.rent.service;

import cn.stylefeng.guns.core.common.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.rent.entity.RentBaseInfo;
import cn.stylefeng.guns.modular.rent.entity.RentBaseInfoExample;
import cn.stylefeng.guns.modular.rent.mapper.RentBaseInfoMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RentBaseInfoService {
    @Resource
    RentBaseInfoMapper rentBaseInfoMapper;

    public LayuiPageInfo list(RentBaseInfo rentBaseInfo,Integer page,Integer limit){
        RentBaseInfoExample rentBaseInfoExample=new RentBaseInfoExample();
        rentBaseInfoExample.setOffset(Long.valueOf((page-1)*limit));
        rentBaseInfoExample.setLimit(limit);
        if(StringUtils.isNoneBlank(rentBaseInfo.getTenantsName())){

        }
        List<RentBaseInfo> rentBaseInfos = rentBaseInfoMapper.selectByExample(rentBaseInfoExample);
        long count = rentBaseInfoMapper.countByExample(rentBaseInfoExample);
        LayuiPageInfo result=new LayuiPageInfo();
        result.setData(rentBaseInfos);
        result.setCount(count);
        return result;
    }

}
