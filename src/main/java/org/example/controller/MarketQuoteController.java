package org.example.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.domain.Result;
import org.example.service.IMarketQuoteService;
import org.example.vo.InputVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * <p>
 * 市场报价表 前端控制器
 * </p>
 *
 * @author liaolw
 * @since 2023-02-14
 */
@RestController
@RequestMapping("/example/marketquote")
@Api(tags = "文件输入")
public class MarketQuoteController {

    @Autowired
    private IMarketQuoteService iMarketQuoteService;

    /**
     * 从指定地址导入文件
     */
    @PostMapping(value = "/upload")
    @ApiOperation(value = "指定文件路径导入", response = Result.class)
    public Result upload(@RequestBody @Valid InputVo inputVo) {
        return iMarketQuoteService.handle(inputVo);
    }


    @GetMapping(value = "/hello")
    @ApiOperation(value = "holle")
    public String hello() {
        return "hello";
    }
}

