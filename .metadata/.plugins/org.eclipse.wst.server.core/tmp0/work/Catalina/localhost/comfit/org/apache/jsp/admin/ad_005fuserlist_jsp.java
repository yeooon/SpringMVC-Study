/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2022-06-10 05:12:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ad_005fuserlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>bbs.jsp</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(cp);
      out.write("/css/main.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("  <div class=\"modal-dialog\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">카테고리 추가</h5>\r\n");
      out.write("        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("        <form>\r\n");
      out.write("          <div class=\"ms-auto\" style=\"margin-bottom: 10px\">\r\n");
      out.write("            <b>차단 기간</b>\r\n");
      out.write("            <select class=\"form-select\" style=\"width: 40%;\">\r\n");
      out.write("\t\t\t    <option value=\"\">10일 차단</option>\r\n");
      out.write("\t\t\t    <option value=\"\">1달 차단</option>\r\n");
      out.write("\t\t\t    <option value=\"\">영구 차단</option>            \r\n");
      out.write("            </select>\r\n");
      out.write("            <hr />\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"ms-auto\" style=\"margin-bottom: 10px\">\r\n");
      out.write("            <b>차단 사유</b>\r\n");
      out.write("            <select class=\"form-select\" style=\"width: 40%;\">\r\n");
      out.write("\t\t\t    <option value=\"\">부적절한 게시물</option>\r\n");
      out.write("\t\t\t    <option value=\"\">광고홍보</option>\r\n");
      out.write("            </select>\r\n");
      out.write("          \t<hr />\r\n");
      out.write("          </div>       \r\n");
      out.write("          <div class=\"ms-auto\">\r\n");
      out.write("          \t<div style=\"margin-bottom: 10px\"><b><span style=\"color: #0080FF\">차단 상세</span></b></div>\t\r\n");
      out.write("          \t<textarea class=\"form-control\" id=\"exampleFormControlTextarea1\" rows=\"3\" placeholder=\"내용을 입력해주세요\" ></textarea>\r\n");
      out.write("          </div>       \r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">취소</button>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\">입력</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t<div class=\"\" style=\"margin-bottom: 20px\"><h1><b>일반 회원 리스트</b></h1></div>  <!-- 왜 서체가? 배민서체지? 커스텀 css해놔서 그럼 -->\r\n");
      out.write("\t\t<table class=\"table table-bordered \" style=\"text-align: center; border: 1px solid #dddddd; box-shadow: 0 1px 3px 0 rgba(0,0,0,0.20);\">\r\n");
      out.write("\t\t\t<thead style=\"background-color: #f9fafd\"><!-- 제목 -->\r\n");
      out.write("\t\t\t\t<tr><!-- 1행 -->\r\n");
      out.write("\t\t\t\t\t<th style=\"background-color: #; text-align: center;\">E-mail</th>\r\n");
      out.write("\t\t\t\t\t<th style=\"background-color: #; text-align: center;\">이름</th>\r\n");
      out.write("\t\t\t\t\t<th style=\"background-color: #; text-align: center;\">닉네임</th>\r\n");
      out.write("\t\t\t\t\t<th style=\"background-color: #; text-align: center;\">전화</th>\r\n");
      out.write("\t\t\t\t\t<th style=\"background-color: #; text-align: center;\">레벨</th>\r\n");
      out.write("\t\t\t\t\t<th style=\"background-color: #; text-align: center;\">가입일</th>\r\n");
      out.write("\t\t\t\t\t<th style=\"background-color: #; text-align: center;\">상태</th>\r\n");
      out.write("\t\t\t\t\t<th style=\"background-color: #; text-align: center;\">누적 차단 횟수</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody style=\"background-color: white;\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>yjooo0816@gmail.com</td>\r\n");
      out.write("\t\t\t\t\t<td>이연주</td>\r\n");
      out.write("\t\t\t\t\t<td>이연주</td>\r\n");
      out.write("\t\t\t\t\t<td>010-1111-1111</td>\r\n");
      out.write("\t\t\t\t\t<td>1LV</td>\r\n");
      out.write("\t\t\t\t\t<td>2022.05.05</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"margin-left: 20px\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<!-- 셀렉트박스 -->\r\n");
      out.write("\t\t\t\t\t\t<div style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t<select class=\"form-select\" style=\"width: 60%; display: inline-block;\">\r\n");
      out.write("\t\t\t\t\t\t    <option selected>가운데정렬</option>\r\n");
      out.write("\t\t\t\t\t\t    <option value=\"\">1</option>\r\n");
      out.write("\t\t\t\t\t\t    <option value=\"\">2</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>1회</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t<div style=\"text-align: right;\">\r\n");
      out.write("\t\t\t<div class=\"btn-group\" style=\"width: 30%; text-align: right;\">\r\n");
      out.write("\t\t\t\t<select class=\"form-select\" style=\"width: 40%; text-align: ;\">\r\n");
      out.write("\t\t\t\t    <option selected>카테고리</option>\r\n");
      out.write("\t\t\t\t    <option value=\"\">1</option>\r\n");
      out.write("\t\t\t\t    <option value=\"\">2</option>\r\n");
      out.write("\t\t\t\t</select> \r\n");
      out.write("\t        <div class=\"input-group\" style=\"width:100%; text-align: right;\">\r\n");
      out.write("\t           <input type=\"text\" class=\"form-control\" placeholder=\"검색어를 입력하세요\">\r\n");
      out.write("\t            <button id=\"Btn\" type=\"button\" class=\"btn btn-outline-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\">\r\n");
      out.write("\t          <i class=\"bi bi-search\"></i>\r\n");
      out.write("\t            </button>                          \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 셀렉트에 안먹어서 일단... 검색버튼에 모달 먹여놓음/드롭다운에도 먹여놓음 -->\r\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("        <h4 class=\"modal-title\" id=\"exampleModalLabel\">차단 관리</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("        <form>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <b>차단 기간</b>\r\n");
      out.write("            <select class=\"form-select\" style=\"width: 40%; text-align: right;\">\r\n");
      out.write("\t\t\t    <option value=\"\">10일 차단</option>\r\n");
      out.write("\t\t\t    <option value=\"\">1달 차단</option>\r\n");
      out.write("\t\t\t    <option value=\"\">영구 차단</option>            \r\n");
      out.write("            </select>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <b>차단 사유</b>\r\n");
      out.write("            <select class=\"form-select\" style=\"width: 40%; text-align: right;\">\r\n");
      out.write("\t\t\t    <option value=\"\">부적절한 게시물</option>\r\n");
      out.write("\t\t\t    <option value=\"\">광고홍보</option>\r\n");
      out.write("            </select>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <b>차단 상세</b>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("          \t<textarea rows=\"5\" cols=\"75\"></textarea>\r\n");
      out.write("          </div>          \r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">취소</button>\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\">확인</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
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
      // /admin/ad_userlist.jsp(63,0) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
