package com.portal.user.service;

import com.portal.pojo.AppUser;
import com.portal.pojo.bo.UpdateUserInfoBO;
import com.portal.pojo.vo.PublisherVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    /**
     * 判断用户是否存在，如果存在返回user信息
     */
    public AppUser queryMobileIsExist(String mobile);

    /**
     * 创建用户，新增用户记录到数据库
     */
    public AppUser createUser(String mobile);

    /**
     * 根据用户主键id查询用户信息
     */
    public AppUser getUser(String userId);

    /**
     * 用户修改信息，完善资料，并且激活
     */
    public void updateUserInfo(UpdateUserInfoBO updateUserInfoBO);

    /**
     * 根据用户id查询用户
     */
    public List<PublisherVO> getUserList(List<String> userIdList);
}
