package com.hsjie.takeout.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.hsjie.takeout.dto.CustomerAddCmd;
import com.hsjie.takeout.dto.CustomerListByNameQry;
import com.hsjie.takeout.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
