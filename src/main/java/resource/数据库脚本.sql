DROP TABLE member PURGE;

CREATE TABLE member(
  mid   VARCHAR2(50),
  name  VARCHAR2(50),
  age   NUMBER(3),
  birthday  DATE,
  sex   VARCHAR2(10),
  note  CLOB,
  CONSTRAINT pk_mid PRIMARY KEY(mid)
);