CREATE TABLE user(
  id  varchar(36) not null PRIMARY key default uuid_generate_v4(),
  user_name varchar(50) COLLATE "default" NOT NULL,
  pass_word varchar(100) COLLATE "default",
  contact varchar(50) COLLATE "default",
  created_by varchar(100) not null default USER,
	created_date timestamp(0) not null DEFAULT now(),
	updated_by varchar(100) not null default USER,
	updated_date timestamp(0) not null DEFAULT now()
);

COMMENT ON TABLE public.user IS '用户信息表';
COMMENT ON COLUMN public.user.id IS '主键';
COMMENT ON COLUMN public.user.user_name IS '用户名';
COMMENT ON COLUMN public.user.pass_word IS '密码';
COMMENT ON COLUMN public.user.contact IS '联系方式';
COMMENT ON COLUMN public.user.created_by IS '创建人';
COMMENT ON COLUMN public.user.created_date IS '创建时间';
COMMENT ON COLUMN public.user.updated_by IS '更新人';
COMMENT ON COLUMN public.user.updated_date IS '更新时间';