package com.tools;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBTools
{
  private static String driver;
  private static String url;
  private static String userName;
  private static String userPwd;
  ResultSet rs = null;
  PreparedStatement pst = null;
  Connection conn = null;

  public static void init(String driver1, String url1, String username1, String password1)
  {
    driver = driver1;
    url = url1;
    userName = username1;
    userPwd = password1;
  }

  public Connection getConnection()
    throws SQLException, Exception
  {
    try
    {
      Class.forName(driver);

      this.conn = ((Connection)DriverManager.getConnection(url, userName, 
        userPwd));
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
    return this.conn;
  }

  public ResultSet executeQuery(String sql, Object[] params)
  {
    try
    {
      getConnection();
    }
    catch (SQLException e1) {
      e1.printStackTrace();
    }
    catch (Exception e1) {
      e1.printStackTrace();
    }
    try
    {
      this.pst = this.conn.prepareStatement(sql);

      if ((params != null) && (params.length > 0)) {
        for (int i = 0; i < params.length; i++) {
          this.pst.setObject(i + 1, params[i]);
        }
      }

      this.rs = this.pst.executeQuery();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return this.rs;
  }

  public int executeUpdate(String sql, Object[] params)
  {
    int result = 0;
    try {
      getConnection();
    }
    catch (SQLException e1) {
      e1.printStackTrace();
    }
    catch (Exception e1) {
      e1.printStackTrace();
    }
    try
    {
      this.pst = this.conn.prepareStatement(sql);

      if ((params != null) && (params.length > 0)) {
        for (int i = 0; i < params.length; i++) {
          this.pst.setObject(i + 1, params[i]);
        }
      }

      result = this.pst.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      closeAll();
    }
    return result;
  }

  public int executeUpdate2(String sql) {
    int result = 0;
    try {
      getConnection();
    }
    catch (SQLException e1) {
      e1.printStackTrace();
    }
    catch (Exception e1) {
      e1.printStackTrace();
    }
    try
    {
      this.pst = this.conn.prepareStatement(sql);

      result = this.pst.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      closeAll();
    }
    return result;
  }

  public void closeAll()
  {
    try {
      if (this.rs != null)
        this.rs.close();
    }
    catch (SQLException e1) {
      e1.printStackTrace();
    }
    try {
      if (this.pst != null)
        this.pst.close();
    }
    catch (SQLException e) {
      e.printStackTrace();
    }
    try {
      if (this.conn != null)
        this.conn.close();
    }
    catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public int checkCountExecute(String sql)
  {
    int flag = 0;
    try {
      this.pst = this.conn.prepareStatement(sql);

      this.rs = this.pst.executeQuery();
      if (this.rs.next())
        flag = 1;
      else
        flag = 0;
    }
    catch (SQLException e) {
      e.printStackTrace();
    } finally {
      closeAll();
    }return flag;
  }
}