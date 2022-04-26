package ru.gb.exchangemodels.models.Actions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.gb.exchangemodels.models.Commands;
import ru.gb.exchangemodels.models.Message;

@RequiredArgsConstructor
@Getter
public class PartFileInfo implements Message {

    private final long receivedOffset;
    private final String filename;
    @Override
    public Commands getType() {
        return Commands.PART_FILE_INFO;
    }

    @Override
    public Object getMessage() {
        return receivedOffset;
    }


}
