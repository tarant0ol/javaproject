
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngineFactory;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {

        /* Stack Test
        Stack stack = new Stack(5);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("==== Stack:");
        stack.printStack();

        int poped = stack.pop();
        System.out.println("Poped: " + poped);

        System.out.println("==== Stack:");
        stack.printStack();
         */

        ScriptEngineManager manager = new ScriptEngineManager();

        // Get the list of all available engines
        List<ScriptEngineFactory> list = manager.getEngineFactories();

        // Print the details of each engine
        for (ScriptEngineFactory f : list) {
            System.out.println("Engine Name:" + f.getEngineName());
            System.out.println("Engine Version:" + f.getEngineVersion());
            System.out.println("Language Name:" + f.getLanguageName());
            System.out.println("Language Version:" + f.getLanguageVersion());
            System.out.println("Engine Short Names:" + f.getNames());

            System.out.println("Mime Types:" + f.getMimeTypes());
            System.out.println("----------------------------");
        }
    }
}