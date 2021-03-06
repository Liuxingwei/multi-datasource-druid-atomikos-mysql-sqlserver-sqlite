package cn.liuxingwei.multidatasource.mapper.sqlite.master;

import cn.liuxingwei.multidatasource.domain.sqlite.SqliteUserDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface SqliteMasterUserMapper {
    @Select("SELECT * FROM user WHERE user_id = #{userId}")
    SqliteUserDomain getUserByUserId(Integer userId);

    @Select("SELECT * FROM user WHERE user_name = #{userName}")
    SqliteUserDomain getUserByUserName(String userName);
}
