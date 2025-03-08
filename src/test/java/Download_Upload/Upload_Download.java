package Download_Upload;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

public class Upload_Download {
    public static void main(String[] args) throws IOException {
        String Fruitname ="Apple";
        String fileName ="C:\\Users\\Atul\\Downloads\\download.xlsx";
        String updatedValue="598";

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
        //download
        driver.findElement(By.cssSelector("#downloadButton")).click();
        // edit excel -get columnnumber of price  - getRownumber of apple -> Update excel with row and col
        int col = getColumnNumber(fileName,"price");
        int row = getRowNumber(fileName,"Apple");
        Assert.assertTrue(updateCell(fileName,row,col,updatedValue));
        //upload
      WebElement Upload= driver.findElement(By.cssSelector("input[type='file']"));
     // Upload.sendKeys("C:\\Users\\Atul\\Downloads\\download.xlsx");
      Upload.sendKeys(fileName);


            // edit excel -get columnnumber of price  - getRownumber of apple -> Update excel with row and col




       //wait for success message to appear and wait for disappear
        By toastLocator = By.cssSelector(".Toastify__toast-body div:nth-child(2)");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(toastLocator));
       String toastText= driver.findElement(toastLocator).getText();
        System.out.println(toastText);
        Assert.assertEquals("Updated Excel Data Successfully.",toastText);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(toastLocator));


        // verify updated excel data showing in the web table
        String Pricecolumn= driver.findElement(By.xpath("//div[text()='Price']")).getDomAttribute("data-column-id");
       String actualprice= driver.findElement(By.xpath("//div[text()='"+Fruitname+"']/parent::div/parent::div/div[@id='cell-"+Pricecolumn+"-undefined']")).getText();
        System.out.println(actualprice);
       Assert.assertEquals(updatedValue,actualprice);

    }

    private static boolean updateCell(String fileName, int row, int col, String updatedValue) throws IOException {
        ArrayList<String> a = new ArrayList<>();
        FileInputStream fis = new FileInputStream(fileName);
        XSSFWorkbook workbook = new  XSSFWorkbook(fis);
        XSSFSheet Sheet = workbook.getSheet("Sheet1");
      Row rowField=  Sheet.getRow(row-1);
     Cell cellfield= rowField.getCell(col);
     cellfield.setCellValue(updatedValue);
        FileOutputStream fos = new FileOutputStream(fileName);
        workbook.write(fos);
        workbook.close();
        fis.close();
        return true;


    }

    private static int getColumnNumber(String fileName, String colname) throws IOException {
        ArrayList<String> a = new ArrayList<>();
        FileInputStream fis = new FileInputStream(fileName);
        XSSFWorkbook workbook = new     XSSFWorkbook(fis);
                XSSFSheet Sheet = workbook.getSheet("Sheet1");
                //Identify Testcases column by scanning the entire 1st row
                Iterator<Row> rows= Sheet.iterator();// sheet is the collection of rows
                Row firstrow=  rows.next();
                Iterator <Cell> ce=  firstrow.cellIterator();  // row is collection of cells
                int k=0;
                int column = 0;
                while(ce.hasNext()){
                    Cell value=  ce.next();
                    if (value.getStringCellValue().equalsIgnoreCase(colname))
                    {
                        //desired
                        column=k;
                    }
                    k++;

                }
                System.out.println(column);

        return column;
    }

    private static int getRowNumber(String fileName, String text) throws IOException {
        ArrayList<String> a = new ArrayList<>();
        FileInputStream fis = new FileInputStream(fileName);
        XSSFWorkbook workbook = new     XSSFWorkbook(fis);
        XSSFSheet Sheet = workbook.getSheet("Sheet1");
        //Identify Testcases column by scanning the entire 1st row
        Iterator<Row> rows= Sheet.iterator();//
        // sheet is the collection of rows


        int k=1;
        int rowindex=-1;

        while(rows.hasNext()){
          Row row= rows.next();
            Iterator <Cell> cells=  row.cellIterator();
            while(cells.hasNext()){
                Cell cell = cells.next();
                if(cell.getCellType()== CellType.STRING && cell.getStringCellValue().equalsIgnoreCase(text)){
                    rowindex=k;

                }
            }
            k++;
        }
        return rowindex;
    }
}
