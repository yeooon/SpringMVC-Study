/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2022-06-14 05:29:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ad_005fnotice_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
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

	request.setCharacterEncoding("UTF-8");
	String cp = request.getContextPath();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<!-- 기기별 크기 담당 -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width\", initial-scale=\"1\">\r\n");
      out.write("<!-- 디자인 담당 -->\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("*{\r\n");
      out.write("  box-sizing: border-box; \r\n");
      out.write("}\r\n");
      out.write("  \r\n");
      out.write(".que:first-child{\r\n");
      out.write("    border-top: 1px solid black;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write(".que{\r\n");
      out.write("  position: relative;\r\n");
      out.write("  padding: 17px 0;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  border-bottom: 1px solid #dddddd;\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("  \r\n");
      out.write(".que::before{\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  content: 'Q';\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  color: #006633;\r\n");
      out.write("  margin-right: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".que.on>span{\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("  color: #0080FF; \r\n");
      out.write("}\r\n");
      out.write("  \r\n");
      out.write(".anw {\r\n");
      out.write("  display: none;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  background-color: #f4f4f2;\r\n");
      out.write("  padding: 27px 0;\r\n");
      out.write("}\r\n");
      out.write("  \r\n");
      out.write(".anw::before {\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  content: 'A';\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("  color: #666;\r\n");
      out.write("  margin-right: 5px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!-- \r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div style=\"margin-bottom: 20px\"><h1><b>공지사항</b></h1></div>\r\n");
      out.write("</div>\r\n");
      out.write(" -->\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"row\" style=\"background-color: white; padding-bottom: 20px\">\r\n");
      out.write("\t<div style=\"margin-bottom: 20px\"><h1><b>공지사항</b></h1></div>\r\n");
      out.write("\t\t<div id=\"Accordion_wrap\">\r\n");
      out.write("\t\t     <div class=\"que\" >\r\n");
      out.write("\t\t      <span>[공지] 외부 채널 유도 관련 운영정책 강화 안내</span>\r\n");
      out.write("\t\t     </div>\r\n");
      out.write("\t\t     <div class=\"anw\" style=\"padding-left: 20px\">\r\n");
      out.write("\t\t      <span>Comfit 앱을 벗어나 거래를 하며 발생되는 분쟁과 사기 피해가 지속됨에 따라<br>\r\n");
      out.write("\t\t\t\t\t외부 채널 유도에 대한 운영 정책이 아래와 같이 강화되오니 고객님들의 적극적인 협조 부탁드립니다.<br>\r\n");
      out.write("\t\t\t\t\t<운영정책 강화 항목><br>\r\n");
      out.write("\t\t\t\t\t- ......<br>\r\n");
      out.write("\t\t\t </span>\r\n");
      out.write("\t\t\t <div style=\"margin-top: 50px; text-align: right;\">\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-primary\" value=\"글쓰기\" style=\"width: 100px;\">수정하기</button>\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-outline-secondary\" value=\"글쓰기\" style=\"width: 100px;\">삭제하기</button>\t\t\t \r\n");
      out.write("\t\t     </div>\t\t \r\n");
      out.write("\t\t     </div>\r\n");
      out.write("\t\t      <div class=\"que\">\r\n");
      out.write("\t\t      <span>[공지] 특정 전자기기 거래 금지 시행 안내</span>\r\n");
      out.write("\t\t     </div>\r\n");
      out.write("\t\t     <div class=\"anw\" style=\"padding-left: 20px\">\r\n");
      out.write("\t\t      <span>This is second answer.</span>\r\n");
      out.write("\t\t\t <div style=\"margin-top: 50px; text-align: right;\">\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-primary\" value=\"글쓰기\" style=\"width: 100px;\">수정하기</button>\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-outline-secondary\" value=\"글쓰기\" style=\"width: 100px;\">삭제하기</button>\t\t\t \r\n");
      out.write("\t\t     </div>\t\t      \r\n");
      out.write("\t\t     </div>\r\n");
      out.write("\t\t      <div class=\"que\">\r\n");
      out.write("\t\t      <span>Comfit 개인정보처리방침 개정 안내</span>\r\n");
      out.write("\t\t     </div>\r\n");
      out.write("\t\t     <div class=\"anw\" style=\"padding-left: 20px\">\r\n");
      out.write("\t\t      <span>[공지] '비트코인/가상화폐/암호화폐' 거래 금지 안내</span>\r\n");
      out.write("\t\t\t <div style=\"margin-top: 50px; text-align: right;\">\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-primary\" value=\"글쓰기\" style=\"width: 100px;\">수정하기</button>\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-outline-secondary\" value=\"글쓰기\" style=\"width: 100px;\">삭제하기</button>\t\t\t \r\n");
      out.write("\t\t     </div>\t      \r\n");
      out.write("\t\t     </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("<div class=\"accordion\" id=\"accordionExample\">\r\n");
      out.write("  <div class=\"accordion-item\">\r\n");
      out.write("    <h2 class=\"accordion-header\" id=\"headingOne\">\r\n");
      out.write("      <button class=\"accordion-button\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseOne\" aria-expanded=\"true\" aria-controls=\"collapseOne\">\r\n");
      out.write("        [공지] 외부 채널 유도 관련 운영정책 강화 안내\r\n");
      out.write("      </button>\r\n");
      out.write("    </h2>\r\n");
      out.write("    <div id=\"collapseOne\" class=\"accordion-collapse collapse show\" aria-labelledby=\"headingOne\" data-bs-parent=\"#accordionExample\">\r\n");
      out.write("      <div class=\"accordion-body\">\r\n");
      out.write("\t\t\t\t\tComfit 앱을 벗어나 거래를 하며 발생되는 분쟁과 사기 피해가 지속됨에 따라<br>\r\n");
      out.write("\t\t\t\t\t외부 채널 유도에 대한 운영 정책이 아래와 같이 강화되오니 고객님들의 적극적인 협조 부탁드립니다.<br>\r\n");
      out.write("\t\t\t\t\t<운영정책 강화 항목><br>\r\n");
      out.write("\t\t\t\t\t- ......<br>      \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"accordion-item\">\r\n");
      out.write("    <h2 class=\"accordion-header\" id=\"headingTwo\">\r\n");
      out.write("      <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseTwo\" aria-expanded=\"false\" aria-controls=\"collapseTwo\">\r\n");
      out.write("       [공지] 특정 전자기기 거래 금지 시행 안내\r\n");
      out.write("      </button>\r\n");
      out.write("    </h2>\r\n");
      out.write("    <div id=\"collapseTwo\" class=\"accordion-collapse collapse\" aria-labelledby=\"headingTwo\" data-bs-parent=\"#accordionExample\">\r\n");
      out.write("      <div class=\"accordion-body\">\r\n");
      out.write("        <strong>This is the second item's accordion body.</strong> It is hidden by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the <code>.accordion-body</code>, though the transition does limit overflow.\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"accordion-item\">\r\n");
      out.write("    <h2 class=\"accordion-header\" id=\"headingThree\">\r\n");
      out.write("      <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseThree\" aria-expanded=\"false\" aria-controls=\"collapseThree\">\r\n");
      out.write("        Comfit 개인정보처리방침 개정 안내\r\n");
      out.write("      </button>\r\n");
      out.write("    </h2>\r\n");
      out.write("    <div id=\"collapseThree\" class=\"accordion-collapse collapse\" aria-labelledby=\"headingThree\" data-bs-parent=\"#accordionExample\">\r\n");
      out.write("      <div class=\"accordion-body\">\r\n");
      out.write("        <strong>This is the third item's accordion body.</strong> It is hidden by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the <code>.accordion-body</code>, though the transition does limit overflow.\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\" style=\"margin-top: 10px; text-align: right;\">\r\n");
      out.write("\t<button class=\"btn btn-primary pull-right\" value=\"글쓰기\" style=\"width: 100px;\" onclick=\"location.href='ad_notice_write.jsp'\">글쓰기</button>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(\".que\").click(function() {\r\n");
      out.write("\t  $(this).next(\".anw\").stop().slideToggle(300);\r\n");
      out.write("\t  $(this).toggleClass('on').siblings().removeClass('on');\r\n");
      out.write("\t  $(this).next(\".anw\").siblings(\".anw\").slideUp(300); // 1개씩 펼치기\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_c_005fimport_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f0_reused = false;
    try {
      _jspx_th_c_005fimport_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f0.setParent(null);
      // /ad_notice_list.jsp(68,0) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f0.setUrl("ad_Header.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f0 = _jspx_th_c_005fimport_005f0.doStartTag();
        if (_jspx_th_c_005fimport_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f0);
      _jspx_th_c_005fimport_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f0_reused);
    }
    return false;
  }
}
