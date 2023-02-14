import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;

import java.util.Collections;

/**
 * @author os-liaolw
 * @ClassName: Test_generate_code
 * @Description:
 * @date: 2023/2/8 20:02
 */
public class Test_generate_code {

    /**
     * 数据源配置
     */

    /**
     * 数据源配置
     */
    private static final DataSourceConfig.Builder DATA_SOURCE_CONFIG = new DataSourceConfig
            .Builder("jdbc:mysql://10.86.230.13:3306/fund230111?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=CTT&allowPublicKeyRetrieval=true&autoReconnect=true",
            "root",
            "Abc***123");


    public static void main(String[] args) {

        FastAutoGenerator.create(DATA_SOURCE_CONFIG)
                .globalConfig(builder -> {
                    builder.author("liaolw") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            /*.fileOverride()*/ // 覆盖已生成文件
                            .outputDir("D:\\workspace\\practice\\market-quote\\src\\main\\java"); // 指定输出目录

                })
                .packageConfig(builder -> {
                    builder.parent("org") // 设置父包名
                            .moduleName("example") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml,
                                    "D:\\workspace\\practice\\market-quote\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("MARKET_QUOTE") // 设置需要生成的表名
                            .addTablePrefix("t_"); // 设置过滤表前缀
                })
                .templateEngine(new VelocityTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
