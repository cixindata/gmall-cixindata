package com.cixindata.user.service.impl;

import com.cixindata.user.bean.UmsMember;
import com.cixindata.user.bean.UmsMemberReceiveAddress;
import com.cixindata.user.mapper.UmsMemberReceiveAddressMapper;
import com.cixindata.user.mapper.UserMapper;
import com.cixindata.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
//        UmsMemberReceiveAddress umsMemberReceiveAddress=new UmsMemberReceiveAddress();
//        umsMemberReceiveAddress.setMemberId(menberId);
//        List<UmsMemberReceiveAddress>umsMemberReceiveAddresseslist=umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);


        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId", memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(example);
        return umsMemberReceiveAddresses;
    }
}
