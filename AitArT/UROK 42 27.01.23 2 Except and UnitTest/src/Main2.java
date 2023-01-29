import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {
    /*
    Дан лист Pand нужно получить Map/<Pand, Boolean/>,
    где ключ - Panda, значение - true,
    если pand встретилась более одного раза, иначе false
     */
    public static void main(String[] args) {

    }
    static Map<Panda, Boolean> checkedPanda(List<Panda>listOfPanda){
        Map<Panda, Boolean> outMap=new HashMap<>();
        for (Panda pnd : listOfPanda){
            outMap.put(pnd, outMap.containsKey(pnd)? true:false);
        }
        return outMap;
    }
}
