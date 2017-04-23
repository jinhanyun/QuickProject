package chanedi.generator.log;

import chanedi.util.StringUtils;

import java.util.HashMap;

/**
 * Created by jijingyu625 on 2016/5/2.
 */
class MethodToLog extends HashMap {

    public MethodToLog(String returnType, String methodName, String argStr) {
        put("isList",returnType.contains("List"));
        put("methodName", methodName);
        String[] argNames = argStr.split(",");
        for (int i = 0; i < argNames.length; i++) {
            String[] arg = argNames[i].split(" ");
            argNames[i] = arg[arg.length - 1];
        }
        put("isEmptyArgs", StringUtils.isEmpty(argStr));
        put("argNames", argNames);
    }

    public void setReturnValue(String returnValue) {
        put("returnValue", returnValue);
    }

    public String getMethodName() {
        return (String) get("methodName");
    }
}
