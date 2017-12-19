package less19Pattern.команда.remoteControl;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Tom on 09.12.2017.
 */
public class RemoteControl {

    Map<Integer, ICommand> map = new TreeMap<>();

    public void addCommand (Integer id, ICommand command){
        map.put(id, command);
    }

    public void pressButten (Integer id){
        ICommand myCommand =  map.get(id);
        myCommand.execute();
    }

    public void undoButten (Integer id){
        ICommand myCommand =  map.get(id);
        myCommand.undo();
    }
}
