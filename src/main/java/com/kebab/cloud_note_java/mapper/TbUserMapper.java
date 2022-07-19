package com.kebab.cloud_note_java.mapper;

import com.kebab.cloud_note_java.pojo.TbUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author shin
* @description 针对表【tb_user】的数据库操作Mapper
* @createDate 2022-07-19 01:04:41
* @Entity com.kebab.cloud_note_java.pojo.TbUser
*/
public interface TbUserMapper extends BaseMapper<TbUser> {
    List<TbUser> getAllByUMailAndUPwd(@Param("mail") String mail, @Param("pwd") String password);
}




