/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2022-06-16 08:47:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.user.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005fsignup_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1654790812624L));
    _jspx_dependants.put("jar:file:/C:/SpringMVCStudy/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/comfit/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>user_signup_info.jsp</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\r\n");
      out.write("    integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("<style>\r\n");
      out.write("    body\r\n");
      out.write("     {\r\n");
      out.write("         min-height: 100vh;\r\n");
      out.write("     }\r\n");
      out.write("    .input-form {\r\n");
      out.write("      max-width: 680px;\r\n");
      out.write("      margin-top: 20px;\r\n");
      out.write("      padding: 32px;\r\n");
      out.write("      background: #fff;\r\n");
      out.write("      -webkit-border-radius: 10px;\r\n");
      out.write("      -moz-border-radius: 10px;\r\n");
      out.write("      border-radius: 10px;\r\n");
      out.write("      -webkit-box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);\r\n");
      out.write("      -moz-box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);\r\n");
      out.write("      box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15)\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("  \r\n");
      out.write("<script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("   function searchAddr()\r\n");
      out.write("   {\r\n");
      out.write("      new daum.Postcode({\r\n");
      out.write("         \r\n");
      out.write("           oncomplete: function(data) {\r\n");
      out.write("               // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.\r\n");
      out.write("               // 예제를 참고하여 다양한 활용법을 확인해 보세요.\r\n");
      out.write("               //alert(data); //[Object]\r\n");
      out.write("               \r\n");
      out.write("               var fullRoadAddr = data.roadAddress;   // 도로명 주소 변수\r\n");
      out.write("               var extraRoadAddr = '';\r\n");
      out.write("               \r\n");
      out.write("             // 법정동명이 있을 경우 추가한다. (법정리는 제외)\r\n");
      out.write("             // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\r\n");
      out.write("               if(data.bname !== '' && /[동|로|가]$/g.test(data.bname))\r\n");
      out.write("               {\r\n");
      out.write("                     extraRoadAddr += data.bname;\r\n");
      out.write("               }\r\n");
      out.write("                 // 건물명이 있고, 공동주택일 경우 추가한다.\r\n");
      out.write("               if(data.buildingName !== '' && data.apartment == 'Y')\r\n");
      out.write("               {\r\n");
      out.write("                     extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("               }\r\n");
      out.write("               // 도로명, 지번 조합형 주소가 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\r\n");
      out.write("               if(extraRoadAddr !== '')\r\n");
      out.write("               {\r\n");
      out.write("                   extraRoadAddr = ' (' + extraRoadAddr + ')';\r\n");
      out.write("               }\r\n");
      out.write("               // 도로명, 지번 주소의 유무에 따라 해당 조합형 주소를 추가한다.\r\n");
      out.write("               if(fullRoadAddr !== '')\r\n");
      out.write("               {\r\n");
      out.write("                   fullRoadAddr += extraRoadAddr;\r\n");
      out.write("               }\r\n");
      out.write("               \r\n");
      out.write("               alert(fullRoadAddr);\r\n");
      out.write("               document.getElementById('address').value = fullRoadAddr;\r\n");
      out.write("               \r\n");
      out.write("           }\r\n");
      out.write("       }).open({\r\n");
      out.write("          /* popupKey : 'popup1'   // 팝업창 key 설정 */\r\n");
      out.write("       });   \r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   function fn_submit()\r\n");
      out.write("   {\r\n");
      out.write("         \r\n");
      out.write("      // 검증에 사용할 정규식 변수 regExp에 저장\r\n");
      out.write("         \r\n");
      out.write("      // alert('비밀번호 정규식 규칙 위반!!');\r\n");
      out.write("      var pwd = document.getElementById('password').value;\r\n");
      out.write("      var pwdCheck = document.getElementById('password_check').value;\r\n");
      out.write("      //alert(pwdCheck);\r\n");
      out.write("      var passwordRules = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,16}$/;\r\n");
      out.write("      \r\n");
      out.write("      if (!passwordRules.test(pwd))\r\n");
      out.write("      {\r\n");
      out.write("         alert('유효하지 않은 비밀번호입니다.');\r\n");
      out.write("         return;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      if(pwd != pwdCheck)\r\n");
      out.write("      {\r\n");
      out.write("         alert('입력하신 비밀번호가 비밀번호확인과 일치하지 않습니다.');\r\n");
      out.write("         return;\r\n");
      out.write("      }\r\n");
      out.write("       \r\n");
      out.write("         \r\n");
      out.write("      var text = document.getElementById('tel').value;\r\n");
      out.write("      var regPhone = /^01([0|1|6|7|8|9])-?([0-9]{3,4})-?([0-9]{4})$/;  \r\n");
      out.write("       if (regPhone.test(text) != true)\r\n");
      out.write("       {\r\n");
      out.write("          alert('정상적인 휴대전화번호를 입력해주세요');\r\n");
      out.write("          return;\r\n");
      out.write("       }\r\n");
      out.write("       \r\n");
      out.write("   \tvar regExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;\r\n");
      out.write("\tvar emailVal = document.getElementById('email').value;\r\n");
      out.write("\t\r\n");
      out.write("\tif (emailVal.match(regExp) == null)\r\n");
      out.write("    {\r\n");
      out.write("          alert('정상적인 이메일을 입력해주세요');\r\n");
      out.write("          return;\r\n");
      out.write("    }\r\n");
      out.write("       \r\n");
      out.write("       $(\"#regitform\").submit();\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   $(function()\r\n");
      out.write("   {\r\n");
      out.write("\t\t//alert(\"sd\")\r\n");
      out.write("\t\t$(\"#nickname\").focusout(function() // 닉네임 중복 검사\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar nickName = \"nickName=\" + $.trim($(\"#nickname\").val());\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : \"POST\"\r\n");
      out.write("\t\t\t   , url : \"nicknamecheck.action\"\r\n");
      out.write("\t\t\t   , data : nickName\r\n");
      out.write("\t\t\t   , success : function(result)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tif (result == 1)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t$(\"#checkNick\").css(\"display\", \"inline\");\r\n");
      out.write("\t\t\t\t\t$(\"#checkNick\").html(\"이미 사용중인 닉네임 입니다.\");\r\n");
      out.write("\t\t\t\t\t$(\"#regitBtn\").prop(\"disabled\", true);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\telse\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t$(\"#checkNick\").css(\"display\", \"inline\");\r\n");
      out.write("\t\t\t\t\t$(\"#checkNick\").html(\"사용가능한 닉네임 입니다.\");\r\n");
      out.write("\t\t\t\t\t$(\"#regitBtn\").prop(\"disabled\", false);\r\n");
      out.write("\t\t\t\t}\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t  , error : function(e)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\talert(e.responseText);\r\n");
      out.write("\t\t\t}\t\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#email\").focusout(function() // 이메일\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar email = \"email=\" + $.trim($(\"#email\").val());\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : \"POST\"\r\n");
      out.write("\t\t\t   , url : \"emailcheck.action\"\r\n");
      out.write("\t\t\t   , data : email\r\n");
      out.write("\t\t\t   , success : function(result)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tif (result == 1)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t$(\"#checkEmail\").css(\"display\", \"inline\");\r\n");
      out.write("\t\t\t\t\t$(\"#checkEmail\").html(\"이미 사용중인 이메일 입니다.\");\r\n");
      out.write("\t\t\t\t\t$(\"#regitBtn\").prop(\"disabled\", true);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\telse\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t$(\"#checkEmail\").css(\"display\", \"inline\");\r\n");
      out.write("\t\t\t\t\t$(\"#checkEmail\").html(\"사용가능한 이메일 입니다.\");\r\n");
      out.write("\t\t\t\t\t$(\"#regitBtn\").prop(\"disabled\", false);\r\n");
      out.write("\t\t\t\t}\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t  , error : function(e)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\talert(e.responseText);\r\n");
      out.write("\t\t\t}\t\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("   })\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Modal 주소 검색 -->\r\n");
      out.write("<div class=\"modal fade\" id=\"searchAddr\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\r\n");
      out.write("  <div class=\"modal-dialog\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\"><img src=\"images/logo.png\" alt=\"\" style=\"width: 150px; height: auto;\"/>주소 검색</h5>\r\n");
      out.write("        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("         <div class=\"input-group mb-1 col-xl-6\" >\r\n");
      out.write("           <span class=\"input-group-text\" id=\"inputGroup-sizing-default\"><i class=\"bi bi-search\"></i></span>\r\n");
      out.write("           <input type=\"text\" class=\"form-control\" placeholder=\"도로명 혹은 지번으로 주소 입력\">\r\n");
      out.write("           <span style=\"font-size: 10pt; font-weight: bold; color: skyblue;\">검색어 예 : 도로명(반포대로 58), 건물명(독립기념관), 지번(삼성동85)</span>\r\n");
      out.write("           </div>\r\n");
      out.write("           \r\n");
      out.write("           <!-- 주소출력 -->\r\n");
      out.write("           <div>\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("         <button type=\"button\" class=\"btn btn-primary\"\r\n");
      out.write("        data-bs-toggle=\"modal\" data-bs-target=\"#searchAdddr_ok\">확인</button>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">취소</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 회원가입 폼 -->\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"input-form-backgroud row\">\r\n");
      out.write("      <div class=\"input-form col-md-12 mx-auto\">\r\n");
      out.write("        \r\n");
      out.write("        <h4 class=\"mb-3\"><img src=\"images/logo.png\" alt=\"\" style=\"width: 250px; height: auto;\"/></h4>\r\n");
      out.write("        <form action=\"regit.action\" method=\"post\" class=\"validation-form\" id=\"regitform\" novalidate>\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-6 mb-3\">\r\n");
      out.write("              <label for=\"name\">이름</label>\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\" required=\"required\">\r\n");
      out.write("              <div class=\"invalid-feedback\">\r\n");
      out.write("                이름을 입력해주세요.\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6 mb-3\">\r\n");
      out.write("              <label for=\"nickname\">닉네임</label>\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"nickname\" name=\"nickname\" required=\"required\">\r\n");
      out.write("              <span style=\"display: none; color:red;\" class=\"err\" id=\"checkNick\"></span>\r\n");
      out.write("              <div class=\"invalid-feedback\">\r\n");
      out.write("                닉네임을 입력해주세요.\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"mb-3\">\r\n");
      out.write("            <label for=\"email\">이메일</label>\r\n");
      out.write("            <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"you@example.com\" required=\"required\">\r\n");
      out.write("            <span style=\"display: none; color:red;\" class=\"err\" id=\"checkEmail\"></span>\r\n");
      out.write("            <div class=\"invalid-feedback\">\r\n");
      out.write("              이메일을 입력해주세요.\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"mb-3\">\r\n");
      out.write("            <label for=\"tel\">휴대폰번호</label>\r\n");
      out.write("            <input type=\"tel\" class=\"form-control\" id=\"tel\" name=\"tel\" placeholder=\"010-1111-2222\" required=\"required\">\r\n");
      out.write("            <div class=\"invalid-feedback\">\r\n");
      out.write("              휴대폰번호를 입력해주세요.\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"mb-3\">\r\n");
      out.write("            <label for=\"password\">비밀번호</label>\r\n");
      out.write("            <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" placeholder=\"비밀번호를 입력해주세요.\" required>\r\n");
      out.write("             &nbsp;<span style=\"font-size: 12pt; color: skyblue;\">8자리 이상(영어, 숫자, 특수문자 각 1개 포함) </span>\r\n");
      out.write("            <div class=\"invalid-feedback\">\r\n");
      out.write("              비밀번호를 확인해주세요.\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"mb-3\">\r\n");
      out.write("            <label for=\"password_check\">비밀번호확인</label>\r\n");
      out.write("            <input type=\"password\" class=\"form-control\" id=\"password_check\" placeholder=\"비밀번호를 한번 더 입력해주세요.\" required>\r\n");
      out.write("            <div class=\"invalid-feedback\">\r\n");
      out.write("              비밀번호를 확인해주세요.\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"mb-3\">\r\n");
      out.write("            <label for=\"address\">주소</label><br />\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"address\" name=\"address\" placeholder=\"클릭해주세요\" required=\"required\" readonly=\"readonly\" onclick=\"searchAddr()\">\r\n");
      out.write("            <div class=\"invalid-feedback\">\r\n");
      out.write("              주소를 입력해주세요.\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"mb-3\">\r\n");
      out.write("            <label for=\"address2\">상세주소</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"address2\" name=\"address2\" placeholder=\"상세주소를 입력해주세요.\"  required=\"required\" >\r\n");
      out.write("          </div>\r\n");
      out.write("         \r\n");
      out.write("          <hr class=\"mb-4\">\r\n");
      out.write("          <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("            <input type=\"checkbox\" class=\"custom-control-input\" id=\"aggrement\" required=\"required\">\r\n");
      out.write("            <label class=\"custom-control-label\" for=\"aggrement\">개인정보 수집 및 이용에 동의합니다.</label>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"mb-4\"></div>\r\n");
      out.write("        </form>\r\n");
      out.write("        <button class=\"btn btn-primary btn-lg btn-block\" type=\"button\" onclick=\"fn_submit()\">가입 완료</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("<script>\r\n");
      out.write("    window.addEventListener('load', () => {\r\n");
      out.write("      const forms = document.getElementsByClassName('validation-form');\r\n");
      out.write("      Array.prototype.filter.call(forms, (form) => {\r\n");
      out.write("        form.addEventListener('submit', function (event) {\r\n");
      out.write("          if (form.checkValidity() === false) {\r\n");
      out.write("            event.preventDefault();\r\n");
      out.write("            event.stopPropagation();\r\n");
      out.write("          }\r\n");
      out.write("          form.classList.add('was-validated');\r\n");
      out.write("        }, false);\r\n");
      out.write("      });\r\n");
      out.write("    }, false);\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}