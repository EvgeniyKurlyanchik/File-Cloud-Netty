package ru.gb.exchangemodels.models.Actions;

import lombok.Getter;
import ru.gb.exchangemodels.models.Commands;
import ru.gb.exchangemodels.models.Message;

@Getter
public class Status implements Message {
    private final String message;
    private Commands command;

    public Status(String message) {
        this.message = message;
        this.command = Commands.STATUS;
    }

    @Override
    public Object getMessage() {
        return message;
    }

    @Override
    public Commands getType() {
        return command;
    }

}