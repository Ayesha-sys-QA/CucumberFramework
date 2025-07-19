package com.test.steps;
import com.test.utils.CommonMethods;

import com.test.testbase.BaseClass;
import com.test.testbase.PageInitializer;

import io.cucumber.java.After;
import io.cucumber.java.Before;

	

	public class Hooks extends CommonMethods {

		@Before
		public void start() {
			setUp();
			PageInitializer.initialize();
		}

		@After
		public void end() {
			tearDown();
		}
	}
