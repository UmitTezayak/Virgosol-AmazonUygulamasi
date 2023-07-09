package tests;

import base.BaseClass;
import methods.Methods;
import static costants.BaseCostants.*;
import static costants.HomePageCostants.*;
import static costants.MainPageCostants.*;
import org.junit.Assert;


public class HomePage extends BaseClass {


    public static void login(){
        Assert.assertEquals(Methods.findElement(LOGO_XPATH).isDisplayed(), true);
        Methods.waitClicableClick(COOKIE_SUBMIT_BUTTON);
        Methods.waitClicableClick(LOGIN_BUTTON);
        Methods.waitVisibilitySendKey(USERNAME_TEXT, USERNAME);
        Methods.waitClicableClick(CONTINUE_BUTTON);
        Methods.waitVisibilitySendKey(PASSWORD_TEXT, PASSWORD);
        Methods.waitClicableSubmit(SUBMIT_BUTON);
       // Assert.assertEquals(Methods.findElement(MYACCOUNT).isDisplayed(), true);
    }

    public static void makeList() {
        Methods.waitClicableClick(ACCOUNT_BUTTON);
        Methods.waitClicableClick(MYLIST);
        Methods.waitClicableClick(MAKEALIST);
        Methods.clearToElement(LISTNAME);
        Methods.waitVisibilitySendKey(LISTNAME, LISTNAME_WORD);
        Methods.waitClicableClick(MAKEALIST_BUTTON);
       try {
           Thread.sleep(5000);}
       catch (InterruptedException e){
           e.printStackTrace();}
    }

    public static void searchAndSelectProduct() {

        Methods.waitVisibilityClick(DROPDOWNBOX_COMPUTERS);
        Methods.waitVisibilitySendKey(SEARCH_BAR, SEARCHWORD);
        Methods.waitClicableClick(SEARCH_BUTTON);
        Methods.waitClicableClick(PAGE_2);
        Methods.waitClicableClick(SECOND_PRODUCT);
        Methods.waitClicableClick(MY_LISTNAME_BEFORE);
        Methods.waitVisibilityClick(MY_LISTNAME);
        Methods.waitClicableClick(CONTINUE_SHOPPING);
        Methods.waitClicableClick(ACCOUNT_BUTTON);
        Methods.waitClicableClick(MYLIST);
        Methods.waitClicableClick(DELETE_PRODUCT);
        Methods.hoverElement(ACCOUNT_BUTTON);
        Methods.waitClicableClick(EXIT_BUTTON);
    }

}




