<% 
    
    int n1 = Integer.parseInt(request.getParameter("num-1"));
    int n2 = Integer.parseInt(request.getParameter("num-2"));

    out.print(n1+n2);
    out.print(request.getParameter("num-1").getClass().getSimpleName());
    
%> 