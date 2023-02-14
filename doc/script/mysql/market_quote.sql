--DROP TABLE IF EXISTS market_quote;
CREATE TABLE IF NOT EXISTS MARKET_QUOTE (
  CURVE_NAME varchar(100) NOT NULL COMMENT '曲线名称',
  INSTRUMENT_TYPE varchar(20) NOT NULL COMMENT '仪器类型',
  INSTRUMENT_NAME varchar(100) NOT NULL COMMENT '仪器名称',
  TENOR varchar(50) NOT NULL COMMENT '票期',
  MATURITY_DATE varchar(10) NOT NULL COMMENT '到期日',
  M_H_REP_DATE varchar(10) NOT NULL COMMENT '报价日',
  INSERT_DATE DATE NOT NULL COMMENT '导入时间',
  INDEX(INSERT_DATE)
)   COMMENT='市场报价表';
