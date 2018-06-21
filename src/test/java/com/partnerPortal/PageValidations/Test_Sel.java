package com.partnerPortal.PageValidations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.FTCash.Panel.testClassMerch_panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.constants.Constants;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestDataUtils;

public class Test_Sel {
	
	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	testClassMerch_panel objects= new testClassMerch_panel();
	TestDataUtils utils= new TestDataUtils();
	Read_Excel ex= new Read_Excel();
	
	/** The base project path. */
	public static String baseProjectPath = System.getProperty(Constants.USER_DIR);

	public static void main(String args[]) {
	
	String str= "saikrishna";

	char[] ch= str.toCharArray();
	
	Set<Character> ch1 = new LinkedHashSet<>();
	
	for(Character c : ch) {
		ch1.add(c);
	}
	
	StringBuilder sb= new StringBuilder();
	
	for(Character c1 : ch1) {
		sb.append(c1);
	}
	System.out.println(sb.toString());
}
	
}