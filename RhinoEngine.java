import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class RhinoEngine {
    public static void main(String[] args) {
        Runnable run = () -> {
         System.out.println("Hello");
        };
    }
}
