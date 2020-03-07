package com.cixindata.user.mapper;

import com.cixindata.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember>{

    List<UmsMember>selectAllUser();
}
