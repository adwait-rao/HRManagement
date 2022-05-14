package LoginPage.AdminAndEmployeeIDPASS;

import java.util.HashMap;

public class AdminIDPass {
    HashMap<String,String> loginInfo = new HashMap<String,String>();
    public AdminIDPass()
    {
        loginInfo.put("Heramb Bhoodhar","1234");
        loginInfo.put("Adwait Rao","1234");
        loginInfo.put("Dnyaneshwari Landge","1234");
    }
    public HashMap  getlogininfo(){
        return loginInfo;
    }
}
