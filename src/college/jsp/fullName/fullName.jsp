<% 
    String fName = request.getParameter("fName");
    String mName = request.getParameter("mName");
    String lName = request.getParameter("lName");

    out.print(fName+" "+mName+" "+lName);
%> 