package com.hsjie.takeout.dto.data;

public enum ErrorCode{
    B_CUSTOMER_companyNameConflict("B_CUSTOMER_companyNameConflict", "客户公司名冲突"),
    B_EMPLOYEE_usernameNotFound("B_EMPLOYEE_usernameNotFound", "雇员用户名未找到"),
    B_EMPLOYEE_passwordNotMatch("B_EMPLOYEE_passwordNotMatch", "雇员密码不匹配");

    private final String errCode;
    private final String errDesc;

    private ErrorCode(String errCode, String errDesc) {
        this.errCode = errCode;
        this.errDesc = errDesc;
    }

    public String getErrCode() {
        return errCode;
    }

    public String getErrDesc() {
        return errDesc;
    }
}
