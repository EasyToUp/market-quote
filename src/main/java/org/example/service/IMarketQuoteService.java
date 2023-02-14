package org.example.service;

import org.example.domain.Result;
import org.example.entity.MarketQuote;
import com.baomidou.mybatisplus.extension.service.IService;
import org.example.vo.InputVo;

/**
 * <p>
 * 市场报价表 服务类
 * </p>
 *
 * @author liaolw
 * @since 2023-02-14
 */
public interface IMarketQuoteService extends IService<MarketQuote> {

    Result handle(InputVo inputVo);
}
