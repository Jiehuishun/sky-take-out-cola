package com.hsjie.takeout.employee;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {

    EmployeeDO getByUsername(String username);
}
