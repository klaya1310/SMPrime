package com.swsi.smprime.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_login{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[login/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="pnlSplash.SetTopAndBottom(0, 100%y)"[login/General script]
views.get("pnlsplash").vw.setTop((int)(0d));
views.get("pnlsplash").vw.setHeight((int)((100d / 100 * height) - (0d)));
//BA.debugLineNum = 4;BA.debugLine="pnlSplash.SetLeftAndRight(0, 100%x)"[login/General script]
views.get("pnlsplash").vw.setLeft((int)(0d));
views.get("pnlsplash").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 6;BA.debugLine="pnlLogin.SetLeftAndRight(.25%x, 99.75%x)"[login/General script]
views.get("pnllogin").vw.setLeft((int)((.25d / 100 * width)));
views.get("pnllogin").vw.setWidth((int)((99.75d / 100 * width) - ((.25d / 100 * width))));
//BA.debugLineNum = 7;BA.debugLine="pnlLogin.SetTopAndBottom(42%y, 100%y)"[login/General script]
views.get("pnllogin").vw.setTop((int)((42d / 100 * height)));
views.get("pnllogin").vw.setHeight((int)((100d / 100 * height) - ((42d / 100 * height))));
//BA.debugLineNum = 9;BA.debugLine="pnlButton.VerticalCenter = pnlLogin.Bottom"[login/General script]
views.get("pnlbutton").vw.setTop((int)((views.get("pnllogin").vw.getTop() + views.get("pnllogin").vw.getHeight()) - (views.get("pnlbutton").vw.getHeight() / 2)));
//BA.debugLineNum = 10;BA.debugLine="pnlButton.HorizontalCenter = pnlLogin.HorizontalCenter"[login/General script]
views.get("pnlbutton").vw.setLeft((int)((views.get("pnllogin").vw.getLeft() + views.get("pnllogin").vw.getWidth()/2) - (views.get("pnlbutton").vw.getWidth() / 2)));
//BA.debugLineNum = 12;BA.debugLine="lblUserName.SetLeftAndRight(5%x, pnlLogin.Width - 5%x)"[login/General script]
views.get("lblusername").vw.setLeft((int)((5d / 100 * width)));
views.get("lblusername").vw.setWidth((int)((views.get("pnllogin").vw.getWidth())-(5d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 13;BA.debugLine="lblUserName.Top = 20dip"[login/General script]
views.get("lblusername").vw.setTop((int)((20d * scale)));
//BA.debugLineNum = 14;BA.debugLine="UserNameAnchor.SetLeftAndRight(3%x, pnlLogin.Width - 3%x)"[login/General script]
views.get("usernameanchor").vw.setLeft((int)((3d / 100 * width)));
views.get("usernameanchor").vw.setWidth((int)((views.get("pnllogin").vw.getWidth())-(3d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 15;BA.debugLine="UserNameAnchor.Top = lblUserName.Bottom + 3dip"[login/General script]
views.get("usernameanchor").vw.setTop((int)((views.get("lblusername").vw.getTop() + views.get("lblusername").vw.getHeight())+(3d * scale)));
//BA.debugLineNum = 16;BA.debugLine="UserNameIcon.Left = 2%x"[login/General script]
views.get("usernameicon").vw.setLeft((int)((2d / 100 * width)));
//BA.debugLineNum = 17;BA.debugLine="UserNameIcon.SetTopAndBottom(2%y, UserNameAnchor.Height - 2%y)"[login/General script]
views.get("usernameicon").vw.setTop((int)((2d / 100 * height)));
views.get("usernameicon").vw.setHeight((int)((views.get("usernameanchor").vw.getHeight())-(2d / 100 * height) - ((2d / 100 * height))));
//BA.debugLineNum = 18;BA.debugLine="txtUserName.SetLeftAndRight(UserNameIcon.Right+5dip, UserNameAnchor.Width -1%x)"[login/General script]
views.get("txtusername").vw.setLeft((int)((views.get("usernameicon").vw.getLeft() + views.get("usernameicon").vw.getWidth())+(5d * scale)));
views.get("txtusername").vw.setWidth((int)((views.get("usernameanchor").vw.getWidth())-(1d / 100 * width) - ((views.get("usernameicon").vw.getLeft() + views.get("usernameicon").vw.getWidth())+(5d * scale))));
//BA.debugLineNum = 19;BA.debugLine="txtUserName.SetTopAndBottom(1%y, UserNameAnchor.Height - 1%y)"[login/General script]
views.get("txtusername").vw.setTop((int)((1d / 100 * height)));
views.get("txtusername").vw.setHeight((int)((views.get("usernameanchor").vw.getHeight())-(1d / 100 * height) - ((1d / 100 * height))));
//BA.debugLineNum = 21;BA.debugLine="lblPassword.SetLeftAndRight(5%x, pnlLogin.Width - 5%x)"[login/General script]
views.get("lblpassword").vw.setLeft((int)((5d / 100 * width)));
views.get("lblpassword").vw.setWidth((int)((views.get("pnllogin").vw.getWidth())-(5d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 22;BA.debugLine="lblPassword.Top = UserNameAnchor.Bottom + 10dip"[login/General script]
views.get("lblpassword").vw.setTop((int)((views.get("usernameanchor").vw.getTop() + views.get("usernameanchor").vw.getHeight())+(10d * scale)));
//BA.debugLineNum = 23;BA.debugLine="PasswordAnchor.SetLeftAndRight(3%x, pnlLogin.Width - 3%x)"[login/General script]
views.get("passwordanchor").vw.setLeft((int)((3d / 100 * width)));
views.get("passwordanchor").vw.setWidth((int)((views.get("pnllogin").vw.getWidth())-(3d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 24;BA.debugLine="PasswordAnchor.Top = lblPassword.Bottom + 3dip"[login/General script]
views.get("passwordanchor").vw.setTop((int)((views.get("lblpassword").vw.getTop() + views.get("lblpassword").vw.getHeight())+(3d * scale)));
//BA.debugLineNum = 25;BA.debugLine="PasswordIcon.Left = 2%x"[login/General script]
views.get("passwordicon").vw.setLeft((int)((2d / 100 * width)));
//BA.debugLineNum = 26;BA.debugLine="PasswordIcon.SetTopAndBottom(2%y, PasswordAnchor.Height - 2%y)"[login/General script]
views.get("passwordicon").vw.setTop((int)((2d / 100 * height)));
views.get("passwordicon").vw.setHeight((int)((views.get("passwordanchor").vw.getHeight())-(2d / 100 * height) - ((2d / 100 * height))));
//BA.debugLineNum = 27;BA.debugLine="txtPassword.SetLeftAndRight(PasswordIcon.Right+5dip, PasswordAnchor.Width - 10%x)"[login/General script]
views.get("txtpassword").vw.setLeft((int)((views.get("passwordicon").vw.getLeft() + views.get("passwordicon").vw.getWidth())+(5d * scale)));
views.get("txtpassword").vw.setWidth((int)((views.get("passwordanchor").vw.getWidth())-(10d / 100 * width) - ((views.get("passwordicon").vw.getLeft() + views.get("passwordicon").vw.getWidth())+(5d * scale))));
//BA.debugLineNum = 28;BA.debugLine="txtPassword.SetTopAndBottom(1%y, PasswordAnchor.Height - 1%y)"[login/General script]
views.get("txtpassword").vw.setTop((int)((1d / 100 * height)));
views.get("txtpassword").vw.setHeight((int)((views.get("passwordanchor").vw.getHeight())-(1d / 100 * height) - ((1d / 100 * height))));
//BA.debugLineNum = 30;BA.debugLine="lblShowPassword.VerticalCenter = PasswordIcon.VerticalCenter"[login/General script]
views.get("lblshowpassword").vw.setTop((int)((views.get("passwordicon").vw.getTop() + views.get("passwordicon").vw.getHeight()/2) - (views.get("lblshowpassword").vw.getHeight() / 2)));
//BA.debugLineNum = 31;BA.debugLine="lblShowPassword.Right = PasswordAnchor.Width - 2%x"[login/General script]
views.get("lblshowpassword").vw.setLeft((int)((views.get("passwordanchor").vw.getWidth())-(2d / 100 * width) - (views.get("lblshowpassword").vw.getWidth())));
//BA.debugLineNum = 33;BA.debugLine="lblCheck.Left = 5%x"[login/General script]
views.get("lblcheck").vw.setLeft((int)((5d / 100 * width)));
//BA.debugLineNum = 34;BA.debugLine="lblCheck.Top = PasswordAnchor.Bottom + 20dip"[login/General script]
views.get("lblcheck").vw.setTop((int)((views.get("passwordanchor").vw.getTop() + views.get("passwordanchor").vw.getHeight())+(20d * scale)));
//BA.debugLineNum = 36;BA.debugLine="lblRemember.SetLeftAndRight(lblCheck.Right + 3dip, pnlLogin.Width - 60%x)"[login/General script]
views.get("lblremember").vw.setLeft((int)((views.get("lblcheck").vw.getLeft() + views.get("lblcheck").vw.getWidth())+(3d * scale)));
views.get("lblremember").vw.setWidth((int)((views.get("pnllogin").vw.getWidth())-(60d / 100 * width) - ((views.get("lblcheck").vw.getLeft() + views.get("lblcheck").vw.getWidth())+(3d * scale))));
//BA.debugLineNum = 37;BA.debugLine="lblRemember.VerticalCenter = lblCheck.VerticalCenter"[login/General script]
views.get("lblremember").vw.setTop((int)((views.get("lblcheck").vw.getTop() + views.get("lblcheck").vw.getHeight()/2) - (views.get("lblremember").vw.getHeight() / 2)));
//BA.debugLineNum = 39;BA.debugLine="pnlButton.SetLeftAndRight(3%x, pnlLogin.Width - 3%x)"[login/General script]
views.get("pnlbutton").vw.setLeft((int)((3d / 100 * width)));
views.get("pnlbutton").vw.setWidth((int)((views.get("pnllogin").vw.getWidth())-(3d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 40;BA.debugLine="pnlButton.SetTopAndBottom(pnlLogin.Height - 18%y, pnlLogin.Height - 8%y)"[login/General script]
views.get("pnlbutton").vw.setTop((int)((views.get("pnllogin").vw.getHeight())-(18d / 100 * height)));
views.get("pnlbutton").vw.setHeight((int)((views.get("pnllogin").vw.getHeight())-(8d / 100 * height) - ((views.get("pnllogin").vw.getHeight())-(18d / 100 * height))));
//BA.debugLineNum = 42;BA.debugLine="btnLogin.SetTopAndBottom(0.75%y, pnlButton.Height - 0.75%y)"[login/General script]
views.get("btnlogin").vw.setTop((int)((0.75d / 100 * height)));
views.get("btnlogin").vw.setHeight((int)((views.get("pnlbutton").vw.getHeight())-(0.75d / 100 * height) - ((0.75d / 100 * height))));
//BA.debugLineNum = 43;BA.debugLine="btnLogin.SetLeftAndRight(1%x, pnlButton.Width - 1%x)"[login/General script]
views.get("btnlogin").vw.setLeft((int)((1d / 100 * width)));
views.get("btnlogin").vw.setWidth((int)((views.get("pnlbutton").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 44;BA.debugLine="lblLogin.SetLeftAndRight(1%x, btnLogin.Width-1%x)"[login/General script]
views.get("lbllogin").vw.setLeft((int)((1d / 100 * width)));
views.get("lbllogin").vw.setWidth((int)((views.get("btnlogin").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 45;BA.debugLine="lblLogin.SetTopAndBottom(0.5%y, btnLogin.Height-0.5%x)"[login/General script]
views.get("lbllogin").vw.setTop((int)((0.5d / 100 * height)));
views.get("lbllogin").vw.setHeight((int)((views.get("btnlogin").vw.getHeight())-(0.5d / 100 * width) - ((0.5d / 100 * height))));
//BA.debugLineNum = 47;BA.debugLine="pnlStatus.SetLeftAndRight(0%x, 100%x)"[login/General script]
views.get("pnlstatus").vw.setLeft((int)((0d / 100 * width)));
views.get("pnlstatus").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 48;BA.debugLine="pnlStatus.SetTopAndBottom(94%y, 100%y)"[login/General script]
views.get("pnlstatus").vw.setTop((int)((94d / 100 * height)));
views.get("pnlstatus").vw.setHeight((int)((100d / 100 * height) - ((94d / 100 * height))));
//BA.debugLineNum = 49;BA.debugLine="lblCopyright.SetLeftAndRight(2%x, pnlStatus.Width - 35%x)"[login/General script]
views.get("lblcopyright").vw.setLeft((int)((2d / 100 * width)));
views.get("lblcopyright").vw.setWidth((int)((views.get("pnlstatus").vw.getWidth())-(35d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 50;BA.debugLine="lblCopyright.SetTopAndBottom(0%y, pnlStatus.Height)"[login/General script]
views.get("lblcopyright").vw.setTop((int)((0d / 100 * height)));
views.get("lblcopyright").vw.setHeight((int)((views.get("pnlstatus").vw.getHeight()) - ((0d / 100 * height))));
//BA.debugLineNum = 51;BA.debugLine="lblCompanyName.SetLeftAndRight(37%x, pnlStatus.Width - 2%x)"[login/General script]
views.get("lblcompanyname").vw.setLeft((int)((37d / 100 * width)));
views.get("lblcompanyname").vw.setWidth((int)((views.get("pnlstatus").vw.getWidth())-(2d / 100 * width) - ((37d / 100 * width))));
//BA.debugLineNum = 52;BA.debugLine="lblCompanyName.SetTopAndBottom(0%y, pnlStatus.Height)"[login/General script]
views.get("lblcompanyname").vw.setTop((int)((0d / 100 * height)));
views.get("lblcompanyname").vw.setHeight((int)((views.get("pnlstatus").vw.getHeight()) - ((0d / 100 * height))));

}
}