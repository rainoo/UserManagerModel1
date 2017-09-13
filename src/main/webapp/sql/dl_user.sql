-- ----------------------------
-- Table structure for dl_user
-- ----------------------------
DROP TABLE IF EXISTS `dl_user`;
CREATE TABLE `dl_user` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `USERNAME` varchar(32) NOT NULL,
  `PASSWORD` varchar(255) NOT NULL,
  `NAME` varchar(50) DEFAULT NULL,
  `MOBILE` varchar(20) DEFAULT NULL,
  `EMAIL` varchar(50) DEFAULT NULL,
  `IDCARD` varchar(20) DEFAULT NULL,
  `DELFLG` varchar(1) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
SET FOREIGN_KEY_CHECKS=1;