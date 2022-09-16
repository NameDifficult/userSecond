package org.fu.user.service.api;

import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;
import org.fu.user.po.UserPO;

public interface UserService extends IService<UserPO> {

    /**
     *  添加用户
     * @param userName 用户名
     * @param userAcct 用户昵称
     * @return true:保存成功      false:保存失败
     */
    Boolean insertUser(String userName , String userAcct);

}
