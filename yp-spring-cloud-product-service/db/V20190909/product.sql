CREATE TABLE product(
  id  varchar(36) not null PRIMARY key default uuid_generate_v4(),
  item_code varchar(50) COLLATE "default" NOT NULL,
  name varchar(100) COLLATE "default",
  band_name varchar(100) COLLATE "default",
  price numeric(18,2),
  created_by varchar(100) not null default USER,
	created_date timestamp(0) not null DEFAULT now(),
	updated_by varchar(100) not null default USER,
	updated_date timestamp(0) not null DEFAULT now()
);

COMMENT ON TABLE product IS '产品信息表';
COMMENT ON COLUMN product.id IS '主键';
COMMENT ON COLUMN product.item_code IS '产品编码';
COMMENT ON COLUMN product.name IS '产品名称';
COMMENT ON COLUMN product.band_name IS '品牌名称';
COMMENT ON COLUMN product.price IS '价格';
COMMENT ON COLUMN product.created_by IS '创建人';
COMMENT ON COLUMN product.created_date IS '创建时间';
COMMENT ON COLUMN product.updated_by IS '更新人';
COMMENT ON COLUMN product.updated_date IS '更新时间';

CREATE INDEX "idx_product_item_code" ON product USING btree ("item_code");