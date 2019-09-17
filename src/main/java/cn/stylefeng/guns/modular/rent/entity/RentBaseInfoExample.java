package cn.stylefeng.guns.modular.rent.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public RentBaseInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRentingHouseIsNull() {
            addCriterion("renting_house is null");
            return (Criteria) this;
        }

        public Criteria andRentingHouseIsNotNull() {
            addCriterion("renting_house is not null");
            return (Criteria) this;
        }

        public Criteria andRentingHouseEqualTo(String value) {
            addCriterion("renting_house =", value, "rentingHouse");
            return (Criteria) this;
        }

        public Criteria andRentingHouseNotEqualTo(String value) {
            addCriterion("renting_house <>", value, "rentingHouse");
            return (Criteria) this;
        }

        public Criteria andRentingHouseGreaterThan(String value) {
            addCriterion("renting_house >", value, "rentingHouse");
            return (Criteria) this;
        }

        public Criteria andRentingHouseGreaterThanOrEqualTo(String value) {
            addCriterion("renting_house >=", value, "rentingHouse");
            return (Criteria) this;
        }

        public Criteria andRentingHouseLessThan(String value) {
            addCriterion("renting_house <", value, "rentingHouse");
            return (Criteria) this;
        }

        public Criteria andRentingHouseLessThanOrEqualTo(String value) {
            addCriterion("renting_house <=", value, "rentingHouse");
            return (Criteria) this;
        }

        public Criteria andRentingHouseLike(String value) {
            addCriterion("renting_house like", value, "rentingHouse");
            return (Criteria) this;
        }

        public Criteria andRentingHouseNotLike(String value) {
            addCriterion("renting_house not like", value, "rentingHouse");
            return (Criteria) this;
        }

        public Criteria andRentingHouseIn(List<String> values) {
            addCriterion("renting_house in", values, "rentingHouse");
            return (Criteria) this;
        }

        public Criteria andRentingHouseNotIn(List<String> values) {
            addCriterion("renting_house not in", values, "rentingHouse");
            return (Criteria) this;
        }

        public Criteria andRentingHouseBetween(String value1, String value2) {
            addCriterion("renting_house between", value1, value2, "rentingHouse");
            return (Criteria) this;
        }

        public Criteria andRentingHouseNotBetween(String value1, String value2) {
            addCriterion("renting_house not between", value1, value2, "rentingHouse");
            return (Criteria) this;
        }

        public Criteria andRentingUnitIsNull() {
            addCriterion("renting_unit is null");
            return (Criteria) this;
        }

        public Criteria andRentingUnitIsNotNull() {
            addCriterion("renting_unit is not null");
            return (Criteria) this;
        }

        public Criteria andRentingUnitEqualTo(String value) {
            addCriterion("renting_unit =", value, "rentingUnit");
            return (Criteria) this;
        }

        public Criteria andRentingUnitNotEqualTo(String value) {
            addCriterion("renting_unit <>", value, "rentingUnit");
            return (Criteria) this;
        }

        public Criteria andRentingUnitGreaterThan(String value) {
            addCriterion("renting_unit >", value, "rentingUnit");
            return (Criteria) this;
        }

        public Criteria andRentingUnitGreaterThanOrEqualTo(String value) {
            addCriterion("renting_unit >=", value, "rentingUnit");
            return (Criteria) this;
        }

        public Criteria andRentingUnitLessThan(String value) {
            addCriterion("renting_unit <", value, "rentingUnit");
            return (Criteria) this;
        }

        public Criteria andRentingUnitLessThanOrEqualTo(String value) {
            addCriterion("renting_unit <=", value, "rentingUnit");
            return (Criteria) this;
        }

        public Criteria andRentingUnitLike(String value) {
            addCriterion("renting_unit like", value, "rentingUnit");
            return (Criteria) this;
        }

        public Criteria andRentingUnitNotLike(String value) {
            addCriterion("renting_unit not like", value, "rentingUnit");
            return (Criteria) this;
        }

        public Criteria andRentingUnitIn(List<String> values) {
            addCriterion("renting_unit in", values, "rentingUnit");
            return (Criteria) this;
        }

        public Criteria andRentingUnitNotIn(List<String> values) {
            addCriterion("renting_unit not in", values, "rentingUnit");
            return (Criteria) this;
        }

        public Criteria andRentingUnitBetween(String value1, String value2) {
            addCriterion("renting_unit between", value1, value2, "rentingUnit");
            return (Criteria) this;
        }

        public Criteria andRentingUnitNotBetween(String value1, String value2) {
            addCriterion("renting_unit not between", value1, value2, "rentingUnit");
            return (Criteria) this;
        }

        public Criteria andRentingAdressIsNull() {
            addCriterion("renting_adress is null");
            return (Criteria) this;
        }

        public Criteria andRentingAdressIsNotNull() {
            addCriterion("renting_adress is not null");
            return (Criteria) this;
        }

        public Criteria andRentingAdressEqualTo(String value) {
            addCriterion("renting_adress =", value, "rentingAdress");
            return (Criteria) this;
        }

        public Criteria andRentingAdressNotEqualTo(String value) {
            addCriterion("renting_adress <>", value, "rentingAdress");
            return (Criteria) this;
        }

        public Criteria andRentingAdressGreaterThan(String value) {
            addCriterion("renting_adress >", value, "rentingAdress");
            return (Criteria) this;
        }

        public Criteria andRentingAdressGreaterThanOrEqualTo(String value) {
            addCriterion("renting_adress >=", value, "rentingAdress");
            return (Criteria) this;
        }

        public Criteria andRentingAdressLessThan(String value) {
            addCriterion("renting_adress <", value, "rentingAdress");
            return (Criteria) this;
        }

        public Criteria andRentingAdressLessThanOrEqualTo(String value) {
            addCriterion("renting_adress <=", value, "rentingAdress");
            return (Criteria) this;
        }

        public Criteria andRentingAdressLike(String value) {
            addCriterion("renting_adress like", value, "rentingAdress");
            return (Criteria) this;
        }

        public Criteria andRentingAdressNotLike(String value) {
            addCriterion("renting_adress not like", value, "rentingAdress");
            return (Criteria) this;
        }

        public Criteria andRentingAdressIn(List<String> values) {
            addCriterion("renting_adress in", values, "rentingAdress");
            return (Criteria) this;
        }

        public Criteria andRentingAdressNotIn(List<String> values) {
            addCriterion("renting_adress not in", values, "rentingAdress");
            return (Criteria) this;
        }

        public Criteria andRentingAdressBetween(String value1, String value2) {
            addCriterion("renting_adress between", value1, value2, "rentingAdress");
            return (Criteria) this;
        }

        public Criteria andRentingAdressNotBetween(String value1, String value2) {
            addCriterion("renting_adress not between", value1, value2, "rentingAdress");
            return (Criteria) this;
        }

        public Criteria andTenantsNameIsNull() {
            addCriterion("tenants_name is null");
            return (Criteria) this;
        }

        public Criteria andTenantsNameIsNotNull() {
            addCriterion("tenants_name is not null");
            return (Criteria) this;
        }

        public Criteria andTenantsNameEqualTo(String value) {
            addCriterion("tenants_name =", value, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameNotEqualTo(String value) {
            addCriterion("tenants_name <>", value, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameGreaterThan(String value) {
            addCriterion("tenants_name >", value, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameGreaterThanOrEqualTo(String value) {
            addCriterion("tenants_name >=", value, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameLessThan(String value) {
            addCriterion("tenants_name <", value, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameLessThanOrEqualTo(String value) {
            addCriterion("tenants_name <=", value, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameLike(String value) {
            addCriterion("tenants_name like", value, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameNotLike(String value) {
            addCriterion("tenants_name not like", value, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameIn(List<String> values) {
            addCriterion("tenants_name in", values, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameNotIn(List<String> values) {
            addCriterion("tenants_name not in", values, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameBetween(String value1, String value2) {
            addCriterion("tenants_name between", value1, value2, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameNotBetween(String value1, String value2) {
            addCriterion("tenants_name not between", value1, value2, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsTelephoneIsNull() {
            addCriterion("tenants_telephone is null");
            return (Criteria) this;
        }

        public Criteria andTenantsTelephoneIsNotNull() {
            addCriterion("tenants_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTenantsTelephoneEqualTo(String value) {
            addCriterion("tenants_telephone =", value, "tenantsTelephone");
            return (Criteria) this;
        }

        public Criteria andTenantsTelephoneNotEqualTo(String value) {
            addCriterion("tenants_telephone <>", value, "tenantsTelephone");
            return (Criteria) this;
        }

        public Criteria andTenantsTelephoneGreaterThan(String value) {
            addCriterion("tenants_telephone >", value, "tenantsTelephone");
            return (Criteria) this;
        }

        public Criteria andTenantsTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("tenants_telephone >=", value, "tenantsTelephone");
            return (Criteria) this;
        }

        public Criteria andTenantsTelephoneLessThan(String value) {
            addCriterion("tenants_telephone <", value, "tenantsTelephone");
            return (Criteria) this;
        }

        public Criteria andTenantsTelephoneLessThanOrEqualTo(String value) {
            addCriterion("tenants_telephone <=", value, "tenantsTelephone");
            return (Criteria) this;
        }

        public Criteria andTenantsTelephoneLike(String value) {
            addCriterion("tenants_telephone like", value, "tenantsTelephone");
            return (Criteria) this;
        }

        public Criteria andTenantsTelephoneNotLike(String value) {
            addCriterion("tenants_telephone not like", value, "tenantsTelephone");
            return (Criteria) this;
        }

        public Criteria andTenantsTelephoneIn(List<String> values) {
            addCriterion("tenants_telephone in", values, "tenantsTelephone");
            return (Criteria) this;
        }

        public Criteria andTenantsTelephoneNotIn(List<String> values) {
            addCriterion("tenants_telephone not in", values, "tenantsTelephone");
            return (Criteria) this;
        }

        public Criteria andTenantsTelephoneBetween(String value1, String value2) {
            addCriterion("tenants_telephone between", value1, value2, "tenantsTelephone");
            return (Criteria) this;
        }

        public Criteria andTenantsTelephoneNotBetween(String value1, String value2) {
            addCriterion("tenants_telephone not between", value1, value2, "tenantsTelephone");
            return (Criteria) this;
        }

        public Criteria andTenantsWeixinIsNull() {
            addCriterion("tenants_weixin is null");
            return (Criteria) this;
        }

        public Criteria andTenantsWeixinIsNotNull() {
            addCriterion("tenants_weixin is not null");
            return (Criteria) this;
        }

        public Criteria andTenantsWeixinEqualTo(String value) {
            addCriterion("tenants_weixin =", value, "tenantsWeixin");
            return (Criteria) this;
        }

        public Criteria andTenantsWeixinNotEqualTo(String value) {
            addCriterion("tenants_weixin <>", value, "tenantsWeixin");
            return (Criteria) this;
        }

        public Criteria andTenantsWeixinGreaterThan(String value) {
            addCriterion("tenants_weixin >", value, "tenantsWeixin");
            return (Criteria) this;
        }

        public Criteria andTenantsWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("tenants_weixin >=", value, "tenantsWeixin");
            return (Criteria) this;
        }

        public Criteria andTenantsWeixinLessThan(String value) {
            addCriterion("tenants_weixin <", value, "tenantsWeixin");
            return (Criteria) this;
        }

        public Criteria andTenantsWeixinLessThanOrEqualTo(String value) {
            addCriterion("tenants_weixin <=", value, "tenantsWeixin");
            return (Criteria) this;
        }

        public Criteria andTenantsWeixinLike(String value) {
            addCriterion("tenants_weixin like", value, "tenantsWeixin");
            return (Criteria) this;
        }

        public Criteria andTenantsWeixinNotLike(String value) {
            addCriterion("tenants_weixin not like", value, "tenantsWeixin");
            return (Criteria) this;
        }

        public Criteria andTenantsWeixinIn(List<String> values) {
            addCriterion("tenants_weixin in", values, "tenantsWeixin");
            return (Criteria) this;
        }

        public Criteria andTenantsWeixinNotIn(List<String> values) {
            addCriterion("tenants_weixin not in", values, "tenantsWeixin");
            return (Criteria) this;
        }

        public Criteria andTenantsWeixinBetween(String value1, String value2) {
            addCriterion("tenants_weixin between", value1, value2, "tenantsWeixin");
            return (Criteria) this;
        }

        public Criteria andTenantsWeixinNotBetween(String value1, String value2) {
            addCriterion("tenants_weixin not between", value1, value2, "tenantsWeixin");
            return (Criteria) this;
        }

        public Criteria andRentingTimeIsNull() {
            addCriterion("renting_time is null");
            return (Criteria) this;
        }

        public Criteria andRentingTimeIsNotNull() {
            addCriterion("renting_time is not null");
            return (Criteria) this;
        }

        public Criteria andRentingTimeEqualTo(Date value) {
            addCriterion("renting_time =", value, "rentingTime");
            return (Criteria) this;
        }

        public Criteria andRentingTimeNotEqualTo(Date value) {
            addCriterion("renting_time <>", value, "rentingTime");
            return (Criteria) this;
        }

        public Criteria andRentingTimeGreaterThan(Date value) {
            addCriterion("renting_time >", value, "rentingTime");
            return (Criteria) this;
        }

        public Criteria andRentingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("renting_time >=", value, "rentingTime");
            return (Criteria) this;
        }

        public Criteria andRentingTimeLessThan(Date value) {
            addCriterion("renting_time <", value, "rentingTime");
            return (Criteria) this;
        }

        public Criteria andRentingTimeLessThanOrEqualTo(Date value) {
            addCriterion("renting_time <=", value, "rentingTime");
            return (Criteria) this;
        }

        public Criteria andRentingTimeIn(List<Date> values) {
            addCriterion("renting_time in", values, "rentingTime");
            return (Criteria) this;
        }

        public Criteria andRentingTimeNotIn(List<Date> values) {
            addCriterion("renting_time not in", values, "rentingTime");
            return (Criteria) this;
        }

        public Criteria andRentingTimeBetween(Date value1, Date value2) {
            addCriterion("renting_time between", value1, value2, "rentingTime");
            return (Criteria) this;
        }

        public Criteria andRentingTimeNotBetween(Date value1, Date value2) {
            addCriterion("renting_time not between", value1, value2, "rentingTime");
            return (Criteria) this;
        }

        public Criteria andRentingPriceIsNull() {
            addCriterion("renting_price is null");
            return (Criteria) this;
        }

        public Criteria andRentingPriceIsNotNull() {
            addCriterion("renting_price is not null");
            return (Criteria) this;
        }

        public Criteria andRentingPriceEqualTo(BigDecimal value) {
            addCriterion("renting_price =", value, "rentingPrice");
            return (Criteria) this;
        }

        public Criteria andRentingPriceNotEqualTo(BigDecimal value) {
            addCriterion("renting_price <>", value, "rentingPrice");
            return (Criteria) this;
        }

        public Criteria andRentingPriceGreaterThan(BigDecimal value) {
            addCriterion("renting_price >", value, "rentingPrice");
            return (Criteria) this;
        }

        public Criteria andRentingPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("renting_price >=", value, "rentingPrice");
            return (Criteria) this;
        }

        public Criteria andRentingPriceLessThan(BigDecimal value) {
            addCriterion("renting_price <", value, "rentingPrice");
            return (Criteria) this;
        }

        public Criteria andRentingPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("renting_price <=", value, "rentingPrice");
            return (Criteria) this;
        }

        public Criteria andRentingPriceIn(List<BigDecimal> values) {
            addCriterion("renting_price in", values, "rentingPrice");
            return (Criteria) this;
        }

        public Criteria andRentingPriceNotIn(List<BigDecimal> values) {
            addCriterion("renting_price not in", values, "rentingPrice");
            return (Criteria) this;
        }

        public Criteria andRentingPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("renting_price between", value1, value2, "rentingPrice");
            return (Criteria) this;
        }

        public Criteria andRentingPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("renting_price not between", value1, value2, "rentingPrice");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIsNull() {
            addCriterion("update_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIsNotNull() {
            addCriterion("update_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateNameEqualTo(String value) {
            addCriterion("update_name =", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotEqualTo(String value) {
            addCriterion("update_name <>", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameGreaterThan(String value) {
            addCriterion("update_name >", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameGreaterThanOrEqualTo(String value) {
            addCriterion("update_name >=", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLessThan(String value) {
            addCriterion("update_name <", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLessThanOrEqualTo(String value) {
            addCriterion("update_name <=", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLike(String value) {
            addCriterion("update_name like", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotLike(String value) {
            addCriterion("update_name not like", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIn(List<String> values) {
            addCriterion("update_name in", values, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotIn(List<String> values) {
            addCriterion("update_name not in", values, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameBetween(String value1, String value2) {
            addCriterion("update_name between", value1, value2, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotBetween(String value1, String value2) {
            addCriterion("update_name not between", value1, value2, "updateName");
            return (Criteria) this;
        }

        public Criteria andMemmoIsNull() {
            addCriterion("memmo is null");
            return (Criteria) this;
        }

        public Criteria andMemmoIsNotNull() {
            addCriterion("memmo is not null");
            return (Criteria) this;
        }

        public Criteria andMemmoEqualTo(String value) {
            addCriterion("memmo =", value, "memmo");
            return (Criteria) this;
        }

        public Criteria andMemmoNotEqualTo(String value) {
            addCriterion("memmo <>", value, "memmo");
            return (Criteria) this;
        }

        public Criteria andMemmoGreaterThan(String value) {
            addCriterion("memmo >", value, "memmo");
            return (Criteria) this;
        }

        public Criteria andMemmoGreaterThanOrEqualTo(String value) {
            addCriterion("memmo >=", value, "memmo");
            return (Criteria) this;
        }

        public Criteria andMemmoLessThan(String value) {
            addCriterion("memmo <", value, "memmo");
            return (Criteria) this;
        }

        public Criteria andMemmoLessThanOrEqualTo(String value) {
            addCriterion("memmo <=", value, "memmo");
            return (Criteria) this;
        }

        public Criteria andMemmoLike(String value) {
            addCriterion("memmo like", value, "memmo");
            return (Criteria) this;
        }

        public Criteria andMemmoNotLike(String value) {
            addCriterion("memmo not like", value, "memmo");
            return (Criteria) this;
        }

        public Criteria andMemmoIn(List<String> values) {
            addCriterion("memmo in", values, "memmo");
            return (Criteria) this;
        }

        public Criteria andMemmoNotIn(List<String> values) {
            addCriterion("memmo not in", values, "memmo");
            return (Criteria) this;
        }

        public Criteria andMemmoBetween(String value1, String value2) {
            addCriterion("memmo between", value1, value2, "memmo");
            return (Criteria) this;
        }

        public Criteria andMemmoNotBetween(String value1, String value2) {
            addCriterion("memmo not between", value1, value2, "memmo");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}