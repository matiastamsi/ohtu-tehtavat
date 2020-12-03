
package statistics.matcher;

import java.lang.reflect.Method;
import statistics.Player;

public class All implements Matcher {

    @Override
    public boolean matches(Player p) {   
        return true;
    }    
    
}
