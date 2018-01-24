package com.fbee.modules.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * @description: 预约订单详情-完成处理form
 * 
 * @author  fanry
 * @date: 2017年2月14日 上午10:53:46
 */
public class ReserveOrderDetailsForm implements Serializable{

	private static final long serialVersionUID = 1L;

	/**
     * 表：reserve_orders
     * 字段：ORDER_NO
     * 注释：订单流水号
     *
     * @mbggenerated
     */
    private String orderNo;

    /**
     * 表：reserve_orders
     * 字段：TENANT_ID
     * 注释：租户id
     *
     * @mbggenerated
     */
    private Integer tenantId;

    /**
     * 表：reserve_orders
     * 字段：MEMBER_ID
     * 注释：客户ID
     *
     * @mbggenerated
     */
    private Integer memberId;

    /**
     * 表：reserve_orders
     * 字段：MEMBER_MOBILE
     * 注释：手机号码
     *
     * @mbggenerated
     */
    private String memberMobile;

    /**
     * 表：reserve_orders
     * 字段：MEMBER_NAME
     * 注释：客户姓名
     *
     * @mbggenerated
     */
    private String memberName;

    /**
     * 表：reserve_orders
     * 字段：MEMBER_SEX
     * 注释：客户性别
     *
     * @mbggenerated
     */
    private String memberSex;

    /**
     * 表：reserve_orders
     * 字段：STAFF_ID
     * 注释：阿姨id
     *
     * @mbggenerated
     */
    private Integer staffId;

    /**
     * 表：reserve_orders
     * 字段：SERVICE_ITEM_CODE
     * 注释：服务工种
     *
     * @mbggenerated
     */
    private String serviceItemCode;

    /**
     * 表：reserve_orders
     * 字段：ORDER_STATUS
     * 注释：预约状态 01待处理 02 已处理 03 已取消
     *
     * @mbggenerated
     */
    private String orderStatus;
    
    /**
     * 表：reserve_orders
     * 字段：ORDER_TIME
     * 注释：预约时间
     *
     * @mbggenerated
     */
    private String orderTime;


    /**
     * 表：reserve_orders
     * 字段：HANDLE_ORDER_TIME
     * 注释：预约订单处理时间
     *
     * @mbggenerated
     */
    private Date handleOrderTime;
    
    /**
     * 表：reserve_orders_customer_info
     * 字段：SERVICE_PROVICE
     * 注释：服务区域省
     *
     * @mbggenerated
     */
    private String serviceProvice;

    /**
     * 表：reserve_orders_customer_info
     * 字段：SERVICE_CITY
     * 注释：服务区域市
     *
     * @mbggenerated
     */
    private String serviceCity;

    /**
     * 表：reserve_orders_customer_info
     * 字段：SERVICE_COUNTY
     * 注释：服务区域区
     *
     * @mbggenerated
     */
    private String serviceCounty;

    /**
     * 表：reserve_orders_customer_info
     * 字段：SERVICE_ADDRESS
     * 注释：服务地址
     *
     * @mbggenerated
     */
    private String serviceAddress;

    /**
     * 表：reserve_orders_customer_info
     * 字段：SERVICE_START
     * 注释：服务开始时间
     *
     * @mbggenerated
     */
    private Date serviceStart;

    /**
     * 表：reserve_orders_customer_info
     * 字段：SERVICE_END
     * 注释：服务结束时间
     *
     * @mbggenerated
     */
    private Date serviceEnd;


    /**
     * 表：reserve_orders_customer_info
     * 字段：SALARY_MIN
     * 注释：薪酬范围-最小值
     *
     * @mbggenerated
     */
    private Integer salaryMin;

    /**
     * 表：reserve_orders_customer_info
     * 字段：SALARY_MAX
     * 注释：薪酬范围-最大值
     *
     * @mbggenerated
     */
    private Integer salaryMax;

    /**
     * 表：reserve_orders_customer_info
     * 字段：HOUSE_TYPE
     * 注释：住宅类型
     *
     * @mbggenerated
     */
    private String houseType;

    /**
     * 表：reserve_orders_customer_info
     * 字段：HOUSE_AREA
     * 注释：住宅面积
     *
     * @mbggenerated
     */
    private BigDecimal houseArea;

