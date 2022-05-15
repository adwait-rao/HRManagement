package LoginPage.AdminAndEmployeeIDPASS;

import java.util.HashMap;

public class EmployeeIDPass {
    static  HashMap<String,String> EmployeeLoginInfo = new HashMap<String,String>();
    public EmployeeIDPass()
    {

    }
    public  static void putintoemployee(String name,String password)
    {
        EmployeeLoginInfo.put(name, password);
    }
}
