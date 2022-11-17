package com.crowdar.examples.services;


import com.crowdar.core.actions.MobileActionManager;

import src.main.java.com.crowdar.examples.constants.HomeConstants;

import com.crowdar.examples.constants.SettingsConstants;
import org.joda.time.Months;
import org.openqa.selenium.WebElement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import  org.joda.time.*;


public class HomeService {
    public static void clickEntryAdd(){
       MobileActionManager.click(HomeConstants.ADD_TIME);
    }
    public static void clickMenuFechas(){
        MobileActionManager.click(HomeConstants.MENU_FECHAS);
    }



    public static void clickHoraFin(){
        MobileActionManager.click(HomeConstants.SELECT_END);
    }

    public static void inputHoraInicio(String S_Hora ){
        WebElement element= MobileActionManager.getElement(HomeConstants.HOUR_START_ENTRY);
        while(!element.getText().equals(S_Hora)){
            MobileActionManager.click(HomeConstants.HOUR_START_NEXT);
        }


    }



    public static void inputHoraFin(String E_Hora ){
        WebElement element= MobileActionManager.getElement(HomeConstants.HOUR_END_ENTRY);
        while(!element.getText().equals(E_Hora)){
            MobileActionManager.click(HomeConstants.HOUR_END_NEXT);
        }


    }


    public static void inputFechaInicio(String fecha_I) {
        MobileActionManager.click(HomeConstants.INPUT_FECHA_INICIAL, fecha_I);
        }




    public static void inputFechaSalida(String fecha_S) {
        MobileActionManager.click(HomeConstants.INPUT_FECHA_SALIDA, fecha_S);
        }


    public static void cancelEscenario() {
        MobileActionManager.click(HomeConstants.CANCEL_ENTRY);
        MobileActionManager.click(HomeConstants.CANCEL_ENTRY_CONFIRM);

    }
    public static void clickMenu(){
        MobileActionManager.click(SettingsConstants.MENU);
    }
    public static void cerrarSesion(){
        MobileActionManager.click(SettingsConstants.LOGOUT);

    }
    public static void confirmCerrarSesion(){
        MobileActionManager.click(SettingsConstants.LOGOUT_CONFIRM);
    }

    public static void deleteEntry(){
        MobileActionManager.click(HomeConstants.MORE_TIME_ENTRY);
        MobileActionManager.click(HomeConstants.DELETE_ENTRY);
    }

}

