package org.example.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.domain.Result;
import org.example.entity.MarketQuote;
import org.example.mapper.MarketQuoteMapper;
import org.example.service.IMarketQuoteService;
import org.example.vo.InputVo;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Date;

/**
 * <p>
 * 市场报价表 服务实现类
 * </p>
 *
 * @author liaolw
 * @since 2023-02-14
 */
@Service
public class MarketQuoteServiceImpl extends ServiceImpl<MarketQuoteMapper, MarketQuote> implements IMarketQuoteService {

    public static final String separate = ",";

    @Override
    public Result handle(InputVo inputVo) {
        String fullPath = inputVo.getFullPath();
        try {
            FileInputStream inputStream = new FileInputStream(fullPath);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = "";
            Boolean skipFirstLine = true;//跳过第一行
            Date insertDate = new Date();
            while ((line = bufferedReader.readLine()) != null) {
                if (skipFirstLine) {
                    skipFirstLine = false;
                    continue;
                }
                if (StrUtil.isNotEmpty(line)) {
                    String[] datas = StrUtil.splitToArray(line, separate);
                    MarketQuote marketQuote = new MarketQuote(datas);
                    marketQuote.setInsertDate(insertDate);
                    this.save(marketQuote);
                }
            }
        } catch (IOException e) {
            log.error("系统异常：", e);
            throw new RuntimeException(e);
        }
        return Result.success();
    }
}
