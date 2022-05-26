package com.techbank.cqrs.commands;

import com.techbank.cqrs.messages.Messages;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BaseCommand extends Messages {
    public BaseCommand(String id) {
        super(id);
    }
}
