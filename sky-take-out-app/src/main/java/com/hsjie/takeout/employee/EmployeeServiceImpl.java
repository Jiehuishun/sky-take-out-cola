package com.hsjie.takeout.employee;

import com.hsjie.takeout.api.EmployeeServiceI;
import com.hsjie.takeout.dto.EmployeeLoginByPasswordCmd;

import com.hsjie.takeout.dto.data.EmployeeLoginDTO;
import com.hsjie.takeout.employee.executor.EmployeeLoginCmdExe;
import com.hsjie.takeout.employee.executor.EmployeeLogoutExe;
import com.hsjie.takeout.heima.Result;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author jiehuishun
 * @since 2024/6/13 13:27
 */
@Service
public class EmployeeServiceImpl implements EmployeeServiceI {

    @Resource
    EmployeeLoginCmdExe employeeLoginCmdExe;

    @Resource
    EmployeeLogoutExe employeeLogoutExe;

    @Override
    public Result<EmployeeLoginDTO> login(EmployeeLoginByPasswordCmd employeeLoginByPasswordCmd) {
        return employeeLoginCmdExe.execute(employeeLoginByPasswordCmd);
    }

    @Override
    public Result<String> logout() {
        return employeeLogoutExe.execute();
    }
}
