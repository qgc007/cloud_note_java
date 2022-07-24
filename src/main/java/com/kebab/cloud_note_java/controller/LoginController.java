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
        TbUser tbUserParam = user;
        String md5Str = DigestUtils.md5DigestAsHex(tbUserParam.getUPwd().getBytes());
        TbUser tbUser = tbUserServiceImpl.query().eq("u_mail",tbUserParam.getUMail()).eq("u_pwd", md5Str).one();
        if(tbUser == null){
            return  new Result(Result.Code.FAIL, null,"密码或者邮箱错误");
        }
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
        var result = new Result();
        logger.info("===userSignUp Start");
        TbUser tbUser = user;
        if(tbUser.getULevel() == null)
            tbUser.setULevel("0"); //   管理员等级 为 9, 0级为初级用户
        //密码加密 MD5
        String md5Str = DigestUtils.md5DigestAsHex(user.getUPwd().getBytes());
        tbUser.setUPwd(md5Str);
        Boolean rst = tbUserServiceImpl.save(tbUser);
        if(rst){
            result.setResult(Result.Code.OK);
            result.setMsg("sign up success");
        }else{
            result.setResult(Result.Code.FAIL);
            result.setMsg("sign up fail");
        }
        logger.info("===userSignUp End");
        return result;
    }
}
