package p13.userinfo.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import p13.domain.userinfo.UserInfo;
import p13.domain.userinfo.dao.UserInfoDao;
import p13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import p13.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("db.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String dbType = prop.getProperty("DBTYPE");
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("12345");
		userInfo.setPasswd("!@#$%");
		userInfo.setUserName("ÀÌ¼ø½Å");
		UserInfoDao userInfoDao = null;
		if(dbType.equals("ORACLE")){
		userInfoDao = new UserInfoOracleDao();
		}
		else if(dbType.endsWith("MYSQL")){
		userInfoDao = new UserInfoMySqlDao();
		}
		else{
		System.out.println("db support error");
		return;
		}
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}

}
