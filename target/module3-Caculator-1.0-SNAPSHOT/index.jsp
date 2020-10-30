<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 30/10/2020
  Time: 2:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<%--    <style>--%>
<%--        legend {--%>
<%--            border: solid 1px red;--%>
<%--        }--%>

<%--        table {--%>
<%--            padding: 5px;--%>
<%--            margin: 5px;--%>
<%--        }--%>
<%--    </style>--%>
    <title>
        Simple Calculator
    </title>
</head>
<body>
<fieldset>
    <legend>Calculator</legend>
    <form action="/calculator" method="post">
        <table>

            <tr>
                <td>First operand:</td>
                <td><input class="input1" type="text" name="first"></td>
            </tr>
            <tr>
                <td>Operator:</td>
                <td><select name="operator" id="">
                    <option value="+" name="cong">+</option>
                    <option value="-" name="tru">-</option>
                    <option value="*" name="nhan">X</option>
                    <option value="/" name="chia">/</option>
                </select></td>
            </tr>
            <tr>
                <td>second operand:</td>
                <td><input class="input2" type="text" name="second"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Calculate"></td>
            </tr>
        </table>
    </form>
</fieldset>
</body>
</html>
