package com.service;

import com.dao.DriverDao;
import com.entity.Driver;
import com.entity.Location;

public class DriverService
{
  public Driver login(String pNumber, String password)
  {
    return new DriverDao().findByPNumberAndPwd(pNumber, password);
  }

  public int register(Driver driver) {
    DriverDao driverDao = new DriverDao();
    int result = driverDao.save(driver);
    return result;
  }

  public int checkInfo(String phoneNum, String idCard) {
    return new DriverDao().checkInfo(phoneNum, idCard);
  }

  public int changePwd(String id, String pwd)
  {
    return new DriverDao().changePwd(id, pwd);
  }

  public Driver findByPhoneNum(String phoneNum) {
    return new DriverDao().findByPhoneNum(phoneNum);
  }

  public int update(String phoneNum, String key, String message)
  {
    return new DriverDao().update(phoneNum, key, message);
  }

  public int checkPhoneNum(String phoneNum)
  {
    return new DriverDao().checkPhoneNum(phoneNum);
  }

  public int updateLocation(String phoneNum, String longitude, String latitude) {
    return new DriverDao().updateLocation(phoneNum, longitude, latitude);
  }
  public int updateWork1(String phoneNum, int work) {
	  return new DriverDao().updateWork(phoneNum, work);
  }
  public int updateOnline1(String phoneNum, int online) {
	  return new DriverDao().updateOnline(phoneNum, online);
  }
  public int findByLocationId(String phoneNum) {
    return new DriverDao().findByLocationId(phoneNum);
  }
  public int findByLocationWorkId(String phoneNum) {
	  return new DriverDao().findByLocationWorkId(phoneNum);
  }
  public int findByLocationOnlineId(String phoneNum) {
	  return new DriverDao().findByLocationOnlineId(phoneNum);
  }
  public int insert(Location location) {
    return new DriverDao().insert(location);
  }
  public int insertwork(Location location) {
	  return new DriverDao().insertwork(location);
  }
  public int insertonline(Location location) {
	  return new DriverDao().insertonline(location);
  }
  
  public int checkPhoneNumAndPwd(String phoneNum,String pwd)
  {
    return new DriverDao().checkPhoneNumAndPwd(phoneNum,pwd);
  }

  public int updateWork(String phoneNum,int work){
	  return new DriverDao().updatework(phoneNum,work);
  }
}