package com.framework.mgt.service.impl; 

import com.framework.mgt.service.SysUserService;
import org.springframework.stereotype.Service;
import com.framework.mgt.entity.SysUser;

/**
 *  基本CURD操作在MybatisBaseServiceImpl中实现
 *  否则自行声明接口，实现方法
 */
@Service
public class SysUserServiceImpl extends MybatisBaseServiceImpl<SysUser, java.lang.String> implements SysUserService { 

}
