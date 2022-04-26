package ru.gb.exchangemodels.models.File;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GenericFile implements Serializable {
    private String fileName;
    private long fileSize;
    private byte[] content;
}

