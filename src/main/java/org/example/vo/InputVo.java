package org.example.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author os-liaolw
 * @ClassName: InputVo
 * @Description:
 * @date: 2023/2/13 19:35
 */
@Data
public class InputVo {

    @NotEmpty(message = "文件路径不能为空")
    @ApiModelProperty(value = "绝对路径", required = true,example = "D:/workspace/practice/market-quote/src/main/resources/market_quote.txt")
    private String fullPath;
}
