package command;

import java.util.Stack;

public class MacroCommand implements Command {
    private Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {
        // Method Referenec Use => Command::execute
        commands.forEach(command -> command.execute());
    }

    public void add(Command command){
        commands.push(command);
    }

    public void undo(){
        commands.pop();
    }

    public void clear(){
        commands.clear();
    }
}
