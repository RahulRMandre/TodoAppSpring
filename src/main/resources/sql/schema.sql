CREATE TABLE IF NOT EXISTS messages (
  id                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
  text                   VARCHAR      NOT NULL
);


CREATE TABLE IF NOT EXISTS users (
  id                 VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
  email             VARCHAR      NOT NULL ,
  name              VARCHAR      NOT NULL,
  password          VARCHAR      NOT NULL
);

CREATE TABLE IF NOT EXISTS TASK_LIST_TITLE (
  ID                 VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
  TASK_LIST_TITLE      VARCHAR      NOT NULL ,
  USER_ID            VARCHAR       NOT NULL,
  FOREIGN KEY (USER_ID)REFERENCES users(id)
);


