package com.uu.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @desc 活跃用户
 * @author liuph
 * @date 2021/02/22 16:13
 */
@Data
public class ActiveUserDo {
    private LocalDateTime lastLoginTime;

    private Integer id;

    private Integer userId;

    private Integer province;
}
