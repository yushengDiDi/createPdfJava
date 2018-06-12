package pdf.kit;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @auther ly
 * @date 2017/12/15 16:15
 */
public class LendingAgreement implements Serializable {
    //合同编号
    private String contractNo;
    //投资人姓名
    private String investorName;
    //投资人证件编号
    private String investorPapersId;
    //投资人在平台用户名
    private String investorLoginName;
    //借款人名称
    private String borrowerName;
    //借款人证件ID
    private String borrowerPapersId;
    //借款人在平台用户名
    private String borrowerLoginName;
    /**
     * 标的信息
     */

    //标的名称
    private String bidName;
    //项目编号
    private String bidNo;
    //封闭期
    private int bidClosedPeriod;
    //预期年化收益率
    private BigDecimal annualizedReturn;
    //投资金额小写
    private BigDecimal lendAmountSmall = BigDecimal.ZERO;
    //资金出借方式，1：到期还本付息，3：等额本息，4：按月付息
    private Integer lendingMethod;
    //回款分期数
    private Integer receivedPayments;

    //担保方式
    private String guaranteeMethod ;
    //还款来源
    private String repaymentSource;
    //借款用途
    private String investRequired;
    //借款总额
    private BigDecimal borrowerMoney = BigDecimal.ZERO;
    //担保函编号
    private String guaranteeSn;
    //还款计划表
    private List<RepaymentDetailsBO> repaymentDetailsBOs;
    //还款总利息
    private BigDecimal interestReceivableTotal = BigDecimal.ZERO;
    //还款总计金额
    private BigDecimal repayTotal = BigDecimal.ZERO;


    public BigDecimal getInterestReceivableTotal() {
        return interestReceivableTotal;
    }

    public void setInterestReceivableTotal(BigDecimal interestReceivableTotal) {
        this.interestReceivableTotal = interestReceivableTotal;
    }

    public BigDecimal getRepayTotal() {
        return repayTotal;
    }

    public void setRepayTotal(BigDecimal repayTotal) {
        this.repayTotal = repayTotal;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getInvestorName() {
        return investorName;
    }

    public void setInvestorName(String investorName) {
        this.investorName = investorName;
    }

    public String getInvestorPapersId() {
        return investorPapersId;
    }

    public void setInvestorPapersId(String investorPapersId) {
        this.investorPapersId = investorPapersId;
    }

    public String getInvestorLoginName() {
        return investorLoginName;
    }

    public void setInvestorLoginName(String investorLoginName) {
        this.investorLoginName = investorLoginName;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public String getBorrowerPapersId() {
        return borrowerPapersId;
    }

    public void setBorrowerPapersId(String borrowerPapersId) {
        this.borrowerPapersId = borrowerPapersId;
    }

    public String getBorrowerLoginName() {
        return borrowerLoginName;
    }

    public void setBorrowerLoginName(String borrowerLoginName) {
        this.borrowerLoginName = borrowerLoginName;
    }

    public String getBidName() {
        return bidName;
    }

    public void setBidName(String bidName) {
        this.bidName = bidName;
    }

    public String getBidNo() {
        return bidNo;
    }

    public void setBidNo(String bidNo) {
        this.bidNo = bidNo;
    }

    public int getBidClosedPeriod() {
        return bidClosedPeriod;
    }

    public void setBidClosedPeriod(int bidClosedPeriod) {
        this.bidClosedPeriod = bidClosedPeriod;
    }

    public BigDecimal getAnnualizedReturn() {
        return annualizedReturn;
    }

    public void setAnnualizedReturn(BigDecimal annualizedReturn) {
        this.annualizedReturn = annualizedReturn;
    }

    public BigDecimal getLendAmountSmall() {
        return lendAmountSmall;
    }

    public void setLendAmountSmall(BigDecimal lendAmountSmall) {
        this.lendAmountSmall = lendAmountSmall;
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

    public String getGuaranteeMethod() {
        return guaranteeMethod;
    }

    public void setGuaranteeMethod(String guaranteeMethod) {
        this.guaranteeMethod = guaranteeMethod;
    }

    public String getRepaymentSource() {
        return repaymentSource;
    }

    public void setRepaymentSource(String repaymentSource) {
        this.repaymentSource = repaymentSource;
    }

    public String getInvestRequired() {
        return investRequired;
    }

    public void setInvestRequired(String investRequired) {
        this.investRequired = investRequired;
    }

    public BigDecimal getBorrowerMoney() {
        return borrowerMoney;
    }

    public void setBorrowerMoney(BigDecimal borrowerMoney) {
        this.borrowerMoney = borrowerMoney;
    }

    public String getGuaranteeSn() {
        return guaranteeSn;
    }

    public void setGuaranteeSn(String guaranteeSn) {
        this.guaranteeSn = guaranteeSn;
    }

    public List<RepaymentDetailsBO> getRepaymentDetailsBOs() {
        return repaymentDetailsBOs;
    }

    public void setRepaymentDetailsBOs(List<RepaymentDetailsBO> repaymentDetailsBOs) {
        this.repaymentDetailsBOs = repaymentDetailsBOs;
    }
}
