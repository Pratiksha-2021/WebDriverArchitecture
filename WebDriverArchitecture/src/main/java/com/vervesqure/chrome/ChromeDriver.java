package com.vervesqure.chrome;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.vervesquare.webDriver.IwebDriver;

public class ChromeDriver implements IwebDriver {
	IwebDriver driver;

	public ChromeDriver() {
		System.out.println("chromedriver is started");
		/*
		 * try { Runtime.getRuntime().exec(new
		 * String[]{"cmd","/c","start chromedriver https://www.facebook.com/"});
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
	}

	@Override
	public void get(String url) {
		System.out.println("url of chrome" + url);

	}

	@Override
	public void click() {
		System.out.println("click on button");
	}

	@Override
	public void sendkeys(String strvar) {
		System.out.println("sendkeys value...>" + strvar);

	}

	@Override
	public String getTitle() {

		System.out.println("title of chrome");
		return "gettitle";
	}

	public WebElement findElement() {
		System.out.println("getting webelement");
		return null;

	}

	public void close() {
		System.out.println(" close current browser");
	}

	public void quit() {
		System.out.println("all browser close");
	}

	public boolean isEnabled() {
		System.out.println("element is enabled");
		return true;

	}

	public void navigate() {
		System.out.println("navigate to another window");
	}

	public String getwindowhandle() {
		System.out.println("gets current window id");
		return "current window id";

	}

	public String getcurrentUrl() {
		System.out.println("getting current page url");
		return "url";

	}
}
