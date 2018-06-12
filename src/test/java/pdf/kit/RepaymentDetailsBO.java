package pdf.kit;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by lihua on 2017/7/8.
 */
//还款明细
public class RepaymentDetailsBO {
    //期数
    private Integer periods;
    //回款日期
    private Date dateOfReturn;
    //每期回款额
    private BigDecimal repaymentPerInstallment;
    //应收利息
    private BigDecimal interestReceivable;
    //应收本金
    private BigDecimal amountReceivable;
    //剩余本金
    private BigDecimal residualPrincipal;

    public Integer getPeriods() {
        return periods;
    }

    public void setPeriods(Integer periods) {
        this.periods = periods;
    }

    public Date getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(Date dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public BigDecimal getRepaymentPerInstallment() {
        return repaymentPerInstallment;
    }

    public void setRepaymentPerInstallment(BigDecimal repaymentPerInstallment) {
        this.repaymentPerInstallment = repaymentPerInstallment;
    }

    public BigDecimal getInterestReceivable() {
        return interestReceivable;
    }

    public void setInterestReceivable(BigDecimal interestReceivable) {
        this.interestReceivable = interestReceivable;
    }

    public BigDecimal getAmountReceivable() {
        return amountReceivable;
    }

    public void setAmountReceivable(BigDecimal amountReceivable) {
        this.amountReceivable = amountReceivable;
    }

    public BigDecimal getResidualPrincipal() {
        return residualPrincipal;
    }

    public void setResidualPrincipal(BigDecimal residualPrincipal) {
        this.residualPrincipal = residualPrincipal;
    }
}
