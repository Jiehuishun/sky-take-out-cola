package com.hsjie.takeout.employee.executor;

import com.hsjie.takeout.heima.Result;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author jiehuishun
 * @since 2024/6/13 14:09
 */
@Component
public class EmployeeLogoutExe {
    public Result<String> execute() {
        return Result.success();
    }
}
