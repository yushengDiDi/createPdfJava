package pdf.kit;

import java.util.Date;

/**
 * Created by Administrator on 2017/12/19.
 */
public class AcconntBill {

    private Long id;
    /*
     * 还款日期
     */
    private Date date;
    /*
     *应还款总额
     */
    private Double  totalRepayment;
    /*
     *应付本金
     */
    private Double principal;
    /*
     *分期手续费
     */
    private Double shouXuFei;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalRepayment() {
        return totalRepayment;
    }

    public void setTotalRepayment(Double totalRepayment) {
        this.totalRepayment = totalRepayment;
    }

    public Double getPrincipal() {
        return principal;
    }

    public void setPrincipal(Double principal) {
        this.principal = principal;
    }

    public Double getShouXuFei() {
        return shouXuFei;
    }

    public void setShouXuFei(Double shouXuFei) {
        this.shouXuFei = shouXuFei;
    }
}
