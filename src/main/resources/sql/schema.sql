CREATE TABLE IF NOT EXISTS MESSAGES (
  ID                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
  TEXT                   VARCHAR      NOT NULL
);


CREATE TABLE IF NOT EXISTS users (
  ID                VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
  EMAIL             VARCHAR      NOT NULL ,
  NAME              VARCHAR      NOT NULL,
  PASSWORD          VARCHAR      NOT NULL
);

CREATE TABLE IF NOT EXISTS TASK_LIST_TITLE (
  ID                    VARCHAR(60)     DEFAULT RANDOM_UUID() PRIMARY KEY,
  TASK_LIST_TITLE       VARCHAR         NOT NULL ,
  USER_ID               VARCHAR         NOT NULL,
  FOREIGN KEY (USER_ID)REFERENCES users(id)
);

CREATE TABLE IF NOT EXISTS TASK (
  ID                    VARCHAR(60)   DEFAULT RANDOM_UUID() PRIMARY KEY,
  TASK_LIST_ID          VARCHAR       NOT NULL ,
  TITLE                 VARCHAR       NOT NULL,
  DETAILS               VARCHAR,
  COMPLETION_DATE       NUMERIC       NOT NULL,
  IS_COMPLETE           NUMERIC       NOT NULL,
  CREATED_AT            NUMERIC       NOT NULL,
  FOREIGN KEY (TASK_LIST_ID)REFERENCES TASK_LIST_TITLE(ID)
);




