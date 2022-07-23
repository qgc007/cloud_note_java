package com.kebab.cloud_note_java.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import com.github.jeffreyning.mybatisplus.anno.MppMultiId;
import com.github.jeffreyning.mybatisplus.conf.EnableMPP;
import lombok.Data;

/**
 * 用户博客
 * @TableName tb_user_blog
 */
@TableName(value ="tb_user_blog")
@Data
public class TbUserBlog implements Serializable {
    /**
     * user id
     */
    @TableId(type = IdType.INPUT)
    @MppMultiId
    private Object uId;

    /**
     * blog id
     */
    @TableId(type = IdType.INPUT)
    @MppMultiId
    private String bId;

    /**
     * blog 标题
     */
    private String bTitle;

    /**
     * blog 内容链接
     */
    private String bTextLink;

    /**
     * 推荐级别
     */
    private String bRecLevel;

    /**
     * 被点赞数
     */
    private Integer bLikeNum;

    /**
     * 管理员推荐
     */
    private Integer bRecAdmin;

    /**
     * 删除标记
     */
    private String bDelFlag;

    /**
     * 创建时间
     */
    private Date bCreateTime;

    /**
     * 修改时间
     */
    private Date bUpdateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}