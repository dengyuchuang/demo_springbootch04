<%@page import="entity.user"%>
<%@page import="java.util.List"%>
<%@page import="dao.impl.UserImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form action="#" method="pos">
   <table border="1" align="center">
       <tr >
         <th colspan="4">紧急报警信息 </th>
       </tr>
       <tr>
          <td>编号</td>
            <td>电话</td>
              <td>姓名</td>
               <td>地址</td>
       </tr>      
   </table>
    <%
        UserImpl  sui=new UserImpl();
        List<user> lis=sui.show1();
        for(user li: lis){
        	out.println(li.getId());
        	out.println(li.getAccount());
        	out.println(li.getName());
        	out.println(li.getAddress());        	
        }        
   %>
   </form>

</body>
</html>