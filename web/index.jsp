<%--
  Created by IntelliJ IDEA.
  User: Duc Phuong
  Date: 19-Feb-19
  Time: 10:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CustomerList</title>
</head>
<body>
<!--form action="Test" method="post">

</form-->
<form >
    <h2 style="text-align:center";>Danh sách khách hàng</h2>
    <table border="1" ; style="width:100%">
        <tr>
            <th>Họ</th>
            <th>Tên</th>
            <th>Tuổi</th>
        </tr>
        <tr onclick="window.location='/customerdetail?id=1'">
            <td>Phạm</td>
            <td>Văn Thành</td>
            <td>22</td>
        </tr>
        <tr>
            <td onclick="window.location='/customerdetail?id=2'">Trần</td>
            <td>Văn Đạt</td>
            <td>19</td>
        </tr>
        <tr onclick="window.location='/customerdetail?id=3'">
            <td>Dương</td>
            <td>Minh Hằng</td>
            <td>18</td>
        </tr>
    </table>
</form>
</body>
</html>
