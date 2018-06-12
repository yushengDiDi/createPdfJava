package pdf.kit;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by lihua on 2017/7/8.
 */
public class LendingAgreementBO {
    //投资人姓名--确认人
    private String confirmingPerson;
    //确认日期
    private Date confirmationDate;
    //编号
    private String serialNumber;
    //投资人--身份证号
    private String idNumber;
    //封闭期，等于借款期限
    private Integer closedPeriod;
    //年化借款率
    private BigDecimal annualizedRate;
    //出借金额大写
    private String lendAmountBig;
    //出借金额小写
    private BigDecimal lendAmountSmall;
    //预期年化收益率
    private BigDecimal annualizedReturn;
    //封闭期开始日期
    private Date closedPeriodStart;
    //封闭期结束日期
    private Date closedPeriodEnd;
    //资金出借方式，1：到期还本付息，3：等额本息，4：按月付息
    private Integer lendingMethod;
    //回款分期数
    private Integer receivedPayments;
    //每期天数
    private Integer daysPerIssue;
    //还款明细
    private List<RepaymentDetailsBO> repaymentDetailsBOs;
    //还款账户户名
    private String repaymentAccountUsername;
    //还款账户帐号
    private String repaymentAccountNumber;
    //还款账户开户行
    private String repaymentAccountOpeningBank;
    //合计回款额
    private BigDecimal totalReturn;
    //合计应收利息
    private BigDecimal aggregateInterestReceivable;
    //合计应收本金
    private BigDecimal aggregatePrincipalReceivable;

    //融资方
    private String financingEnterprise;
    //融资方地址
    private String financingEnterpriseAddress;

    public String getFinancingEnterprise() {
        return financingEnterprise;
    }

    public void setFinancingEnterprise(String financingEnterprise) {
        this.financingEnterprise = financingEnterprise;
    }

    public String getFinancingEnterpriseAddress() {
        return financingEnterpriseAddress;
    }

    public void setFinancingEnterpriseAddress(String financingEnterpriseAddress) {
        this.financingEnterpriseAddress = financingEnterpriseAddress;
    }

    public String getConfirmingPerson() {
        return confirmingPerson;
    }

    public void setConfirmingPerson(String confirmingPerson) {
        this.confirmingPerson = confirmingPerson;
    }

    public Date getConfirmationDate() {
        return confirmationDate;
    }

    public void setConfirmationDate(Date confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Integer getClosedPeriod() {
        return closedPeriod;
    }

    public void setClosedPeriod(Integer closedPeriod) {
        this.closedPeriod = closedPeriod;
    }

    public BigDecimal getAnnualizedRate() {
        return annualizedRate;
    }

    public void setAnnualizedRate(BigDecimal annualizedRate) {
        this.annualizedRate = annualizedRate;
    }

    public String getLendAmountBig() {
        return lendAmountBig;
    }

    public void setLendAmountBig(String lendAmountBig) {
        this.lendAmountBig = lendAmountBig;
    }

    public BigDecimal getLendAmountSmall() {
        return lendAmountSmall;
    }

    public void setLendAmountSmall(BigDecimal lendAmountSmall) {
        this.lendAmountSmall = lendAmountSmall;
    }

    public BigDecimal getAnnualizedReturn() {
        return annualizedReturn;
    }

    public void setAnnualizedReturn(BigDecimal annualizedReturn) {
        this.annualizedReturn = annualizedReturn;
    }

    public Date getClosedPeriodStart() {
        return closedPeriodStart;
    }

    public void setClosedPeriodStart(Date closedPeriodStart) {
        this.closedPeriodStart = closedPeriodStart;
    }

    public Date getClosedPeriodEnd() {
        return closedPeriodEnd;
    }

    public void setClosedPeriodEnd(Date closedPeriodEnd) {
        this.closedPeriodEnd = closedPeriodEnd;
    }

    public Integer getLendingMethod() {
        return lendingMethod;
    }

    public void setLendingMethod(Integer lendingMethod) {
        this.lendingMethod = lendingMethod;
    }

    public Integer getReceivedPayments() {
        return receivedPayments;
    }

    public void setReceivedPayments(Integer receivedPayments) {
        this.receivedPayments = receivedPayments;
    }

    public Integer getDaysPerIssue() {
        return daysPerIssue;
    }

    public void setDaysPerIssue(Integer daysPerIssue) {
        this.daysPerIssue = daysPerIssue;
    }

    public List<RepaymentDetailsBO> getRepaymentDetailsBOs() {
        return repaymentDetailsBOs;
    }

    public void setRepaymentDetailsBOs(List<RepaymentDetailsBO> repaymentDetailsBOs) {
        this.repaymentDetailsBOs = repaymentDetailsBOs;
    }

    public String getRepaymentAccountUsername() {
        return repaymentAccountUsername;
    }

    public void setRepaymentAccountUsername(String repaymentAccountUsername) {
        this.repaymentAccountUsername = repaymentAccountUsername;
    }

    public String getRepaymentAccountNumber() {
        return repaymentAccountNumber;
    }

    public void setRepaymentAccountNumber(String repaymentAccountNumber) {
        this.repaymentAccountNumber = repaymentAccountNumber;
    }

    public String getRepaymentAccountOpeningBank() {
        return repaymentAccountOpeningBank;
    }

    public void setRepaymentAccountOpeningBank(String repaymentAccountOpeningBank) {
        this.repaymentAccountOpeningBank = repaymentAccountOpeningBank;
    }

    public BigDecimal getTotalReturn() {
        return totalReturn;
    }

    public void setTotalReturn(BigDecimal totalReturn) {
        this.totalReturn = totalReturn;
    }

    public BigDecimal getAggregateInterestReceivable() {
        return aggregateInterestReceivable;
    }

    public void setAggregateInterestReceivable(BigDecimal aggregateInterestReceivable) {
        this.aggregateInterestReceivable = aggregateInterestReceivable;
    }

    public BigDecimal getAggregatePrincipalReceivable() {
        return aggregatePrincipalReceivable;
    }

    public void setAggregatePrincipalReceivable(BigDecimal aggregatePrincipalReceivable) {
        this.aggregatePrincipalReceivable = aggregatePrincipalReceivable;
    }
}
