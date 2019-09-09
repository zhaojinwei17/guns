package cn.stylefeng.guns.modular.rent.mapper;

import cn.stylefeng.guns.modular.rent.entity.RentBaseInfo;
import cn.stylefeng.guns.modular.rent.entity.RentBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RentBaseInfoMapper {
    long countByExample(RentBaseInfoExample example);

    int deleteByExample(RentBaseInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(RentBaseInfo record);

    int insertSelective(RentBaseInfo record);

    List<RentBaseInfo> selectByExample(RentBaseInfoExample example);

    RentBaseInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RentBaseInfo record, @Param("example") RentBaseInfoExample example);

    int updateByExample(@Param("record") RentBaseInfo record, @Param("example") RentBaseInfoExample example);

    int updateByPrimaryKeySelective(RentBaseInfo record);

    int updateByPrimaryKey(RentBaseInfo record);
}