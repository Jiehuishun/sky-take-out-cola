package com.hsjie.takeout.dto;

import com.alibaba.cola.dto.Query;
import lombok.Data;

/**
 * Description:
 *
 * @author jiehuishun
 * @since 2024/6/13 03:28
 */
@Data
public class EmployeeLoginByPasswordCmd{
    private String username;
    private String password;
}
