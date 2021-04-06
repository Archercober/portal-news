package com.portal.user.service;

import com.portal.utils.PagedGridResult;

import java.util.Date;

public interface AppUserMngService {

    /**
     * 查询所有用户列表
     */
    public PagedGridResult queryAllUserList(String nickname,
                                            Integer status,
                                            Date startDate,
                                            Date endDate,
                                            Integer page,
                                            Integer pageSize);

    /**
     * 冻结用户账号，或者解除冻结状态
     */
    public void freezeUserOrNot(String userId, Integer doStatus);

}
