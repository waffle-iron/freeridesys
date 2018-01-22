package com.free.ride.bean;

import java.io.Serializable;
import java.util.Date;
/**
 * 顺风车
 * 类名:SfcVanFeeds ;
 * @date: 2018-1-19 下午5:31:50 ;
 * @title: 类功能描述注释;
 * @author:zxc;
 * @version:v1.0
 */
public class SfcVanFeeds implements Serializable
{

    /**  
     * serialVersionUID:TODO（用一句话描述这个变量表示什么）  
     *  
     * @since 1.0.0  
     */  
    
    private static final long serialVersionUID = -8228658756675171284L;
    
    private int id;
    private int uId;
    private String contractName;//联系人
    private String contractPhone;//联系人电话
    private int gender;//1、男  2、女
    private String strating;//出发地
    private String startGeohash;//出发地geohash
    private String destination;//目的地
    private String remark;//备注
    private int visited;//浏览人数
    private int type;//1、人找车 2、车找人
    private int status;//0、草稿 1、发布中 2、已结单 3、已下架
    private int distance;//里程
    private String tags;//标签
    private Date startTime;//出发日期
    private Date createTime;//创建时间
    private Date modifyTime;//修改时间
    private Date publishTime;//发布时间
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getuId()
    {
        return uId;
    }
    public void setuId(int uId)
    {
        this.uId = uId;
    }
    public String getContractName()
    {
        return contractName;
    }
    public void setContractName(String contractName)
    {
        this.contractName = contractName;
    }
    public String getContractPhone()
    {
        return contractPhone;
    }
    public void setContractPhone(String contractPhone)
    {
        this.contractPhone = contractPhone;
    }
    public int getGender()
    {
        return gender;
    }
    public void setGender(int gender)
    {
        this.gender = gender;
    }
    public String getStrating()
    {
        return strating;
    }
    public void setStrating(String strating)
    {
        this.strating = strating;
    }
    public String getStartGeohash()
    {
        return startGeohash;
    }
    public void setStartGeohash(String startGeohash)
    {
        this.startGeohash = startGeohash;
    }
    public String getDestination()
    {
        return destination;
    }
    public void setDestination(String destination)
    {
        this.destination = destination;
    }
    public String getRemark()
    {
        return remark;
    }
    public void setRemark(String remark)
    {
        this.remark = remark;
    }
    public int getVisited()
    {
        return visited;
    }
    public void setVisited(int visited)
    {
        this.visited = visited;
    }
    public int getType()
    {
        return type;
    }
    public void setType(int type)
    {
        this.type = type;
    }
    public int getStatus()
    {
        return status;
    }
    public void setStatus(int status)
    {
        this.status = status;
    }
    public int getDistance()
    {
        return distance;
    }
    public void setDistance(int distance)
    {
        this.distance = distance;
    }
    public String getTags()
    {
        return tags;
    }
    public void setTags(String tags)
    {
        this.tags = tags;
    }
    public Date getStartTime()
    {
        return startTime;
    }
    public void setStartTime(Date startTime)
    {
        this.startTime = startTime;
    }
    public Date getCreateTime()
    {
        return createTime;
    }
    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }
    public Date getModifyTime()
    {
        return modifyTime;
    }
    public void setModifyTime(Date modifyTime)
    {
        this.modifyTime = modifyTime;
    }
    public Date getPublishTime()
    {
        return publishTime;
    }
    public void setPublishTime(Date publishTime)
    {
        this.publishTime = publishTime;
    }
    @Override
    public String toString()
    {
        return "SfcVanFeeds [id=" + id + ", uId=" + uId + ", contractName=" + contractName
                + ", contractPhone=" + contractPhone + ", gender=" + gender + ", strating="
                + strating + ", startGeohash=" + startGeohash + ", destination=" + destination
                + ", remark=" + remark + ", visited=" + visited + ", type=" + type + ", status="
                + status + ", distance=" + distance + ", tags=" + tags + ", startTime=" + startTime
                + ", createTime=" + createTime + ", modifyTime=" + modifyTime + ", publishTime="
                + publishTime + "]";
    }
}
