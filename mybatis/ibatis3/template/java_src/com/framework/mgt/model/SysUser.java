/*
 * Beijing YESWAY Information Technology Co,Ltd.
 * All rights reserved.
 * 北京九五智驾信息技术股份有限公司
 * <p>ParamsDai.java</p>
 */

package com.framework.mgt.model;
import com.framework.mgt.model.BaseModel;


public class SysUser extends BaseModel{
 
	private static final long serialVersionUID = 1L;

	/**
     * @备注:用户编号     
     * @字段:id VARCHAR(64)  
     */	
	private java.lang.String id;

	/**
     * @备注:用户姓名     
     * @字段:name VARCHAR(64)  
     */	
	private java.lang.String name;

	/**
     * @备注:电子邮件     
     * @字段:email VARCHAR(64)  
     */	
	private java.lang.String email;

	/**
     * @备注:密码     
     * @字段:password VARCHAR(64)  
     */	
	private java.lang.String password;

	/**
     * @备注:登录名     
     * @字段:login_name VARCHAR(64)  
     */	
	private java.lang.String loginName;

	/**
     * @备注:电话     
     * @字段:phone VARCHAR(64)  
     */	
	private java.lang.String phone;

	/**
     * @备注:创建者     
     * @字段:create_by VARCHAR(64)  
     */	
	private java.lang.String createBy;

	/**
     * @备注:创建时间     
     * @字段:create_date DATETIME(19)  
     */	
	private java.util.Date createDate;

	/**
     * @备注:更新者     
     * @字段:update_by VARCHAR(64)  
     */	
	private java.lang.String updateBy;

	/**
     * @备注:更新时间     
     * @字段:update_date DATETIME(19)  
     */	
	private java.util.Date updateDate;

	/**
     * @备注:备注信息     
     * @字段:remarks VARCHAR(255)  
     */	
	private java.lang.String remarks;

	/**
     * @备注:删除标记     
     * @字段:del_flag CHAR(1)  
     */	
	private java.lang.String delFlag;
	public SysUser(){
	}

	public SysUser(
		java.lang.String id
	){
		this.id = id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}
	 
	public java.lang.String getId() {
		return this.id;
	}
	public void setName(java.lang.String name) {
		this.name = name;
	}
	 
	public java.lang.String getName() {
		return this.name;
	}
	public void setEmail(java.lang.String email) {
		this.email = email;
	}
	 
	public java.lang.String getEmail() {
		return this.email;
	}
	public void setPassword(java.lang.String password) {
		this.password = password;
	}
	 
	public java.lang.String getPassword() {
		return this.password;
	}
	public void setLoginName(java.lang.String loginName) {
		this.loginName = loginName;
	}
	 
	public java.lang.String getLoginName() {
		return this.loginName;
	}
	public void setPhone(java.lang.String phone) {
		this.phone = phone;
	}
	 
	public java.lang.String getPhone() {
		return this.phone;
	}
	public void setCreateBy(java.lang.String createBy) {
		this.createBy = createBy;
	}
	 
	public java.lang.String getCreateBy() {
		return this.createBy;
	}
	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}
	 
	public java.util.Date getCreateDate() {
		return this.createDate;
	}
	 
	public void setUpdateBy(java.lang.String updateBy) {
		this.updateBy = updateBy;
	}
	 
	public java.lang.String getUpdateBy() {
		return this.updateBy;
	}
	public void setUpdateDate(java.util.Date updateDate) {
		this.updateDate = updateDate;
	}
	 
	public java.util.Date getUpdateDate() {
		return this.updateDate;
	}
	 
	public void setRemarks(java.lang.String remarks) {
		this.remarks = remarks;
	}
	 
	public java.lang.String getRemarks() {
		return this.remarks;
	}
	public void setDelFlag(java.lang.String delFlag) {
		this.delFlag = delFlag;
	}
	 
	public java.lang.String getDelFlag() {
		return this.delFlag;
	}
}
