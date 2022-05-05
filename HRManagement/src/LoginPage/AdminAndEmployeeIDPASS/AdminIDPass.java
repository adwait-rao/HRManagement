package LoginPage.AdminAndEmployeeIDPASS;

import java.util.HashMap;

public class AdminIDPass {
    HashMap<String,String> loginInfo = new HashMap<String,String>();
    public AdminIDPass()
    {
        loginInfo.put("Heramb","1234");
        loginInfo.put("Adwait","1234");
        loginInfo.put("Dnyaneshwari","1234");
    }
    public HashMap  getlogininfo(){
        return loginInfo;
    }
}
