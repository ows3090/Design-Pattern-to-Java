package memento;

import command.MacroCommand;

public class Memento {
    private MacroCommand state;

    public Memento(MacroCommand state) {
        this.state = state.clone();
    }

    public MacroCommand getSavedState() {
        return state.clone();
    }
}
