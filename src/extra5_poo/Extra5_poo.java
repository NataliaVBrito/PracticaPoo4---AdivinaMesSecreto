package extra5_poo;

import entity.MonthEntity;
import service.MonthService;

public class Extra5_poo {
    
    public static void main(String[] args) {
        MonthService monthService = new MonthService();
        MonthEntity monthEntity = monthService.createMonths();
        
        monthService.guessTheMonth(monthEntity);
    }
    
}
