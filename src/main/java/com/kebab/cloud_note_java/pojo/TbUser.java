package com.kebab.cloud_note_java.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName tb_user
 */
@TableName(value ="tb_user")
@Data
public class TbUser implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Object uId;

    /**
     * 登录邮箱
     */
    private String uMail;

    /**
     * 用户名
     */
    private String uName;

    /**
     * 密码
     */
    private String uPwd;

    /**
     * 级别
     */
    private String uLevel;

    /**
     * 性别
     */
    private String uGendar;

    /**
     * 地址
     */
    private String uAddress;

    /**
     * 电话
     */
    private String uPhone;

    /**
     * 头像
     */
    private String uAvatar;

    /**
     * 登录时间
     */
    private Date uCreateTime;

    /**
     * 修改时间
     */
    private Date uUpdateTime;

    /**
     * 删除标记
     */
    private String uDelFlag;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

//    @Override
//    public boolean equals(Object that) {
//        if (this == that) {
//            return true;
//        }
//        if (that == null) {
//            return false;
//        }
//        if (getClass() != that.getClass()) {
//            return false;
//        }
//        TbUser other = (TbUser) that;
//        return (this.getuId() == null ? other.getuId() == null : this.getuId().equals(other.getuId()))
//            && (this.getuMail() == null ? other.getuMail() == null : this.getuMail().equals(other.getuMail()))
//            && (this.getuName() == null ? other.getuName() == null : this.getuName().equals(other.getuName()))
//            && (this.getuPwd() == null ? other.getuPwd() == null : this.getuPwd().equals(other.getuPwd()))
//            && (this.getuLevel() == null ? other.getuLevel() == null : this.getuLevel().equals(other.getuLevel()))
//            && (this.getuGendar() == null ? other.getuGendar() == null : this.getuGendar().equals(other.getuGendar()))
//            && (this.getuAddress() == null ? other.getuAddress() == null : this.getuAddress().equals(other.getuAddress()))
//            && (this.getuPhone() == null ? other.getuPhone() == null : this.getuPhone().equals(other.getuPhone()))
//            && (this.getuAvatar() == null ? other.getuAvatar() == null : this.getuAvatar().equals(other.getuAvatar()))
//            && (this.getuCreateTime() == null ? other.getuCreateTime() == null : this.getuCreateTime().equals(other.getuCreateTime()))
//            && (this.getuUpdateTime() == null ? other.getuUpdateTime() == null : this.getuUpdateTime().equals(other.getuUpdateTime()))
//            && (this.getuDelFlag() == null ? other.getuDelFlag() == null : this.getuDelFlag().equals(other.getuDelFlag()));
//    }

//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((getuId() == null) ? 0 : getuId().hashCode());
//        result = prime * result + ((getuMail() == null) ? 0 : getuMail().hashCode());
//        result = prime * result + ((getuName() == null) ? 0 : getuName().hashCode());
//        result = prime * result + ((getuPwd() == null) ? 0 : getuPwd().hashCode());
//        result = prime * result + ((getuLevel() == null) ? 0 : getuLevel().hashCode());
//        result = prime * result + ((getuGendar() == null) ? 0 : getuGendar().hashCode());
//        result = prime * result + ((getuAddress() == null) ? 0 : getuAddress().hashCode());
//        result = prime * result + ((getuPhone() == null) ? 0 : getuPhone().hashCode());
//        result = prime * result + ((getuAvatar() == null) ? 0 : getuAvatar().hashCode());
//        result = prime * result + ((getuCreateTime() == null) ? 0 : getuCreateTime().hashCode());
//        result = prime * result + ((getuUpdateTime() == null) ? 0 : getuUpdateTime().hashCode());
//        result = prime * result + ((getuDelFlag() == null) ? 0 : getuDelFlag().hashCode());
//        return result;
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uId=").append(uId);
        sb.append(", uMail=").append(uMail);
        sb.append(", uName=").append(uName);
        sb.append(", uPwd=").append(uPwd);
        sb.append(", uLevel=").append(uLevel);
        sb.append(", uGendar=").append(uGendar);
        sb.append(", uAddress=").append(uAddress);
        sb.append(", uPhone=").append(uPhone);
        sb.append(", uAvatar=").append(uAvatar);
        sb.append(", uCreateTime=").append(uCreateTime);
        sb.append(", uUpdateTime=").append(uUpdateTime);
        sb.append(", uDelFlag=").append(uDelFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}