package com.hsjie.takeout.domain.customer.gateway;

import com.hsjie.takeout.domain.customer.Credit;

//Assume that the credit info is in another distributed Service
public interface CreditGateway {
    Credit getCredit(String customerId);
}
