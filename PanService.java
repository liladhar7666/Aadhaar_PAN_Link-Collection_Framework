package Aadhaar_PAN_Link;

import java.util.HashMap;
import java.util.Map;

public class PanService {

    private static Map<String,Pan> panMap = new HashMap<>();

    static {
        panMap.put("ABCD123456",new Pan("ABCD123456","12345678","HDFC BANK",
                "Stock,ELSS,FD"));
        panMap.put("ABCD123",new Pan("ABCD123","123456","SBI BANK",
                "Stock,FD"));
    }

    public Pan getPanByAadhaarNumber(String aadhaarNumber){
        for(Pan pan:panMap.values()){
            if(pan.getAadhaarNumber().equals(aadhaarNumber)){
                return pan;
            }
        }
        return null;
    }
}
