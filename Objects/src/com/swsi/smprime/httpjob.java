package com.swsi.smprime;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class httpjob extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.swsi.smprime.httpjob");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.swsi.smprime.httpjob.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _jobname = "";
public boolean _success = false;
public String _username = "";
public String _password = "";
public String _errormessage = "";
public Object _target = null;
public String _taskid = "";
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest _req = null;
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response = null;
public Object _tag = null;
public b4a.example.dateutils _dateutils = null;
public com.swsi.smprime.main _main = null;
public com.swsi.smprime.starter _starter = null;
public com.swsi.smprime.dbutils _dbutils = null;
public com.swsi.smprime.mainscreen _mainscreen = null;
public com.swsi.smprime.httputils2service _httputils2service = null;
public static class _multipartfiledata{
public boolean IsInitialized;
public String Dir;
public String FileName;
public String KeyName;
public String ContentType;
public void Initialize() {
IsInitialized = true;
Dir = "";
FileName = "";
KeyName = "";
ContentType = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public JobName As String";
_jobname = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Success As Boolean";
_success = false;
 //BA.debugLineNum = 5;BA.debugLine="Public Username, Password As String";
_username = "";
_password = "";
 //BA.debugLineNum = 6;BA.debugLine="Public ErrorMessage As String";
_errormessage = "";
 //BA.debugLineNum = 7;BA.debugLine="Private target As Object";
_target = new Object();
 //BA.debugLineNum = 13;BA.debugLine="Private taskId As String";
_taskid = "";
 //BA.debugLineNum = 15;BA.debugLine="Private req As OkHttpRequest";
_req = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest();
 //BA.debugLineNum = 16;BA.debugLine="Public Response As OkHttpResponse";
_response = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse();
 //BA.debugLineNum = 25;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 26;BA.debugLine="Type MultipartFileData (Dir As String, FileName A";
;
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _complete(int _id) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Public Sub Complete (id As Int)";
 //BA.debugLineNum = 249;BA.debugLine="taskId = id";
_taskid = BA.NumberToString(_id);
 //BA.debugLineNum = 250;BA.debugLine="CallSubDelayed2(target, \"JobDone\", Me)";
__c.CallSubDelayed2(ba,_target,"JobDone",this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return "";
}
public String  _delete(String _link) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Public Sub Delete(Link As String)";
 //BA.debugLineNum = 207;BA.debugLine="req.InitializeDelete(Link)";
_req.InitializeDelete(_link);
 //BA.debugLineNum = 208;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return "";
}
public String  _delete2(String _link,String[] _parameters) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Public Sub Delete2(Link As String, Parameters() As";
 //BA.debugLineNum = 212;BA.debugLine="req.InitializeDelete(escapeLink(Link, Parameters)";
_req.InitializeDelete(_escapelink(_link,_parameters));
 //BA.debugLineNum = 213;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return "";
}
public String  _download(String _link) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Public Sub Download(Link As String)";
 //BA.debugLineNum = 177;BA.debugLine="req.InitializeGet(Link)";
_req.InitializeGet(_link);
 //BA.debugLineNum = 178;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public String  _download2(String _link,String[] _parameters) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
 //BA.debugLineNum = 187;BA.debugLine="req.InitializeGet(escapeLink(Link, Parameters))";
_req.InitializeGet(_escapelink(_link,_parameters));
 //BA.debugLineNum = 188;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return "";
}
public String  _escapelink(String _link,String[] _parameters) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
int _i = 0;
 //BA.debugLineNum = 191;BA.debugLine="Private Sub escapeLink(Link As String, Parameters(";
 //BA.debugLineNum = 192;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 193;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 194;BA.debugLine="sb.Append(Link)";
_sb.Append(_link);
 //BA.debugLineNum = 195;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
