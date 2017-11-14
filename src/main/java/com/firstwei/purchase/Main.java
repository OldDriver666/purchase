/**
 * 采购计划
 */
package com.firstwei.purchase;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.firstwei.purchase.entity.AddOrderInfo;
import com.firstwei.purchase.entity.BackOrderInfo;
import com.firstwei.purchase.entity.SaleDayInfo;
import com.firstwei.purchase.entity.SaleInfo;
import com.firstwei.purchase.entity.StockInfo;
import com.firstwei.purchase.util.ExcelImporterUtils;
import com.firstwei.purchase.util.ExportUtils;

/**
 * @author tantan
 * 
 */
public class Main {
	
	private static String SALE_TABLE = "D:\\采购计划\\销量分析.xlsx";
	private static String STOCK_TABLE = "D:\\采购计划\\库存量.xlsx";
	private static String BACK_ORDER_TABLE = "D:\\采购计划\\未交量.xlsx";
	private static String SALE_DAY_TABLE = "D:\\采购计划\\可销天数.xlsx";
	private static String ADD_ORDER_TABLE = "D:\\采购计划\\加单数量.xlsx";

	/**
	 * 入口
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
//		//读取销量表
//		List<SaleInfo>  saleList = ExcelImporterUtils.importSheet(SALE_TABLE, SaleInfo.class, SaleInfo.class.getSimpleName());
//		//读取库存表
//		List<StockInfo>  stockList = ExcelImporterUtils.importSheet(STOCK_TABLE, StockInfo.class, StockInfo.class.getSimpleName());
//		//读取未交量表
//		List<BackOrderInfo>  backOrderList = ExcelImporterUtils.importSheet(BACK_ORDER_TABLE, BackOrderInfo.class, BackOrderInfo.class.getSimpleName());
//		//可销天数表
//		List<SaleDayInfo>  saleDayList = ExcelImporterUtils.importSheet(SALE_DAY_TABLE, SaleDayInfo.class, SaleDayInfo.class.getSimpleName());
//
		//计算加单量
		List<AddOrderInfo> addOrderList = new ArrayList<AddOrderInfo>();
		AddOrderInfo ao = new AddOrderInfo();
		ao.setGoodsName("苹果");
		ao.setAddOrderQuantity(2000);
		addOrderList.add(ao);
		
		AddOrderInfo bo = new AddOrderInfo();
		bo.setGoodsName("香蕉");
		bo.setAddOrderQuantity(2000);
		addOrderList.add(bo);
		
//		String path = "d:/";    
//        String fileName = "test";    
//        String fileType = "xlsx";    
        writer(ADD_ORDER_TABLE, "xlsx",addOrderList);    
//        read(path, fileName, fileType);    
		
	}
	

	private static void writer(String filePath,String fileType, List<AddOrderInfo> list) throws IOException {    
        //创建工作文档对象     
        Workbook wb = null;    
        if (fileType.equals("xls")) {    
            wb = new HSSFWorkbook();    
        }    
        else if(fileType.equals("xlsx"))    
        {    
            wb = new XSSFWorkbook();    
        }    
        else    
        {    
            System.out.println("您的文档格式不正确！");    
        }    
        
        //创建sheet对象     
        Sheet sheet1 = (Sheet) wb.createSheet("sheet1");    
        int length = list.size();
//        int size = AddOrderInfo.class.getFields().length;
        //循环写入行数据     
        for (int i = 0; i < length; i++) {    
            Row row = (Row) sheet1.createRow(i);    
            //循环写入列数据     
            Cell cell0 = row.createCell(0);    
            cell0.setCellValue(list.get(i).getGoodsName());    
            Cell cell1 = row.createCell(1);    
            cell1.setCellValue(list.get(i).getAddOrderQuantity());    
        }    
        //创建文件流     
        OutputStream stream = new FileOutputStream(filePath);    
        //写入数据     
        wb.write(stream);    
        //关闭文件流     
        stream.close();    
    }    
	
    public static void read(String path,String fileName,String fileType) throws IOException    
    {    
        InputStream stream = new FileInputStream(path+fileName+"."+fileType);    
        Workbook wb = null;    
        if (fileType.equals("xls")) {    
            wb = new HSSFWorkbook(stream);    
        }    
        else if (fileType.equals("xlsx")) {    
            wb = new XSSFWorkbook(stream);    
        }    
        else {    
            System.out.println("您输入的excel格式不正确");    
        }    
        Sheet sheet1 = wb.getSheetAt(0);    
        for (Row row : sheet1) {    
            for (Cell cell : row) {    
                System.out.print(cell.getStringCellValue()+"  ");    
            }    
            System.out.println();    
        }    
    }    

}
