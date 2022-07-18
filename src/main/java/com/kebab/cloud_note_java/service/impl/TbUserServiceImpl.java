package com.kebab.cloud_note_java.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kebab.cloud_note_java.pojo.TbUser;
import com.kebab.cloud_note_java.service.TbUserService;
import com.kebab.cloud_note_java.mapper.TbUserMapper;
import org.springframework.stereotype.Service;

/**
* @author shin
* @description 针对表【tb_user】的数据库操作Service实现
* @createDate 2022-07-19 01:04:41
*/
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser>
    implements TbUserService{

}




