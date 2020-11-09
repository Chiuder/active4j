package com.active4j.web.system.wrapper;

import java.util.List;

import com.active4j.entity.base.wrapper.BaseTableWrapper;
import com.active4j.entity.system.entity.SysRoleEntity;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
public class RoleWrapper extends BaseTableWrapper<SysRoleEntity>{
	
	public RoleWrapper(List<SysRoleEntity> pageResult) {
		//父类中的方法初始化数据
		super(pageResult);
		
		//值替换
		this.getData().stream().forEach(d -> {
			if(StringUtils.isEmpty(d.getParentId())) {
				d.setParentId("-1");
			}
		});
	}

}
