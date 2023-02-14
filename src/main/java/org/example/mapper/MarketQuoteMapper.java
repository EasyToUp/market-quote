package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.entity.MarketQuote;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 市场报价表 Mapper 接口
 * </p>
 *
 * @author liaolw
 * @since 2023-02-14
 */
@Mapper
public interface MarketQuoteMapper extends BaseMapper<MarketQuote> {

}
