package com.sybinal.shop.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentHistoryExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public PaymentHistoryExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
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

		public Criteria andOrderNumIsNull() {
			addCriterion("order_num is null");
			return (Criteria) this;
		}

		public Criteria andOrderNumIsNotNull() {
			addCriterion("order_num is not null");
			return (Criteria) this;
		}

		public Criteria andOrderNumEqualTo(String value) {
			addCriterion("order_num =", value, "orderNum");
			return (Criteria) this;
		}

		public Criteria andOrderNumNotEqualTo(String value) {
			addCriterion("order_num <>", value, "orderNum");
			return (Criteria) this;
		}

		public Criteria andOrderNumGreaterThan(String value) {
			addCriterion("order_num >", value, "orderNum");
			return (Criteria) this;
		}

		public Criteria andOrderNumGreaterThanOrEqualTo(String value) {
			addCriterion("order_num >=", value, "orderNum");
			return (Criteria) this;
		}

		public Criteria andOrderNumLessThan(String value) {
			addCriterion("order_num <", value, "orderNum");
			return (Criteria) this;
		}

		public Criteria andOrderNumLessThanOrEqualTo(String value) {
			addCriterion("order_num <=", value, "orderNum");
			return (Criteria) this;
		}

		public Criteria andOrderNumLike(String value) {
			addCriterion("order_num like", value, "orderNum");
			return (Criteria) this;
		}

		public Criteria andOrderNumNotLike(String value) {
			addCriterion("order_num not like", value, "orderNum");
			return (Criteria) this;
		}

		public Criteria andOrderNumIn(List<String> values) {
			addCriterion("order_num in", values, "orderNum");
			return (Criteria) this;
		}

		public Criteria andOrderNumNotIn(List<String> values) {
			addCriterion("order_num not in", values, "orderNum");
			return (Criteria) this;
		}

		public Criteria andOrderNumBetween(String value1, String value2) {
			addCriterion("order_num between", value1, value2, "orderNum");
			return (Criteria) this;
		}

		public Criteria andOrderNumNotBetween(String value1, String value2) {
			addCriterion("order_num not between", value1, value2, "orderNum");
			return (Criteria) this;
		}

		public Criteria andProductPriceIsNull() {
			addCriterion("product_price is null");
			return (Criteria) this;
		}

		public Criteria andProductPriceIsNotNull() {
			addCriterion("product_price is not null");
			return (Criteria) this;
		}

		public Criteria andProductPriceEqualTo(Integer value) {
			addCriterion("product_price =", value, "productPrice");
			return (Criteria) this;
		}

		public Criteria andProductPriceNotEqualTo(Integer value) {
			addCriterion("product_price <>", value, "productPrice");
			return (Criteria) this;
		}

		public Criteria andProductPriceGreaterThan(Integer value) {
			addCriterion("product_price >", value, "productPrice");
			return (Criteria) this;
		}

		public Criteria andProductPriceGreaterThanOrEqualTo(Integer value) {
			addCriterion("product_price >=", value, "productPrice");
			return (Criteria) this;
		}

		public Criteria andProductPriceLessThan(Integer value) {
			addCriterion("product_price <", value, "productPrice");
			return (Criteria) this;
		}

		public Criteria andProductPriceLessThanOrEqualTo(Integer value) {
			addCriterion("product_price <=", value, "productPrice");
			return (Criteria) this;
		}

		public Criteria andProductPriceIn(List<Integer> values) {
			addCriterion("product_price in", values, "productPrice");
			return (Criteria) this;
		}

		public Criteria andProductPriceNotIn(List<Integer> values) {
			addCriterion("product_price not in", values, "productPrice");
			return (Criteria) this;
		}

		public Criteria andProductPriceBetween(Integer value1, Integer value2) {
			addCriterion("product_price between", value1, value2,
					"productPrice");
			return (Criteria) this;
		}

		public Criteria andProductPriceNotBetween(Integer value1, Integer value2) {
			addCriterion("product_price not between", value1, value2,
					"productPrice");
			return (Criteria) this;
		}

		public Criteria andPaymentTypeIsNull() {
			addCriterion("payment_type is null");
			return (Criteria) this;
		}

		public Criteria andPaymentTypeIsNotNull() {
			addCriterion("payment_type is not null");
			return (Criteria) this;
		}

		public Criteria andPaymentTypeEqualTo(Integer value) {
			addCriterion("payment_type =", value, "paymentType");
			return (Criteria) this;
		}

		public Criteria andPaymentTypeNotEqualTo(Integer value) {
			addCriterion("payment_type <>", value, "paymentType");
			return (Criteria) this;
		}

		public Criteria andPaymentTypeGreaterThan(Integer value) {
			addCriterion("payment_type >", value, "paymentType");
			return (Criteria) this;
		}

		public Criteria andPaymentTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("payment_type >=", value, "paymentType");
			return (Criteria) this;
		}

		public Criteria andPaymentTypeLessThan(Integer value) {
			addCriterion("payment_type <", value, "paymentType");
			return (Criteria) this;
		}

		public Criteria andPaymentTypeLessThanOrEqualTo(Integer value) {
			addCriterion("payment_type <=", value, "paymentType");
			return (Criteria) this;
		}

		public Criteria andPaymentTypeIn(List<Integer> values) {
			addCriterion("payment_type in", values, "paymentType");
			return (Criteria) this;
		}

		public Criteria andPaymentTypeNotIn(List<Integer> values) {
			addCriterion("payment_type not in", values, "paymentType");
			return (Criteria) this;
		}

		public Criteria andPaymentTypeBetween(Integer value1, Integer value2) {
			addCriterion("payment_type between", value1, value2, "paymentType");
			return (Criteria) this;
		}

		public Criteria andPaymentTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("payment_type not between", value1, value2,
					"paymentType");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Integer value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Integer value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Integer value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Integer value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Integer value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Integer> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Integer> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Integer value1, Integer value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andPaymentTimeIsNull() {
			addCriterion("payment_time is null");
			return (Criteria) this;
		}

		public Criteria andPaymentTimeIsNotNull() {
			addCriterion("payment_time is not null");
			return (Criteria) this;
		}

		public Criteria andPaymentTimeEqualTo(Date value) {
			addCriterion("payment_time =", value, "paymentTime");
			return (Criteria) this;
		}

		public Criteria andPaymentTimeNotEqualTo(Date value) {
			addCriterion("payment_time <>", value, "paymentTime");
			return (Criteria) this;
		}

		public Criteria andPaymentTimeGreaterThan(Date value) {
			addCriterion("payment_time >", value, "paymentTime");
			return (Criteria) this;
		}

		public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("payment_time >=", value, "paymentTime");
			return (Criteria) this;
		}

		public Criteria andPaymentTimeLessThan(Date value) {
			addCriterion("payment_time <", value, "paymentTime");
			return (Criteria) this;
		}

		public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
			addCriterion("payment_time <=", value, "paymentTime");
			return (Criteria) this;
		}

		public Criteria andPaymentTimeIn(List<Date> values) {
			addCriterion("payment_time in", values, "paymentTime");
			return (Criteria) this;
		}

		public Criteria andPaymentTimeNotIn(List<Date> values) {
			addCriterion("payment_time not in", values, "paymentTime");
			return (Criteria) this;
		}

		public Criteria andPaymentTimeBetween(Date value1, Date value2) {
			addCriterion("payment_time between", value1, value2, "paymentTime");
			return (Criteria) this;
		}

		public Criteria andPaymentTimeNotBetween(Date value1, Date value2) {
			addCriterion("payment_time not between", value1, value2,
					"paymentTime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table payment_history
     *
     * @mbggenerated do_not_delete_during_merge Wed Oct 19 20:55:54 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}