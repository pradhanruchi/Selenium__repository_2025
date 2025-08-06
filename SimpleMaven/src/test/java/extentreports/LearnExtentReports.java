package extentreports;

import java.time.LocalDateTime;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnExtentReports {
	@Test
	public void createReporta()  {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		//Step 1: create ExtentSparkReporter object
		ExtentSparkReporter spark= new ExtentSparkReporter("./HTML_reports/ExtentReport_"+timestamp+".html");
		
		//Step 2: create ExtentReports Object   (actual report)
		ExtentReports ereport=new ExtentReports();
		
		//Step 3: attach ExtentSparkReporter to ExtentReports
		ereport.attachReporter(spark);
		
		//Step 4: create ExtentTest object
		ExtentTest test= ereport.createTest("createReport");
		
		//Step 5: call log(Status,"message")
		test.log(Status.PASS, "message added into report");
		
		//Step 6: call flush()
		ereport.flush();	
	}
}
