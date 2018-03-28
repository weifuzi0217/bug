package com.bug.common.sysetem;
/**
 ********************************************************
 * @author <zhaoqingwei><|天下英雄出我辈，一入江湖岁月催|>*
 * 20182018年3月28日 上午12:49:09                       
 * ******************************************************
 * @注释：返回数据格式整理封装
 * 
 **/
public class ReObject {
//	{
//		"status":"状态码",
//		"massage":"中文说明",
//		"obj":{返回数据},
//		"":"",
//		"":""
//	}
	private String status;
	private Object obj;
	private String massage;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
	}
	
	public static ReObject returnData(String msg,String statu,Object object){
		ReObject ro = new ReObject();
		ro.setMassage(msg);
		ro.setObj(object);
		ro.setStatus(statu);
		return ro;
	}
}
