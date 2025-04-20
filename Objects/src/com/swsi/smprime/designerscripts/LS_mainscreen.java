package com.swsi.smprime.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_mainscreen{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("toolbar").vw.setTop((int)((0d * scale)));
if ((anywheresoftware.b4a.keywords.LayoutBuilder.getScreenSize()>6.5d)) { 
;
views.get("toolbar").vw.setHeight((int)((64d * scale)));
;}else{ 
;
if ((BA.ObjectToBoolean( String.valueOf(anywheresoftware.b4a.keywords.LayoutBuilder.isPortrait())))) { 
;
views.get("toolbar").vw.setHeight((int)((50d * scale)));
;}else{ 
;
views.get("toolbar").vw.setHeight((int)((42d * scale)));
;};
;};
views.get("pnlmain").vw.setLeft((int)((0d / 100 * width)));
views.get("pnlmain").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("pnlmain").vw.setTop((int)((views.get("toolbar").vw.getTop() + views.get("toolbar").vw.getHeight())));
views.get("pnlmain").vw.setHeight((int)((100d / 100 * height) - ((views.get("toolbar").vw.getTop() + views.get("toolbar").vw.getHeight()))));
views.get("pnlaccount").vw.setLeft((int)((2d / 100 * width)));
views.get("pnlaccount").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(2d / 100 * width) - ((2d / 100 * width))));
views.get("pnlaccount").vw.setTop((int)((10d * scale)));
views.get("pnlaccount").vw.setHeight((int)((views.get("pnlmain").vw.getHeight())-(77d / 100 * height) - ((10d * scale))));
views.get("circleaccount").vw.setLeft((int)((2d / 100 * width)));
views.get("circleaccount").vw.setTop((int)((2d / 100 * height)));
views.get("lblinitials").vw.setTop((int)((views.get("circleaccount").vw.getHeight())/2d - (views.get("lblinitials").vw.getHeight() / 2)));
views.get("lblinitials").vw.setLeft((int)((views.get("circleaccount").vw.getWidth())/2d - (views.get("lblinitials").vw.getWidth() / 2)));
views.get("lblaccountname").vw.setLeft((int)((views.get("circleaccount").vw.getLeft() + views.get("circleaccount").vw.getWidth())+(10d * scale)));
views.get("lblaccountname").vw.setWidth((int)((views.get("pnlaccount").vw.getWidth())-(12d / 100 * width) - ((views.get("circleaccount").vw.getLeft() + views.get("circleaccount").vw.getWidth())+(10d * scale))));
views.get("lblaccountname").vw.setTop((int)((views.get("circleaccount").vw.getTop())));
views.get("lblbranch").vw.setLeft((int)((views.get("circleaccount").vw.getLeft() + views.get("circleaccount").vw.getWidth())+(10d * scale)));
views.get("lblbranch").vw.setWidth((int)((views.get("pnlaccount").vw.getWidth())-(12d / 100 * width) - ((views.get("circleaccount").vw.getLeft() + views.get("circleaccount").vw.getWidth())+(10d * scale))));
views.get("lblbranch").vw.setTop((int)((views.get("lblaccountname").vw.getTop() + views.get("lblaccountname").vw.getHeight())));
views.get("lblposition").vw.setLeft((int)((views.get("circleaccount").vw.getLeft() + views.get("circleaccount").vw.getWidth())+(10d * scale)));
views.get("lblposition").vw.setWidth((int)((views.get("pnlaccount").vw.getWidth())-(12d / 100 * width) - ((views.get("circleaccount").vw.getLeft() + views.get("circleaccount").vw.getWidth())+(10d * scale))));
views.get("lblposition").vw.setTop((int)((views.get("lblbranch").vw.getTop() + views.get("lblbranch").vw.getHeight())));
views.get("profile").vw.setLeft((int)((views.get("pnlaccount").vw.getWidth())-(3d / 100 * width) - (views.get("profile").vw.getWidth())));
views.get("profile").vw.setTop((int)((views.get("circleaccount").vw.getTop() + views.get("circleaccount").vw.getHeight()/2) - (views.get("profile").vw.getHeight() / 2)));
views.get("profile").vw.setWidth((int)((8d / 100 * width)));
views.get("profile").vw.setHeight((int)((views.get("profile").vw.getWidth())));
views.get("pnlbillperiod").vw.setTop((int)((views.get("pnlaccount").vw.getTop() + views.get("pnlaccount").vw.getHeight())+(10d * scale)));
views.get("pnlbillperiod").vw.setHeight((int)((views.get("pnlmain").vw.getHeight())-(69d / 100 * height) - ((views.get("pnlaccount").vw.getTop() + views.get("pnlaccount").vw.getHeight())+(10d * scale))));
views.get("pnlbillperiod").vw.setLeft((int)((2d / 100 * width)));
views.get("pnlbillperiod").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(2d / 100 * width) - ((2d / 100 * width))));
views.get("cal").vw.setLeft((int)((1d / 100 * width)));
views.get("cal").vw.setTop((int)((views.get("pnlbillperiod").vw.getHeight())/2d - (views.get("cal").vw.getHeight() / 2)));
views.get("lblbptitle").vw.setLeft((int)((views.get("cal").vw.getLeft() + views.get("cal").vw.getWidth())+(5d * scale)));
views.get("lblbptitle").vw.setTop((int)((views.get("cal").vw.getTop() + views.get("cal").vw.getHeight()/2) - (views.get("lblbptitle").vw.getHeight() / 2)));
views.get("lblbillingperiod").vw.setLeft((int)((views.get("lblbptitle").vw.getLeft() + views.get("lblbptitle").vw.getWidth())+(2d * scale)));
views.get("lblbillingperiod").vw.setWidth((int)((views.get("pnlbillperiod").vw.getWidth())-(12d / 100 * width) - ((views.get("lblbptitle").vw.getLeft() + views.get("lblbptitle").vw.getWidth())+(2d * scale))));
views.get("lblbillingperiod").vw.setTop((int)((views.get("cal").vw.getTop() + views.get("cal").vw.getHeight()/2) - (views.get("lblbillingperiod").vw.getHeight() / 2)));
views.get("billperiodsettings").vw.setLeft((int)((views.get("pnlbillperiod").vw.getWidth())-(2d / 100 * width) - (views.get("billperiodsettings").vw.getWidth())));
views.get("billperiodsettings").vw.setTop((int)((views.get("cal").vw.getTop() + views.get("cal").vw.getHeight()/2) - (views.get("billperiodsettings").vw.getHeight() / 2)));
views.get("pnlprintersettings").vw.setTop((int)((views.get("pnlbillperiod").vw.getTop() + views.get("pnlbillperiod").vw.getHeight())+(10d * scale)));
views.get("pnlprintersettings").vw.setHeight((int)((views.get("pnlmain").vw.getHeight())-(45d / 100 * height) - ((views.get("pnlbillperiod").vw.getTop() + views.get("pnlbillperiod").vw.getHeight())+(10d * scale))));
//BA.debugLineNum = 58;BA.debugLine="pnlPrinterSettings.SetLeftAndRight(2%x, pnlMain.Width - 2%x)"[MainScreen/General script]
views.get("pnlprintersettings").vw.setLeft((int)((2d / 100 * width)));
views.get("pnlprintersettings").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(2d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 60;BA.debugLine="pnlAccountSettings.SetTopAndBottom(pnlPrinterSettings.Bottom + 10dip, pnlMain.Height - 20%y)"[MainScreen/General script]
views.get("pnlaccountsettings").vw.setTop((int)((views.get("pnlprintersettings").vw.getTop() + views.get("pnlprintersettings").vw.getHeight())+(10d * scale)));
views.get("pnlaccountsettings").vw.setHeight((int)((views.get("pnlmain").vw.getHeight())-(20d / 100 * height) - ((views.get("pnlprintersettings").vw.getTop() + views.get("pnlprintersettings").vw.getHeight())+(10d * scale))));
//BA.debugLineNum = 61;BA.debugLine="pnlPrinterSettings.SetLeftAndRight(2%x, pnlMain.Width - 2%x)"[MainScreen/General script]
views.get("pnlprintersettings").vw.setLeft((int)((2d / 100 * width)));
views.get("pnlprintersettings").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(2d / 100 * width) - ((2d / 100 * width))));

}
}