    /**
     * 表：reserve_orders_customer_info
     * 字段：FAMILY_COUNT
     * 注释：家庭人数
     *
     * @mbggenerated
     */
    private Integer familyCount;

    /**
     * 表：reserve_orders_customer_info
     * 字段：CHILDREN_COUNT
     * 注释：儿童数
     *
     * @mbggenerated
     */
    private Integer childrenCount;

    /**
     * 表：reserve_orders_customer_info
     * 字段：OLDER_COUNT
     * 注释：老人数
     *
     * @mbggenerated
     */
    private Integer olderCount;

    /**
     * 表：reserve_orders_customer_info
     * 字段：CHILDREN_AGE_RANGE
     * 注释：儿童年龄段
     *
     * @mbggenerated
     */
    private String childrenAgeRange;

    /**
     * 表：reserve_orders_customer_info
     * 字段：OLDER_AGE_RANGE
     * 注释：老人年龄段
     *
     * @mbggenerated
     */
    private String olderAgeRange;

    /**
     * 表：reserve_orders_customer_info
     * 字段：SELF_CARES
     * 注释：老人能都自理
     *
     * @mbggenerated
     */
    private String selfCares;

    /**
     * 表：reserve_orders_customer_info
     * 字段：IS_BABY_BORN
     * 注释：宝宝是否已出生
     *
     * @mbggenerated
     */
    private String isBabyBorn;

    /**
     * 表：reserve_orders_customer_info
     * 字段：EXPECTED_BIRTH
     * 注释：预产期
     *
     * @mbggenerated
     */
    private Date expectedBirth;


    /**
     * 表：reserve_orders_customer_info
     * 字段：SERVICE_TYPE
     * 注释：服务类型
     *
     * @mbggenerated
     */
    private String serviceType;

    /**
     * 表：reserve_orders_customer_info
     * 字段：COOKING_REQIREMENTS
     * 注释：烹饪要求
     *
     * @mbggenerated
     */
    private String[] cookingReqirements;
    
    /**
     * 表：reserve_orders_customer_info
     * 字段：LANGUAGE_REQUIREMENTS
     * 注释：语言要求
     *
     * @mbggenerated
     */
    private String[] languageRequirements;

    /**
     * 表：reserve_orders_customer_info
     * 字段：PERSONALITY_REQUIREMENTS
     * 注释：性格要求
     *
     * @mbggenerated
     */
    private String[] personalityRequirements;


    /**
     * 表：reserve_orders_customer_info
     * 字段：SPECIAL_NEEDS
     * 注释：特殊需求
     *
     * @mbggenerated
     */
    private String specialNeeds;
    
    /**
     * 表：reserve_orders_customer_info
     * 字段：PET_RAISING
     * 注释：饲养宠物
     *
     * @mbggenerated
     */
    private String petRaising;
    
    /**
     * 表：orders
     * 字段：ORDER_STATUS
     * 注释：订单表中的订单状态
     *
     * @mbggenerated
     */
    private String newOrderStatus;
    
    /**
     * 表：orders
     * 字段：AMOUNT
     * 注释：订单表中的订单价格
     *
     * @mbggenerated
     */
    private BigDecimal amount;


