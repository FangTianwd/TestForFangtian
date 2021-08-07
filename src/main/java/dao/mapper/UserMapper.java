package dao.mapper;

import common.GenericMapper;
import dao.model.UserDO;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author jiangshengcheng
 * @date 2021年08月07日 4:18 下午
 */
@Repository
public interface UserMapper extends GenericMapper<UserDO> {
    @Select("SELECT ID FROM testforfangtian.USER")
    List<String> listUserId();
}
