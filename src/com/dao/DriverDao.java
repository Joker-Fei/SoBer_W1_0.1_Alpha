package com.dao;

import com.entity.Driver;
import com.entity.Location;
import com.tools.DBTools;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DriverDao
{
  DBTools dbtool = new DBTools();

  public Driver findByPNumberAndPwd(String phoneNum, String pwd) {
    String sql = "select * from driver where phonenum=? and pwd=?";
    Object[] params = { phoneNum, pwd };

    return findSingleBySQL(sql, params);
  }

  public List<Driver> findBySQL(String sql, Object[] params)
  {
    List list = new ArrayList();
    ResultSet rs = this.dbtool.executeQuery(sql, params);
    try {
      while (rs.next()) {
        Driver driver = new Driver(
          rs.getString("name"), 
          rs.getString("pwd"), 
          rs.getString("idCard"), 
          rs.getString("driverImg"), 
          rs.getString("runImg"), 
          rs.getString("city"), 
          rs.getString("carNum"), 
          rs.getString("brand"), 
          rs.getString("length"), 
          rs.getString("model"), 
          rs.getInt("walletId"), 
          rs.getString("address"), 
          rs.getDate("registerTime"));

        list.add(driver);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      this.dbtool.closeAll();
    }
    return list;
  }

  public Driver findSingleBySQL(String sql, Object[] params)
  {
    ResultSet rs = this.dbtool.executeQuery(sql, params);
    try {
      if (rs.next()) {
        Driver user = new Driver(
          rs.getInt("id"), 
          rs.getString("phoneNum"), 
          rs.getString("name"), 
          rs.getString("pwd"), 
          rs.getString("idCard"), 
          rs.getString("driverImg"), 
          rs.getString("runImg"), 
          rs.getString("city"), 
          rs.getString("carNum"), 
          rs.getString("brand"), 
          rs.getString("length"), 
          rs.getString("model"), 
          rs.getInt("walletId"), 
          rs.getString("address"), 
          rs.getDate("registerTime"), 
          rs.getString("uuid"), 
          rs.getString("img"));
        return user;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      this.dbtool.closeAll(); } this.dbtool.closeAll();

    return null;
  }

  public Location findSingleBySQL2(String sql, Object[] params)
  {
    ResultSet rs = this.dbtool.executeQuery(sql, params);
    try {
      if (rs.next()) {
        Location location = new Location(
          rs.getInt("id"), 
          rs.getString("phonenum"), 
          rs.getString("longitude"), 
          rs.getString("latitude"), 
          rs.getInt("work"));
        return location;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      this.dbtool.closeAll(); } this.dbtool.closeAll();

    return null;
  }

  public int count(String sql, Object[] params)
  {
    ResultSet rs = this.dbtool.executeQuery(sql, params);
    try {
      if (rs.next())
      {
        return rs.getInt(1);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      this.dbtool.closeAll(); } this.dbtool.closeAll();

    return 0;
  }

  public Driver findById(int id)
  {
    String sql = "select * from driver where id=?";
    Object[] params = { Integer.valueOf(id) };
    return findSingleBySQL(sql, params);
  }

  public List<Driver> findAll()
  {
    String sql = "select * from driver";
    Object[] params = new Object[0];
    return findBySQL(sql, params);
  }

  public int count()
  {
    String sql = "select count(*) from driver";
    return count(sql, null);
  }

  public List<Driver> findAllByUserId(String id)
  {
    String sql = "select * from driver where id=?";
    Object[] params = { id };
    return findBySQL(sql, params);
  }

  public int findByUserName(String username)
  {
    String sql = "select * from driver where name=?";
    Object[] params = { username };
    if (findSingleBySQL(sql, params) != null) {
      return 0;
    }
    return 1;
  }

  public int checkInfo(String phoneNum, String idCard)
  {
    String sql = "select * from driver where phonenum=? and idcard=? limit 1";//limit 1 唯一一条数据查询
    Object[] params = { phoneNum, idCard };
    if (findSingleBySQL(sql, params) != null) {
      return 1;
    }
    return 0;
  }

  public int changePwd(String id, String pwd)
  {
    String sql = "update driver set pwd=? where phonenum=?";
    Object[] params = { pwd, id };
    int i = this.dbtool.executeUpdate(sql, params);
    if (i > 0) {
      return 1;
    }
    return 0;
  }

  public int findByLocationId(String phonenum)
  {
    String sql = "select * from location where phonenum=?";
    Object[] params = { phonenum };
    if (findSingleBySQL2(sql, params) != null) {
      return 1;
    }
    return 0;
  }
  public int findByLocationWorkId(String id)
  {
	  String sql = "select * from location where phonenum=?";
	  Object[] params = { id};
	  if (findSingleBySQL2(sql, params) != null) {
		  return 1;
	  }
	  return 0;
  }
  public int findByLocationOnlineId(String id)
  {
	  String sql = "select * from location where phonenum=?";
	  Object[] params = { id};
	  if (findSingleBySQL2(sql, params) != null) {
		  return 1;
	  }
	  return 0;
  }

  public int updateLocation(String phoneNum, String longitude, String latitude)
  {
    String sql = "update location set longitude='" + longitude + "'" + "," + "latitude=" + "'" + latitude + "'" + " where phonenum=" + phoneNum;
    int iii = this.dbtool.executeUpdate2(sql);
    return iii;
  }
  public int updateWork(String phoneNum, int work)
  {
	  String sql = "update location set work='" + work + "'" +" where phonenum=" + phoneNum;
	  int iii = this.dbtool.executeUpdate2(sql);
	  return iii;
  }
  public int updateOnline(String phoneNum, int online)
  {
	  String sql = "update location set online='" + online + "'" +" where phonenum=" + phoneNum;
	  int iii = this.dbtool.executeUpdate2(sql);
	  return iii;
  }

  public int insert(Location location)
  {
    String sql = "insert into location (phonenum,longitude,latitude,work,online) values(?,?,?,?,?)";
    Object[] params = { location.getPhoneNum(), location.getLongitude(), location.getLatitude(), location.getWork(),location.getOnline() };
    return this.dbtool.executeUpdate(sql, params);
  }
  public int insertwork(Location location)
  {
	  String sql = "insert into location (phonenum,work) values(?,?)";
	  Object[] params = { location.getPhoneNum(), location.getWork() };
	  return this.dbtool.executeUpdate(sql, params);
  }
  public int insertonline(Location location)
  {
	  String sql = "insert into location (phonenum,online) values(?,?)";
	  Object[] params = { location.getPhoneNum(), location.getOnline() };
	  return this.dbtool.executeUpdate(sql, params);
  }

  public int save(Driver driver)
  {
    String sql = "insert into driver (phonenum,name,pwd,idcard,driverimg,runimg,city,carnum,brand,length,model,walletid,address,registertime,uuid,img)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    Object[] params = { 
      driver.getPhoneNum(), 
      driver.getName(), 
      driver.getPwd(), 
      driver.getIdCard(), 
      driver.getDriverImg(), 
      driver.getRunImg(), 
      driver.getCity(), 
      driver.getCarNum(), 
      driver.getBrand(), 
      driver.getLength(), 
      driver.getModel(), 
      Integer.valueOf(driver.getWalletId()), 
      driver.getAddress(), 
      driver.getRegisterTime(), 
      driver.getUuid(), 
      driver.getImg() };
    return this.dbtool.executeUpdate(sql, params);
  }

  public Driver findByPhoneNum(String phoneNum)
  {
    String sql = "select name,pwd,idcard,driverimg,runimg,city,carnum,brand,length,model,address,walletid,registertime from driver where phonenum=?";
    Object[] params = { phoneNum };
    List <Driver> driverList = findBySQL(sql, params);
    if ((driverList != null) && (driverList.size() > 0)) {
      return (Driver)driverList.get(0);
    }
    return null;
  }

  public int update(String phoneNum, String key, String message)
  {
    String sql = "update driver set " + key + "=" + "'" + message + "'" + " where phonenum=" + phoneNum;

    return this.dbtool.executeUpdate2(sql);
  }

  public int checkPhoneNum(String phoneNum) {
    String sql = "select * from driver where phonenum=?";
    Object[] params = { phoneNum };
    if (findSingleBySQL(sql, params) != null) {
      return 1;
    }
    return 0;
  }

public int checkPhoneNumAndPwd(String phoneNum, String pwd) {
	  String sql = "select * from driver where phonenum=? and pwd=?";
	    Object[] params = { phoneNum,pwd };
	    if (findSingleBySQL(sql, params) != null) {
	      return 1;
	    }
	    return 0;
}

public int updatework(String phoneNum,int work) {
	    String sql = "update location set work=? where phonenum=?";
	    Object[] params = { work,phoneNum };
	    int i = this.dbtool.executeUpdate(sql, params);
	    if (i > 0) {
	      return 1;
	    }
	  
	    return 0;
}
}