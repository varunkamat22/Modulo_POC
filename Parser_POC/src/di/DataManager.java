package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by vakamat on 2/10/2017.
 */
@Component(value = "dataManager")
public class DataManager {

    private DataHandler dataHandler;

    public DataManager(@Autowired DataHandler dataHandler){
        this.dataHandler = dataHandler;
    }

    public void test(){
        this.dataHandler.handle("Hello World");
    }
}
