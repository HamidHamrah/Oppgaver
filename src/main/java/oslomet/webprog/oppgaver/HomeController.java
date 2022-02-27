package oslomet.webprog.oppgaver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final Integer[] tempArray= new Integer[]{-3,-2,2,7,12,16,18,17,12,7,-2,-1};
    @GetMapping("/")
    public int finnTemperatur(String maned){
        switch (maned){
            case "Januar":
                return tempArray[0];
            case "Febraur":
                return tempArray[1];
            case "Mars":
                return tempArray[2];
            case "April":
                return tempArray[3];
            case "Mai":
                return tempArray[4];
            case "Juni":
                return tempArray[5];
            case "Juli":
                return tempArray[6];
            case "Aug":
                return tempArray[7];
            case "September":
                return tempArray[8];
            case "october":
                return tempArray[9];
            case "November":
                return tempArray[10];
            case "Desember":
                return tempArray[11];
        }
        return 0;
    }
}
