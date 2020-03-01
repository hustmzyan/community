package mzyan.hust.community.mapper;

import mzyan.hust.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by mzYan on 2020-02-29 19:15
 */
@Mapper
public interface UserMapper {

    @Insert("insert into user (name, accountId, token, gmtCreate, gmtModified) values (#{name}, #{accountId}, #{token}, #{gmtCreate}, #{gmtModified})")
    void insert(User user);

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);
}
