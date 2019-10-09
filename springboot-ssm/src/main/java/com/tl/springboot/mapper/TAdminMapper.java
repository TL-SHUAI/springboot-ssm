package com.tl.springboot.mapper;

import com.tl.springboot.pojo.TAdmin;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author tanglei
 * @date 2019/9/18  19:09
 */
//@Mapper
public interface TAdminMapper {

    /**
     *
     * 查询管理员
     * @return
     */
    @Select("select * from t_admin")
    List<TAdmin> listAdmins();

    /**
     * 根据id查询管理员
     * @param id
     * @return
     */
    @Select("select * from t_admin where id = #{id}")
    TAdmin getAdminById(Integer id);

    /**
     * 添加用户
     * @param admin
     */
    @Insert("insert into t_admin(loginacct,username,userpswd,email) values(#{loginacct},#{username},#{userpswd},#{email}) ")
    void saveAdmin(TAdmin admin);

    /**
     * 修改用户
     * @param admin
     */
    @Update("update t_admin set loginacct = #{loginacct},username=#{username} where id = #{id}")
    void updateAdmin(TAdmin admin);

    /**
     * 根据id删除用户
     * @param id
     */
    @Delete("delete from t_admin where id = #{id}")
    void deleteAdminById(Integer id);


}