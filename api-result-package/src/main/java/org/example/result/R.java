package org.example.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.example.enums.ApiCode;

import java.io.Serializable;

@Data//lombok注解
@JsonInclude(JsonInclude.Include.NON_NULL)//jackson注解,表示属性为null时就不序列化该属性
public class R<T> implements Serializable {

    private int code;

    private T data;

    private String message = "";

    public static R<?> success(){
        R r = new R();
        r.code = ApiCode.OK.getCode();
        return r;
    }

    public static<T> R<T> success(T obj){
        R<T> r = new R<>();
        r.code = ApiCode.OK.getCode();
        r.data = obj;
        return r;
    }

    public static<T> R<T> error(){
        R<T> r = new R<>();
        r.code = ApiCode.ERROR.getCode();
        return r;
    }

    public static<T> R<T> error(String message){
        R<T> r = new R<>();
        r.code = ApiCode.ERROR.getCode();
        r.message = message;
        return r;
    }

    public static<T> R<T> error(ApiCode apiCode){
        R<T> r = new R<>();
        r.code = apiCode.getCode();
        r.message = apiCode.getMessage();
        return r;
    }

    public static<T> R<T> error(ApiCode apiCode,String message){
        R<T> r = new R<>();
        r.code = apiCode.getCode();
        r.message = message;
        return r;
    }

}