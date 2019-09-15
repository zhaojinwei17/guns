package cn.stylefeng.guns.modular.rent.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * rent_base_info
 * @author 
 */
public class RentBaseInfo implements Serializable {

    private Integer page;

    private Integer limit;
    /**
     * 房租信息ID
     */
    private String id;

    /**
     * 房租名称(三水新城高档公寓)
     */
    private String rentingHouse;

    /**
     * 房租规格(三室一厅)
     */
    private String rentingUnit;

    /**
     * 房租地址(某城市某小区)
     */
    private String rentingAdress;

    /**
     * 租客姓名
     */
    private String tenantsName;

    /**
     * 租客电话
     */
    private String tenantsTelephone;

    /**
     * 租客微信
     */
    private String tenantsWeixin;

    /**
     * 收租日期
     */
    private Date rentingTime;

    /**
     * 收租金额
     */
    private BigDecimal rentingPrice;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新人
     */
    private String updateName;

    /**
     * 备注
     */
    private String memmo;

    private static final long serialVersionUID = 1L;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRentingHouse() {
        return rentingHouse;
    }

    public void setRentingHouse(String rentingHouse) {
        this.rentingHouse = rentingHouse;
    }

    public String getRentingUnit() {
        return rentingUnit;
    }

    public void setRentingUnit(String rentingUnit) {
        this.rentingUnit = rentingUnit;
    }

    public String getRentingAdress() {
        return rentingAdress;
    }

    public void setRentingAdress(String rentingAdress) {
        this.rentingAdress = rentingAdress;
    }

    public String getTenantsName() {
        return tenantsName;
    }

    public void setTenantsName(String tenantsName) {
        this.tenantsName = tenantsName;
    }

    public String getTenantsTelephone() {
        return tenantsTelephone;
    }

    public void setTenantsTelephone(String tenantsTelephone) {
        this.tenantsTelephone = tenantsTelephone;
    }

    public String getTenantsWeixin() {
        return tenantsWeixin;
    }

    public void setTenantsWeixin(String tenantsWeixin) {
        this.tenantsWeixin = tenantsWeixin;
    }

    public Date getRentingTime() {
        return rentingTime;
    }

    public void setRentingTime(Date rentingTime) {
        this.rentingTime = rentingTime;
    }

    public BigDecimal getRentingPrice() {
        return rentingPrice;
    }

    public void setRentingPrice(BigDecimal rentingPrice) {
        this.rentingPrice = rentingPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public String getMemmo() {
        return memmo;
    }

    public void setMemmo(String memmo) {
        this.memmo = memmo;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RentBaseInfo other = (RentBaseInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRentingHouse() == null ? other.getRentingHouse() == null : this.getRentingHouse().equals(other.getRentingHouse()))
            && (this.getRentingUnit() == null ? other.getRentingUnit() == null : this.getRentingUnit().equals(other.getRentingUnit()))
            && (this.getRentingAdress() == null ? other.getRentingAdress() == null : this.getRentingAdress().equals(other.getRentingAdress()))
            && (this.getTenantsName() == null ? other.getTenantsName() == null : this.getTenantsName().equals(other.getTenantsName()))
            && (this.getTenantsTelephone() == null ? other.getTenantsTelephone() == null : this.getTenantsTelephone().equals(other.getTenantsTelephone()))
            && (this.getTenantsWeixin() == null ? other.getTenantsWeixin() == null : this.getTenantsWeixin().equals(other.getTenantsWeixin()))
            && (this.getRentingTime() == null ? other.getRentingTime() == null : this.getRentingTime().equals(other.getRentingTime()))
            && (this.getRentingPrice() == null ? other.getRentingPrice() == null : this.getRentingPrice().equals(other.getRentingPrice()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateName() == null ? other.getUpdateName() == null : this.getUpdateName().equals(other.getUpdateName()))
            && (this.getMemmo() == null ? other.getMemmo() == null : this.getMemmo().equals(other.getMemmo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRentingHouse() == null) ? 0 : getRentingHouse().hashCode());
        result = prime * result + ((getRentingUnit() == null) ? 0 : getRentingUnit().hashCode());
        result = prime * result + ((getRentingAdress() == null) ? 0 : getRentingAdress().hashCode());
        result = prime * result + ((getTenantsName() == null) ? 0 : getTenantsName().hashCode());
        result = prime * result + ((getTenantsTelephone() == null) ? 0 : getTenantsTelephone().hashCode());
        result = prime * result + ((getTenantsWeixin() == null) ? 0 : getTenantsWeixin().hashCode());
        result = prime * result + ((getRentingTime() == null) ? 0 : getRentingTime().hashCode());
        result = prime * result + ((getRentingPrice() == null) ? 0 : getRentingPrice().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateName() == null) ? 0 : getUpdateName().hashCode());
        result = prime * result + ((getMemmo() == null) ? 0 : getMemmo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rentingHouse=").append(rentingHouse);
        sb.append(", rentingUnit=").append(rentingUnit);
        sb.append(", rentingAdress=").append(rentingAdress);
        sb.append(", tenantsName=").append(tenantsName);
        sb.append(", tenantsTelephone=").append(tenantsTelephone);
        sb.append(", tenantsWeixin=").append(tenantsWeixin);
        sb.append(", rentingTime=").append(rentingTime);
        sb.append(", rentingPrice=").append(rentingPrice);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateName=").append(updateName);
        sb.append(", memmo=").append(memmo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}