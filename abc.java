public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException
{
  // don't do anything unless there is a valid servlet session.
  // be sure to pass 'false' in with this method call.
  HttpSession session = request.getSession(false);
  if (session == null)
  {
    System.err.println("FileUploadServlet, session was null, just returning.");
    return;
  }
  
  // your other business logic code is down here ...
}
