package com.bn.docmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author wty
 * @date 2020/11/29 14:47
 *个人基本信息
 */
@Entity
@Table(name = "personal_basic_information")
public class PersonalBasicInformation  extends BaseModel{
    /**
    * 自增id
    */
    @Id
    @Column(insertable = false,updatable = false)
    private Long id;

    /**
    * 姓名
    */
    private String basicName;

    /**
    * 身份证号
    */
    private String basicIdcard;

    /**
    * 出生日期
    */
    private Date basicBirthday;

    /**
    * 年龄
    */
    private Integer basicAge;

    /**
    * 手机号
    */
    private String basicPhone;

    /**
    * 性别
    */
    private String basicSex;

    /**
    * 政治面貌
    */
    private String basicPoliticaloutlook;

    /**
    * 级别
    */
    private String basicLevel;

    /**
    * 民族
    */
    private String basicNation;

    /**
    * 学历
    */
    private String basicEducation;

    /**
    * 户籍
    */
    private String basicHouseholdregister;

    /**
    * 现居地
    */
    private String basicCurrentresidence;

    /**
    * 工作日期
    */
    private Date basicWorkingdate;

    /**
    * 工龄
    */
    private Integer basicWorkingyears;

    /**
    * 入党日期
    */
    private Date basicDateofjoiningtheparty;

    /**
    * 创建时间
    */
    private Date createtime;

    /**
    * 党龄
    */
    private Integer basicPartyage;

    /**
    * 创建人
    */
    private String createby;

    /**
    * 修改时间
    */
    private Date updatetime;

    /**
    * 修改人
    */
    private String updateby;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBasicName() {
        return basicName;
    }

    public void setBasicName(String basicName) {
        this.basicName = basicName;
    }

    public String getBasicIdcard() {
        return basicIdcard;
    }

    public void setBasicIdcard(String basicIdcard) {
        this.basicIdcard = basicIdcard;
    }

    public Date getBasicBirthday() {
        return basicBirthday;
    }

    public void setBasicBirthday(Date basicBirthday) {
        this.basicBirthday = basicBirthday;
    }

    public Integer getBasicAge() {
        return basicAge;
    }

    public void setBasicAge(Integer basicAge) {
        this.basicAge = basicAge;
    }

    public String getBasicPhone() {
        return basicPhone;
    }

    public void setBasicPhone(String basicPhone) {
        this.basicPhone = basicPhone;
    }

    public String getBasicSex() {
        return basicSex;
    }

    public void setBasicSex(String basicSex) {
        this.basicSex = basicSex;
    }

    public String getBasicPoliticaloutlook() {
        return basicPoliticaloutlook;
    }

    public void setBasicPoliticaloutlook(String basicPoliticaloutlook) {
        this.basicPoliticaloutlook = basicPoliticaloutlook;
    }

    public String getBasicLevel() {
        return basicLevel;
    }

    public void setBasicLevel(String basicLevel) {
        this.basicLevel = basicLevel;
    }

    public String getBasicNation() {
        return basicNation;
    }

    public void setBasicNation(String basicNation) {
        this.basicNation = basicNation;
    }

    public String getBasicEducation() {
        return basicEducation;
    }

    public void setBasicEducation(String basicEducation) {
        this.basicEducation = basicEducation;
    }

    public String getBasicHouseholdregister() {
        return basicHouseholdregister;
    }

    public void setBasicHouseholdregister(String basicHouseholdregister) {
        this.basicHouseholdregister = basicHouseholdregister;
    }

    public String getBasicCurrentresidence() {
        return basicCurrentresidence;
    }

    public void setBasicCurrentresidence(String basicCurrentresidence) {
        this.basicCurrentresidence = basicCurrentresidence;
    }

    public Date getBasicWorkingdate() {
        return basicWorkingdate;
    }

    public void setBasicWorkingdate(Date basicWorkingdate) {
        this.basicWorkingdate = basicWorkingdate;
    }

    public Integer getBasicWorkingyears() {
        return basicWorkingyears;
    }

    public void setBasicWorkingyears(Integer basicWorkingyears) {
        this.basicWorkingyears = basicWorkingyears;
    }

    public Date getBasicDateofjoiningtheparty() {
        return basicDateofjoiningtheparty;
    }

    public void setBasicDateofjoiningtheparty(Date basicDateofjoiningtheparty) {
        this.basicDateofjoiningtheparty = basicDateofjoiningtheparty;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getBasicPartyage() {
        return basicPartyage;
    }

    public void setBasicPartyage(Integer basicPartyage) {
        this.basicPartyage = basicPartyage;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }
}