if (_parameters.length>0) { 
_sb.Append("?");};
 //BA.debugLineNum = 196;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 197;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
{
final int step6 = 2;
final int limit6 = (int) (_parameters.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 198;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
if (_i>0) { 
_sb.Append("&");};
 //BA.debugLineNum = 199;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
_sb.Append(_su.EncodeUrl(_parameters[_i],"UTF8")).Append("=");
 //BA.debugLineNum = 200;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
_sb.Append(_su.EncodeUrl(_parameters[(int) (_i+1)],"UTF8"));
 }
};
 //BA.debugLineNum = 202;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmap() throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
 //BA.debugLineNum = 263;BA.debugLine="Public Sub GetBitmap As Bitmap";
 //BA.debugLineNum = 264;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 265;BA.debugLine="b = LoadBitmap(HttpUtils2Service.TempFolder, task";
_b = __c.LoadBitmap(_httputils2service._tempfolder /*String*/ ,_taskid);
 //BA.debugLineNum = 266;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmapresize(int _width,int _height,boolean _keepaspectratio) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Public Sub GetBitmapResize(Width As Int, Height As";
 //BA.debugLineNum = 275;BA.debugLine="Return LoadBitmapResize(HttpUtils2Service.TempFol";
if (true) return __c.LoadBitmapResize(_httputils2service._tempfolder /*String*/ ,_taskid,_width,_height,_keepaspectratio);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmapsample(int _width,int _height) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Public Sub GetBitmapSample(Width As Int, Height As";
 //BA.debugLineNum = 271;BA.debugLine="Return LoadBitmapSample(HttpUtils2Service.TempFol";
if (true) return __c.LoadBitmapSample(_httputils2service._tempfolder /*String*/ ,_taskid,_width,_height);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper  _getinputstream() throws Exception{
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
 //BA.debugLineNum = 280;BA.debugLine="Public Sub GetInputStream As InputStream";
 //BA.debugLineNum = 281;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 282;BA.debugLine="In = File.OpenInput(HttpUtils2Service.TempFolder,";
_in = __c.File.OpenInput(_httputils2service._tempfolder /*String*/ ,_taskid);
 //BA.debugLineNum = 283;BA.debugLine="Return In";
if (true) return _in;
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest  _getrequest() throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Public Sub GetRequest As OkHttpRequest";
 //BA.debugLineNum = 244;BA.debugLine="Return req";
if (true) return _req;
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public String  _getstring() throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Public Sub GetString As String";
 //BA.debugLineNum = 225;BA.debugLine="Return GetString2(\"UTF8\")";
if (true) return _getstring2("UTF8");
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return "";
}
public String  _getstring2(String _encoding) throws Exception{
anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _tr = null;
String _res = "";
 //BA.debugLineNum = 229;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
 //BA.debugLineNum = 233;BA.debugLine="Dim tr As TextReader";
_tr = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
 //BA.debugLineNum = 234;BA.debugLine="tr.Initialize2(File.OpenInput(HttpUtils2Service.T";
_tr.Initialize2((java.io.InputStream)(__c.File.OpenInput(_httputils2service._tempfolder /*String*/ ,_taskid).getObject()),_encoding);
 //BA.debugLineNum = 235;BA.debugLine="Dim res As String = tr.ReadAll";
_res = _tr.ReadAll();
 //BA.debugLineNum = 236;BA.debugLine="tr.Close";
_tr.Close();
 //BA.debugLineNum = 237;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return "";
}
public String  _head(String _link) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Public Sub Head(Link As String)";
 //BA.debugLineNum = 84;BA.debugLine="req.InitializeHead(Link)";
_req.InitializeHead(_link);
 //BA.debugLineNum = 85;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _name,Object _targetmodule) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 35;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
 //BA.debugLineNum = 36;BA.debugLine="JobName = Name";
_jobname = _name;
 //BA.debugLineNum = 37;BA.debugLine="target = TargetModule";
_target = _targetmodule;
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public boolean  _multipartstartsection(anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream,boolean _empty) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Private Sub MultipartStartSection (stream As Outpu";
 //BA.debugLineNum = 138;BA.debugLine="If empty = False Then";
if (_empty==__c.False) { 
 //BA.debugLineNum = 139;BA.debugLine="stream.WriteBytes(Array As Byte(13, 10), 0, 2)";
_stream.WriteBytes(new byte[]{(byte) (13),(byte) (10)},(int) (0),(int) (2));
 }else {
 //BA.debugLineNum = 141;BA.debugLine="empty = False";
_empty = __c.False;
 };
 //BA.debugLineNum = 143;BA.debugLine="Return empty";
if (true) return _empty;
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return false;
}
public String  _patchbytes(String _link,byte[] _data) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Public Sub PatchBytes(Link As String, Data() As By";
 //BA.debugLineNum = 75;BA.debugLine="req.InitializePatch2(Link, Data)";
_req.InitializePatch2(_link,_data);
 //BA.debugLineNum = 78;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _patchstring(String _link,String _text) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub PatchString(Link As String, Text As Str";
 //BA.debugLineNum = 63;BA.debugLine="PatchBytes(Link, Text.GetBytes(\"UTF8\"))";
_patchbytes(_link,_text.getBytes("UTF8"));
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public String  _postbytes(String _link,byte[] _data) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
 //BA.debugLineNum = 46;BA.debugLine="req.InitializePost2(Link, Data)";
_req.InitializePost2(_link,_data);
 //BA.debugLineNum = 47;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _postfile(String _link,String _dir,String _filename) throws Exception{
int _length = 0;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
 //BA.debugLineNum = 148;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
 //BA.debugLineNum = 153;BA.debugLine="Dim length As Int";
_length = 0;
 //BA.debugLineNum = 154;BA.debugLine="If Dir = File.DirAssets Then";
if ((_dir).equals(__c.File.getDirAssets())) { 
 //BA.debugLineNum = 155;BA.debugLine="Log(\"Cannot send files from the assets folder.\")";
__c.LogImpl("93145735","Cannot send files from the assets folder.",0);
 //BA.debugLineNum = 156;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 158;BA.debugLine="length = File.Size(Dir, FileName)";
_length = (int) (__c.File.Size(_dir,_filename));
 //BA.debugLineNum = 159;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 160;BA.debugLine="In = File.OpenInput(Dir, FileName)";
_in = __c.File.OpenInput(_dir,_filename);
 //BA.debugLineNum = 161;BA.debugLine="If length < 1000000 Then '1mb";
if (_length<1000000) { 
 //BA.debugLineNum = 164;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 165;BA.debugLine="out.InitializeToBytesArray(length)";
_out.InitializeToBytesArray(_length);
 //BA.debugLineNum = 166;BA.debugLine="File.Copy2(In, out)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_out.getObject()));
 //BA.debugLineNum = 167;BA.debugLine="PostBytes(Link, out.ToBytesArray)";
_postbytes(_link,_out.ToBytesArray());
 }else {
 //BA.debugLineNum = 169;BA.debugLine="req.InitializePost(Link, In, length)";
_req.InitializePost(_link,(java.io.InputStream)(_in.getObject()),_length);
 //BA.debugLineNum = 170;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\",";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 };
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public String  _postmultipart(String _link,anywheresoftware.b4a.objects.collections.Map _namevalues,anywheresoftware.b4a.objects.collections.List _files) throws Exception{
String _boundary = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream = null;
byte[] _b = null;
String _eol = "";
boolean _empty = false;
String _key = "";
String _value = "";
String _s = "";
com.swsi.smprime.httpjob._multipartfiledata _fd = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
 //BA.debugLineNum = 91;BA.debugLine="Public Sub PostMultipart(Link As String, NameValue";
 //BA.debugLineNum = 92;BA.debugLine="Dim boundary As String = \"-----------------------";
_boundary = "---------------------------1461124740692";
 //BA.debugLineNum = 93;BA.debugLine="Dim stream As OutputStream";
_stream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 94;BA.debugLine="stream.InitializeToBytesArray(0)";
_stream.InitializeToBytesArray((int) (0));
 //BA.debugLineNum = 95;BA.debugLine="Dim b() As Byte";
_b = new byte[(int) (0)];
;
 //BA.debugLineNum = 96;BA.debugLine="Dim eol As String = Chr(13) & Chr(10)";
_eol = BA.ObjectToString(__c.Chr((int) (13)))+BA.ObjectToString(__c.Chr((int) (10)));
 //BA.debugLineNum = 97;BA.debugLine="Dim empty As Boolean = True";
_empty = __c.True;
 //BA.debugLineNum = 98;BA.debugLine="If NameValues <> Null And NameValues.IsInitialize";
if (_namevalues!= null && _namevalues.IsInitialized()) { 
 //BA.debugLineNum = 99;BA.debugLine="For Each key As String In NameValues.Keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _namevalues.Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = BA.ObjectToString(group8.Get(index8));
 //BA.debugLineNum = 100;BA.debugLine="Dim value As String = NameValues.Get(key)";
_value = BA.ObjectToString(_namevalues.Get((Object)(_key)));
 //BA.debugLineNum = 101;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = _multipartstartsection(_stream,_empty);
 //BA.debugLineNum = 102;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_key))+"\"\n"+"\n"+""+__c.SmartStringFormatter("",(Object)(_value))+"");
 //BA.debugLineNum = 107;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
 //BA.debugLineNum = 108;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
 }
};
 };
 //BA.debugLineNum = 111;BA.debugLine="If Files <> Null And Files.IsInitialized Then";
if (_files!= null && _files.IsInitialized()) { 
 //BA.debugLineNum = 112;BA.debugLine="For Each fd As MultipartFileData In Files";
{
final anywheresoftware.b4a.BA.IterableList group17 = _files;
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_fd = (com.swsi.smprime.httpjob._multipartfiledata)(group17.Get(index17));
 //BA.debugLineNum = 113;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = _multipartstartsection(_stream,_empty);
 //BA.debugLineNum = 114;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_fd.KeyName /*String*/ ))+"\"; filename=\""+__c.SmartStringFormatter("",(Object)(_fd.FileName /*String*/ ))+"\"\n"+"Content-Type: "+__c.SmartStringFormatter("",(Object)(_fd.ContentType /*String*/ ))+"\n"+"\n"+"");
 //BA.debugLineNum = 120;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
 //BA.debugLineNum = 121;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
 //BA.debugLineNum = 122;BA.debugLine="Dim in As InputStream = File.OpenInput(fd.Dir,";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = __c.File.OpenInput(_fd.Dir /*String*/ ,_fd.FileName /*String*/ );
 //BA.debugLineNum = 123;BA.debugLine="File.Copy2(in, stream)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_stream.getObject()));
 }
};
 };
 //BA.debugLineNum = 126;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = _multipartstartsection(_stream,_empty);
 //BA.debugLineNum = 127;BA.debugLine="s = _ $\"--${boundary}-- \"$";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"--\n"+"");
 //BA.debugLineNum = 130;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
 //BA.debugLineNum = 131;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
 //BA.debugLineNum = 132;BA.debugLine="PostBytes(Link, stream.ToBytesArray)";
_postbytes(_link,_stream.ToBytesArray());
 //BA.debugLineNum = 133;BA.debugLine="req.SetContentType(\"multipart/form-data; boundary";
_req.SetContentType("multipart/form-data; boundary="+_boundary);
 //BA.debugLineNum = 134;BA.debugLine="req.SetContentEncoding(\"UTF8\")";
_req.SetContentEncoding("UTF8");
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _poststring(String _link,String _text) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
 //BA.debugLineNum = 41;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
_postbytes(_link,_text.getBytes("UTF8"));
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _putbytes(String _link,byte[] _data) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub PutBytes(Link As String, Data() As Byte";
 //BA.debugLineNum = 57;BA.debugLine="req.InitializePut2(Link, Data)";
_req.InitializePut2(_link,_data);
 //BA.debugLineNum = 58;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _putstring(String _link,String _text) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Public Sub PutString(Link As String, Text As Strin";
 //BA.debugLineNum = 52;BA.debugLine="PutBytes(Link, Text.GetBytes(\"UTF8\"))";
_putbytes(_link,_text.getBytes("UTF8"));
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public String  _release() throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Public Sub Release";
 //BA.debugLineNum = 219;BA.debugLine="File.Delete(HttpUtils2Service.TempFolder, taskId)";
__c.File.Delete(_httputils2service._tempfolder /*String*/ ,_taskid);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
