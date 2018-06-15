package com.ns.clould.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UserMain implements Serializable {
    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 邮件，要求唯一
     */
    private String email;

    /**
     * 用户昵称，要求唯一
     */
    private String nickname;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 身份证号
     */
    private String idcardno;

    private String passwd;

    private String paypassword;

    /**
     * 已绑定的手机号码，不要求唯一
     */
    private String mobile;

    /**
     * 所在城市
     */
    private String city;

    /**
     * 注册时间
     */
    private Date registertime;

    /**
     * 1出借人，2借款人，10出借+借款人  用户角色com.zkbc.core.consts.user.UserRolesType，
     */
    private Short roles;

    /**
     * 可用现金余额  这条记录中的值才是用户真正可用的钱
     */
    private BigDecimal cash;

    /**
     * 已冻结的提现中现金
     */
    private BigDecimal frozenwithdrawcash;

    /**
     * 已冻结的投标中现金
     */
    private BigDecimal frozenbiddingcash;

    /**
     * 国政通验证次数，每次验证减1，默认每人最多验证3次
     */
    private Short idverifylimit;

    /**
     * 头像id
     */
    private Integer portrait;

    /**
     * 用户状态。用数值型的好处是今后可以扩充定义，参见com.zkbc.core.consts.user.UserStatusType
     */
    private Short status;

    /**
     * 禁止状态。参见com.zkbc.core.consts.user.UserForbidStatusType
     */
    private Short forbidstatus;

    /**
     * 个人相册容量，单位：MB。用户所有的userpic加起来不能大于此数值
     */
    private Short albumcapacity;

    /**
     * 安全等级
     */
    private Short securitylevel;

    /**
     * 新浪微博uid
     */
    private String weibouid;

    /**
     * 新浪微博AccessToken
     */
    private String weiboaccesstoken;

    /**
     * 腾讯uid
     */
    private String qquid;

    /**
     * 腾讯AccessToken
     */
    private String qqaccesstoken;

    /**
     * 渠道编码
     */
    private Integer origin;

    /**
     * 所属客户经理
     */
    private Integer staffid;

    private String usercode;

    /**
     * 推荐人，存储推荐人用户名
     */
    private String referee;

    /**
     * 公司顺序号
     */
    private Integer companyseq;

    /**
     * 操作员顺序号
     */
    private Integer tellerseq;

    /**
     * 记录登陆密码错误次数
     */
    private Integer wrongpassword;

    /**
     * 0，普通用户，1，A级用户，2，B级用户
     */
    private Integer level;

    /**
     * 体验金额
     */
    private BigDecimal experiencecash;

    /**
     * 移动端token，此值未用，token字段参考表user_mobile_session.token
     */
    private String token;

    /**
     * key
     */
    private String keytype;

    private Integer chanalcode;

    /**
     * 恒丰银行登录ID-注册时手机号 不可变更
     */
    private String hfLoginId;

    /**
     * 开通恒丰托管账户时间
     */
    private Date openaccounttime;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno == null ? null : idcardno.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getPaypassword() {
        return paypassword;
    }

    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword == null ? null : paypassword.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public Short getRoles() {
        return roles;
    }

    public void setRoles(Short roles) {
        this.roles = roles;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public BigDecimal getFrozenwithdrawcash() {
        return frozenwithdrawcash;
    }

    public void setFrozenwithdrawcash(BigDecimal frozenwithdrawcash) {
        this.frozenwithdrawcash = frozenwithdrawcash;
    }

    public BigDecimal getFrozenbiddingcash() {
        return frozenbiddingcash;
    }

    public void setFrozenbiddingcash(BigDecimal frozenbiddingcash) {
        this.frozenbiddingcash = frozenbiddingcash;
    }

    public Short getIdverifylimit() {
        return idverifylimit;
    }

    public void setIdverifylimit(Short idverifylimit) {
        this.idverifylimit = idverifylimit;
    }

    public Integer getPortrait() {
        return portrait;
    }

    public void setPortrait(Integer portrait) {
        this.portrait = portrait;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getForbidstatus() {
        return forbidstatus;
    }

    public void setForbidstatus(Short forbidstatus) {
        this.forbidstatus = forbidstatus;
    }

    public Short getAlbumcapacity() {
        return albumcapacity;
    }

    public void setAlbumcapacity(Short albumcapacity) {
        this.albumcapacity = albumcapacity;
    }

    public Short getSecuritylevel() {
        return securitylevel;
    }

    public void setSecuritylevel(Short securitylevel) {
        this.securitylevel = securitylevel;
    }

    public String getWeibouid() {
        return weibouid;
    }

    public void setWeibouid(String weibouid) {
        this.weibouid = weibouid == null ? null : weibouid.trim();
    }

    public String getWeiboaccesstoken() {
        return weiboaccesstoken;
    }

    public void setWeiboaccesstoken(String weiboaccesstoken) {
        this.weiboaccesstoken = weiboaccesstoken == null ? null : weiboaccesstoken.trim();
    }

    public String getQquid() {
        return qquid;
    }

    public void setQquid(String qquid) {
        this.qquid = qquid == null ? null : qquid.trim();
    }

    public String getQqaccesstoken() {
        return qqaccesstoken;
    }

    public void setQqaccesstoken(String qqaccesstoken) {
        this.qqaccesstoken = qqaccesstoken == null ? null : qqaccesstoken.trim();
    }

    public Integer getOrigin() {
        return origin;
    }

    public void setOrigin(Integer origin) {
        this.origin = origin;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee == null ? null : referee.trim();
    }

    public Integer getCompanyseq() {
        return companyseq;
    }

    public void setCompanyseq(Integer companyseq) {
        this.companyseq = companyseq;
    }

    public Integer getTellerseq() {
        return tellerseq;
    }

    public void setTellerseq(Integer tellerseq) {
        this.tellerseq = tellerseq;
    }

    public Integer getWrongpassword() {
        return wrongpassword;
    }

    public void setWrongpassword(Integer wrongpassword) {
        this.wrongpassword = wrongpassword;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public BigDecimal getExperiencecash() {
        return experiencecash;
    }

    public void setExperiencecash(BigDecimal experiencecash) {
        this.experiencecash = experiencecash;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getKeytype() {
        return keytype;
    }

    public void setKeytype(String keytype) {
        this.keytype = keytype == null ? null : keytype.trim();
    }

    public Integer getChanalcode() {
        return chanalcode;
    }

    public void setChanalcode(Integer chanalcode) {
        this.chanalcode = chanalcode;
    }

    public String getHfLoginId() {
        return hfLoginId;
    }

    public void setHfLoginId(String hfLoginId) {
        this.hfLoginId = hfLoginId == null ? null : hfLoginId.trim();
    }

    public Date getOpenaccounttime() {
        return openaccounttime;
    }

    public void setOpenaccounttime(Date openaccounttime) {
        this.openaccounttime = openaccounttime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", email=").append(email);
        sb.append(", nickname=").append(nickname);
        sb.append(", realname=").append(realname);
        sb.append(", idcardno=").append(idcardno);
        sb.append(", passwd=").append(passwd);
        sb.append(", paypassword=").append(paypassword);
        sb.append(", mobile=").append(mobile);
        sb.append(", city=").append(city);
        sb.append(", registertime=").append(registertime);
        sb.append(", roles=").append(roles);
        sb.append(", cash=").append(cash);
        sb.append(", frozenwithdrawcash=").append(frozenwithdrawcash);
        sb.append(", frozenbiddingcash=").append(frozenbiddingcash);
        sb.append(", idverifylimit=").append(idverifylimit);
        sb.append(", portrait=").append(portrait);
        sb.append(", status=").append(status);
        sb.append(", forbidstatus=").append(forbidstatus);
        sb.append(", albumcapacity=").append(albumcapacity);
        sb.append(", securitylevel=").append(securitylevel);
        sb.append(", weibouid=").append(weibouid);
        sb.append(", weiboaccesstoken=").append(weiboaccesstoken);
        sb.append(", qquid=").append(qquid);
        sb.append(", qqaccesstoken=").append(qqaccesstoken);
        sb.append(", origin=").append(origin);
        sb.append(", staffid=").append(staffid);
        sb.append(", usercode=").append(usercode);
        sb.append(", referee=").append(referee);
        sb.append(", companyseq=").append(companyseq);
        sb.append(", tellerseq=").append(tellerseq);
        sb.append(", wrongpassword=").append(wrongpassword);
        sb.append(", level=").append(level);
        sb.append(", experiencecash=").append(experiencecash);
        sb.append(", token=").append(token);
        sb.append(", keytype=").append(keytype);
        sb.append(", chanalcode=").append(chanalcode);
        sb.append(", hfLoginId=").append(hfLoginId);
        sb.append(", openaccounttime=").append(openaccounttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}