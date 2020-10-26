package com.vervesquare.webDriver;

import org.openqa.selenium.WebElement;

public interface IwebDriver {

	public String getTitle();

	public void click();

	public void sendkeys(String strvar);

	public void get(String url);

	public WebElement findElement();

	public void close();

	public void quit();

	public boolean isEnabled();

	public void navigate();

	public String getwindowhandle();

	public String getcurrentUrl();

}
