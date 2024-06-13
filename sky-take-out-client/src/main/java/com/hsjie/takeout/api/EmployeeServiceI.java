package com.hsjie.takeout.api;

import com.hsjie.takeout.dto.EmployeeLoginByPasswordCmd;

import com.hsjie.takeout.dto.data.EmployeeLoginDTO;
import com.hsjie.takeout.heima.Result;

public interface EmployeeServiceI {
    Result<EmployeeLoginDTO> login(EmployeeLoginByPasswordCmd employeeLoginByPasswordCmd);

    Result<String> logout();
}
