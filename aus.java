public boolean autorization(String login,String password){
    if (login.equals("login") && password.equals("password")){
        return true;
        }
    else {
        return false;
    }
}