package p13.domain.userinfo.dao;

import p13.domain.userinfo.UserInfo;

public interface UserInfoDao {
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
}
