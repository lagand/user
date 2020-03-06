package com.cloud.user.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@TableName("users.user")
public class User extends Model<User> {

    @TableId(value="id", type= IdType.AUTO)
    private long id;

    private String No;

    @TableField("user_name")
    private String userName;

    private String password;

    private String salt;
}
