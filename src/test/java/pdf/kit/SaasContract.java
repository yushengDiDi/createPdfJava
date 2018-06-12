package pdf.kit;

/**
 * Created by Administrator on 2018/1/22.
 */
public class SaasContract {
    private String tenantName;
    private String name;
    private String idCard;
    private String phone;
    //房屋相信地址
    private String houseAddress;
    //房屋面积
    private String area;

    private String startDateStr;

    private String endDateStr;

    //开始时间到结束时间
    private String month;

    //租金 大写
    private String billRent;

    //押金 大写
    private String billDeposit;

    //付款方式
    private String way;

    //公寓自定义文本内容

    private String text[];

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStartDateStr() {
        return startDateStr;
    }

    public void setStartDateStr(String startDateStr) {
        this.startDateStr = startDateStr;
    }

    public String getEndDateStr() {
        return endDateStr;
    }

    public void setEndDateStr(String endDateStr) {
        this.endDateStr = endDateStr;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getBillRent() {
        return billRent;
    }

    public void setBillRent(String billRent) {
        this.billRent = billRent;
    }

    public String getBillDeposit() {
        return billDeposit;
    }

    public void setBillDeposit(String billDeposit) {
        this.billDeposit = billDeposit;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public String[] getText() {
        return text;
    }

    public void setText(String[] text) {
        this.text = text;
    }
}
