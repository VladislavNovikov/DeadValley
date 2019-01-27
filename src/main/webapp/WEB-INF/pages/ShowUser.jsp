<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ShowUser</title>
</head>
<body>
<form method="get" action="/ShowStartPage/TheMostRichest">
    Самый богатый: <div style =
        "size: 50px;
        display: inline-block;
        padding: 0.2%; " >
        ${theMostRichest}
    </div>
    <input type="submit" value="Показать самого богатого">
</form>
<form method="get" action="/ShowStartPage/AccountsSum">
    Количество аккаунтов: <div style =
        "size: 50px;
        display: inline-block;
        padding: 0.2%; " >
        ${accountsSum}
    </div>
    <input type="submit" value="Показать количество аккаунтов">
</form>

</body>
</html>
