package pdf.kit;

import com.google.common.collect.Lists;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pdf.kit.component.PDFHeaderFooter;
import pdf.kit.component.PDFKit;
import pdf.kit.component.chart.Line;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by fgm on 2017/4/17.
 * 360报告
 *
 */
public class ReportKit360 {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    public static List<Line> getTemperatureLineList() {
        List<Line> list= Lists.newArrayList();
        for(int i=1;i<=7;i++){
            Line line=new Line();
            float random=Math.round(Math.random()*10);
            line.setxValue("星期" + i);
            line.setyValue(20 + random);
            line.setGroupName("下周");
            list.add(line);
        }
        for(int i=1;i<=7;i++){
            Line line=new Line();
            float random=Math.round(Math.random()*10);
            line.setxValue("星期" + i);
            line.setyValue(20 + random);
            line.setGroupName("这周");
            list.add(line);
        }
        return list;
    }

    public  String createPDF(Object data, String fileName){
        //pdf保存路径
        try {
            //设置自定义PDF页眉页脚工具类
            PDFHeaderFooter headerFooter=new PDFHeaderFooter();
            PDFKit kit=new PDFKit();
//            kit.setHeaderFooterBuilder(headerFooter);
            //设置输出路径
            kit.setSaveFilePath("D:/pdf/contractSaas.pdf");
            String saveFilePath=kit.exportToFile(fileName,data);
            return  saveFilePath;
        } catch (Exception e) {
            log.error("PDF生成失败{}", ExceptionUtils.getFullStackTrace(e));
            return null;
        }
    }

    public static void main(String[] args) {

        SassContract();
    }

public static void CFuFenQI(){
    ReportKit360 kit=new ReportKit360();
    CRentStaging cRentStaging=new CRentStaging();
    cRentStaging.setName("于生");
    cRentStaging.setIdNo("320392199601221318");
    cRentStaging.setPhone("13021991683");
    List<AcconntBill> acconntBill =new ArrayList<AcconntBill>();
    AcconntBill bill = new AcconntBill();
    bill.setDate(new Date());
    bill.setPrincipal(1000.0);
    bill.setTotalRepayment(10000.0);
    bill.setShouXuFei(0.1);
    acconntBill.add(bill);
    cRentStaging.setUserAccountlist(acconntBill);
    String path= kit.createPDF(cRentStaging,"c.pdf");
}

public static void SassContract(){
    //传入对应的参数
    ReportKit360 kit=new ReportKit360();
    SaasContract saasContract =new SaasContract();
    saasContract.setName("于生");
    saasContract.setTenantName("小唐唐公寓公司");
    saasContract.setIdCard("320382199001221318");
    saasContract.setPhone("13021991683");
    saasContract.setHouseAddress("北京市朝阳区望京SOHO");
    saasContract.setArea("20平方米");
    saasContract.setStartDateStr("2018年1月22日14:14:46");
    saasContract.setEndDateStr("2019年1月22日14:14:56");
    saasContract.setMonth("12个月");
    saasContract.setWay("押一付三");
    saasContract.setBillRent("3000");
    saasContract.setBillDeposit("3000");
    String[] a= {"公寓自定义内容"};
    saasContract.setText(a);
    //引入模板
    String path= kit.createPDF(saasContract,"SaasContract.pdf");
}


}
