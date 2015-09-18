package json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.oxygen.core.beans.IAction;
/*
import com.cpcus.oxygen.beans.ActionXmlBean;
import com.cpcus.oxygen.beans.Operation;
import com.cpcus.oxygen.beans.VerificationXmlBean;
import com.cpcus.oxygen.beans.WaitXmlBean;*/


public abstract class OperationAdapter extends XmlAdapter<ArrayList<IAction>, List> {
    /*
    @Override
    public ArrayList<Operation> marshal(List list) throws Exception {
        // TODO Auto-generated method stub
      ArrayList<Operation> list2 = new ArrayList();
//        MapEntity[] list = new MapEntity[map.size()];
      for(Iterator iter=list.iterator();iter.hasNext();){
        Object op = iter.next();
        if (op.getClass().isAssignableFrom(ActionXmlBean.class))
        {
          list2.add((Operation) op);
        }
        else if (op.getClass().isAssignableFrom(VerificationXmlBean.class))
        {
          
        }else if(op.getClass().isAssignableFrom(WaitXmlBean.class)){
          
        }
        
      }
        Set keyset = map.keySet();
        int index =0;
        for(Iterator itor=keyset.iterator();itor.hasNext();){
            MapEntity item = new MapEntity();
            item.key = itor.next();
            item.value = map.get(item.key);
            list[index++] = item;            
        }
        return list2;
    }*/

    /*@Override
    public Map unmarshal(MapEntity[] list) throws Exception {
        // TODO Auto-generated method stub
        Map map = new HashMap();
        for(int i=0;i<list.length;i++){
            MapEntity item = list[i];
            map.put(item.key, item.value);
        }
        
        return map;
        
    }
*/
}
