package com.hsjie.takeout.dto.data;

import lombok.Data;

/**
 * Description:
 *
 * @author jiehuishun
 * @since 2024/6/13 03:20
 */
@Data
public class EmployeeLoginDTO {
    private Long id;
    private String username;
    private String name;
    private String token;
}
