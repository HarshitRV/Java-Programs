<%
    String choice = request.getParameter("col");
    String bg="";
    switch(choice){
        case "1": bg="red"; break;
        case "2": bg="green"; break;
        case "3": bg="blue"; break;
    }
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Changed Background</title>
</head>
<body style="background-color: <%=bg%>;">
    
</body>
</html>
