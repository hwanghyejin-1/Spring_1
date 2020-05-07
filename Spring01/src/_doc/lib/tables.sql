CREATE TABLE str_product(
   PNO NUMBER NULL,
   TITLE varchar2(200) NOT NULL,
   WRITER varchar2(100) NOT NULL,
   CONTENT varchar2(2000) NOT NULL,
   REG8 DATE DEFAULT sysdate,
   MODD8 DATE DEFAULT sysdate,
   READCOUNT NUMBER DEFAULT 0,
   IMGFILE VARCHAR2(2000)
);

ALTER TABLE STR_PRODUCT
ADD CONSTRAINT STR_PRODUCT_PK PRIMARY KEY(PNO)
ENABLE;

CREATE SEQUENCE SEQENCE_PRODUCT INCREMENT BY 1 MINVALUE 0 NOCACHE NOORDER;