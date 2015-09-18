package com.ectrs.testdev.mtest;

import java.util.ArrayList;
import java.util.List;

import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.SuiteRunner;
import org.testng.TestRunner;
import org.testng.reporters.XMLReporter;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class TestngReport
{

  public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchFieldException, SecurityException
  {
    //SuiteHTMLReporter reporter = new SuiteHTMLReporter();
    XMLReporter xmlreporter = new XMLReporter();
    
    List<XmlSuite> xmlSuites = new ArrayList<>();
    XmlSuite xs = new XmlSuite();
    List<XmlTest> tests = new ArrayList<>();
    XmlTest xt = new XmlTest();
    xt.setName("Test/gogo");
    tests.add(xt);
    xs.setTests(tests);
    List<ISuite> suites = new ArrayList<>();
    SuiteRunner sr = new SuiteRunner(null, xs, null);
    Class clazz = Class.forName("org.testng.SuiteResult");
    ISuiteResult sres = (ISuiteResult) clazz.newInstance();
    
    TestRunner tr = new TestRunner(null, sr, xt, false, null);
    clazz.getField("m_testContext");
    
    String outputDirectory = "c:/report";
    xmlreporter.generateReport(xmlSuites, suites, outputDirectory );
  }

}
