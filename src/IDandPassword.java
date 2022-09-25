import java.util.HashMap;


public class IDandPassword {
    
    HashMap<String, String> loginInfo = new HashMap<String,String>();
    
    IDandPassword(){
        
        loginInfo.put("mehmet", "1234");
        loginInfo.put("ahmet", "password");
        loginInfo.put("hatice","hatice1234");
        
        
    }
    
    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
