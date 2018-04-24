# valid-session









Getting back to the purpose of testing for the existence of a valid Java servlet session ... if you're writing Java servlet code, and you want to test to see if the user has a valid Java servlet session, just call the getSession method of the HttpServletRequest class, making sure you pass a false parameter in with that method call to make sure your call does not create a new session:
