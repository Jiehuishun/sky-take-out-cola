package com.hsjie.takeout.employee.executor;

import com.hsjie.takeout.dto.EmployeeLoginByPasswordCmd;
import com.hsjie.takeout.dto.data.EmployeeLoginDTO;
import com.hsjie.takeout.dto.data.ErrorCode;
import com.hsjie.takeout.employee.EmployeeDO;
import com.hsjie.takeout.employee.EmployeeMapper;
import com.hsjie.takeout.heima.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author jiehuishun
 * @since 2024/6/13 13:40
 */

@Component
public class EmployeeLoginCmdExe {

    @Autowired
    private EmployeeMapper employeeMapper;

    public Result<EmployeeLoginDTO> execute(EmployeeLoginByPasswordCmd employeeLoginByPasswordCmd){
        EmployeeDO byName = employeeMapper.getByUsername(employeeLoginByPasswordCmd.getUsername());
        if(byName==null){
            return Result.error(ErrorCode.B_EMPLOYEE_usernameNotFound.getErrCode());
        }
        if(!byName.getPassword().equals(employeeLoginByPasswordCmd.getPassword())){
            return Result.error(ErrorCode.B_EMPLOYEE_passwordNotMatch.getErrCode());
        }
        EmployeeLoginDTO employeeLoginDTO =  new EmployeeLoginDTO();
        employeeLoginDTO.setId(byName.getId());
        employeeLoginDTO.setName(byName.getName());
        employeeLoginDTO.setUsername(byName.getUsername());

        // TODO finish JWT
        employeeLoginDTO.setToken("AAAABBBBCCCC");
        return Result.success(employeeLoginDTO);
    }
}