	public String getOrderNo() {
		return orderNo;
	}


	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}


	public Integer getTenantId() {
		return tenantId;
	}


	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}


	public Integer getMemberId() {
		return memberId;
	}


	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}


	public String getMemberMobile() {
		return memberMobile;
	}


	public void setMemberMobile(String memberMobile) {
		this.memberMobile = memberMobile;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public String getMemberSex() {
		return memberSex;
	}


	public void setMemberSex(String memberSex) {
		this.memberSex = memberSex;
	}


	public Integer getStaffId() {
		return staffId;
	}


	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}


	public String getServiceItemCode() {
		return serviceItemCode;
	}


	public void setServiceItemCode(String serviceItemCode) {
		this.serviceItemCode = serviceItemCode;
	}


	public String getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


	public String getOrderTime() {
		return orderTime;
	}


	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}


	public Date getHandleOrderTime() {
		return handleOrderTime;
	}


	public void setHandleOrderTime(Date handleOrderTime) {
		this.handleOrderTime = handleOrderTime;
	}


	public String getServiceProvice() {
		return serviceProvice;
	}


	public void setServiceProvice(String serviceProvice) {
		this.serviceProvice = serviceProvice;
	}


	public String getServiceCity() {
		return serviceCity;
	}


	public void setServiceCity(String serviceCity) {
		this.serviceCity = serviceCity;
	}


	public String getServiceCounty() {
		return serviceCounty;
	}


	public void setServiceCounty(String serviceCounty) {
		this.serviceCounty = serviceCounty;
	}


	public String getServiceAddress() {
		return serviceAddress;
	}


	public void setServiceAddress(String serviceAddress) {
		this.serviceAddress = serviceAddress;
	}


	public Date getServiceStart() {
		return serviceStart;
	}


	public void setServiceStart(Date serviceStart) {
		this.serviceStart = serviceStart;
	}


	public Date getServiceEnd() {
		return serviceEnd;
	}


	public void setServiceEnd(Date serviceEnd) {
		this.serviceEnd = serviceEnd;
	}


	public Integer getSalaryMin() {
		return salaryMin;
	}


	public void setSalaryMin(Integer salaryMin) {
		this.salaryMin = salaryMin;
	}


	public Integer getSalaryMax() {
		return salaryMax;
	}


	public void setSalaryMax(Integer salaryMax) {
		this.salaryMax = salaryMax;
	}


	public String getHouseType() {
		return houseType;
	}


	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}


	public BigDecimal getHouseArea() {
		return houseArea;
	}


	public void setHouseArea(BigDecimal houseArea) {
		this.houseArea = houseArea;
	}


	public Integer getFamilyCount() {
		return familyCount;
	}


	public void setFamilyCount(Integer familyCount) {
		this.familyCount = familyCount;
	}


	public Integer getChildrenCount() {
		return childrenCount;
	}


	public void setChildrenCount(Integer childrenCount) {
		this.childrenCount = childrenCount;
	}


	public Integer getOlderCount() {
		return olderCount;
	}


	public void setOlderCount(Integer olderCount) {
		this.olderCount = olderCount;
	}


	public String getChildrenAgeRange() {
		return childrenAgeRange;
	}


	public void setChildrenAgeRange(String childrenAgeRange) {
		this.childrenAgeRange = childrenAgeRange;
	}


	public String getOlderAgeRange() {
		return olderAgeRange;
	}


	public void setOlderAgeRange(String olderAgeRange) {
		this.olderAgeRange = olderAgeRange;
	}


	public String getSelfCares() {
		return selfCares;
	}


	public void setSelfCares(String selfCares) {
		this.selfCares = selfCares;
	}


	public String getIsBabyBorn() {
		return isBabyBorn;
	}


	public void setIsBabyBorn(String isBabyBorn) {
		this.isBabyBorn = isBabyBorn;
	}


	public Date getExpectedBirth() {
		return expectedBirth;
	}


	public void setExpectedBirth(Date expectedBirth) {
		this.expectedBirth = expectedBirth;
	}


	public String getServiceType() {
		return serviceType;
	}


	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}


	public String[] getCookingReqirements() {
		return cookingReqirements;
	}


	public void setCookingReqirements(String[] cookingReqirements) {
		this.cookingReqirements = cookingReqirements;
	}


	public String[] getLanguageRequirements() {
		return languageRequirements;
	}


	public void setLanguageRequirements(String[] languageRequirements) {
		this.languageRequirements = languageRequirements;
	}


	public String[] getPersonalityRequirements() {
		return personalityRequirements;
	}


	public void setPersonalityRequirements(String[] personalityRequirements) {
		this.personalityRequirements = personalityRequirements;
	}


	public String getSpecialNeeds() {
		return specialNeeds;
	}


	public void setSpecialNeeds(String specialNeeds) {
		this.specialNeeds = specialNeeds;
	}


	public String getPetRaising() {
		return petRaising;
	}


	public void setPetRaising(String petRaising) {
		this.petRaising = petRaising;
	}


	


	public String getNewOrderStatus() {
		return newOrderStatus;
	}


	public void setNewOrderStatus(String newOrderStatus) {
		this.newOrderStatus = newOrderStatus;
	}


	public BigDecimal getAmount() {
		return amount;
	}


	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}



	
    
    
	
}
