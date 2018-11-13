package com.device.management.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SzAttendanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SzAttendanceExample() {
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

        public Criteria andClintIdIsNull() {
            addCriterion("clint_id is null");
            return (Criteria) this;
        }

        public Criteria andClintIdIsNotNull() {
            addCriterion("clint_id is not null");
            return (Criteria) this;
        }

        public Criteria andClintIdEqualTo(String value) {
            addCriterion("clint_id =", value, "clintId");
            return (Criteria) this;
        }

        public Criteria andClintIdNotEqualTo(String value) {
            addCriterion("clint_id <>", value, "clintId");
            return (Criteria) this;
        }

        public Criteria andClintIdGreaterThan(String value) {
            addCriterion("clint_id >", value, "clintId");
            return (Criteria) this;
        }

        public Criteria andClintIdGreaterThanOrEqualTo(String value) {
            addCriterion("clint_id >=", value, "clintId");
            return (Criteria) this;
        }

        public Criteria andClintIdLessThan(String value) {
            addCriterion("clint_id <", value, "clintId");
            return (Criteria) this;
        }

        public Criteria andClintIdLessThanOrEqualTo(String value) {
            addCriterion("clint_id <=", value, "clintId");
            return (Criteria) this;
        }

        public Criteria andClintIdLike(String value) {
            addCriterion("clint_id like", value, "clintId");
            return (Criteria) this;
        }

        public Criteria andClintIdNotLike(String value) {
            addCriterion("clint_id not like", value, "clintId");
            return (Criteria) this;
        }

        public Criteria andClintIdIn(List<String> values) {
            addCriterion("clint_id in", values, "clintId");
            return (Criteria) this;
        }

        public Criteria andClintIdNotIn(List<String> values) {
            addCriterion("clint_id not in", values, "clintId");
            return (Criteria) this;
        }

        public Criteria andClintIdBetween(String value1, String value2) {
            addCriterion("clint_id between", value1, value2, "clintId");
            return (Criteria) this;
        }

        public Criteria andClintIdNotBetween(String value1, String value2) {
            addCriterion("clint_id not between", value1, value2, "clintId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNull() {
            addCriterion("school_id is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("school_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(Integer value) {
            addCriterion("school_id =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(Integer value) {
            addCriterion("school_id <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(Integer value) {
            addCriterion("school_id >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_id >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(Integer value) {
            addCriterion("school_id <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("school_id <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<Integer> values) {
            addCriterion("school_id in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<Integer> values) {
            addCriterion("school_id not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("school_id between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("school_id not between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andIsconnectionIsNull() {
            addCriterion("isConnection is null");
            return (Criteria) this;
        }

        public Criteria andIsconnectionIsNotNull() {
            addCriterion("isConnection is not null");
            return (Criteria) this;
        }

        public Criteria andIsconnectionEqualTo(Integer value) {
            addCriterion("isConnection =", value, "isconnection");
            return (Criteria) this;
        }

        public Criteria andIsconnectionNotEqualTo(Integer value) {
            addCriterion("isConnection <>", value, "isconnection");
            return (Criteria) this;
        }

        public Criteria andIsconnectionGreaterThan(Integer value) {
            addCriterion("isConnection >", value, "isconnection");
            return (Criteria) this;
        }

        public Criteria andIsconnectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("isConnection >=", value, "isconnection");
            return (Criteria) this;
        }

        public Criteria andIsconnectionLessThan(Integer value) {
            addCriterion("isConnection <", value, "isconnection");
            return (Criteria) this;
        }

        public Criteria andIsconnectionLessThanOrEqualTo(Integer value) {
            addCriterion("isConnection <=", value, "isconnection");
            return (Criteria) this;
        }

        public Criteria andIsconnectionIn(List<Integer> values) {
            addCriterion("isConnection in", values, "isconnection");
            return (Criteria) this;
        }

        public Criteria andIsconnectionNotIn(List<Integer> values) {
            addCriterion("isConnection not in", values, "isconnection");
            return (Criteria) this;
        }

        public Criteria andIsconnectionBetween(Integer value1, Integer value2) {
            addCriterion("isConnection between", value1, value2, "isconnection");
            return (Criteria) this;
        }

        public Criteria andIsconnectionNotBetween(Integer value1, Integer value2) {
            addCriterion("isConnection not between", value1, value2, "isconnection");
            return (Criteria) this;
        }

        public Criteria andConfigIsNull() {
            addCriterion("config is null");
            return (Criteria) this;
        }

        public Criteria andConfigIsNotNull() {
            addCriterion("config is not null");
            return (Criteria) this;
        }

        public Criteria andConfigEqualTo(String value) {
            addCriterion("config =", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotEqualTo(String value) {
            addCriterion("config <>", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigGreaterThan(String value) {
            addCriterion("config >", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigGreaterThanOrEqualTo(String value) {
            addCriterion("config >=", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigLessThan(String value) {
            addCriterion("config <", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigLessThanOrEqualTo(String value) {
            addCriterion("config <=", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigLike(String value) {
            addCriterion("config like", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotLike(String value) {
            addCriterion("config not like", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigIn(List<String> values) {
            addCriterion("config in", values, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotIn(List<String> values) {
            addCriterion("config not in", values, "config");
            return (Criteria) this;
        }

        public Criteria andConfigBetween(String value1, String value2) {
            addCriterion("config between", value1, value2, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotBetween(String value1, String value2) {
            addCriterion("config not between", value1, value2, "config");
            return (Criteria) this;
        }

        public Criteria andIntimeIsNull() {
            addCriterion("intime is null");
            return (Criteria) this;
        }

        public Criteria andIntimeIsNotNull() {
            addCriterion("intime is not null");
            return (Criteria) this;
        }

        public Criteria andIntimeEqualTo(Date value) {
            addCriterion("intime =", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotEqualTo(Date value) {
            addCriterion("intime <>", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeGreaterThan(Date value) {
            addCriterion("intime >", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("intime >=", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLessThan(Date value) {
            addCriterion("intime <", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLessThanOrEqualTo(Date value) {
            addCriterion("intime <=", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeIn(List<Date> values) {
            addCriterion("intime in", values, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotIn(List<Date> values) {
            addCriterion("intime not in", values, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeBetween(Date value1, Date value2) {
            addCriterion("intime between", value1, value2, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotBetween(Date value1, Date value2) {
            addCriterion("intime not between", value1, value2, "intime");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andMinitorinfoIsNull() {
            addCriterion("minitorInfo is null");
            return (Criteria) this;
        }

        public Criteria andMinitorinfoIsNotNull() {
            addCriterion("minitorInfo is not null");
            return (Criteria) this;
        }

        public Criteria andMinitorinfoEqualTo(String value) {
            addCriterion("minitorInfo =", value, "minitorinfo");
            return (Criteria) this;
        }

        public Criteria andMinitorinfoNotEqualTo(String value) {
            addCriterion("minitorInfo <>", value, "minitorinfo");
            return (Criteria) this;
        }

        public Criteria andMinitorinfoGreaterThan(String value) {
            addCriterion("minitorInfo >", value, "minitorinfo");
            return (Criteria) this;
        }

        public Criteria andMinitorinfoGreaterThanOrEqualTo(String value) {
            addCriterion("minitorInfo >=", value, "minitorinfo");
            return (Criteria) this;
        }

        public Criteria andMinitorinfoLessThan(String value) {
            addCriterion("minitorInfo <", value, "minitorinfo");
            return (Criteria) this;
        }

        public Criteria andMinitorinfoLessThanOrEqualTo(String value) {
            addCriterion("minitorInfo <=", value, "minitorinfo");
            return (Criteria) this;
        }

        public Criteria andMinitorinfoLike(String value) {
            addCriterion("minitorInfo like", value, "minitorinfo");
            return (Criteria) this;
        }

        public Criteria andMinitorinfoNotLike(String value) {
            addCriterion("minitorInfo not like", value, "minitorinfo");
            return (Criteria) this;
        }

        public Criteria andMinitorinfoIn(List<String> values) {
            addCriterion("minitorInfo in", values, "minitorinfo");
            return (Criteria) this;
        }

        public Criteria andMinitorinfoNotIn(List<String> values) {
            addCriterion("minitorInfo not in", values, "minitorinfo");
            return (Criteria) this;
        }

        public Criteria andMinitorinfoBetween(String value1, String value2) {
            addCriterion("minitorInfo between", value1, value2, "minitorinfo");
            return (Criteria) this;
        }

        public Criteria andMinitorinfoNotBetween(String value1, String value2) {
            addCriterion("minitorInfo not between", value1, value2, "minitorinfo");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeIsNull() {
            addCriterion("lastlogin_time is null");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeIsNotNull() {
            addCriterion("lastlogin_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeEqualTo(Date value) {
            addCriterion("lastlogin_time =", value, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeNotEqualTo(Date value) {
            addCriterion("lastlogin_time <>", value, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeGreaterThan(Date value) {
            addCriterion("lastlogin_time >", value, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastlogin_time >=", value, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeLessThan(Date value) {
            addCriterion("lastlogin_time <", value, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeLessThanOrEqualTo(Date value) {
            addCriterion("lastlogin_time <=", value, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeIn(List<Date> values) {
            addCriterion("lastlogin_time in", values, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeNotIn(List<Date> values) {
            addCriterion("lastlogin_time not in", values, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeBetween(Date value1, Date value2) {
            addCriterion("lastlogin_time between", value1, value2, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeNotBetween(Date value1, Date value2) {
            addCriterion("lastlogin_time not between", value1, value2, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andBoxNumIsNull() {
            addCriterion("box_num is null");
            return (Criteria) this;
        }

        public Criteria andBoxNumIsNotNull() {
            addCriterion("box_num is not null");
            return (Criteria) this;
        }

        public Criteria andBoxNumEqualTo(String value) {
            addCriterion("box_num =", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumNotEqualTo(String value) {
            addCriterion("box_num <>", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumGreaterThan(String value) {
            addCriterion("box_num >", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumGreaterThanOrEqualTo(String value) {
            addCriterion("box_num >=", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumLessThan(String value) {
            addCriterion("box_num <", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumLessThanOrEqualTo(String value) {
            addCriterion("box_num <=", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumLike(String value) {
            addCriterion("box_num like", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumNotLike(String value) {
            addCriterion("box_num not like", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumIn(List<String> values) {
            addCriterion("box_num in", values, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumNotIn(List<String> values) {
            addCriterion("box_num not in", values, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumBetween(String value1, String value2) {
            addCriterion("box_num between", value1, value2, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumNotBetween(String value1, String value2) {
            addCriterion("box_num not between", value1, value2, "boxNum");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andClintTypeIsNull() {
            addCriterion("clint_type is null");
            return (Criteria) this;
        }

        public Criteria andClintTypeIsNotNull() {
            addCriterion("clint_type is not null");
            return (Criteria) this;
        }

        public Criteria andClintTypeEqualTo(Integer value) {
            addCriterion("clint_type =", value, "clintType");
            return (Criteria) this;
        }

        public Criteria andClintTypeNotEqualTo(Integer value) {
            addCriterion("clint_type <>", value, "clintType");
            return (Criteria) this;
        }

        public Criteria andClintTypeGreaterThan(Integer value) {
            addCriterion("clint_type >", value, "clintType");
            return (Criteria) this;
        }

        public Criteria andClintTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("clint_type >=", value, "clintType");
            return (Criteria) this;
        }

        public Criteria andClintTypeLessThan(Integer value) {
            addCriterion("clint_type <", value, "clintType");
            return (Criteria) this;
        }

        public Criteria andClintTypeLessThanOrEqualTo(Integer value) {
            addCriterion("clint_type <=", value, "clintType");
            return (Criteria) this;
        }

        public Criteria andClintTypeIn(List<Integer> values) {
            addCriterion("clint_type in", values, "clintType");
            return (Criteria) this;
        }

        public Criteria andClintTypeNotIn(List<Integer> values) {
            addCriterion("clint_type not in", values, "clintType");
            return (Criteria) this;
        }

        public Criteria andClintTypeBetween(Integer value1, Integer value2) {
            addCriterion("clint_type between", value1, value2, "clintType");
            return (Criteria) this;
        }

        public Criteria andClintTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("clint_type not between", value1, value2, "clintType");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(Integer value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(Integer value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(Integer value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(Integer value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(Integer value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<Integer> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<Integer> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(Integer value1, Integer value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(Integer value1, Integer value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andAppconnectstateIsNull() {
            addCriterion("AppConnectState is null");
            return (Criteria) this;
        }

        public Criteria andAppconnectstateIsNotNull() {
            addCriterion("AppConnectState is not null");
            return (Criteria) this;
        }

        public Criteria andAppconnectstateEqualTo(Integer value) {
            addCriterion("AppConnectState =", value, "appconnectstate");
            return (Criteria) this;
        }

        public Criteria andAppconnectstateNotEqualTo(Integer value) {
            addCriterion("AppConnectState <>", value, "appconnectstate");
            return (Criteria) this;
        }

        public Criteria andAppconnectstateGreaterThan(Integer value) {
            addCriterion("AppConnectState >", value, "appconnectstate");
            return (Criteria) this;
        }

        public Criteria andAppconnectstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("AppConnectState >=", value, "appconnectstate");
            return (Criteria) this;
        }

        public Criteria andAppconnectstateLessThan(Integer value) {
            addCriterion("AppConnectState <", value, "appconnectstate");
            return (Criteria) this;
        }

        public Criteria andAppconnectstateLessThanOrEqualTo(Integer value) {
            addCriterion("AppConnectState <=", value, "appconnectstate");
            return (Criteria) this;
        }

        public Criteria andAppconnectstateIn(List<Integer> values) {
            addCriterion("AppConnectState in", values, "appconnectstate");
            return (Criteria) this;
        }

        public Criteria andAppconnectstateNotIn(List<Integer> values) {
            addCriterion("AppConnectState not in", values, "appconnectstate");
            return (Criteria) this;
        }

        public Criteria andAppconnectstateBetween(Integer value1, Integer value2) {
            addCriterion("AppConnectState between", value1, value2, "appconnectstate");
            return (Criteria) this;
        }

        public Criteria andAppconnectstateNotBetween(Integer value1, Integer value2) {
            addCriterion("AppConnectState not between", value1, value2, "appconnectstate");
            return (Criteria) this;
        }

        public Criteria andAppconnecttimeIsNull() {
            addCriterion("AppConnectTime is null");
            return (Criteria) this;
        }

        public Criteria andAppconnecttimeIsNotNull() {
            addCriterion("AppConnectTime is not null");
            return (Criteria) this;
        }

        public Criteria andAppconnecttimeEqualTo(Date value) {
            addCriterion("AppConnectTime =", value, "appconnecttime");
            return (Criteria) this;
        }

        public Criteria andAppconnecttimeNotEqualTo(Date value) {
            addCriterion("AppConnectTime <>", value, "appconnecttime");
            return (Criteria) this;
        }

        public Criteria andAppconnecttimeGreaterThan(Date value) {
            addCriterion("AppConnectTime >", value, "appconnecttime");
            return (Criteria) this;
        }

        public Criteria andAppconnecttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AppConnectTime >=", value, "appconnecttime");
            return (Criteria) this;
        }

        public Criteria andAppconnecttimeLessThan(Date value) {
            addCriterion("AppConnectTime <", value, "appconnecttime");
            return (Criteria) this;
        }

        public Criteria andAppconnecttimeLessThanOrEqualTo(Date value) {
            addCriterion("AppConnectTime <=", value, "appconnecttime");
            return (Criteria) this;
        }

        public Criteria andAppconnecttimeIn(List<Date> values) {
            addCriterion("AppConnectTime in", values, "appconnecttime");
            return (Criteria) this;
        }

        public Criteria andAppconnecttimeNotIn(List<Date> values) {
            addCriterion("AppConnectTime not in", values, "appconnecttime");
            return (Criteria) this;
        }

        public Criteria andAppconnecttimeBetween(Date value1, Date value2) {
            addCriterion("AppConnectTime between", value1, value2, "appconnecttime");
            return (Criteria) this;
        }

        public Criteria andAppconnecttimeNotBetween(Date value1, Date value2) {
            addCriterion("AppConnectTime not between", value1, value2, "appconnecttime");
            return (Criteria) this;
        }

        public Criteria andIskaoqinIsNull() {
            addCriterion("IsKaoqin is null");
            return (Criteria) this;
        }

        public Criteria andIskaoqinIsNotNull() {
            addCriterion("IsKaoqin is not null");
            return (Criteria) this;
        }

        public Criteria andIskaoqinEqualTo(Integer value) {
            addCriterion("IsKaoqin =", value, "iskaoqin");
            return (Criteria) this;
        }

        public Criteria andIskaoqinNotEqualTo(Integer value) {
            addCriterion("IsKaoqin <>", value, "iskaoqin");
            return (Criteria) this;
        }

        public Criteria andIskaoqinGreaterThan(Integer value) {
            addCriterion("IsKaoqin >", value, "iskaoqin");
            return (Criteria) this;
        }

        public Criteria andIskaoqinGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsKaoqin >=", value, "iskaoqin");
            return (Criteria) this;
        }

        public Criteria andIskaoqinLessThan(Integer value) {
            addCriterion("IsKaoqin <", value, "iskaoqin");
            return (Criteria) this;
        }

        public Criteria andIskaoqinLessThanOrEqualTo(Integer value) {
            addCriterion("IsKaoqin <=", value, "iskaoqin");
            return (Criteria) this;
        }

        public Criteria andIskaoqinIn(List<Integer> values) {
            addCriterion("IsKaoqin in", values, "iskaoqin");
            return (Criteria) this;
        }

        public Criteria andIskaoqinNotIn(List<Integer> values) {
            addCriterion("IsKaoqin not in", values, "iskaoqin");
            return (Criteria) this;
        }

        public Criteria andIskaoqinBetween(Integer value1, Integer value2) {
            addCriterion("IsKaoqin between", value1, value2, "iskaoqin");
            return (Criteria) this;
        }

        public Criteria andIskaoqinNotBetween(Integer value1, Integer value2) {
            addCriterion("IsKaoqin not between", value1, value2, "iskaoqin");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeIsNull() {
            addCriterion("OnlineTime is null");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeIsNotNull() {
            addCriterion("OnlineTime is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeEqualTo(Integer value) {
            addCriterion("OnlineTime =", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeNotEqualTo(Integer value) {
            addCriterion("OnlineTime <>", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeGreaterThan(Integer value) {
            addCriterion("OnlineTime >", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("OnlineTime >=", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeLessThan(Integer value) {
            addCriterion("OnlineTime <", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeLessThanOrEqualTo(Integer value) {
            addCriterion("OnlineTime <=", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeIn(List<Integer> values) {
            addCriterion("OnlineTime in", values, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeNotIn(List<Integer> values) {
            addCriterion("OnlineTime not in", values, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeBetween(Integer value1, Integer value2) {
            addCriterion("OnlineTime between", value1, value2, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("OnlineTime not between", value1, value2, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeIsNull() {
            addCriterion("OfflineTime is null");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeIsNotNull() {
            addCriterion("OfflineTime is not null");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeEqualTo(Integer value) {
            addCriterion("OfflineTime =", value, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeNotEqualTo(Integer value) {
            addCriterion("OfflineTime <>", value, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeGreaterThan(Integer value) {
            addCriterion("OfflineTime >", value, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("OfflineTime >=", value, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeLessThan(Integer value) {
            addCriterion("OfflineTime <", value, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeLessThanOrEqualTo(Integer value) {
            addCriterion("OfflineTime <=", value, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeIn(List<Integer> values) {
            addCriterion("OfflineTime in", values, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeNotIn(List<Integer> values) {
            addCriterion("OfflineTime not in", values, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeBetween(Integer value1, Integer value2) {
            addCriterion("OfflineTime between", value1, value2, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("OfflineTime not between", value1, value2, "offlinetime");
            return (Criteria) this;
        }
    }

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