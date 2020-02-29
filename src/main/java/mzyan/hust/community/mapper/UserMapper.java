package mzyan.hust.community.mapper;

import mzyan.hust.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by mzYan on 2020-02-29 19:15
 */
@Mapper
public interface UserMapper {

    @Insert("insert into user (name, accountId, token, gmtCreate, gmtModified) values (#{name}, #{accountId}, #{token}, #{gmtCreate}, #{gmtModified})")
    void insert(User user);
}
