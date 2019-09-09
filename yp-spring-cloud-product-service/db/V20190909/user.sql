CREATE TABLE "public"."ecif_appid_callback_info" (
"id" varchar(36) COLLATE "default" DEFAULT uuid_generate_v4() NOT NULL,
"appid" varchar(50) COLLATE "default" NOT NULL,
"agency_enum_name" varchar(100) COLLATE "default",
"agency_com_name" varchar(100) COLLATE "default",
"agency_com_code" varchar(100) COLLATE "default",
"url" varchar(200) COLLATE "default" NOT NULL,
"created_by" varchar(50) COLLATE "default" NOT NULL,
"created_date" timestamp(0) DEFAULT now() NOT NULL,
"updated_by" varchar(50) COLLATE "default" NOT NULL,
"updated_date" timestamp(0) DEFAULT now() NOT NULL,
"business_type" varchar(30) COLLATE "default",
CONSTRAINT "ecif_appid_callback_info_pkey" PRIMARY KEY ("id")
)
WITH (OIDS=FALSE)
;

ALTER TABLE "public"."ecif_appid_callback_info" OWNER TO "orderdata";

COMMENT ON TABLE "public"."ecif_appid_callback_info" IS '通知各系统URL';

COMMENT ON COLUMN "public"."ecif_appid_callback_info"."id" IS 'id';

COMMENT ON COLUMN "public"."ecif_appid_callback_info"."appid" IS 'appid';

COMMENT ON COLUMN "public"."ecif_appid_callback_info"."agency_enum_name" IS '枚举名称';

COMMENT ON COLUMN "public"."ecif_appid_callback_info"."agency_com_name" IS '名称';

COMMENT ON COLUMN "public"."ecif_appid_callback_info"."agency_com_code" IS '编码';

COMMENT ON COLUMN "public"."ecif_appid_callback_info"."url" IS '回调链接';

COMMENT ON COLUMN "public"."ecif_appid_callback_info"."created_by" IS '创建人';

COMMENT ON COLUMN "public"."ecif_appid_callback_info"."created_date" IS '创建时间';

COMMENT ON COLUMN "public"."ecif_appid_callback_info"."updated_by" IS '更新人';

COMMENT ON COLUMN "public"."ecif_appid_callback_info"."updated_date" IS '更新时间';

COMMENT ON COLUMN "public"."ecif_appid_callback_info"."business_type" IS '业务类型';



CREATE INDEX "idx_ecif_appid_callback_url_agency_com_code" ON "public"."ecif_appid_callback_info" USING btree ("agency_com_code");

CREATE INDEX "idx_ecif_appid_callback_url_appid" ON "public"."ecif_appid_callback_info" USING btree ("appid");