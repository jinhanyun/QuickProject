package chanedi.generator.log;

import java.util.HashMap;

/**
 * Created by jijingyu625 on 2016/5/2.
 */
class DaoReturnToLog extends HashMap {

    public DaoReturnToLog(String variableType, String variable, String methodName) {
        put("isList",variableType.contains("List"));
        put("methodName", methodName);
        put("variable", variable);
    }

}
