package com.free.ride.bean;

import java.io.Serializable;
import java.util.Date;
/**
 * 用户
 * 类名:SfcUser ;
 * @date: 2018-1-19 下午5:28:30 ;
 * @title: 类功能描述注释;
 * @author:zxc;
 * @version:v1.0
 */
public class SfcUser implements Serializable
{

    /**  
     * serialVersionUID:TODO（用一句话描述这个变量表示什么）  
     *  
     * @since 1.0.0  
     */  
    
    private static final long serialVersionUID = -1807746324310474482L;
    
    private int id;
    private int cId;
    private String phoneNo;//手机号码
    private String nickName;//昵称
    private String geoHash;//经纬度geohash码
    private Date createTime;//创建时间
    private Date mofityTime;//修改时间
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getcId()
    {
        return cId;
    }
    public void setcId(int cId)
    {
        this.cId = cId;
    }
    public String getPhoneNo()
    {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo)
    {
        this.phoneNo = phoneNo;
    }
    public String getNickName()
    {
        return nickName;
    }
    public void setNickName(String nickName)
    {
        this.nickName = nickName;
    }
    public String getGeoHash()
    {
        return geoHash;
    }
    public void setGeoHash(String geoHash)
    {
        this.geoHash = geoHash;
    }
    public Date getCreateTime()
    {
        return createTime;
    }
    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }
    public Date getMofityTime()
    {
        return mofityTime;
    }
    public void setMofityTime(Date mofityTime)
    {
        this.mofityTime = mofityTime;
    }
    @Override
    public String toString()
    {
        return "SfcUser [id=" + id + ", cId=" + cId + ", phoneNo=" + phoneNo + ", nickName="
                + nickName + ", geoHash=" + geoHash + ", createTime=" + createTime
                + ", mofityTime=" + mofityTime + "]";
    }
}
