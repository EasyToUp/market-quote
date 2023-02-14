package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author os-liaolw
 * @ClassName:
 * @Description:
 * @date: 2023/2/13 19:24
 */
@Getter
@AllArgsConstructor
public enum ResultCode {

    //成功提示码
    SUCCESS(20000, "成功"),

    //自定义失败信息
    FAILURE(50000, "失败"),

    ;


    private final Integer code;
    private final String message;
}
