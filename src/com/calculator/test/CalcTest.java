package com.calculator.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.calculator.Main;
import com.calculator.R;
import com.jayway.android.robotium.solo.Solo;


public class CalcTest extends ActivityInstrumentationTestCase2<Main>{

	public Solo solo;
	
	public CalcTest() {
		super(Main.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
		
		/*LogConfigurator logConfigurator = new LogConfigurator(); 
		logConfigurator.setFileName(Environment.getExternalStorageDirectory() 
		+ File.separator + "MyApp" + File.separator + "logs" 
		+ File.separator + "log4j.txt"); 
		logConfigurator.setRootLevel(Level.DEBUG); 
		logConfigurator.setLevel("org.apache", Level.ERROR); 
		logConfigurator.setFilePattern("%d %-5p [%c{2}]-[%L] %m%n"); 
		logConfigurator.setMaxFileSize(1024 * 1024 * 5); 
		logConfigurator.setImmediateFlush(true); 
		logConfigurator.configure(); 
		Logger log = Logger.getLogger(Main.class); 
		log.info("My Application Created");*/

	}
	

	public void testA(){
		EditText FirstValue = (EditText) solo.getView(R.id.EditText01);
		solo.enterText(FirstValue, "5");
		
		EditText SecondValue = (EditText) solo.getView(R.id.EditText02);
		solo.enterText(SecondValue, "8");
		
		solo.clickOnText("gkgkuhlku");
		
		//System.out.println("Hello Calculator");
	}
	

	protected void tearDown() throws Exception {
		try {
			solo.finalize();

		} catch (Throwable e) {
			e.printStackTrace();

		}
		getActivity().finish();
		super.tearDown();
	}
	
}
