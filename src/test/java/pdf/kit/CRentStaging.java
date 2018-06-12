package pdf.kit;
import java.util.*;

/**
 * @author  yusheng
 * Created  2017/12/18.
 */
public class CRentStaging {

    private Long id;
    /**
     *房总管账号ID
     */
    private String phone;
    /**
     * 姓名
     */
    private String name;
    /**
     *身份证号码
     */
    private String idNo;

    /**
     *用户账单
     */
    private List<AcconntBill> userAccountlist;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public List<AcconntBill> getUserAccountlist() {
        return userAccountlist;
    }

    public void setUserAccountlist(List<AcconntBill> userAccountlist) {
        this.userAccountlist = userAccountlist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
