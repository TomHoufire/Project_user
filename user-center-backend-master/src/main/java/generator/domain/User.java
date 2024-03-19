package generator.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 用户
* @TableName user
*/
public class User implements Serializable {

    /**
    * id
    */
    @NotNull(message="[id]不能为空")
    @ApiModelProperty("id")
    private Long id;
    /**
    * 用户昵称
    */
    @Size(max= 256,message="编码长度不能超过256")
    @ApiModelProperty("用户昵称")
    @Length(max= 256,message="编码长度不能超过256")
    private String username;
    /**
    * 账号
    */
    @Size(max= 256,message="编码长度不能超过256")
    @ApiModelProperty("账号")
    @Length(max= 256,message="编码长度不能超过256")
    private String useraccount;
    /**
    * 用户头像
    */
    @Size(max= 1024,message="编码长度不能超过1024")
    @ApiModelProperty("用户头像")
    @Length(max= 1024,message="编码长度不能超过1,024")
    private String avatarurl;
    /**
    * 性别
    */
    @ApiModelProperty("性别")
    private Integer gender;
    /**
    * 密码
    */
    @NotBlank(message="[密码]不能为空")
    @Size(max= 512,message="编码长度不能超过512")
    @ApiModelProperty("密码")
    @Length(max= 512,message="编码长度不能超过512")
    private String userpassword;
    /**
    * 电话
    */
    @Size(max= 128,message="编码长度不能超过128")
    @ApiModelProperty("电话")
    @Length(max= 128,message="编码长度不能超过128")
    private String phone;
    /**
    * 邮箱
    */
    @Size(max= 512,message="编码长度不能超过512")
    @ApiModelProperty("邮箱")
    @Length(max= 512,message="编码长度不能超过512")
    private String email;
    /**
    * 状态 0 - 正常
    */
    @NotNull(message="[状态 0 - 正常]不能为空")
    @ApiModelProperty("状态 0 - 正常")
    private Integer userstatus;
    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private Date createtime;
    /**
    * 
    */
    @ApiModelProperty("")
    private Date updatetime;
    /**
    * 是否删除
    */
    @NotNull(message="[是否删除]不能为空")
    @ApiModelProperty("是否删除")
    private Integer isdelete;
    /**
    * 用户角色 0 - 普通用户 1 - 管理员
    */
    @NotNull(message="[用户角色 0 - 普通用户 1 - 管理员]不能为空")
    @ApiModelProperty("用户角色 0 - 普通用户 1 - 管理员")
    private Integer userrole;
    /**
    * 星球编号
    */
    @Size(max= 512,message="编码长度不能超过512")
    @ApiModelProperty("星球编号")
    @Length(max= 512,message="编码长度不能超过512")
    private String planetcode;

    /**
    * id
    */
    private void setId(Long id){
    this.id = id;
    }

    /**
    * 用户昵称
    */
    private void setUsername(String username){
    this.username = username;
    }

    /**
    * 账号
    */
    private void setUseraccount(String useraccount){
    this.useraccount = useraccount;
    }

    /**
    * 用户头像
    */
    private void setAvatarurl(String avatarurl){
    this.avatarurl = avatarurl;
    }

    /**
    * 性别
    */
    private void setGender(Integer gender){
    this.gender = gender;
    }

    /**
    * 密码
    */
    private void setUserpassword(String userpassword){
    this.userpassword = userpassword;
    }

    /**
    * 电话
    */
    private void setPhone(String phone){
    this.phone = phone;
    }

    /**
    * 邮箱
    */
    private void setEmail(String email){
    this.email = email;
    }

    /**
    * 状态 0 - 正常
    */
    private void setUserstatus(Integer userstatus){
    this.userstatus = userstatus;
    }

    /**
    * 创建时间
    */
    private void setCreatetime(Date createtime){
    this.createtime = createtime;
    }

    /**
    * 
    */
    private void setUpdatetime(Date updatetime){
    this.updatetime = updatetime;
    }

    /**
    * 是否删除
    */
    private void setIsdelete(Integer isdelete){
    this.isdelete = isdelete;
    }

    /**
    * 用户角色 0 - 普通用户 1 - 管理员
    */
    private void setUserrole(Integer userrole){
    this.userrole = userrole;
    }

    /**
    * 星球编号
    */
    private void setPlanetcode(String planetcode){
    this.planetcode = planetcode;
    }


    /**
    * id
    */
    private Long getId(){
    return this.id;
    }

    /**
    * 用户昵称
    */
    private String getUsername(){
    return this.username;
    }

    /**
    * 账号
    */
    private String getUseraccount(){
    return this.useraccount;
    }

    /**
    * 用户头像
    */
    private String getAvatarurl(){
    return this.avatarurl;
    }

    /**
    * 性别
    */
    private Integer getGender(){
    return this.gender;
    }

    /**
    * 密码
    */
    private String getUserpassword(){
    return this.userpassword;
    }

    /**
    * 电话
    */
    private String getPhone(){
    return this.phone;
    }

    /**
    * 邮箱
    */
    private String getEmail(){
    return this.email;
    }

    /**
    * 状态 0 - 正常
    */
    private Integer getUserstatus(){
    return this.userstatus;
    }

    /**
    * 创建时间
    */
    private Date getCreatetime(){
    return this.createtime;
    }

    /**
    * 
    */
    private Date getUpdatetime(){
    return this.updatetime;
    }

    /**
    * 是否删除
    */
    private Integer getIsdelete(){
    return this.isdelete;
    }

    /**
    * 用户角色 0 - 普通用户 1 - 管理员
    */
    private Integer getUserrole(){
    return this.userrole;
    }

    /**
    * 星球编号
    */
    private String getPlanetcode(){
    return this.planetcode;
    }

}
