package org.example.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author os-liaolw
 * @ClassName:
 * @Description:
 * @date: 2023/2/13 19:24
 */
@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -7203083949399598804L;

    private Boolean success;

    private Integer code;

    private String message;

    private T data;

    /**
     * 成功
     */
    public static Result<Void> success() {
        Result<Void> result = new Result<>();
        result.setSuccess(Boolean.TRUE);
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMessage(ResultCode.SUCCESS.getMessage());
        return result;
    }

    /**
     * 成功，有返回数据
     */
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setSuccess(Boolean.TRUE);
        result.code = ResultCode.SUCCESS.getCode();
        result.message = ResultCode.SUCCESS.getMessage();
        result.data = data;
        return result;
    }

    /**
     * 失败
     */
    public static Result<Void> failure() {
        Result<Void> result = new Result<>();
        result.setSuccess(Boolean.FALSE);
        result.setCode(ResultCode.FAILURE.getCode());
        result.setMessage(ResultCode.FAILURE.getMessage());
        return result;
    }

    /**
     * 失败，自定义失败信息
     */
    public static Result<Void> failure(String message) {
        Result<Void> result = new Result<>();
        result.setSuccess(Boolean.FALSE);
        result.setCode(ResultCode.FAILURE.getCode());
        result.setMessage(message);
        return result;
    }

    /**
     * 失败，使用已定义枚举
     */
    public static Result failure(ResultCode resultCode) {
        Result<Void> result = new Result<>();
        result.setSuccess(Boolean.FALSE);
        result.setCode(resultCode.getCode());
        result.setMessage(resultCode.getMessage());
        return result;
    }

    @Override
    public String toString() {
        return "Result [code=" + code + ", data=" + data + ", msg=" + message + "]";
    }
}
