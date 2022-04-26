package ru.gb.exchangemodels.models.Actions;

import ru.gb.exchangemodels.models.Commands;
import ru.gb.exchangemodels.models.Message;


import java.util.List;

public class FileList implements Message {

    private List<String> fileList;
    private Commands command;

    public FileList(List<String> fileList) {
        this.fileList = fileList;
        this.command = Commands.FILE_LIST;
    }

    @Override
    public Commands getType() {
        return command;
    }

    @Override
    public Object getMessage() {
        return fileList;
    }
}