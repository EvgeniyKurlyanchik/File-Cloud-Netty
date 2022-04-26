package ru.gb.exchangemodels.models;

import java.io.Serializable;


public interface Message extends Serializable {
    Commands getType();
    Object getMessage();
}