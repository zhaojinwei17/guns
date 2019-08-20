package cn.stylefeng.guns.modular.rent.mapper;

import cn.stylefeng.guns.modular.rent.entity.RentBaseInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface RentBaseInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(RentBaseInfo record);

    int insertSelective(RentBaseInfo record);

    RentBaseInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RentBaseInfo record);

    int updateByPrimaryKey(RentBaseInfo record);
}