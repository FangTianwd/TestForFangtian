package manager.impl;

import dao.mapper.UserMapper;
import manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jiangshengcheng
 * @date 2021年08月07日 4:58 下午
 */
@Service
public class UserManagerImpl implements UserManager {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<String> listUserId() {
        return userMapper.listUserId();
    }
}
