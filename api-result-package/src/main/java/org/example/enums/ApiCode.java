package org.example.enums;

public enum ApiCode {

    OK(1000,"SUCCESS"),
    ERROR(2000,"Error"),

    PARAM_ERROR(2001,"parameters error"),

    EMAIL_FORMATTER_ERROR(2002,"邮箱格式错误"),
    //...
    ;

    private int code;

    private String message;

    ApiCode(int code,String message){
        this.code = code;
        this.message = message;
    }


    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
