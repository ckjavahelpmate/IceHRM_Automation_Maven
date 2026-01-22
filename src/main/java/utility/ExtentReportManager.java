package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager 
{
	private static ExtentReports extentReports ;
	private static ThreadLocal<ExtentTest> tests = new ThreadLocal<ExtentTest>();
	
	public static ExtentReports createExtentReport() 
	{
		if( extentReports == null )
		{
//			Create WebPage
				ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("./reports/extent-report.html");
				extentSparkReporter.config().setDocumentTitle("ICE HRM Automation");
				extentSparkReporter.config().setTheme(Theme.DARK);
				
//			Create dash board
				extentReports = new ExtentReports();
				extentReports.setSystemInfo("Suite Name", "Resgression");
				extentReports.setSystemInfo("Suite Name", "Resgression");
				extentReports.setSystemInfo("Suite Name", "Resgression");
				extentReports.setSystemInfo("Suite Name", "Resgression");
				extentReports.setSystemInfo("Suite Name", "Resgression");
				
//			Attach the dash board to the web page
				extentReports.attachReporter(extentSparkReporter);	
		}
		
		return extentReports ;
	}
	
	public static void setTest(ExtentTest extentTest) {
		tests.set(extentTest);
	}
	
	public static ExtentTest getTest() {
		return tests.get();
	}
	
	public static void flushreport() {
		if( extentReports != null )
		{
			extentReports.flush();
		}
	}
	
}












