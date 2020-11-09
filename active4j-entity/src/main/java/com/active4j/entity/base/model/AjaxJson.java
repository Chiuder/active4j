package com.active4j.entity.base.model;

import java.util.Map;

import com.alibaba.fastjson.JSON;

import lombok.Getter;
import lombok.Setter;

/**
 * ajax json 公共返回结果
 * @author teli_
 *
 */
@Getter
@Setter
public class AjaxJson {

	private boolean success = true;// 是否成功
	private String msg = "操作成功";// 提示信息
	private Object obj = null;// 其他信息
	private Map<String, Object> attributes;// 其他参数

	/**
	 * 转为json字符串
	 * 
	 * @return
	 */
//	public String getJsonStr() {
//		JSONObject obj = new JSONObject();
//		obj.put("success", this.isSuccess());
//		obj.put("msg", this.getMsg());
//		obj.put("obj", this.obj);
//		obj.put("attributes", this.attributes);
//		return obj.toJSONString();
//	}
	
	
	/**
	 * 直接返回错误信息
	 * @param msg
	 * @return
	 */
	public static String getErrorStr(String msg) {
		AjaxJson j = new AjaxJson();
		j.setSuccess(false);
		j.setMsg(msg);
		
		return JSON.toJSONString(j);
	}
}
