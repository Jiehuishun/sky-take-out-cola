package com.hsjie.takeout.domain.customer.gateway;

import com.hsjie.takeout.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
