package com.hsjie.takeout.employee;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Description:
 *
 * @author jiehuishun
 * @since 2024/6/13 13:48
 */
@Data
public class EmployeeDO {
    private Long id;
    private String name;
    private String username;
    private String password;
    private String phone;
    private String sex;
    private String idNumber;
    private Integer status;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Long createUser;
    private Long updateUser;
}
