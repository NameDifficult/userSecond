package org.fu.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.fu.user.mapper.UserMapper;
import org.fu.user.po.UserPO;
import org.fu.user.service.api.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserPO> implements UserService {

    @Override
    public Boolean insertUser(String userName, String userAcct) {
        if (userName == null || userName.length() < 1 || userAcct == null || userAcct.length() < 1){
            return false;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String createTime = simpleDateFormat.format(new Date());
        UserPO userPO = new UserPO(userName,userAcct,createTime);
        return save(userPO);
    }
}
