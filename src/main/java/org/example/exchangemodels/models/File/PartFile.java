package ru.gb.exchangemodels.models.File;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.gb.exchangemodels.models.Commands;
import ru.gb.exchangemodels.models.Message;

@Getter
@RequiredArgsConstructor
public class PartFile implements Message {

    private final byte[] message;
    private final long startPos;
    private final long endPos;
    private final boolean isLast;
    private final String filename;
    @Override
    public Commands getType() {
        return Commands.PART_FILE;
    }

}
