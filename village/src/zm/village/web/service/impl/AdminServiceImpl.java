package zm.village.web.service.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zm.village.dao.Admin;
import zm.village.service.AdminService;


/**
* @ClassName: AdminServiceImpl.java
* @Description: 管理员逻辑实现类
* @version: v1.0.0
* @author: 陈光磊
* @date: 2018年7月21日 下午8:09:53 
 */
@Service
public class AdminServiceImpl implements AdminService{
    
	@Autowired
	private zm.village.web.mapper.AdminMapper mapper;
	/* 管理员登录实现方法
	 * @see zm.village.service.AdminService#login(zm.village.dao.Admin)
	 */
	@Override
	public boolean login(Admin vo) {
		Admin admin;
		Map<String,String> map = new HashMap<>();
		map.put("type", vo.getType().toString());
		map.put("name", vo.getUsername());
		if((admin = mapper.selectByUsername(map))==null) {
			return false;
		}else if(admin.getPassword().equals(vo.getPassword())&&admin.getType().equals(vo.getType())) {
			return true;
		}
		return false;
	}

	/* 主要用来修改管理员密码
	 * @see zm.village.service.AdminService#changeSelect(zm.village.dao.Admin)
	 */
	@Override
	public int changeSelect(Admin vo) {
		return mapper.updateByPrimaryKeySelective(vo);
	}

	/* 根据类型选取相应管理员
	 * @see zm.village.service.AdminService#getByType(java.lang.Integer)
	 */
	@Override
	public List<Admin> getByType(Integer type) {
		return mapper.selectByType(type);
	}

	/* (non-Javadoc)
	 * @see zm.village.service.AdminService#deleteMany(java.lang.Integer[])
	 */
	@Override
	public int deleteMany(Integer[] id) {
		for (Integer integer : id) {
			mapper.deleteByPrimaryKey(integer);
		}
		return id.length;
	}

}
