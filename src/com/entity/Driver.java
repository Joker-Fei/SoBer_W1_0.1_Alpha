package com.entity;

import java.sql.Date;

public class Driver
{
  private int id;
  private String phoneNum;
  private String name;
  private String pwd;
  private String idCard;
  private String driverImg;
  private String runImg;
  private String city;
  private String carNum;
  private String brand;
  private String length;
  private String model;
  private int walletId;
  private String address;
  private Date registerTime;
  private String uuid;
  private String img;

  public Driver(String name, String pwd, String idCard, String driverImg, String runImg, String city, String carNum, String brand, String length, String model, int walletId, String address, Date registerTime)
  {
    this.name = name;
    this.pwd = pwd;
    this.idCard = idCard;
    this.driverImg = driverImg;
    this.runImg = runImg;
    this.city = city;
    this.carNum = carNum;
    this.brand = brand;
    this.length = length;
    this.model = model;
    this.walletId = walletId;
    this.address = address;
    this.registerTime = registerTime;
  }

  public int getId()
  {
    return this.id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public String getName()
  {
    return this.name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getPwd()
  {
    return this.pwd;
  }

  public void setPwd(String pwd)
  {
    this.pwd = pwd;
  }

  public String getIdCard()
  {
    return this.idCard;
  }

  public void setIdCard(String idCard)
  {
    this.idCard = idCard;
  }

  public String getDriverImg()
  {
    return this.driverImg;
  }

  public void setDriverImg(String driverImg)
  {
    this.driverImg = driverImg;
  }

  public String getRunImg()
  {
    return this.runImg;
  }

  public void setRunImg(String runImg)
  {
    this.runImg = runImg;
  }

  public String getCity()
  {
    return this.city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  public String getBrand()
  {
    return this.brand;
  }

  public void setBrand(String brand)
  {
    this.brand = brand;
  }

  public String getLength()
  {
    return this.length;
  }

  public void setLength(String length)
  {
    this.length = length;
  }

  public String getModel()
  {
    return this.model;
  }

  public void setModel(String model)
  {
    this.model = model;
  }

  public int getWalletId()
  {
    return this.walletId;
  }

  public void setWalletId(int walletId)
  {
    this.walletId = walletId;
  }

  public String getAddress()
  {
    return this.address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public Date getRegisterTime()
  {
    return this.registerTime;
  }

  public void setRegisterTime(Date registerTime)
  {
    this.registerTime = registerTime;
  }

  public String getUuid()
  {
    return this.uuid;
  }

  public void setUuid(String uuid)
  {
    this.uuid = uuid;
  }

  public String getImg()
  {
    return this.img;
  }

  public void setImg(String img)
  {
    this.img = img;
  }

  public String getPhoneNum()
  {
    return this.phoneNum;
  }

  public void setPhoneNum(String phoneNum)
  {
    this.phoneNum = phoneNum;
  }

  public String getCarNum()
  {
    return this.carNum;
  }

  public void setCarNum(String carNum)
  {
    this.carNum = carNum;
  }

  public Driver()
  {
  }

  public Driver(int id, String phoneNum, String name, String pwd, String idCard, String driverImg, String runImg, String city, String carNum, String brand, String length, String model, int walletId, String adress, Date registerTime, String uuid, String img)
  {
    this.id = id;
    this.phoneNum = phoneNum;
    this.name = name;
    this.pwd = pwd;
    this.idCard = idCard;
    this.driverImg = driverImg;
    this.runImg = runImg;
    this.city = city;
    this.carNum = carNum;
    this.brand = brand;
    this.length = length;
    this.model = model;
    this.walletId = walletId;
    this.address = adress;
    this.registerTime = registerTime;
    this.uuid = uuid;
    this.img = img;
  }

  public Driver(String phoneNum, String name, String pwd, String idCard, String driverImg, String runImg, String city, String carNum, String brand, String length, String model, int walletId, String address, Date registerTime, String uuid, String img)
  {
    this.phoneNum = phoneNum;
    this.name = name;
    this.pwd = pwd;
    this.idCard = idCard;
    this.driverImg = driverImg;
    this.runImg = runImg;
    this.city = city;
    this.carNum = carNum;
    this.brand = brand;
    this.length = length;
    this.model = model;
    this.walletId = walletId;
    this.address = address;
    this.registerTime = registerTime;
    this.uuid = uuid;
    this.img = img;
  }

  public Driver(String phoneNum, String name, String pwd, String idCard)
  {
    this.phoneNum = phoneNum;
    this.name = name;
    this.pwd = pwd;
    this.idCard = idCard;
  }
}