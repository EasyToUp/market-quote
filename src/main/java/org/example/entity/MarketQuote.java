package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 市场报价表
 * </p>
 *
 * @author liaolw
 * @since 2023-02-14
 */
@Data
@TableName("market_quote")
@ApiModel(value = "MarketQuote对象", description = "市场报价表")
public class MarketQuote implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("曲线名称")
    private String curveName;

    @ApiModelProperty("仪器类型")
    private String instrumentType;

    @ApiModelProperty("仪器名称")
    private String instrumentName;

    @ApiModelProperty("票期")
    private String tenor;

    @ApiModelProperty("到期日")
    private String maturityDate;

    @ApiModelProperty("报价日")
    private String mHRepDate;

    @ApiModelProperty("导入时间")
    private Date insertDate;

    public MarketQuote() {
    }

    public MarketQuote(String[] arr) {
        this.curveName = arr[0];
        this.instrumentType = arr[1];
        this.instrumentName = arr[2];
        this.tenor = arr[3];
        this.maturityDate = arr[4];
        this.mHRepDate = arr[5];
    }

}
