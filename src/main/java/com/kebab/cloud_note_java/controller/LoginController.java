package com.kebab.cloud_note_java.controller;
import com.kebab.cloud_note_java.pojo.Result;
import com.kebab.cloud_note_java.pojo.TbUser;
import com.kebab.cloud_note_java.service.impl.TbUserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    TbUserServiceImpl tbUserServiceImpl;

    //日志
    private final static Logger logger = LoggerFactory.getLogger(LoginController.class);

    /**
     * 登录
     * @return
     */
    @RequestMapping("/sign_in")
    public  Result userSignIn(@Validated @RequestBody(required=true)TbUser user){
        logger.info("===userSignIn Start");
        System.out.println(user.getUMail());
        TbUser tbUserParam = user;
        //String md5Str = DigestUtils.md5DigestAsHex(tbUserParam.getUPwd().getBytes());
        TbUser tbUser = tbUserServiceImpl.query().eq("u_mail",tbUserParam.getUMail()).eq("u_pwd", user.getUPwd()).one();
        System.out.println(tbUser.getUName());
        logger.info("===userSignIn End");
        return  new Result(Result.Code.OK, null,"登录成功");
        //return Results
    }

    /**
     * 注册
     * @return
     */
    @RequestMapping("/sign_up")
    public Result userSignUp(@Validated  @RequestBody(required=true)TbUser user){
        TbUser tbUser = user;
        //密码加密 MD5
        String md5Str = DigestUtils.md5DigestAsHex(user.getUPwd().getBytes());
        Boolean rst = tbUserServiceImpl.save(tbUser);
        return  new Result();
    }
}
