package com.cixindata.user.service;

import com.cixindata.user.bean.UmsMember;
import com.cixindata.user.bean.UmsMemberReceiveAddress;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserService {

    List<UmsMember>getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
