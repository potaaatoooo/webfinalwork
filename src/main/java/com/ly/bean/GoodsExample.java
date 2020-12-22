package com.ly.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andGidIsNull() {
            addCriterion("GID is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("GID is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(String value) {
            addCriterion("GID =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(String value) {
            addCriterion("GID <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(String value) {
            addCriterion("GID >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(String value) {
            addCriterion("GID >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(String value) {
            addCriterion("GID <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(String value) {
            addCriterion("GID <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLike(String value) {
            addCriterion("GID like", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotLike(String value) {
            addCriterion("GID not like", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<String> values) {
            addCriterion("GID in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<String> values) {
            addCriterion("GID not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(String value1, String value2) {
            addCriterion("GID between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(String value1, String value2) {
            addCriterion("GID not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGbarcodeIsNull() {
            addCriterion("GBarCode is null");
            return (Criteria) this;
        }

        public Criteria andGbarcodeIsNotNull() {
            addCriterion("GBarCode is not null");
            return (Criteria) this;
        }

        public Criteria andGbarcodeEqualTo(String value) {
            addCriterion("GBarCode =", value, "gbarcode");
            return (Criteria) this;
        }

        public Criteria andGbarcodeNotEqualTo(String value) {
            addCriterion("GBarCode <>", value, "gbarcode");
            return (Criteria) this;
        }

        public Criteria andGbarcodeGreaterThan(String value) {
            addCriterion("GBarCode >", value, "gbarcode");
            return (Criteria) this;
        }

        public Criteria andGbarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("GBarCode >=", value, "gbarcode");
            return (Criteria) this;
        }

        public Criteria andGbarcodeLessThan(String value) {
            addCriterion("GBarCode <", value, "gbarcode");
            return (Criteria) this;
        }

        public Criteria andGbarcodeLessThanOrEqualTo(String value) {
            addCriterion("GBarCode <=", value, "gbarcode");
            return (Criteria) this;
        }

        public Criteria andGbarcodeLike(String value) {
            addCriterion("GBarCode like", value, "gbarcode");
            return (Criteria) this;
        }

        public Criteria andGbarcodeNotLike(String value) {
            addCriterion("GBarCode not like", value, "gbarcode");
            return (Criteria) this;
        }

        public Criteria andGbarcodeIn(List<String> values) {
            addCriterion("GBarCode in", values, "gbarcode");
            return (Criteria) this;
        }

        public Criteria andGbarcodeNotIn(List<String> values) {
            addCriterion("GBarCode not in", values, "gbarcode");
            return (Criteria) this;
        }

        public Criteria andGbarcodeBetween(String value1, String value2) {
            addCriterion("GBarCode between", value1, value2, "gbarcode");
            return (Criteria) this;
        }

        public Criteria andGbarcodeNotBetween(String value1, String value2) {
            addCriterion("GBarCode not between", value1, value2, "gbarcode");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("GName is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("GName is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("GName =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("GName <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("GName >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("GName >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("GName <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("GName <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("GName like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("GName not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("GName in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("GName not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("GName between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("GName not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGclass1IsNull() {
            addCriterion("GClass1 is null");
            return (Criteria) this;
        }

        public Criteria andGclass1IsNotNull() {
            addCriterion("GClass1 is not null");
            return (Criteria) this;
        }

        public Criteria andGclass1EqualTo(String value) {
            addCriterion("GClass1 =", value, "gclass1");
            return (Criteria) this;
        }

        public Criteria andGclass1NotEqualTo(String value) {
            addCriterion("GClass1 <>", value, "gclass1");
            return (Criteria) this;
        }

        public Criteria andGclass1GreaterThan(String value) {
            addCriterion("GClass1 >", value, "gclass1");
            return (Criteria) this;
        }

        public Criteria andGclass1GreaterThanOrEqualTo(String value) {
            addCriterion("GClass1 >=", value, "gclass1");
            return (Criteria) this;
        }

        public Criteria andGclass1LessThan(String value) {
            addCriterion("GClass1 <", value, "gclass1");
            return (Criteria) this;
        }

        public Criteria andGclass1LessThanOrEqualTo(String value) {
            addCriterion("GClass1 <=", value, "gclass1");
            return (Criteria) this;
        }

        public Criteria andGclass1Like(String value) {
            addCriterion("GClass1 like", value, "gclass1");
            return (Criteria) this;
        }

        public Criteria andGclass1NotLike(String value) {
            addCriterion("GClass1 not like", value, "gclass1");
            return (Criteria) this;
        }

        public Criteria andGclass1In(List<String> values) {
            addCriterion("GClass1 in", values, "gclass1");
            return (Criteria) this;
        }

        public Criteria andGclass1NotIn(List<String> values) {
            addCriterion("GClass1 not in", values, "gclass1");
            return (Criteria) this;
        }

        public Criteria andGclass1Between(String value1, String value2) {
            addCriterion("GClass1 between", value1, value2, "gclass1");
            return (Criteria) this;
        }

        public Criteria andGclass1NotBetween(String value1, String value2) {
            addCriterion("GClass1 not between", value1, value2, "gclass1");
            return (Criteria) this;
        }

        public Criteria andGclass2IsNull() {
            addCriterion("GClass2 is null");
            return (Criteria) this;
        }

        public Criteria andGclass2IsNotNull() {
            addCriterion("GClass2 is not null");
            return (Criteria) this;
        }

        public Criteria andGclass2EqualTo(String value) {
            addCriterion("GClass2 =", value, "gclass2");
            return (Criteria) this;
        }

        public Criteria andGclass2NotEqualTo(String value) {
            addCriterion("GClass2 <>", value, "gclass2");
            return (Criteria) this;
        }

        public Criteria andGclass2GreaterThan(String value) {
            addCriterion("GClass2 >", value, "gclass2");
            return (Criteria) this;
        }

        public Criteria andGclass2GreaterThanOrEqualTo(String value) {
            addCriterion("GClass2 >=", value, "gclass2");
            return (Criteria) this;
        }

        public Criteria andGclass2LessThan(String value) {
            addCriterion("GClass2 <", value, "gclass2");
            return (Criteria) this;
        }

        public Criteria andGclass2LessThanOrEqualTo(String value) {
            addCriterion("GClass2 <=", value, "gclass2");
            return (Criteria) this;
        }

        public Criteria andGclass2Like(String value) {
            addCriterion("GClass2 like", value, "gclass2");
            return (Criteria) this;
        }

        public Criteria andGclass2NotLike(String value) {
            addCriterion("GClass2 not like", value, "gclass2");
            return (Criteria) this;
        }

        public Criteria andGclass2In(List<String> values) {
            addCriterion("GClass2 in", values, "gclass2");
            return (Criteria) this;
        }

        public Criteria andGclass2NotIn(List<String> values) {
            addCriterion("GClass2 not in", values, "gclass2");
            return (Criteria) this;
        }

        public Criteria andGclass2Between(String value1, String value2) {
            addCriterion("GClass2 between", value1, value2, "gclass2");
            return (Criteria) this;
        }

        public Criteria andGclass2NotBetween(String value1, String value2) {
            addCriterion("GClass2 not between", value1, value2, "gclass2");
            return (Criteria) this;
        }

        public Criteria andGprimpriceIsNull() {
            addCriterion("GPrimPrice is null");
            return (Criteria) this;
        }

        public Criteria andGprimpriceIsNotNull() {
            addCriterion("GPrimPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGprimpriceEqualTo(BigDecimal value) {
            addCriterion("GPrimPrice =", value, "gprimprice");
            return (Criteria) this;
        }

        public Criteria andGprimpriceNotEqualTo(BigDecimal value) {
            addCriterion("GPrimPrice <>", value, "gprimprice");
            return (Criteria) this;
        }

        public Criteria andGprimpriceGreaterThan(BigDecimal value) {
            addCriterion("GPrimPrice >", value, "gprimprice");
            return (Criteria) this;
        }

        public Criteria andGprimpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GPrimPrice >=", value, "gprimprice");
            return (Criteria) this;
        }

        public Criteria andGprimpriceLessThan(BigDecimal value) {
            addCriterion("GPrimPrice <", value, "gprimprice");
            return (Criteria) this;
        }

        public Criteria andGprimpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GPrimPrice <=", value, "gprimprice");
            return (Criteria) this;
        }

        public Criteria andGprimpriceIn(List<BigDecimal> values) {
            addCriterion("GPrimPrice in", values, "gprimprice");
            return (Criteria) this;
        }

        public Criteria andGprimpriceNotIn(List<BigDecimal> values) {
            addCriterion("GPrimPrice not in", values, "gprimprice");
            return (Criteria) this;
        }

        public Criteria andGprimpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GPrimPrice between", value1, value2, "gprimprice");
            return (Criteria) this;
        }

        public Criteria andGprimpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GPrimPrice not between", value1, value2, "gprimprice");
            return (Criteria) this;
        }

        public Criteria andGlowestpriceIsNull() {
            addCriterion("GLowestPrice is null");
            return (Criteria) this;
        }

        public Criteria andGlowestpriceIsNotNull() {
            addCriterion("GLowestPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGlowestpriceEqualTo(BigDecimal value) {
            addCriterion("GLowestPrice =", value, "glowestprice");
            return (Criteria) this;
        }

        public Criteria andGlowestpriceNotEqualTo(BigDecimal value) {
            addCriterion("GLowestPrice <>", value, "glowestprice");
            return (Criteria) this;
        }

        public Criteria andGlowestpriceGreaterThan(BigDecimal value) {
            addCriterion("GLowestPrice >", value, "glowestprice");
            return (Criteria) this;
        }

        public Criteria andGlowestpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLowestPrice >=", value, "glowestprice");
            return (Criteria) this;
        }

        public Criteria andGlowestpriceLessThan(BigDecimal value) {
            addCriterion("GLowestPrice <", value, "glowestprice");
            return (Criteria) this;
        }

        public Criteria andGlowestpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLowestPrice <=", value, "glowestprice");
            return (Criteria) this;
        }

        public Criteria andGlowestpriceIn(List<BigDecimal> values) {
            addCriterion("GLowestPrice in", values, "glowestprice");
            return (Criteria) this;
        }

        public Criteria andGlowestpriceNotIn(List<BigDecimal> values) {
            addCriterion("GLowestPrice not in", values, "glowestprice");
            return (Criteria) this;
        }

        public Criteria andGlowestpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLowestPrice between", value1, value2, "glowestprice");
            return (Criteria) this;
        }

        public Criteria andGlowestpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLowestPrice not between", value1, value2, "glowestprice");
            return (Criteria) this;
        }

        public Criteria andGadpriceIsNull() {
            addCriterion("GAdPrice is null");
            return (Criteria) this;
        }

        public Criteria andGadpriceIsNotNull() {
            addCriterion("GAdPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGadpriceEqualTo(BigDecimal value) {
            addCriterion("GAdPrice =", value, "gadprice");
            return (Criteria) this;
        }

        public Criteria andGadpriceNotEqualTo(BigDecimal value) {
            addCriterion("GAdPrice <>", value, "gadprice");
            return (Criteria) this;
        }

        public Criteria andGadpriceGreaterThan(BigDecimal value) {
            addCriterion("GAdPrice >", value, "gadprice");
            return (Criteria) this;
        }

        public Criteria andGadpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GAdPrice >=", value, "gadprice");
            return (Criteria) this;
        }

        public Criteria andGadpriceLessThan(BigDecimal value) {
            addCriterion("GAdPrice <", value, "gadprice");
            return (Criteria) this;
        }

        public Criteria andGadpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GAdPrice <=", value, "gadprice");
            return (Criteria) this;
        }

        public Criteria andGadpriceIn(List<BigDecimal> values) {
            addCriterion("GAdPrice in", values, "gadprice");
            return (Criteria) this;
        }

        public Criteria andGadpriceNotIn(List<BigDecimal> values) {
            addCriterion("GAdPrice not in", values, "gadprice");
            return (Criteria) this;
        }

        public Criteria andGadpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GAdPrice between", value1, value2, "gadprice");
            return (Criteria) this;
        }

        public Criteria andGadpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GAdPrice not between", value1, value2, "gadprice");
            return (Criteria) this;
        }

        public Criteria andGspeciIsNull() {
            addCriterion("GSpeci is null");
            return (Criteria) this;
        }

        public Criteria andGspeciIsNotNull() {
            addCriterion("GSpeci is not null");
            return (Criteria) this;
        }

        public Criteria andGspeciEqualTo(String value) {
            addCriterion("GSpeci =", value, "gspeci");
            return (Criteria) this;
        }

        public Criteria andGspeciNotEqualTo(String value) {
            addCriterion("GSpeci <>", value, "gspeci");
            return (Criteria) this;
        }

        public Criteria andGspeciGreaterThan(String value) {
            addCriterion("GSpeci >", value, "gspeci");
            return (Criteria) this;
        }

        public Criteria andGspeciGreaterThanOrEqualTo(String value) {
            addCriterion("GSpeci >=", value, "gspeci");
            return (Criteria) this;
        }

        public Criteria andGspeciLessThan(String value) {
            addCriterion("GSpeci <", value, "gspeci");
            return (Criteria) this;
        }

        public Criteria andGspeciLessThanOrEqualTo(String value) {
            addCriterion("GSpeci <=", value, "gspeci");
            return (Criteria) this;
        }

        public Criteria andGspeciLike(String value) {
            addCriterion("GSpeci like", value, "gspeci");
            return (Criteria) this;
        }

        public Criteria andGspeciNotLike(String value) {
            addCriterion("GSpeci not like", value, "gspeci");
            return (Criteria) this;
        }

        public Criteria andGspeciIn(List<String> values) {
            addCriterion("GSpeci in", values, "gspeci");
            return (Criteria) this;
        }

        public Criteria andGspeciNotIn(List<String> values) {
            addCriterion("GSpeci not in", values, "gspeci");
            return (Criteria) this;
        }

        public Criteria andGspeciBetween(String value1, String value2) {
            addCriterion("GSpeci between", value1, value2, "gspeci");
            return (Criteria) this;
        }

        public Criteria andGspeciNotBetween(String value1, String value2) {
            addCriterion("GSpeci not between", value1, value2, "gspeci");
            return (Criteria) this;
        }

        public Criteria andGoriginIsNull() {
            addCriterion("GOrigin is null");
            return (Criteria) this;
        }

        public Criteria andGoriginIsNotNull() {
            addCriterion("GOrigin is not null");
            return (Criteria) this;
        }

        public Criteria andGoriginEqualTo(String value) {
            addCriterion("GOrigin =", value, "gorigin");
            return (Criteria) this;
        }

        public Criteria andGoriginNotEqualTo(String value) {
            addCriterion("GOrigin <>", value, "gorigin");
            return (Criteria) this;
        }

        public Criteria andGoriginGreaterThan(String value) {
            addCriterion("GOrigin >", value, "gorigin");
            return (Criteria) this;
        }

        public Criteria andGoriginGreaterThanOrEqualTo(String value) {
            addCriterion("GOrigin >=", value, "gorigin");
            return (Criteria) this;
        }

        public Criteria andGoriginLessThan(String value) {
            addCriterion("GOrigin <", value, "gorigin");
            return (Criteria) this;
        }

        public Criteria andGoriginLessThanOrEqualTo(String value) {
            addCriterion("GOrigin <=", value, "gorigin");
            return (Criteria) this;
        }

        public Criteria andGoriginLike(String value) {
            addCriterion("GOrigin like", value, "gorigin");
            return (Criteria) this;
        }

        public Criteria andGoriginNotLike(String value) {
            addCriterion("GOrigin not like", value, "gorigin");
            return (Criteria) this;
        }

        public Criteria andGoriginIn(List<String> values) {
            addCriterion("GOrigin in", values, "gorigin");
            return (Criteria) this;
        }

        public Criteria andGoriginNotIn(List<String> values) {
            addCriterion("GOrigin not in", values, "gorigin");
            return (Criteria) this;
        }

        public Criteria andGoriginBetween(String value1, String value2) {
            addCriterion("GOrigin between", value1, value2, "gorigin");
            return (Criteria) this;
        }

        public Criteria andGoriginNotBetween(String value1, String value2) {
            addCriterion("GOrigin not between", value1, value2, "gorigin");
            return (Criteria) this;
        }

        public Criteria andGunitIsNull() {
            addCriterion("GUnit is null");
            return (Criteria) this;
        }

        public Criteria andGunitIsNotNull() {
            addCriterion("GUnit is not null");
            return (Criteria) this;
        }

        public Criteria andGunitEqualTo(String value) {
            addCriterion("GUnit =", value, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitNotEqualTo(String value) {
            addCriterion("GUnit <>", value, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitGreaterThan(String value) {
            addCriterion("GUnit >", value, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitGreaterThanOrEqualTo(String value) {
            addCriterion("GUnit >=", value, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitLessThan(String value) {
            addCriterion("GUnit <", value, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitLessThanOrEqualTo(String value) {
            addCriterion("GUnit <=", value, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitLike(String value) {
            addCriterion("GUnit like", value, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitNotLike(String value) {
            addCriterion("GUnit not like", value, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitIn(List<String> values) {
            addCriterion("GUnit in", values, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitNotIn(List<String> values) {
            addCriterion("GUnit not in", values, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitBetween(String value1, String value2) {
            addCriterion("GUnit between", value1, value2, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitNotBetween(String value1, String value2) {
            addCriterion("GUnit not between", value1, value2, "gunit");
            return (Criteria) this;
        }

        public Criteria andGsupplyIsNull() {
            addCriterion("GSupply is null");
            return (Criteria) this;
        }

        public Criteria andGsupplyIsNotNull() {
            addCriterion("GSupply is not null");
            return (Criteria) this;
        }

        public Criteria andGsupplyEqualTo(String value) {
            addCriterion("GSupply =", value, "gsupply");
            return (Criteria) this;
        }

        public Criteria andGsupplyNotEqualTo(String value) {
            addCriterion("GSupply <>", value, "gsupply");
            return (Criteria) this;
        }

        public Criteria andGsupplyGreaterThan(String value) {
            addCriterion("GSupply >", value, "gsupply");
            return (Criteria) this;
        }

        public Criteria andGsupplyGreaterThanOrEqualTo(String value) {
            addCriterion("GSupply >=", value, "gsupply");
            return (Criteria) this;
        }

        public Criteria andGsupplyLessThan(String value) {
            addCriterion("GSupply <", value, "gsupply");
            return (Criteria) this;
        }

        public Criteria andGsupplyLessThanOrEqualTo(String value) {
            addCriterion("GSupply <=", value, "gsupply");
            return (Criteria) this;
        }

        public Criteria andGsupplyLike(String value) {
            addCriterion("GSupply like", value, "gsupply");
            return (Criteria) this;
        }

        public Criteria andGsupplyNotLike(String value) {
            addCriterion("GSupply not like", value, "gsupply");
            return (Criteria) this;
        }

        public Criteria andGsupplyIn(List<String> values) {
            addCriterion("GSupply in", values, "gsupply");
            return (Criteria) this;
        }

        public Criteria andGsupplyNotIn(List<String> values) {
            addCriterion("GSupply not in", values, "gsupply");
            return (Criteria) this;
        }

        public Criteria andGsupplyBetween(String value1, String value2) {
            addCriterion("GSupply between", value1, value2, "gsupply");
            return (Criteria) this;
        }

        public Criteria andGsupplyNotBetween(String value1, String value2) {
            addCriterion("GSupply not between", value1, value2, "gsupply");
            return (Criteria) this;
        }

        public Criteria andGstatusIsNull() {
            addCriterion("GStatus is null");
            return (Criteria) this;
        }

        public Criteria andGstatusIsNotNull() {
            addCriterion("GStatus is not null");
            return (Criteria) this;
        }

        public Criteria andGstatusEqualTo(String value) {
            addCriterion("GStatus =", value, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGstatusNotEqualTo(String value) {
            addCriterion("GStatus <>", value, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGstatusGreaterThan(String value) {
            addCriterion("GStatus >", value, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGstatusGreaterThanOrEqualTo(String value) {
            addCriterion("GStatus >=", value, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGstatusLessThan(String value) {
            addCriterion("GStatus <", value, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGstatusLessThanOrEqualTo(String value) {
            addCriterion("GStatus <=", value, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGstatusLike(String value) {
            addCriterion("GStatus like", value, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGstatusNotLike(String value) {
            addCriterion("GStatus not like", value, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGstatusIn(List<String> values) {
            addCriterion("GStatus in", values, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGstatusNotIn(List<String> values) {
            addCriterion("GStatus not in", values, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGstatusBetween(String value1, String value2) {
            addCriterion("GStatus between", value1, value2, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGstatusNotBetween(String value1, String value2) {
            addCriterion("GStatus not between", value1, value2, "gstatus");
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