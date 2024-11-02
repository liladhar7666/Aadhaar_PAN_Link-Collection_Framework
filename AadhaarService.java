package Aadhaar_PAN_Link;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {

    private static Map<String,Aadhaar> aadhaarMap=new HashMap<>();
    static {
        aadhaarMap.put("12345678",new Aadhaar("12345678","Liladhar","Sadhuji","Nagpur"));
        aadhaarMap.put("123456",new Aadhaar("123456","Pradip","Madhiji","Nagpur"));
    }
//    method available
    public Aadhaar getAadhaarByNumber(String aadhaarNumber)
    {
        return  aadhaarMap.get(aadhaarNumber);
    }
}
