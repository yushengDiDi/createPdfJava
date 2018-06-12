package pdf.kit;

import java.io.Serializable;

public class ZukeContract implements Serializable {
    /**
     *公寓名
     */
     private String tenantName;
    /**
     *租客名
     */
     private String ZukeName;
    /**
     *租客姓名
     */
     private String name;
    /**
     *f房间面积
     */
     private String area;
    /**
     *租客身份证
     */
     private String idNo;
    /**
     *租客手机号
     */
     private String phone;
    /**
     *房屋相信地址已经庭 室
     */
     private String houseAddress;
    /**
     *合同开始时间
     */
     private String startDate;
    /**
     *合同结束时间
     */
     private String endDate;
    /**
     *押付方式
     */
     private String YaFu;
    /**
     *租金 大写
     */
     private String ZuJin;
    /**
     *押金大写
     */
     private String Yajin;
    /**
     *当前时间 年 月 日
     */
     private String CurrentDate;
    /**
     *开始到结束合同 总共几个月
     */
    private String Month;

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getZukeName() {
        return ZukeName;
    }

    public void setZukeName(String zukeName) {
        ZukeName = zukeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getYaFu() {
        return YaFu;
    }

    public void setYaFu(String yaFu) {
        YaFu = yaFu;
    }

    public String getZuJin() {
        return ZuJin;
    }

    public void setZuJin(String zuJin) {
        ZuJin = zuJin;
    }

    public String getYajin() {
        return Yajin;
    }

    public void setYajin(String yajin) {
        Yajin = yajin;
    }

    public String getCurrentDate() {
        return CurrentDate;
    }

    public void setCurrentDate(String currentDate) {
        CurrentDate = currentDate;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }
}