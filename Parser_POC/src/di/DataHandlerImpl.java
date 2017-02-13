package di;

import org.springframework.stereotype.Component;

/**
 * Created by vakamat on 2/10/2017.
 */
@Component(value="consolePrinter")
public class DataHandlerImpl implements DataHandler{

    @Override
    public void handle(Object o) {
        System.out.println(o);
    }
}
