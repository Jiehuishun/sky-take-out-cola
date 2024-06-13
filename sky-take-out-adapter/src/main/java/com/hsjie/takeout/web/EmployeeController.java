package com.hsjie.takeout.web;

import com.hsjie.takeout.api.EmployeeServiceI;
import com.hsjie.takeout.dto.EmployeeLoginByPasswordCmd;
import com.hsjie.takeout.dto.data.EmployeeLoginDTO;
import com.hsjie.takeout.heima.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author jiehuishun
 * @since 2024/6/13 03:29
 */
@RestController()
@RequestMapping("/admin/employee")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeServiceI employeeServiceI;


    @PostMapping("/login")
    public Result<EmployeeLoginDTO> login(@RequestBody EmployeeLoginByPasswordCmd employeeLoginByPasswordCmd) {
        return employeeServiceI.login(employeeLoginByPasswordCmd);
    }

    @PostMapping("/logout")
    public Result<String> logout(){
        return employeeServiceI.logout();
    }
}
